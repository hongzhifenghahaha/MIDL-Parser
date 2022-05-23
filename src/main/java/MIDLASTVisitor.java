import MIDL.MIDLBaseVisitor;
import MIDL.MIDLParser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 该类以Visitor的方式遍历解析树的节点，并通过对特定节点的处理来生成自己预设计的抽象语法树
 */
public class MIDLASTVisitor extends MIDLBaseVisitor<Void> {
    // level 表示当前节点的缩进等级
    public int level = 0;
    // tree 存放当前 AST 的字符串形式、
    StringBuilder tree = new StringBuilder();
    // indentation 是缩进，暂定为四个空格
    String indentation = "    ";
    // 文件夹名
    String dirName = "ast_result"+File.separator;

//    通过竖线和横线来表示树的层级关系，而不是通过缩进来表示，这里暂时不采用
//    public void treeAppend(String s) {
//        String treeNode = s;
//        if (level != 0) {
//            treeNode = indentation.repeat(level - 1) + "|---" + s;
//        }
//        tree.append(treeNode).append("\n");
//    }

    /**
     * 往当前的AST中新增一个节点，即新增一行字符串
     */
    public void treeAppend(String s) {
        String treeNode = indentation.repeat(level) + s;
        tree.append(treeNode).append("\n");
    }

