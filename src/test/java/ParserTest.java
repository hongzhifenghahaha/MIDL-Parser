import MIDL.MIDLLexer;
import MIDL.MIDLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

/**
 * 该类用于测试语法规则的正确性，对应的测试用例放在 resources/test_lexer 中
 */
public class ParserTest {
    /**
     * 错误监听器，有语法错误会抛出异常
     */
    static class ThrowingErrorListener extends BaseErrorListener {
        public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        /**
         * 覆写 SyntaxError，使其会抛出异常
         */
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        }
    }

    public MIDLLexer lexer;
    public MIDLParser parser;
    public final String sourceDir = "test_parser" + File.separator;

    /**
     * 打开某一测试用例文件，并测试相应的语法规则
     * @param fileName 测试用例文件名
     * @param ruleName 词法规则名，使用 Java 的反射方法来调用对应的语法函数。
     */
    public void testLine(String fileName, String ruleName) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, URISyntaxException {
        /*
         *  断言为真，用于测试正确的语法是否全部通过匹配
         */
        FileInputStream inputStream = new FileInputStream(this.getClass().getResource(sourceDir + fileName + "_true.txt").getPath());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str;
        while (null != (str = bufferedReader.readLine())) {
            lexer = new MIDLLexer(CharStreams.fromString(str));
            parser = new MIDLParser(new CommonTokenStream(lexer));
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            var parserClass = MIDLParser.class;
            var ruleMethod = parserClass.getMethod(ruleName);
            ruleMethod.invoke(parser);
        }

        /*
         *  断言为真，用于测试正确的语法是否全部通过匹配
         */
        inputStream = new FileInputStream(this.getClass().getResource(sourceDir + fileName + "_false.txt").getPath());
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (null != (str = bufferedReader.readLine())) {
            lexer = new MIDLLexer(CharStreams.fromString(str));
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
            parser = new MIDLParser(new CommonTokenStream(lexer));
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            var parserClass = MIDLParser.class;
            var ruleMethod = parserClass.getMethod(ruleName);
            Assertions.assertThrows(ParseCancellationException.class, () -> {
                try {
                    ruleMethod.invoke(parser);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            });
        }

        inputStream.close();
        bufferedReader.close();
    }

    /**
     * 测试 literal 语法
     */
    @Test
    void literalTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("literal", "literal_test");
    }

    /**
     * 测试 unary_expr 语法
     */
    @Test
    void unaryExprTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("unary_expr", "unary_expr_test");
    }

    /**
     * 测试 mult_expr 语法
     */
    @Test
    void multExprTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("mult_expr", "mult_expr_test");
    }

    /**
     * 测试 add_expr 语法
     */
    @Test
    void addExprTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("add_expr", "add_expr_test");
    }

    /**
     * 测试 shift_expr 语法
     */
    @Test
    void shiftExprTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("shift_expr", "shift_expr_test");
    }

    /**
     * 测试 and_expr 语法
     */
    @Test
    void andExprTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("and_expr", "and_expr_test");
    }

    /**
     * 测试 xor_expr 语法
     */
    @Test
    void xorExprTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("xor_expr", "xor_expr_test");
    }

    /**
     * 测试 or_expr 语法
     */
    @Test
    void orExprTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("or_expr", "or_expr_test");
    }

    /**
     * 测试 exp_list 语法
     */
    @Test
    void expListTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("exp_list", "exp_list_test");
    }

    /**
     * 测试 array_declarator 语法
     */
    @Test
    void arrayDeclaratorTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("array_declarator", "array_declarator_test");
    }

    /**
     * 测试 simple_declarator 语法
     */
    @Test
    void simpleDeclaratorTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("simple_declarator", "simple_declarator_test");
    }

    /**
     * 测试 declarator 语法
     */
    @Test
    void declaratorTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("declarator", "declarator_test");
    }

    /**
     * 测试 declarators 语法
     */
    @Test
    void declaratorsTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("declarators", "declarators_test");
    }

    /**
     * 测试 unsigned_int 语法
     */
    @Test
    void unsignedIntTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("unsigned_int", "unsigned_int_test");
    }

    /**
     * 测试 signed_int 语法
     */
    @Test
    void signedIntTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("signed_int", "signed_int_test");
    }

    /**
     * 测试 integer_type 语法
     */
    @Test
    void integerTypeTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("integer_type", "integer_type_test");
    }

    /**
     * 测试 floating_pt_type 语法
     */
    @Test
    void floatingPtTypeTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("floating_pt_type", "floating_pt_type_test");
    }

    /**
     * 测试 base_type_spec 语法
     */
    @Test
    void baseTypeSpecTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("base_type_spec", "base_type_spec_test");
    }

    /**
     * 测试 scoped_name 语法
     */
    @Test
    void scopedNameTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("scoped_name", "scoped_name_test");
    }

    /**
     * 测试 type_spec 语法
     */
    @Test
    void typeSpecTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("type_spec", "type_spec_test");
    }

    /**
     * 测试 member_list 语法
     */
    @Test
    void memberListTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("member_list", "member_list_test");
    }

    /**
     * 测试 struct_type 语法
     */
    @Test
    void structTypeTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("struct_type", "struct_type_test");
    }

    /**
     * 测试 type_decl 语法
     */
    @Test
    void typeDeclTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("type_decl", "type_decl_test");
    }

    /**
     * 测试 module 语法
     */
    @Test
    void moduleTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("module", "module_test");
    }

    /**
     * 测试 definition 语法
     */
    @Test
    void definitionTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("definition", "definition_test");
    }

    /**
     * 测试 specification 语法
     */
    @Test
    void specificationTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("specification", "specification_test");
    }

}
