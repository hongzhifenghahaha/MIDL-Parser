import MIDL.MIDLBaseListener;
import MIDL.MIDLParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 该类通过 Listener 来生成语法解析树
 */
public class MIDLParserTreeListener extends MIDLBaseListener {
    // level表示当前节点的缩进等级
    public int level = 0;
    // tree存放当前AST的字符串形式、
    StringBuilder tree = new StringBuilder();
    // indentation是缩进，暂定为四个空格
    String indentation = "    ";
    // 文件夹名
    String dirName = "parser_tree_result" + File.separator;

    /**
     * 往当前的解析树中新增一个节点，即新增一行字符串
     */
    public void treeAppend(String s) {
        String treeNode = indentation.repeat(level) + s;
        tree.append(treeNode).append("\n");
    }

    /**
     * 输出解析树到文件中
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
     * 进入节点
     */
    @Override
    public void enterSpecification(MIDLParser.SpecificationContext ctx) {
        treeAppend("specification");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterDefinition(MIDLParser.DefinitionContext ctx) {
        treeAppend("definition");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterModule(MIDLParser.ModuleContext ctx) {
        treeAppend("module");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterType_decl(MIDLParser.Type_declContext ctx) {
        treeAppend("type_decl");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterStruct_type(MIDLParser.Struct_typeContext ctx) {
        treeAppend("struct_type");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterMember_list(MIDLParser.Member_listContext ctx) {
        treeAppend("member_list");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterType_spec(MIDLParser.Type_specContext ctx) {
        treeAppend("type_spce");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterScoped_name(MIDLParser.Scoped_nameContext ctx) {
        treeAppend("scoped_name");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        treeAppend("base_type_spec");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterFloating_pt_type(MIDLParser.Floating_pt_typeContext ctx) {
        treeAppend("floating_pt_type");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterInteger_type(MIDLParser.Integer_typeContext ctx) {
        treeAppend("integer_type");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterSigned_int(MIDLParser.Signed_intContext ctx) {
        treeAppend("signed_int");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUnsigned_int(MIDLParser.Unsigned_intContext ctx) {
        treeAppend("unsigned_int");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterDeclarators(MIDLParser.DeclaratorsContext ctx) {
        treeAppend("declarators");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterDeclarator(MIDLParser.DeclaratorContext ctx) {
        treeAppend("declarator");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterSimple_declarator(MIDLParser.Simple_declaratorContext ctx) {
        treeAppend("simple_declarator");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterArray_declarator(MIDLParser.Array_declaratorContext ctx) {
        treeAppend("array_declarator");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterExp_list(MIDLParser.Exp_listContext ctx) {
        treeAppend("exp_list");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterOr_expr(MIDLParser.Or_exprContext ctx) {
        treeAppend("or_expr");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterXor_expr(MIDLParser.Xor_exprContext ctx) {
        treeAppend("xor_expr");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterAnd_expr(MIDLParser.And_exprContext ctx) {
        treeAppend("and_expr");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterShift_expr(MIDLParser.Shift_exprContext ctx) {
        treeAppend("shift_expr");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterAdd_expr(MIDLParser.Add_exprContext ctx) {
        treeAppend("add_expr");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterMult_expr(MIDLParser.Mult_exprContext ctx) {
        treeAppend("mult_expr");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUnary_expr(MIDLParser.Unary_exprContext ctx) {
        treeAppend("unary_expr");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterLiteral(MIDLParser.LiteralContext ctx) {
        treeAppend("literal");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterId_lable(MIDLParser.Id_lableContext ctx) {
        treeAppend("ID");
        level++;
        treeAppend(ctx.getText());
    }

    /**
     * 进入节点
     */
    @Override
    public void enterInteger_label(MIDLParser.Integer_labelContext ctx) {
        treeAppend("INTEGER");
        level++;
        treeAppend(ctx.getText());
    }

    /**
     * 进入节点
     */
    @Override
    public void enterFloat_pt_label(MIDLParser.Float_pt_labelContext ctx) {
        treeAppend("FLOAT_PT");
        level++;
        treeAppend(ctx.getText());
    }

    /**
     * 进入节点
     */
    @Override
    public void enterChar_label(MIDLParser.Char_labelContext ctx) {
        treeAppend("CHAR");
        level++;
        treeAppend(ctx.getText());
    }

    /**
     * 进入节点
     */
    @Override
    public void enterString_label(MIDLParser.String_labelContext ctx) {
        treeAppend("STRING");
        level++;
        treeAppend(ctx.getText());
    }

    /**
     * 进入节点
     */
    @Override
    public void enterBoolean_label(MIDLParser.Boolean_labelContext ctx) {
        treeAppend("BOOLEAN");
        level++;
        treeAppend(ctx.getText());
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUnary_op(MIDLParser.Unary_opContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterMult_op(MIDLParser.Mult_opContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterAdd_op(MIDLParser.Add_opContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterShift_op(MIDLParser.Shift_opContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterAnd_op(MIDLParser.And_opContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterXor_op(MIDLParser.Xor_opContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterOr_op(MIDLParser.Or_opContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterLeft_bracket(MIDLParser.Left_bracketContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterComma(MIDLParser.CommaContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterRight_bracket(MIDLParser.Right_bracketContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterEqual_sign(MIDLParser.Equal_signContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUnsigned_short(MIDLParser.Unsigned_shortContext ctx) {
        treeAppend("unsigned short");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUnit16(MIDLParser.Unit16Context ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUnsigned_long(MIDLParser.Unsigned_longContext ctx) {
        treeAppend("unsigned long");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUint32(MIDLParser.Uint32Context ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUnsigned_long_long(MIDLParser.Unsigned_long_longContext ctx) {
        treeAppend("unsigned long long");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUint64(MIDLParser.Uint64Context ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterUnit8(MIDLParser.Unit8Context ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterShort(MIDLParser.ShortContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterInt16(MIDLParser.Int16Context ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterLong(MIDLParser.LongContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterInt32(MIDLParser.Int32Context ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterLong_long(MIDLParser.Long_longContext ctx) {
        treeAppend("long long");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterInt64(MIDLParser.Int64Context ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterInt8(MIDLParser.Int8Context ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterFloat(MIDLParser.FloatContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterDouble(MIDLParser.DoubleContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterLong_double(MIDLParser.Long_doubleContext ctx) {
        treeAppend("long double");
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterChar_literal(MIDLParser.Char_literalContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterString_literal(MIDLParser.String_literalContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterBoolean_literal(MIDLParser.Boolean_literalContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterScoped_op(MIDLParser.Scoped_opContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterSemicolon(MIDLParser.SemicolonContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterStruct_literal(MIDLParser.Struct_literalContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterLeft_curly_brace(MIDLParser.Left_curly_braceContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterRight_curly_brace(MIDLParser.Right_curly_braceContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 进入节点
     */
    @Override
    public void enterModule_literal(MIDLParser.Module_literalContext ctx) {
        treeAppend(ctx.getText());
        level++;
    }

    /**
     * 退出所有节点时都执行 level-- 操作
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        level--;
    }

}
