import MIDL.MIDLLexer;
import MIDL.MIDLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

/**
 * 该类用于测试词法规则的正确性，对应的测试用例放在 resources/test_lexer 中
 */
public class LexerTest {
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
    public final String sourceDir = "test_lexer" + File.separator;


    /**
     * 打开某一测试用例文件，并测试相应的词法规则
     * @param fileName 测试用例文件名
     * @param ruleName 词法规则名，使用 Java 的反射方法来调用对应的词法函数。
     */
    public void testLine(String fileName, String ruleName) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, URISyntaxException {
        /*
         *  断言为真，用于测试正确的词法是否全部通过匹配
         */
        FileInputStream inputStream = new FileInputStream(this.getClass().getResource(sourceDir + fileName + "_true.txt").getPath());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str;
        while (null != (str = bufferedReader.readLine())) {
            lexer = new MIDLLexer(CharStreams.fromString(str));
            parser = new MIDLParser(new CommonTokenStream(lexer));
            parser.addErrorListener(ParserTest.ThrowingErrorListener.INSTANCE);
            var parserClass = MIDLParser.class;
            var ruleMethod = parserClass.getMethod(ruleName);
            ruleMethod.invoke(parser);
        }

        /*
         *  断言为假(有异常抛出)，用于测试错误的词法是否全部都会抛出异常
         */
        inputStream = new FileInputStream(this.getClass().getResource(sourceDir + fileName + "_false.txt").getPath());
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (null != (str = bufferedReader.readLine())) {
            lexer = new MIDLLexer(CharStreams.fromString(str));
            lexer.addErrorListener(ParserTest.ThrowingErrorListener.INSTANCE);
            parser = new MIDLParser(new CommonTokenStream(lexer));
            parser.addErrorListener(ParserTest.ThrowingErrorListener.INSTANCE);
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
     * 测试 ID 词法
     */
    @Test
    void idTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("ID","id");
    }

    /**
     * 测试 INTEGER 词法
     */
    @Test
    void integerTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("INTEGER","integer");
    }

    /**
     * 测试 FLOATPT 词法
     */
    @Test
    void floatintPtTypeTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("FLOATPT","float_pt");
    }

    /**
     * 测试 CHAR 词法
     */
    @Test
    void charTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("CHAR","char_");
    }

    /**
     * 测试 STRING 词法
     */
    @Test
    void stringTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("STRING","string");
    }

    /**
     * 测试 BOOLEAN 词法
     */
    @Test
    void booleanTest() throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testLine("BOOLEAN","boolean_");
    }

}