    /**
     * 输出AST到文件中，如果文件或文件夹不存在则创建
     */
    public void printTree(String syntax) {
//        System.out.println(tree.toString());
        String path = dirName + syntax + "_SyntaxOut.txt";
        File dir = new File(dirName);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file = new File(path);
        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            OutputStream outputStream = new FileOutputStream(file);
            byte[] bytes = tree.toString().getBytes(StandardCharsets.UTF_8);
            outputStream.write(bytes);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 遍历节点
     */
    @Override
    public Void visitSpecification(MIDLParser.SpecificationContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitDefinition(MIDLParser.DefinitionContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitModule(MIDLParser.ModuleContext ctx) {
        String rootNode = "module(" + ctx.id_lable().getText() + ")";
        treeAppend(rootNode);
        level++;
        ctx.definition().forEach(this::visit);
        level--;
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitType_decl(MIDLParser.Type_declContext ctx) {
        if (ctx.getChildCount() > 1) {
            String rootNode = "struct(" + ctx.id_lable().getText() + ")";
            treeAppend(rootNode);
        } else {
            visit(ctx.struct_type());
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitStruct_type(MIDLParser.Struct_typeContext ctx) {
        String rootNode = "struct(" + ctx.id_lable().getText() + ")";
        treeAppend(rootNode);
        level++;
        visit(ctx.member_list());
        level--;
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitMember_list(MIDLParser.Member_listContext ctx) {
        treeAppend("member_list");
        level++;
        for (int i = 0; i < ctx.type_spec().size(); i++) {
            visit(ctx.type_spec(i));
            level++;
            visit(ctx.declarators(i));
            level--;
        }
        level--;
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitType_spec(MIDLParser.Type_specContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitScoped_name(MIDLParser.Scoped_nameContext ctx) {
        String rootNode = "scoped_name(" + ctx.id_lable(0).getText() + ")";
        treeAppend(rootNode);
        if (ctx.getChildCount() > 1) {
            for (int i = 1; i < ctx.id_lable().size(); i++) {
                visit(ctx.id_lable(i));
            }
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitFloating_pt_type(MIDLParser.Floating_pt_typeContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitInteger_type(MIDLParser.Integer_typeContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitSigned_int(MIDLParser.Signed_intContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUnsigned_int(MIDLParser.Unsigned_intContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitDeclarators(MIDLParser.DeclaratorsContext ctx) {
        ctx.declarator().forEach(this::visit);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitDeclarator(MIDLParser.DeclaratorContext ctx) {
        visitChildren(ctx);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitSimple_declarator(MIDLParser.Simple_declaratorContext ctx) {
        String rootNode = "simple_declarator(" + ctx.id_lable().getText() + ")";
        treeAppend(rootNode);
        if (ctx.getChildCount() > 1) {
            level++;
            visit(ctx.or_expr());
            level--;
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitArray_declarator(MIDLParser.Array_declaratorContext ctx) {
        String rootNode = "array_declarator(" + ctx.id_lable().getText() + ")";
        treeAppend(rootNode);
        level++;
        visit(ctx.or_expr());
        if (ctx.getChildCount() > 4) {
            visit(ctx.exp_list());
        }
        level--;
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitExp_list(MIDLParser.Exp_listContext ctx) {
        ctx.or_expr().forEach(this::visit);
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitOr_expr(MIDLParser.Or_exprContext ctx) {
        visit(ctx.xor_expr(0));
        for (int i = 0; i < ctx.or_op().size(); i++) {
            visit(ctx.or_op(i));
            level++;
            visit(ctx.xor_expr(i + 1));
            level--;
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitXor_expr(MIDLParser.Xor_exprContext ctx) {
        visit(ctx.and_expr(0));
        for (int i = 0; i < ctx.xor_op().size(); i++) {
            visit(ctx.xor_op(i));
            level++;
            visit(ctx.and_expr(i + 1));
            level--;
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitAnd_expr(MIDLParser.And_exprContext ctx) {
        visit(ctx.shift_expr(0));
        for (int i = 0; i < ctx.and_op().size(); i++) {
            visit(ctx.and_op(i));
            level++;
            visit(ctx.shift_expr(i + 1));
            level--;
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitShift_expr(MIDLParser.Shift_exprContext ctx) {
        visit(ctx.add_expr(0));
        for (int i = 0; i < ctx.shift_op().size(); i++) {
            visit(ctx.shift_op(i));
            level++;
            visit(ctx.add_expr(i + 1));
            level--;
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitAdd_expr(MIDLParser.Add_exprContext ctx) {
        visit(ctx.mult_expr(0));
        for (int i = 0; i < ctx.add_op().size(); i++) {
            visit(ctx.add_op(i));
            level++;
            visit(ctx.mult_expr(i + 1));
            level--;
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitMult_expr(MIDLParser.Mult_exprContext ctx) {
        visit(ctx.unary_expr(0));
        for (int i = 0; i < ctx.mult_op().size(); i++) {
            visit(ctx.mult_op(i));
            level++;
            visit(ctx.unary_expr(i + 1));
            level--;
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUnary_expr(MIDLParser.Unary_exprContext ctx) {
        if (ctx.getChildCount() == 2) {
            visit(ctx.unary_op());
            level++;
            visit(ctx.literal());
            level--;
        } else {
            visit(ctx.literal());
        }
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitLiteral(MIDLParser.LiteralContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitId_lable(MIDLParser.Id_lableContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitInteger_label(MIDLParser.Integer_labelContext ctx) {
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitFloat_pt_label(MIDLParser.Float_pt_labelContext ctx) {
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitChar_label(MIDLParser.Char_labelContext ctx) {
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitString_label(MIDLParser.String_labelContext ctx) {
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitBoolean_label(MIDLParser.Boolean_labelContext ctx) {
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUnary_op(MIDLParser.Unary_opContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitMult_op(MIDLParser.Mult_opContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitAdd_op(MIDLParser.Add_opContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitShift_op(MIDLParser.Shift_opContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitAnd_op(MIDLParser.And_opContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitXor_op(MIDLParser.Xor_opContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitOr_op(MIDLParser.Or_opContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitLeft_bracket(MIDLParser.Left_bracketContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitComma(MIDLParser.CommaContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitRight_bracket(MIDLParser.Right_bracketContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitEqual_sign(MIDLParser.Equal_signContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUnsigned_short(MIDLParser.Unsigned_shortContext ctx) {
        treeAppend("unsigned short");
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUnit16(MIDLParser.Unit16Context ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUnsigned_long(MIDLParser.Unsigned_longContext ctx) {
        treeAppend("unsigned long");
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUint32(MIDLParser.Uint32Context ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUnsigned_long_long(MIDLParser.Unsigned_long_longContext ctx) {
        treeAppend("unsigned long long");
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUint64(MIDLParser.Uint64Context ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitUnit8(MIDLParser.Unit8Context ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitShort(MIDLParser.ShortContext ctx) {
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitInt16(MIDLParser.Int16Context ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitLong(MIDLParser.LongContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitInt32(MIDLParser.Int32Context ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitLong_long(MIDLParser.Long_longContext ctx) {
        treeAppend("long long");
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitInt64(MIDLParser.Int64Context ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitInt8(MIDLParser.Int8Context ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitFloat(MIDLParser.FloatContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitDouble(MIDLParser.DoubleContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitLong_double(MIDLParser.Long_doubleContext ctx) {
        treeAppend("long double");
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitChar_literal(MIDLParser.Char_literalContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitString_literal(MIDLParser.String_literalContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitBoolean_literal(MIDLParser.Boolean_literalContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitScoped_op(MIDLParser.Scoped_opContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitSemicolon(MIDLParser.SemicolonContext ctx) {
//        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitStruct_literal(MIDLParser.Struct_literalContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitLeft_curly_brace(MIDLParser.Left_curly_braceContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitRight_curly_brace(MIDLParser.Right_curly_braceContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitModule_literal(MIDLParser.Module_literalContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitId(MIDLParser.IdContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitInteger(MIDLParser.IntegerContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitFloat_pt(MIDLParser.Float_ptContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitChar(MIDLParser.CharContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitString(MIDLParser.StringContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

    /**
     * 遍历节点
     */
    @Override
    public Void visitBoolean(MIDLParser.BooleanContext ctx) {
        treeAppend(ctx.getText());
        return null;
    }

}
