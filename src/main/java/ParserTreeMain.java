import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import MIDL.*;

import java.lang.reflect.InvocationTargetException;

/**
 * 该类通过 Listener 来生成语法解析树
 */
public class ParserTreeMain {
    ParserTreeMain (){};

    /**
     * 分别调用每个语法，并生成对应的语法解析树
     */
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        ParserTreeMain ptm = new ParserTreeMain();
        ptm.literalTree();
        ptm.unaryExprTree();
        ptm.multExprTree();
        ptm.addExprTree();
        ptm.shiftExprTree();
        ptm.andExprTree();
        ptm.xorExprTree();
        ptm.orExprTree();
        ptm.expListTree();
        ptm.arrayDeclaratorTree();
        ptm.simpleDeclaratorTree();
        ptm.declaratorTree();
        ptm.declaratorsTree();
        ptm.unsignedIntTree();
        ptm.signedIntTree();
        ptm.integerTypeTree();
        ptm.floatingPtTypeTree();
        ptm.baseTypeSpecTree();
        ptm.scopedNameTree();
        ptm.typeSpecTree();
        ptm.memberListTree();
        ptm.structTypeTree();
        ptm.typeDeclTree();
        ptm.moduleTree();
        ptm.definitionTree();
        ptm.specificationTree();
    }

    /**
     * 使用某个语法规则，匹配输入的字符串，并将生成的语法解析树输出到文件中
     * @param line 输入的字符串
     * @param fileName AST输出到该文件
     * @param ruleName 语法规则的名字，使用 Java 的反射方法来调用对应的语法函数。
     */
    public void visitTree(String line, String fileName, String ruleName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MIDLLexer lexer = new MIDLLexer(CharStreams.fromString(line));
        MIDLParser parser = new MIDLParser(new CommonTokenStream(lexer));
        var parserClass = MIDLParser.class;
        var ruleMethod = parserClass.getMethod(ruleName);
        ParseTree tree = (ParseTree) ruleMethod.invoke(parser);
        ParseTreeWalker walker = new ParseTreeWalker();
        MIDLParserTreeListener listener = new MIDLParserTreeListener();
        walker.walk(listener, tree);
        listener.printTree(fileName);
    }

    /**
     * 用 literal 语法来匹配字符串并生成语法解析树
     */
    public void literalTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("\"aaaaa\"", "literal", "literal");
    }

    /**
     * 用 unary_expr 语法来匹配字符串并生成语法解析树
     */
    public void unaryExprTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("+2", "unary_expr", "unary_expr");
    }

    /**
     * 用 mult_expr 语法来匹配字符串并生成语法解析树
     */
    public void multExprTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("~1 / -3 * 2 % 3", "mult_expr", "mult_expr");
    }

    /**
     * 用 add_expr 语法来匹配字符串并生成语法解析树
     */
    public void addExprTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("1 + 2 * 3 / 4", "add_expr", "add_expr");
    }

    /**
     * 用 shift_expr 语法来匹配字符串并生成语法解析树
     */
    public void shiftExprTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("1 + 1 >> 1 - 1", "shift_expr", "shift_expr");
    }

    /**
     * 用 and_expr 语法来匹配字符串并生成语法解析树
     */
    public void andExprTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("1 & -1 & 3 * 4 >> 2", "and_expr", "and_expr");
    }

    /**
     * 用 xor_expr 语法来匹配字符串并生成语法解析树
     */
    public void xorExprTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("1 ^ -1 ^ 3 & 4", "xor_expr", "xor_expr");
    }

    /**
     * 用 or_expr 语法来匹配字符串并生成语法解析树
     */
    public void orExprTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("~1 | 1 | 3 ^ 4", "or_expr", "or_expr");
    }

    /**
     * 用 exp_list 语法来匹配字符串并生成语法解析树
     */
    public void expListTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("[1 , ~1, 2*3^4&5]", "exp_list", "exp_list");
    }

    /**
     * 用 array_declarator 语法来匹配字符串并生成语法解析树
     */
    public void arrayDeclaratorTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("a[20] = [3 * 4 - 2 / 1]", "array_declarator", "array_declarator");
    }

    /**
     * 用 simple_declarator 语法来匹配字符串并生成语法解析树
     */
    public void simpleDeclaratorTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("x = 1*3 - 2*2*3", "simple_declarator", "simple_declarator");
    }

    /**
     * 用 declarator 语法来匹配字符串并生成语法解析树
     */
    public void declaratorTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("x = 1", "declarator", "declarator");
    }

    /**
     * 用 declarators 语法来匹配字符串并生成语法解析树
     */
    public void declaratorsTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("list[20] = [3 * 4 - 2 / 1],x = 1*3 - 2*2*3, q = 'c'", "declarators", "declarators");
    }

    /**
     * 用 unsigned_int 语法来匹配字符串并生成语法解析树
     */
    public void unsignedIntTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("unsigned long long", "unsigned_int", "unsigned_int");
    }

    /**
     * 用 signed_int 语法来匹配字符串并生成语法解析树
     */
    public void signedIntTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("long long", "signed_int", "signed_int");
    }

    /**
     * 用 integer_type 语法来匹配字符串并生成语法解析树
     */
    public void integerTypeTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("unsigned long long", "integer_type", "integer_type");
    }

    /**
     * 用 floating_pt_type 语法来匹配字符串并生成语法解析树
     */
    public void floatingPtTypeTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("long double", "floating_pt_type", "floating_pt_type");
    }

    /**
     * 用 base_type_spec 语法来匹配字符串并生成语法解析树
     */
    public void baseTypeSpecTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("boolean", "base_type_spec", "base_type_spec");
    }

    /**
     * 用 scoped_name 语法来匹配字符串并生成语法解析树
     */
    public void scopedNameTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("::std::cout::endl", "scoped_name", "scoped_name");
    }

    /**
     * 用 type_spec 语法来匹配字符串并生成语法解析树
     */
    public void typeSpecTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("std::cout", "type_spec", "type_spec");
    }

    /**
     * 用 member_list 语法来匹配字符串并生成语法解析树
     */
    public void memberListTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("double a,b=1;std::cout c;", "member_list", "member_list");
    }

    /**
     * 用 struct_type 语法来匹配字符串并生成语法解析树
     */
    public void structTypeTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("struct node {int32 x;}", "struct_type", "struct_type");
    }

    /**
     * 用 type_decl 语法来匹配字符串并生成语法解析树
     */
    public void typeDeclTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("struct node {int32 x;}", "type_decl", "type_decl");
    }

    /**
     * 用 module 语法来匹配字符串并生成语法解析树
     */
    public void moduleTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("module m2 {struct node {int32 x;};struct x;}", "module", "module");
    }

    /**
     * 用 definition 语法来匹配字符串并生成语法解析树
     */
    public void definitionTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("module m2 {struct node {int32 x;};struct x;};", "definition", "definition");
    }

    /**
     * 用 specification 语法来匹配字符串并生成语法解析树
     */
    public void specificationTree() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        visitTree("struct node {int32 x;};module m2 {struct node {int32 x;};struct x;};4", "specification", "specification");
    }
}
