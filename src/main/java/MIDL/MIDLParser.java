// Generated from /home/hzf/course/compilation_principle/experiment1_gradle/src/main/java/MIDL.g4 by ANTLR 4.10.1
package MIDL;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MIDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, BOOLEAN=38, 
		ID=39, INTEGER=40, FLOATING_PT=41, CHAR=42, STRING=43, WS=44;
	public static final int
		RULE_specification = 0, RULE_definition = 1, RULE_module = 2, RULE_type_decl = 3, 
		RULE_struct_type = 4, RULE_member_list = 5, RULE_type_spec = 6, RULE_scoped_name = 7, 
		RULE_base_type_spec = 8, RULE_floating_pt_type = 9, RULE_integer_type = 10, 
		RULE_signed_int = 11, RULE_unsigned_int = 12, RULE_declarators = 13, RULE_declarator = 14, 
		RULE_simple_declarator = 15, RULE_array_declarator = 16, RULE_exp_list = 17, 
		RULE_or_expr = 18, RULE_xor_expr = 19, RULE_and_expr = 20, RULE_shift_expr = 21, 
		RULE_add_expr = 22, RULE_mult_expr = 23, RULE_unary_expr = 24, RULE_literal = 25, 
		RULE_id_lable = 26, RULE_integer_label = 27, RULE_float_pt_label = 28, 
		RULE_char_label = 29, RULE_string_label = 30, RULE_boolean_label = 31, 
		RULE_unary_op = 32, RULE_mult_op = 33, RULE_add_op = 34, RULE_shift_op = 35, 
		RULE_and_op = 36, RULE_xor_op = 37, RULE_or_op = 38, RULE_left_bracket = 39, 
		RULE_comma = 40, RULE_right_bracket = 41, RULE_equal_sign = 42, RULE_unsigned_short = 43, 
		RULE_unit16 = 44, RULE_unsigned_long = 45, RULE_uint32 = 46, RULE_unsigned_long_long = 47, 
		RULE_uint64 = 48, RULE_unit8 = 49, RULE_short = 50, RULE_int16 = 51, RULE_long = 52, 
		RULE_int32 = 53, RULE_long_long = 54, RULE_int64 = 55, RULE_int8 = 56, 
		RULE_float = 57, RULE_double = 58, RULE_long_double = 59, RULE_char_literal = 60, 
		RULE_string_literal = 61, RULE_boolean_literal = 62, RULE_scoped_op = 63, 
		RULE_semicolon = 64, RULE_struct_literal = 65, RULE_left_curly_brace = 66, 
		RULE_right_curly_brace = 67, RULE_module_literal = 68, RULE_id = 69, RULE_integer = 70, 
		RULE_float_pt = 71, RULE_char = 72, RULE_string = 73, RULE_boolean = 74, 
		RULE_specification_test = 75, RULE_definition_test = 76, RULE_module_test = 77, 
		RULE_type_decl_test = 78, RULE_struct_type_test = 79, RULE_member_list_test = 80, 
		RULE_type_spec_test = 81, RULE_scoped_name_test = 82, RULE_base_type_spec_test = 83, 
		RULE_floating_pt_type_test = 84, RULE_integer_type_test = 85, RULE_signed_int_test = 86, 
		RULE_unsigned_int_test = 87, RULE_declarators_test = 88, RULE_declarator_test = 89, 
		RULE_simple_declarator_test = 90, RULE_array_declarator_test = 91, RULE_exp_list_test = 92, 
		RULE_or_expr_test = 93, RULE_xor_expr_test = 94, RULE_and_expr_test = 95, 
		RULE_shift_expr_test = 96, RULE_add_expr_test = 97, RULE_mult_expr_test = 98, 
		RULE_unary_expr_test = 99, RULE_literal_test = 100;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "definition", "module", "type_decl", "struct_type", 
			"member_list", "type_spec", "scoped_name", "base_type_spec", "floating_pt_type", 
			"integer_type", "signed_int", "unsigned_int", "declarators", "declarator", 
			"simple_declarator", "array_declarator", "exp_list", "or_expr", "xor_expr", 
			"and_expr", "shift_expr", "add_expr", "mult_expr", "unary_expr", "literal", 
			"id_lable", "integer_label", "float_pt_label", "char_label", "string_label", 
			"boolean_label", "unary_op", "mult_op", "add_op", "shift_op", "and_op", 
			"xor_op", "or_op", "left_bracket", "comma", "right_bracket", "equal_sign", 
			"unsigned_short", "unit16", "unsigned_long", "uint32", "unsigned_long_long", 
			"uint64", "unit8", "short", "int16", "long", "int32", "long_long", "int64", 
			"int8", "float", "double", "long_double", "char_literal", "string_literal", 
			"boolean_literal", "scoped_op", "semicolon", "struct_literal", "left_curly_brace", 
			"right_curly_brace", "module_literal", "id", "integer", "float_pt", "char", 
			"string", "boolean", "specification_test", "definition_test", "module_test", 
			"type_decl_test", "struct_type_test", "member_list_test", "type_spec_test", 
			"scoped_name_test", "base_type_spec_test", "floating_pt_type_test", "integer_type_test", 
			"signed_int_test", "unsigned_int_test", "declarators_test", "declarator_test", 
			"simple_declarator_test", "array_declarator_test", "exp_list_test", "or_expr_test", 
			"xor_expr_test", "and_expr_test", "shift_expr_test", "add_expr_test", 
			"mult_expr_test", "unary_expr_test", "literal_test"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'+'", "'~'", "'*'", "'/'", "'%'", "'>>'", "'<<'", "'&'", 
			"'^'", "'|'", "'['", "','", "']'", "'='", "'unsigned'", "'short'", "'uint16'", 
			"'long'", "'uint32'", "'uint64'", "'uint8'", "'int16'", "'int32'", "'int64'", 
			"'int8'", "'float'", "'double'", "'char'", "'string'", "'boolean'", "'::'", 
			"';'", "'struct'", "'{'", "'}'", "'module'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BOOLEAN", "ID", "INTEGER", "FLOATING_PT", "CHAR", "STRING", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MIDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MIDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecificationContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			definition();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__36) {
				{
				{
				setState(203);
				definition();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				type_decl();
				setState(210);
				semicolon();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				module();
				setState(213);
				semicolon();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public Module_literalContext module_literal() {
			return getRuleContext(Module_literalContext.class,0);
		}
		public Id_lableContext id_lable() {
			return getRuleContext(Id_lableContext.class,0);
		}
		public Left_curly_braceContext left_curly_brace() {
			return getRuleContext(Left_curly_braceContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public Right_curly_braceContext right_curly_brace() {
			return getRuleContext(Right_curly_braceContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			module_literal();
			setState(218);
			id_lable();
			setState(219);
			left_curly_brace();
			setState(220);
			definition();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__36) {
				{
				{
				setState(221);
				definition();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			right_curly_brace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declContext extends ParserRuleContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Struct_literalContext struct_literal() {
			return getRuleContext(Struct_literalContext.class,0);
		}
		public Id_lableContext id_lable() {
			return getRuleContext(Id_lableContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_decl);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				struct_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				struct_literal();
				setState(231);
				id_lable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_typeContext extends ParserRuleContext {
		public Struct_literalContext struct_literal() {
			return getRuleContext(Struct_literalContext.class,0);
		}
		public Id_lableContext id_lable() {
			return getRuleContext(Id_lableContext.class,0);
		}
		public Left_curly_braceContext left_curly_brace() {
			return getRuleContext(Left_curly_braceContext.class,0);
		}
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public Right_curly_braceContext right_curly_brace() {
			return getRuleContext(Right_curly_braceContext.class,0);
		}
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterStruct_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitStruct_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitStruct_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			struct_literal();
			setState(236);
			id_lable();
			setState(237);
			left_curly_brace();
			setState(238);
			member_list();
			setState(239);
			right_curly_brace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_listContext extends ParserRuleContext {
		public List<Type_specContext> type_spec() {
			return getRuleContexts(Type_specContext.class);
		}
		public Type_specContext type_spec(int i) {
			return getRuleContext(Type_specContext.class,i);
		}
		public List<DeclaratorsContext> declarators() {
			return getRuleContexts(DeclaratorsContext.class);
		}
		public DeclaratorsContext declarators(int i) {
			return getRuleContext(DeclaratorsContext.class,i);
		}
		public List<SemicolonContext> semicolon() {
			return getRuleContexts(SemicolonContext.class);
		}
		public SemicolonContext semicolon(int i) {
			return getRuleContext(SemicolonContext.class,i);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterMember_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitMember_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitMember_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID))) != 0)) {
				{
				{
				setState(241);
				type_spec();
				setState(242);
				declarators();
				setState(243);
				semicolon();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specContext extends ParserRuleContext {
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitType_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitType_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_spec);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				scoped_name();
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				base_type_spec();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				struct_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scoped_nameContext extends ParserRuleContext {
		public List<Id_lableContext> id_lable() {
			return getRuleContexts(Id_lableContext.class);
		}
		public Id_lableContext id_lable(int i) {
			return getRuleContext(Id_lableContext.class,i);
		}
		public List<Scoped_opContext> scoped_op() {
			return getRuleContexts(Scoped_opContext.class);
		}
		public Scoped_opContext scoped_op(int i) {
			return getRuleContext(Scoped_opContext.class,i);
		}
		public Scoped_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterScoped_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitScoped_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitScoped_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scoped_nameContext scoped_name() throws RecognitionException {
		Scoped_nameContext _localctx = new Scoped_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scoped_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(255);
				scoped_op();
				}
			}

			setState(258);
			id_lable();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(259);
				scoped_op();
				setState(260);
				id_lable();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_type_specContext extends ParserRuleContext {
		public Floating_pt_typeContext floating_pt_type() {
			return getRuleContext(Floating_pt_typeContext.class,0);
		}
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Base_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBase_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBase_type_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBase_type_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_type_specContext base_type_spec() throws RecognitionException {
		Base_type_specContext _localctx = new Base_type_specContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_base_type_spec);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				floating_pt_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				integer_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				char_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				string_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				boolean_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_pt_typeContext extends ParserRuleContext {
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public DoubleContext double_() {
			return getRuleContext(DoubleContext.class,0);
		}
		public Long_doubleContext long_double() {
			return getRuleContext(Long_doubleContext.class,0);
		}
		public Floating_pt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_pt_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterFloating_pt_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitFloating_pt_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitFloating_pt_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_pt_typeContext floating_pt_type() throws RecognitionException {
		Floating_pt_typeContext _localctx = new Floating_pt_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_floating_pt_type);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				float_();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				double_();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				long_double();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typeContext extends ParserRuleContext {
		public Signed_intContext signed_int() {
			return getRuleContext(Signed_intContext.class,0);
		}
		public Unsigned_intContext unsigned_int() {
			return getRuleContext(Unsigned_intContext.class,0);
		}
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInteger_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInteger_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInteger_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integer_type);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__18:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				signed_int();
				}
				break;
			case T__15:
			case T__17:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				unsigned_int();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_intContext extends ParserRuleContext {
		public ShortContext short_() {
			return getRuleContext(ShortContext.class,0);
		}
		public Int16Context int16() {
			return getRuleContext(Int16Context.class,0);
		}
		public LongContext long_() {
			return getRuleContext(LongContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public Long_longContext long_long() {
			return getRuleContext(Long_longContext.class,0);
		}
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public Int8Context int8() {
			return getRuleContext(Int8Context.class,0);
		}
		public Signed_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSigned_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSigned_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSigned_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_intContext signed_int() throws RecognitionException {
		Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signed_int);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(283);
					short_();
					}
					break;
				case T__22:
					{
					setState(284);
					int16();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(287);
					long_();
					}
					break;
				case T__23:
					{
					setState(288);
					int32();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(291);
					long_long();
					}
					break;
				case T__24:
					{
					setState(292);
					int64();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				int8();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_intContext extends ParserRuleContext {
		public Unsigned_shortContext unsigned_short() {
			return getRuleContext(Unsigned_shortContext.class,0);
		}
		public Unit16Context unit16() {
			return getRuleContext(Unit16Context.class,0);
		}
		public Unsigned_longContext unsigned_long() {
			return getRuleContext(Unsigned_longContext.class,0);
		}
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public Unsigned_long_longContext unsigned_long_long() {
			return getRuleContext(Unsigned_long_longContext.class,0);
		}
		public Uint64Context uint64() {
			return getRuleContext(Uint64Context.class,0);
		}
		public Unit8Context unit8() {
			return getRuleContext(Unit8Context.class,0);
		}
		public Unsigned_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnsigned_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnsigned_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnsigned_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_intContext unsigned_int() throws RecognitionException {
		Unsigned_intContext _localctx = new Unsigned_intContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unsigned_int);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(298);
					unsigned_short();
					}
					break;
				case T__17:
					{
					setState(299);
					unit16();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(302);
					unsigned_long();
					}
					break;
				case T__19:
					{
					setState(303);
					uint32();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(306);
					unsigned_long_long();
					}
					break;
				case T__20:
					{
					setState(307);
					uint64();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				unit8();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorsContext extends ParserRuleContext {
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public DeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorsContext declarators() throws RecognitionException {
		DeclaratorsContext _localctx = new DeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			declarator();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(314);
				comma();
				setState(315);
				declarator();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Array_declaratorContext array_declarator() {
			return getRuleContext(Array_declaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declarator);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				simple_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				array_declarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declaratorContext extends ParserRuleContext {
		public Id_lableContext id_lable() {
			return getRuleContext(Id_lableContext.class,0);
		}
		public Equal_signContext equal_sign() {
			return getRuleContext(Equal_signContext.class,0);
		}
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSimple_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSimple_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSimple_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			id_lable();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(327);
				equal_sign();
				setState(328);
				or_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declaratorContext extends ParserRuleContext {
		public Id_lableContext id_lable() {
			return getRuleContext(Id_lableContext.class,0);
		}
		public Left_bracketContext left_bracket() {
			return getRuleContext(Left_bracketContext.class,0);
		}
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public Right_bracketContext right_bracket() {
			return getRuleContext(Right_bracketContext.class,0);
		}
		public Equal_signContext equal_sign() {
			return getRuleContext(Equal_signContext.class,0);
		}
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public Array_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterArray_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitArray_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitArray_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declaratorContext array_declarator() throws RecognitionException {
		Array_declaratorContext _localctx = new Array_declaratorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			id_lable();
			setState(333);
			left_bracket();
			setState(334);
			or_expr();
			setState(335);
			right_bracket();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(336);
				equal_sign();
				setState(337);
				exp_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_listContext extends ParserRuleContext {
		public Left_bracketContext left_bracket() {
			return getRuleContext(Left_bracketContext.class,0);
		}
		public List<Or_exprContext> or_expr() {
			return getRuleContexts(Or_exprContext.class);
		}
		public Or_exprContext or_expr(int i) {
			return getRuleContext(Or_exprContext.class,i);
		}
		public Right_bracketContext right_bracket() {
			return getRuleContext(Right_bracketContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public Exp_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterExp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitExp_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitExp_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_listContext exp_list() throws RecognitionException {
		Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			left_bracket();
			setState(342);
			or_expr();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(343);
				comma();
				setState(344);
				or_expr();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			right_bracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_exprContext extends ParserRuleContext {
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public List<Or_opContext> or_op() {
			return getRuleContexts(Or_opContext.class);
		}
		public Or_opContext or_op(int i) {
			return getRuleContext(Or_opContext.class,i);
		}
		public Or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterOr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitOr_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitOr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		Or_exprContext _localctx = new Or_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_or_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			xor_expr();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(354);
				or_op();
				setState(355);
				xor_expr();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<Xor_opContext> xor_op() {
			return getRuleContexts(Xor_opContext.class);
		}
		public Xor_opContext xor_op(int i) {
			return getRuleContext(Xor_opContext.class,i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitXor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			and_expr();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(363);
				xor_op();
				setState(364);
				and_expr();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<And_opContext> and_op() {
			return getRuleContexts(And_opContext.class);
		}
		public And_opContext and_op(int i) {
			return getRuleContext(And_opContext.class,i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			shift_expr();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(372);
				and_op();
				setState(373);
				shift_expr();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Add_exprContext> add_expr() {
			return getRuleContexts(Add_exprContext.class);
		}
		public Add_exprContext add_expr(int i) {
			return getRuleContext(Add_exprContext.class,i);
		}
		public List<Shift_opContext> shift_op() {
			return getRuleContexts(Shift_opContext.class);
		}
		public Shift_opContext shift_op(int i) {
			return getRuleContext(Shift_opContext.class,i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitShift_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			add_expr();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				{
				setState(381);
				shift_op();
				}
				setState(382);
				add_expr();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_exprContext extends ParserRuleContext {
		public List<Mult_exprContext> mult_expr() {
			return getRuleContexts(Mult_exprContext.class);
		}
		public Mult_exprContext mult_expr(int i) {
			return getRuleContext(Mult_exprContext.class,i);
		}
		public List<Add_opContext> add_op() {
			return getRuleContexts(Add_opContext.class);
		}
		public Add_opContext add_op(int i) {
			return getRuleContext(Add_opContext.class,i);
		}
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitAdd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitAdd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_add_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			mult_expr();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				{
				setState(390);
				add_op();
				}
				setState(391);
				mult_expr();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_exprContext extends ParserRuleContext {
		public List<Unary_exprContext> unary_expr() {
			return getRuleContexts(Unary_exprContext.class);
		}
		public Unary_exprContext unary_expr(int i) {
			return getRuleContext(Unary_exprContext.class,i);
		}
		public List<Mult_opContext> mult_op() {
			return getRuleContexts(Mult_opContext.class);
		}
		public Mult_opContext mult_op(int i) {
			return getRuleContext(Mult_opContext.class,i);
		}
		public Mult_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterMult_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitMult_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitMult_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			unary_expr();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				{
				{
				setState(399);
				mult_op();
				}
				setState(400);
				unary_expr();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_exprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unary_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				setState(407);
				unary_op();
				}
			}

			setState(410);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Integer_labelContext integer_label() {
			return getRuleContext(Integer_labelContext.class,0);
		}
		public Float_pt_labelContext float_pt_label() {
			return getRuleContext(Float_pt_labelContext.class,0);
		}
		public Char_labelContext char_label() {
			return getRuleContext(Char_labelContext.class,0);
		}
		public String_labelContext string_label() {
			return getRuleContext(String_labelContext.class,0);
		}
		public Boolean_labelContext boolean_label() {
			return getRuleContext(Boolean_labelContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				integer_label();
				}
				break;
			case FLOATING_PT:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				float_pt_label();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				char_label();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				string_label();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				boolean_label();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_lableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public Id_lableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_lable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterId_lable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitId_lable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitId_lable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_lableContext id_lable() throws RecognitionException {
		Id_lableContext _localctx = new Id_lableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_id_lable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_labelContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MIDLParser.INTEGER, 0); }
		public Integer_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInteger_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInteger_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInteger_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_labelContext integer_label() throws RecognitionException {
		Integer_labelContext _localctx = new Integer_labelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integer_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_pt_labelContext extends ParserRuleContext {
		public TerminalNode FLOATING_PT() { return getToken(MIDLParser.FLOATING_PT, 0); }
		public Float_pt_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_pt_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterFloat_pt_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitFloat_pt_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitFloat_pt_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_pt_labelContext float_pt_label() throws RecognitionException {
		Float_pt_labelContext _localctx = new Float_pt_labelContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_float_pt_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(FLOATING_PT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_labelContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MIDLParser.CHAR, 0); }
		public Char_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterChar_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitChar_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitChar_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_labelContext char_label() throws RecognitionException {
		Char_labelContext _localctx = new Char_labelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_char_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_labelContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MIDLParser.STRING, 0); }
		public String_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterString_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitString_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitString_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_labelContext string_label() throws RecognitionException {
		String_labelContext _localctx = new String_labelContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_labelContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MIDLParser.BOOLEAN, 0); }
		public Boolean_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBoolean_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBoolean_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBoolean_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_labelContext boolean_label() throws RecognitionException {
		Boolean_labelContext _localctx = new Boolean_labelContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolean_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_opContext extends ParserRuleContext {
		public Mult_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterMult_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitMult_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitMult_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_opContext extends ParserRuleContext {
		public Shift_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterShift_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitShift_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitShift_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_opContext shift_op() throws RecognitionException {
		Shift_opContext _localctx = new Shift_opContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shift_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_opContext extends ParserRuleContext {
		public And_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterAnd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitAnd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitAnd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_opContext and_op() throws RecognitionException {
		And_opContext _localctx = new And_opContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_and_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xor_opContext extends ParserRuleContext {
		public Xor_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterXor_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitXor_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitXor_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_opContext xor_op() throws RecognitionException {
		Xor_opContext _localctx = new Xor_opContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_xor_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_opContext extends ParserRuleContext {
		public Or_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterOr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitOr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitOr_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_opContext or_op() throws RecognitionException {
		Or_opContext _localctx = new Or_opContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_or_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_bracketContext extends ParserRuleContext {
		public Left_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLeft_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLeft_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLeft_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_bracketContext left_bracket() throws RecognitionException {
		Left_bracketContext _localctx = new Left_bracketContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_left_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_bracketContext extends ParserRuleContext {
		public Right_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterRight_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitRight_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitRight_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_bracketContext right_bracket() throws RecognitionException {
		Right_bracketContext _localctx = new Right_bracketContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_right_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equal_signContext extends ParserRuleContext {
		public Equal_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterEqual_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitEqual_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitEqual_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_signContext equal_sign() throws RecognitionException {
		Equal_signContext _localctx = new Equal_signContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_equal_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_shortContext extends ParserRuleContext {
		public Unsigned_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnsigned_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnsigned_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnsigned_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_shortContext unsigned_short() throws RecognitionException {
		Unsigned_shortContext _localctx = new Unsigned_shortContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unsigned_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__15);
			setState(454);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unit16Context extends ParserRuleContext {
		public Unit16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit16; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnit16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnit16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnit16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unit16Context unit16() throws RecognitionException {
		Unit16Context _localctx = new Unit16Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_unit16);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_longContext extends ParserRuleContext {
		public Unsigned_longContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnsigned_long(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnsigned_long(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnsigned_long(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_longContext unsigned_long() throws RecognitionException {
		Unsigned_longContext _localctx = new Unsigned_longContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unsigned_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__15);
			setState(459);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uint32Context extends ParserRuleContext {
		public Uint32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUint32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUint32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUint32(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Uint32Context uint32() throws RecognitionException {
		Uint32Context _localctx = new Uint32Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_uint32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_long_longContext extends ParserRuleContext {
		public Unsigned_long_longContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_long_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnsigned_long_long(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnsigned_long_long(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnsigned_long_long(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_long_longContext unsigned_long_long() throws RecognitionException {
		Unsigned_long_longContext _localctx = new Unsigned_long_longContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unsigned_long_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__15);
			setState(464);
			match(T__18);
			setState(465);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uint64Context extends ParserRuleContext {
		public Uint64Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint64; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUint64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUint64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUint64(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Uint64Context uint64() throws RecognitionException {
		Uint64Context _localctx = new Uint64Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_uint64);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unit8Context extends ParserRuleContext {
		public Unit8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnit8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnit8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnit8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unit8Context unit8() throws RecognitionException {
		Unit8Context _localctx = new Unit8Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_unit8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortContext extends ParserRuleContext {
		public ShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortContext short_() throws RecognitionException {
		ShortContext _localctx = new ShortContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int16Context extends ParserRuleContext {
		public Int16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int16; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInt16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInt16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInt16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int16Context int16() throws RecognitionException {
		Int16Context _localctx = new Int16Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_int16);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongContext extends ParserRuleContext {
		public LongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongContext long_() throws RecognitionException {
		LongContext _localctx = new LongContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int32Context extends ParserRuleContext {
		public Int32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInt32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInt32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInt32(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int32Context int32() throws RecognitionException {
		Int32Context _localctx = new Int32Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_int32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Long_longContext extends ParserRuleContext {
		public Long_longContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLong_long(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLong_long(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLong_long(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Long_longContext long_long() throws RecognitionException {
		Long_longContext _localctx = new Long_longContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_long_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__18);
			setState(480);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int64Context extends ParserRuleContext {
		public Int64Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int64; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInt64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInt64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInt64(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int64Context int64() throws RecognitionException {
		Int64Context _localctx = new Int64Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_int64);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int8Context extends ParserRuleContext {
		public Int8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInt8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInt8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInt8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int8Context int8() throws RecognitionException {
		Int8Context _localctx = new Int8Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_int8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatContext extends ParserRuleContext {
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleContext extends ParserRuleContext {
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleContext double_() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Long_doubleContext extends ParserRuleContext {
		public Long_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLong_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLong_double(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLong_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Long_doubleContext long_double() throws RecognitionException {
		Long_doubleContext _localctx = new Long_doubleContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_long_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__18);
			setState(491);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_literalContext extends ParserRuleContext {
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitChar_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitChar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_boolean_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scoped_opContext extends ParserRuleContext {
		public Scoped_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterScoped_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitScoped_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitScoped_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scoped_opContext scoped_op() throws RecognitionException {
		Scoped_opContext _localctx = new Scoped_opContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_scoped_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_literalContext extends ParserRuleContext {
		public Struct_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterStruct_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitStruct_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitStruct_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_literalContext struct_literal() throws RecognitionException {
		Struct_literalContext _localctx = new Struct_literalContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_struct_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_curly_braceContext extends ParserRuleContext {
		public Left_curly_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_curly_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLeft_curly_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLeft_curly_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLeft_curly_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_curly_braceContext left_curly_brace() throws RecognitionException {
		Left_curly_braceContext _localctx = new Left_curly_braceContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_left_curly_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_curly_braceContext extends ParserRuleContext {
		public Right_curly_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_curly_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterRight_curly_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitRight_curly_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitRight_curly_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_curly_braceContext right_curly_brace() throws RecognitionException {
		Right_curly_braceContext _localctx = new Right_curly_braceContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_right_curly_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_literalContext extends ParserRuleContext {
		public Module_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterModule_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitModule_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitModule_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_literalContext module_literal() throws RecognitionException {
		Module_literalContext _localctx = new Module_literalContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_module_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(ID);
			setState(512);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MIDLParser.INTEGER, 0); }
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(INTEGER);
			setState(515);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_ptContext extends ParserRuleContext {
		public TerminalNode FLOATING_PT() { return getToken(MIDLParser.FLOATING_PT, 0); }
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Float_ptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_pt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterFloat_pt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitFloat_pt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitFloat_pt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_ptContext float_pt() throws RecognitionException {
		Float_ptContext _localctx = new Float_ptContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_float_pt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(FLOATING_PT);
			setState(518);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MIDLParser.CHAR, 0); }
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(CHAR);
			setState(521);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MIDLParser.STRING, 0); }
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(STRING);
			setState(524);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MIDLParser.BOOLEAN, 0); }
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(BOOLEAN);
			setState(527);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specification_testContext extends ParserRuleContext {
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Specification_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSpecification_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSpecification_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSpecification_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specification_testContext specification_test() throws RecognitionException {
		Specification_testContext _localctx = new Specification_testContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_specification_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			specification();
			setState(530);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_testContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Definition_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDefinition_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDefinition_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDefinition_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_testContext definition_test() throws RecognitionException {
		Definition_testContext _localctx = new Definition_testContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_definition_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			definition();
			setState(533);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_testContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Module_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterModule_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitModule_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitModule_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_testContext module_test() throws RecognitionException {
		Module_testContext _localctx = new Module_testContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_module_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			module();
			setState(536);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_decl_testContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Type_decl_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterType_decl_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitType_decl_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitType_decl_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_decl_testContext type_decl_test() throws RecognitionException {
		Type_decl_testContext _localctx = new Type_decl_testContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_type_decl_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			type_decl();
			setState(539);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_type_testContext extends ParserRuleContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Struct_type_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterStruct_type_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitStruct_type_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitStruct_type_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_type_testContext struct_type_test() throws RecognitionException {
		Struct_type_testContext _localctx = new Struct_type_testContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_struct_type_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			struct_type();
			setState(542);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_list_testContext extends ParserRuleContext {
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Member_list_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterMember_list_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitMember_list_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitMember_list_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_list_testContext member_list_test() throws RecognitionException {
		Member_list_testContext _localctx = new Member_list_testContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_member_list_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			member_list();
			setState(545);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_spec_testContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Type_spec_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterType_spec_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitType_spec_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitType_spec_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_spec_testContext type_spec_test() throws RecognitionException {
		Type_spec_testContext _localctx = new Type_spec_testContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type_spec_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			type_spec();
			setState(548);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scoped_name_testContext extends ParserRuleContext {
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Scoped_name_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped_name_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterScoped_name_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitScoped_name_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitScoped_name_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scoped_name_testContext scoped_name_test() throws RecognitionException {
		Scoped_name_testContext _localctx = new Scoped_name_testContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_scoped_name_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			scoped_name();
			setState(551);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_type_spec_testContext extends ParserRuleContext {
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Base_type_spec_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_spec_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBase_type_spec_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBase_type_spec_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBase_type_spec_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_type_spec_testContext base_type_spec_test() throws RecognitionException {
		Base_type_spec_testContext _localctx = new Base_type_spec_testContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_base_type_spec_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			base_type_spec();
			setState(554);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_pt_type_testContext extends ParserRuleContext {
		public Floating_pt_typeContext floating_pt_type() {
			return getRuleContext(Floating_pt_typeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Floating_pt_type_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_pt_type_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterFloating_pt_type_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitFloating_pt_type_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitFloating_pt_type_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_pt_type_testContext floating_pt_type_test() throws RecognitionException {
		Floating_pt_type_testContext _localctx = new Floating_pt_type_testContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_floating_pt_type_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			floating_pt_type();
			setState(557);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_type_testContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Integer_type_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInteger_type_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInteger_type_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInteger_type_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_type_testContext integer_type_test() throws RecognitionException {
		Integer_type_testContext _localctx = new Integer_type_testContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_integer_type_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			integer_type();
			setState(560);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_int_testContext extends ParserRuleContext {
		public Signed_intContext signed_int() {
			return getRuleContext(Signed_intContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Signed_int_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSigned_int_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSigned_int_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSigned_int_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_int_testContext signed_int_test() throws RecognitionException {
		Signed_int_testContext _localctx = new Signed_int_testContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_signed_int_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			signed_int();
			setState(563);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_int_testContext extends ParserRuleContext {
		public Unsigned_intContext unsigned_int() {
			return getRuleContext(Unsigned_intContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Unsigned_int_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_int_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnsigned_int_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnsigned_int_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnsigned_int_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_int_testContext unsigned_int_test() throws RecognitionException {
		Unsigned_int_testContext _localctx = new Unsigned_int_testContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_unsigned_int_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			unsigned_int();
			setState(566);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarators_testContext extends ParserRuleContext {
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Declarators_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarators_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDeclarators_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDeclarators_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDeclarators_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarators_testContext declarators_test() throws RecognitionException {
		Declarators_testContext _localctx = new Declarators_testContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_declarators_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			declarators();
			setState(569);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarator_testContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Declarator_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDeclarator_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDeclarator_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDeclarator_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarator_testContext declarator_test() throws RecognitionException {
		Declarator_testContext _localctx = new Declarator_testContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_declarator_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			declarator();
			setState(572);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declarator_testContext extends ParserRuleContext {
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Simple_declarator_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarator_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSimple_declarator_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSimple_declarator_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSimple_declarator_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declarator_testContext simple_declarator_test() throws RecognitionException {
		Simple_declarator_testContext _localctx = new Simple_declarator_testContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simple_declarator_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			simple_declarator();
			setState(575);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declarator_testContext extends ParserRuleContext {
		public Array_declaratorContext array_declarator() {
			return getRuleContext(Array_declaratorContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Array_declarator_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declarator_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterArray_declarator_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitArray_declarator_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitArray_declarator_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarator_testContext array_declarator_test() throws RecognitionException {
		Array_declarator_testContext _localctx = new Array_declarator_testContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_array_declarator_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			array_declarator();
			setState(578);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_list_testContext extends ParserRuleContext {
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Exp_list_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterExp_list_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitExp_list_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitExp_list_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_list_testContext exp_list_test() throws RecognitionException {
		Exp_list_testContext _localctx = new Exp_list_testContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_exp_list_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			exp_list();
			setState(581);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_expr_testContext extends ParserRuleContext {
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Or_expr_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterOr_expr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitOr_expr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitOr_expr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expr_testContext or_expr_test() throws RecognitionException {
		Or_expr_testContext _localctx = new Or_expr_testContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_or_expr_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			or_expr();
			setState(584);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xor_expr_testContext extends ParserRuleContext {
		public Xor_exprContext xor_expr() {
			return getRuleContext(Xor_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Xor_expr_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterXor_expr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitXor_expr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitXor_expr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_expr_testContext xor_expr_test() throws RecognitionException {
		Xor_expr_testContext _localctx = new Xor_expr_testContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_xor_expr_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			xor_expr();
			setState(587);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expr_testContext extends ParserRuleContext {
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public And_expr_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterAnd_expr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitAnd_expr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitAnd_expr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expr_testContext and_expr_test() throws RecognitionException {
		And_expr_testContext _localctx = new And_expr_testContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_and_expr_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			and_expr();
			setState(590);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expr_testContext extends ParserRuleContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Shift_expr_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterShift_expr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitShift_expr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitShift_expr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expr_testContext shift_expr_test() throws RecognitionException {
		Shift_expr_testContext _localctx = new Shift_expr_testContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_shift_expr_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			shift_expr();
			setState(593);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_expr_testContext extends ParserRuleContext {
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Add_expr_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterAdd_expr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitAdd_expr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitAdd_expr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_expr_testContext add_expr_test() throws RecognitionException {
		Add_expr_testContext _localctx = new Add_expr_testContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_add_expr_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			add_expr();
			setState(596);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_expr_testContext extends ParserRuleContext {
		public Mult_exprContext mult_expr() {
			return getRuleContext(Mult_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Mult_expr_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expr_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterMult_expr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitMult_expr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitMult_expr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_expr_testContext mult_expr_test() throws RecognitionException {
		Mult_expr_testContext _localctx = new Mult_expr_testContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_mult_expr_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			mult_expr();
			setState(599);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expr_testContext extends ParserRuleContext {
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Unary_expr_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnary_expr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnary_expr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnary_expr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expr_testContext unary_expr_test() throws RecognitionException {
		Unary_expr_testContext _localctx = new Unary_expr_testContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_unary_expr_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			unary_expr();
			setState(602);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_testContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MIDLParser.EOF, 0); }
		public Literal_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLiteral_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLiteral_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLiteral_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_testContext literal_test() throws RecognitionException {
		Literal_testContext _localctx = new Literal_testContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_literal_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			literal();
			setState(605);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0260\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0001\u0000\u0001\u0000\u0005\u0000\u00cd\b\u0000\n\u0000\f\u0000"+
		"\u00d0\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00d8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u00df\b\u0002\n\u0002\f\u0002\u00e2"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00ea\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00f6\b\u0005\n\u0005\f\u0005\u00f9\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00fe\b\u0006\u0001\u0007\u0003\u0007"+
		"\u0101\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0107\b\u0007\n\u0007\f\u0007\u010a\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0111\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u0116\b\t"+
		"\u0001\n\u0001\n\u0003\n\u011a\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u011e\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0122\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0126\b\u000b\u0001\u000b\u0003\u000b\u0129"+
		"\b\u000b\u0001\f\u0001\f\u0003\f\u012d\b\f\u0001\f\u0001\f\u0003\f\u0131"+
		"\b\f\u0001\f\u0001\f\u0003\f\u0135\b\f\u0001\f\u0003\f\u0138\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u013e\b\r\n\r\f\r\u0141\t\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0145\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u014b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0154\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u015b\b\u0011\n\u0011\f\u0011\u015e\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0166\b\u0012\n"+
		"\u0012\f\u0012\u0169\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u016f\b\u0013\n\u0013\f\u0013\u0172\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0178\b\u0014\n\u0014"+
		"\f\u0014\u017b\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0181\b\u0015\n\u0015\f\u0015\u0184\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u018a\b\u0016\n\u0016\f\u0016"+
		"\u018d\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0193\b\u0017\n\u0017\f\u0017\u0196\t\u0017\u0001\u0018\u0003\u0018\u0199"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01a2\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u0001"+
		"3\u00014\u00014\u00015\u00015\u00016\u00016\u00016\u00017\u00017\u0001"+
		"8\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001"+
		"A\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001I\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001"+
		"P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001S\u0001"+
		"S\u0001S\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0001V\u0001V\u0001"+
		"V\u0001W\u0001W\u0001W\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001"+
		"Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001]\u0001"+
		"]\u0001]\u0001^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001`\u0001`\u0001"+
		"`\u0001a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001c\u0001c\u0001c\u0001"+
		"d\u0001d\u0001d\u0001d\u0000\u0000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u0000\u0004\u0001\u0000\u0001\u0003"+
		"\u0001\u0000\u0004\u0006\u0001\u0000\u0001\u0002\u0001\u0000\u0007\b\u0226"+
		"\u0000\u00ca\u0001\u0000\u0000\u0000\u0002\u00d7\u0001\u0000\u0000\u0000"+
		"\u0004\u00d9\u0001\u0000\u0000\u0000\u0006\u00e9\u0001\u0000\u0000\u0000"+
		"\b\u00eb\u0001\u0000\u0000\u0000\n\u00f7\u0001\u0000\u0000\u0000\f\u00fd"+
		"\u0001\u0000\u0000\u0000\u000e\u0100\u0001\u0000\u0000\u0000\u0010\u0110"+
		"\u0001\u0000\u0000\u0000\u0012\u0115\u0001\u0000\u0000\u0000\u0014\u0119"+
		"\u0001\u0000\u0000\u0000\u0016\u0128\u0001\u0000\u0000\u0000\u0018\u0137"+
		"\u0001\u0000\u0000\u0000\u001a\u0139\u0001\u0000\u0000\u0000\u001c\u0144"+
		"\u0001\u0000\u0000\u0000\u001e\u0146\u0001\u0000\u0000\u0000 \u014c\u0001"+
		"\u0000\u0000\u0000\"\u0155\u0001\u0000\u0000\u0000$\u0161\u0001\u0000"+
		"\u0000\u0000&\u016a\u0001\u0000\u0000\u0000(\u0173\u0001\u0000\u0000\u0000"+
		"*\u017c\u0001\u0000\u0000\u0000,\u0185\u0001\u0000\u0000\u0000.\u018e"+
		"\u0001\u0000\u0000\u00000\u0198\u0001\u0000\u0000\u00002\u01a1\u0001\u0000"+
		"\u0000\u00004\u01a3\u0001\u0000\u0000\u00006\u01a5\u0001\u0000\u0000\u0000"+
		"8\u01a7\u0001\u0000\u0000\u0000:\u01a9\u0001\u0000\u0000\u0000<\u01ab"+
		"\u0001\u0000\u0000\u0000>\u01ad\u0001\u0000\u0000\u0000@\u01af\u0001\u0000"+
		"\u0000\u0000B\u01b1\u0001\u0000\u0000\u0000D\u01b3\u0001\u0000\u0000\u0000"+
		"F\u01b5\u0001\u0000\u0000\u0000H\u01b7\u0001\u0000\u0000\u0000J\u01b9"+
		"\u0001\u0000\u0000\u0000L\u01bb\u0001\u0000\u0000\u0000N\u01bd\u0001\u0000"+
		"\u0000\u0000P\u01bf\u0001\u0000\u0000\u0000R\u01c1\u0001\u0000\u0000\u0000"+
		"T\u01c3\u0001\u0000\u0000\u0000V\u01c5\u0001\u0000\u0000\u0000X\u01c8"+
		"\u0001\u0000\u0000\u0000Z\u01ca\u0001\u0000\u0000\u0000\\\u01cd\u0001"+
		"\u0000\u0000\u0000^\u01cf\u0001\u0000\u0000\u0000`\u01d3\u0001\u0000\u0000"+
		"\u0000b\u01d5\u0001\u0000\u0000\u0000d\u01d7\u0001\u0000\u0000\u0000f"+
		"\u01d9\u0001\u0000\u0000\u0000h\u01db\u0001\u0000\u0000\u0000j\u01dd\u0001"+
		"\u0000\u0000\u0000l\u01df\u0001\u0000\u0000\u0000n\u01e2\u0001\u0000\u0000"+
		"\u0000p\u01e4\u0001\u0000\u0000\u0000r\u01e6\u0001\u0000\u0000\u0000t"+
		"\u01e8\u0001\u0000\u0000\u0000v\u01ea\u0001\u0000\u0000\u0000x\u01ed\u0001"+
		"\u0000\u0000\u0000z\u01ef\u0001\u0000\u0000\u0000|\u01f1\u0001\u0000\u0000"+
		"\u0000~\u01f3\u0001\u0000\u0000\u0000\u0080\u01f5\u0001\u0000\u0000\u0000"+
		"\u0082\u01f7\u0001\u0000\u0000\u0000\u0084\u01f9\u0001\u0000\u0000\u0000"+
		"\u0086\u01fb\u0001\u0000\u0000\u0000\u0088\u01fd\u0001\u0000\u0000\u0000"+
		"\u008a\u01ff\u0001\u0000\u0000\u0000\u008c\u0202\u0001\u0000\u0000\u0000"+
		"\u008e\u0205\u0001\u0000\u0000\u0000\u0090\u0208\u0001\u0000\u0000\u0000"+
		"\u0092\u020b\u0001\u0000\u0000\u0000\u0094\u020e\u0001\u0000\u0000\u0000"+
		"\u0096\u0211\u0001\u0000\u0000\u0000\u0098\u0214\u0001\u0000\u0000\u0000"+
		"\u009a\u0217\u0001\u0000\u0000\u0000\u009c\u021a\u0001\u0000\u0000\u0000"+
		"\u009e\u021d\u0001\u0000\u0000\u0000\u00a0\u0220\u0001\u0000\u0000\u0000"+
		"\u00a2\u0223\u0001\u0000\u0000\u0000\u00a4\u0226\u0001\u0000\u0000\u0000"+
		"\u00a6\u0229\u0001\u0000\u0000\u0000\u00a8\u022c\u0001\u0000\u0000\u0000"+
		"\u00aa\u022f\u0001\u0000\u0000\u0000\u00ac\u0232\u0001\u0000\u0000\u0000"+
		"\u00ae\u0235\u0001\u0000\u0000\u0000\u00b0\u0238\u0001\u0000\u0000\u0000"+
		"\u00b2\u023b\u0001\u0000\u0000\u0000\u00b4\u023e\u0001\u0000\u0000\u0000"+
		"\u00b6\u0241\u0001\u0000\u0000\u0000\u00b8\u0244\u0001\u0000\u0000\u0000"+
		"\u00ba\u0247\u0001\u0000\u0000\u0000\u00bc\u024a\u0001\u0000\u0000\u0000"+
		"\u00be\u024d\u0001\u0000\u0000\u0000\u00c0\u0250\u0001\u0000\u0000\u0000"+
		"\u00c2\u0253\u0001\u0000\u0000\u0000\u00c4\u0256\u0001\u0000\u0000\u0000"+
		"\u00c6\u0259\u0001\u0000\u0000\u0000\u00c8\u025c\u0001\u0000\u0000\u0000"+
		"\u00ca\u00ce\u0003\u0002\u0001\u0000\u00cb\u00cd\u0003\u0002\u0001\u0000"+
		"\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u0001\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0003\u0006\u0003\u0000\u00d2\u00d3\u0003\u0080@\u0000\u00d3"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0004\u0002\u0000\u00d5"+
		"\u00d6\u0003\u0080@\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d8\u0003"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u0088D\u0000\u00da\u00db\u0003"+
		"4\u001a\u0000\u00db\u00dc\u0003\u0084B\u0000\u00dc\u00e0\u0003\u0002\u0001"+
		"\u0000\u00dd\u00df\u0003\u0002\u0001\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003\u0086C\u0000"+
		"\u00e4\u0005\u0001\u0000\u0000\u0000\u00e5\u00ea\u0003\b\u0004\u0000\u00e6"+
		"\u00e7\u0003\u0082A\u0000\u00e7\u00e8\u00034\u001a\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ea\u0007\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003"+
		"\u0082A\u0000\u00ec\u00ed\u00034\u001a\u0000\u00ed\u00ee\u0003\u0084B"+
		"\u0000\u00ee\u00ef\u0003\n\u0005\u0000\u00ef\u00f0\u0003\u0086C\u0000"+
		"\u00f0\t\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\f\u0006\u0000\u00f2"+
		"\u00f3\u0003\u001a\r\u0000\u00f3\u00f4\u0003\u0080@\u0000\u00f4\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f8\u000b\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fe\u0003\u000e\u0007\u0000\u00fb\u00fe"+
		"\u0003\u0010\b\u0000\u00fc\u00fe\u0003\b\u0004\u0000\u00fd\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\r\u0001\u0000\u0000\u0000\u00ff\u0101\u0003~"+
		"?\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0108\u00034\u001a\u0000"+
		"\u0103\u0104\u0003~?\u0000\u0104\u0105\u00034\u001a\u0000\u0105\u0107"+
		"\u0001\u0000\u0000\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0107\u010a"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u000f\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u0111\u0003\u0012\t\u0000\u010c\u0111\u0003"+
		"\u0014\n\u0000\u010d\u0111\u0003x<\u0000\u010e\u0111\u0003z=\u0000\u010f"+
		"\u0111\u0003|>\u0000\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u010c\u0001"+
		"\u0000\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0011\u0001"+
		"\u0000\u0000\u0000\u0112\u0116\u0003r9\u0000\u0113\u0116\u0003t:\u0000"+
		"\u0114\u0116\u0003v;\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0013"+
		"\u0001\u0000\u0000\u0000\u0117\u011a\u0003\u0016\u000b\u0000\u0118\u011a"+
		"\u0003\u0018\f\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u0015\u0001\u0000\u0000\u0000\u011b\u011e\u0003"+
		"d2\u0000\u011c\u011e\u0003f3\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0129\u0001\u0000\u0000\u0000"+
		"\u011f\u0122\u0003h4\u0000\u0120\u0122\u0003j5\u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0129\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0003l6\u0000\u0124\u0126\u0003n7\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0129\u0003p8\u0000\u0128\u011d"+
		"\u0001\u0000\u0000\u0000\u0128\u0121\u0001\u0000\u0000\u0000\u0128\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u0017"+
		"\u0001\u0000\u0000\u0000\u012a\u012d\u0003V+\u0000\u012b\u012d\u0003X"+
		",\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000"+
		"\u0000\u012d\u0138\u0001\u0000\u0000\u0000\u012e\u0131\u0003Z-\u0000\u012f"+
		"\u0131\u0003\\.\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0138\u0001\u0000\u0000\u0000\u0132\u0135"+
		"\u0003^/\u0000\u0133\u0135\u0003`0\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000"+
		"\u0000\u0136\u0138\u0003b1\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137"+
		"\u0130\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0019\u0001\u0000\u0000\u0000\u0139"+
		"\u013f\u0003\u001c\u000e\u0000\u013a\u013b\u0003P(\u0000\u013b\u013c\u0003"+
		"\u001c\u000e\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013a\u0001"+
		"\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u001b\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0145\u0003"+
		"\u001e\u000f\u0000\u0143\u0145\u0003 \u0010\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u001d\u0001\u0000"+
		"\u0000\u0000\u0146\u014a\u00034\u001a\u0000\u0147\u0148\u0003T*\u0000"+
		"\u0148\u0149\u0003$\u0012\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u001f\u0001\u0000\u0000\u0000\u014c\u014d\u00034\u001a\u0000\u014d\u014e"+
		"\u0003N\'\u0000\u014e\u014f\u0003$\u0012\u0000\u014f\u0153\u0003R)\u0000"+
		"\u0150\u0151\u0003T*\u0000\u0151\u0152\u0003\"\u0011\u0000\u0152\u0154"+
		"\u0001\u0000\u0000\u0000\u0153\u0150\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0001\u0000\u0000\u0000\u0154!\u0001\u0000\u0000\u0000\u0155\u0156\u0003"+
		"N\'\u0000\u0156\u015c\u0003$\u0012\u0000\u0157\u0158\u0003P(\u0000\u0158"+
		"\u0159\u0003$\u0012\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0157"+
		"\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0003R)\u0000\u0160#\u0001\u0000\u0000\u0000\u0161\u0167\u0003&\u0013"+
		"\u0000\u0162\u0163\u0003L&\u0000\u0163\u0164\u0003&\u0013\u0000\u0164"+
		"\u0166\u0001\u0000\u0000\u0000\u0165\u0162\u0001\u0000\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168%\u0001\u0000\u0000\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u016a\u0170\u0003(\u0014\u0000\u016b\u016c\u0003"+
		"J%\u0000\u016c\u016d\u0003(\u0014\u0000\u016d\u016f\u0001\u0000\u0000"+
		"\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000"+
		"\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\'\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000"+
		"\u0173\u0179\u0003*\u0015\u0000\u0174\u0175\u0003H$\u0000\u0175\u0176"+
		"\u0003*\u0015\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0174\u0001"+
		"\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a)\u0001\u0000"+
		"\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u0182\u0003,\u0016"+
		"\u0000\u017d\u017e\u0003F#\u0000\u017e\u017f\u0003,\u0016\u0000\u017f"+
		"\u0181\u0001\u0000\u0000\u0000\u0180\u017d\u0001\u0000\u0000\u0000\u0181"+
		"\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183+\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0185\u018b\u0003.\u0017\u0000\u0186\u0187\u0003"+
		"D\"\u0000\u0187\u0188\u0003.\u0017\u0000\u0188\u018a\u0001\u0000\u0000"+
		"\u0000\u0189\u0186\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c-\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018e\u0194\u00030\u0018\u0000\u018f\u0190\u0003B!\u0000\u0190\u0191"+
		"\u00030\u0018\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u018f\u0001"+
		"\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195/\u0001\u0000"+
		"\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u0199\u0003@ \u0000"+
		"\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u00032\u0019\u0000\u019b"+
		"1\u0001\u0000\u0000\u0000\u019c\u01a2\u00036\u001b\u0000\u019d\u01a2\u0003"+
		"8\u001c\u0000\u019e\u01a2\u0003:\u001d\u0000\u019f\u01a2\u0003<\u001e"+
		"\u0000\u01a0\u01a2\u0003>\u001f\u0000\u01a1\u019c\u0001\u0000\u0000\u0000"+
		"\u01a1\u019d\u0001\u0000\u0000\u0000\u01a1\u019e\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a23\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\'\u0000\u0000\u01a4"+
		"5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005(\u0000\u0000\u01a67\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0005)\u0000\u0000\u01a89\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0005*\u0000\u0000\u01aa;\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0005+\u0000\u0000\u01ac=\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005"+
		"&\u0000\u0000\u01ae?\u0001\u0000\u0000\u0000\u01af\u01b0\u0007\u0000\u0000"+
		"\u0000\u01b0A\u0001\u0000\u0000\u0000\u01b1\u01b2\u0007\u0001\u0000\u0000"+
		"\u01b2C\u0001\u0000\u0000\u0000\u01b3\u01b4\u0007\u0002\u0000\u0000\u01b4"+
		"E\u0001\u0000\u0000\u0000\u01b5\u01b6\u0007\u0003\u0000\u0000\u01b6G\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0005\t\u0000\u0000\u01b8I\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0005\n\u0000\u0000\u01baK\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0005\u000b\u0000\u0000\u01bcM\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0005\f\u0000\u0000\u01beO\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0005\r\u0000\u0000\u01c0Q\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0005\u000e\u0000\u0000\u01c2S\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005"+
		"\u000f\u0000\u0000\u01c4U\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u0010"+
		"\u0000\u0000\u01c6\u01c7\u0005\u0011\u0000\u0000\u01c7W\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0005\u0012\u0000\u0000\u01c9Y\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0005\u0010\u0000\u0000\u01cb\u01cc\u0005\u0013\u0000\u0000"+
		"\u01cc[\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u0014\u0000\u0000\u01ce"+
		"]\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0010\u0000\u0000\u01d0\u01d1"+
		"\u0005\u0013\u0000\u0000\u01d1\u01d2\u0005\u0013\u0000\u0000\u01d2_\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0005\u0015\u0000\u0000\u01d4a\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0005\u0016\u0000\u0000\u01d6c\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0005\u0011\u0000\u0000\u01d8e\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005\u0017\u0000\u0000\u01dag\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0005\u0013\u0000\u0000\u01dci\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0005\u0018\u0000\u0000\u01dek\u0001\u0000\u0000\u0000\u01df\u01e0\u0005"+
		"\u0013\u0000\u0000\u01e0\u01e1\u0005\u0013\u0000\u0000\u01e1m\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0005\u0019\u0000\u0000\u01e3o\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0005\u001a\u0000\u0000\u01e5q\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0005\u001b\u0000\u0000\u01e7s\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0005\u001c\u0000\u0000\u01e9u\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0005\u0013\u0000\u0000\u01eb\u01ec\u0005\u001c\u0000\u0000\u01ecw\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\u0005\u001d\u0000\u0000\u01eey\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0005\u001e\u0000\u0000\u01f0{\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0005\u001f\u0000\u0000\u01f2}\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0005 \u0000\u0000\u01f4\u007f\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0005!\u0000\u0000\u01f6\u0081\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0005\"\u0000\u0000\u01f8\u0083\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005"+
		"#\u0000\u0000\u01fa\u0085\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005$\u0000"+
		"\u0000\u01fc\u0087\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005%\u0000\u0000"+
		"\u01fe\u0089\u0001\u0000\u0000\u0000\u01ff\u0200\u0005\'\u0000\u0000\u0200"+
		"\u0201\u0005\u0000\u0000\u0001\u0201\u008b\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0005(\u0000\u0000\u0203\u0204\u0005\u0000\u0000\u0001\u0204\u008d"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0005)\u0000\u0000\u0206\u0207\u0005"+
		"\u0000\u0000\u0001\u0207\u008f\u0001\u0000\u0000\u0000\u0208\u0209\u0005"+
		"*\u0000\u0000\u0209\u020a\u0005\u0000\u0000\u0001\u020a\u0091\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0005+\u0000\u0000\u020c\u020d\u0005\u0000\u0000"+
		"\u0001\u020d\u0093\u0001\u0000\u0000\u0000\u020e\u020f\u0005&\u0000\u0000"+
		"\u020f\u0210\u0005\u0000\u0000\u0001\u0210\u0095\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0003\u0000\u0000\u0000\u0212\u0213\u0005\u0000\u0000\u0001"+
		"\u0213\u0097\u0001\u0000\u0000\u0000\u0214\u0215\u0003\u0002\u0001\u0000"+
		"\u0215\u0216\u0005\u0000\u0000\u0001\u0216\u0099\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0003\u0004\u0002\u0000\u0218\u0219\u0005\u0000\u0000\u0001"+
		"\u0219\u009b\u0001\u0000\u0000\u0000\u021a\u021b\u0003\u0006\u0003\u0000"+
		"\u021b\u021c\u0005\u0000\u0000\u0001\u021c\u009d\u0001\u0000\u0000\u0000"+
		"\u021d\u021e\u0003\b\u0004\u0000\u021e\u021f\u0005\u0000\u0000\u0001\u021f"+
		"\u009f\u0001\u0000\u0000\u0000\u0220\u0221\u0003\n\u0005\u0000\u0221\u0222"+
		"\u0005\u0000\u0000\u0001\u0222\u00a1\u0001\u0000\u0000\u0000\u0223\u0224"+
		"\u0003\f\u0006\u0000\u0224\u0225\u0005\u0000\u0000\u0001\u0225\u00a3\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0003\u000e\u0007\u0000\u0227\u0228\u0005"+
		"\u0000\u0000\u0001\u0228\u00a5\u0001\u0000\u0000\u0000\u0229\u022a\u0003"+
		"\u0010\b\u0000\u022a\u022b\u0005\u0000\u0000\u0001\u022b\u00a7\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0003\u0012\t\u0000\u022d\u022e\u0005\u0000\u0000"+
		"\u0001\u022e\u00a9\u0001\u0000\u0000\u0000\u022f\u0230\u0003\u0014\n\u0000"+
		"\u0230\u0231\u0005\u0000\u0000\u0001\u0231\u00ab\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0003\u0016\u000b\u0000\u0233\u0234\u0005\u0000\u0000\u0001"+
		"\u0234\u00ad\u0001\u0000\u0000\u0000\u0235\u0236\u0003\u0018\f\u0000\u0236"+
		"\u0237\u0005\u0000\u0000\u0001\u0237\u00af\u0001\u0000\u0000\u0000\u0238"+
		"\u0239\u0003\u001a\r\u0000\u0239\u023a\u0005\u0000\u0000\u0001\u023a\u00b1"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0003\u001c\u000e\u0000\u023c\u023d"+
		"\u0005\u0000\u0000\u0001\u023d\u00b3\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0003\u001e\u000f\u0000\u023f\u0240\u0005\u0000\u0000\u0001\u0240\u00b5"+
		"\u0001\u0000\u0000\u0000\u0241\u0242\u0003 \u0010\u0000\u0242\u0243\u0005"+
		"\u0000\u0000\u0001\u0243\u00b7\u0001\u0000\u0000\u0000\u0244\u0245\u0003"+
		"\"\u0011\u0000\u0245\u0246\u0005\u0000\u0000\u0001\u0246\u00b9\u0001\u0000"+
		"\u0000\u0000\u0247\u0248\u0003$\u0012\u0000\u0248\u0249\u0005\u0000\u0000"+
		"\u0001\u0249\u00bb\u0001\u0000\u0000\u0000\u024a\u024b\u0003&\u0013\u0000"+
		"\u024b\u024c\u0005\u0000\u0000\u0001\u024c\u00bd\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\u0003(\u0014\u0000\u024e\u024f\u0005\u0000\u0000\u0001\u024f"+
		"\u00bf\u0001\u0000\u0000\u0000\u0250\u0251\u0003*\u0015\u0000\u0251\u0252"+
		"\u0005\u0000\u0000\u0001\u0252\u00c1\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0003,\u0016\u0000\u0254\u0255\u0005\u0000\u0000\u0001\u0255\u00c3\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0003.\u0017\u0000\u0257\u0258\u0005\u0000"+
		"\u0000\u0001\u0258\u00c5\u0001\u0000\u0000\u0000\u0259\u025a\u00030\u0018"+
		"\u0000\u025a\u025b\u0005\u0000\u0000\u0001\u025b\u00c7\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u00032\u0019\u0000\u025d\u025e\u0005\u0000\u0000\u0001"+
		"\u025e\u00c9\u0001\u0000\u0000\u0000 \u00ce\u00d7\u00e0\u00e9\u00f7\u00fd"+
		"\u0100\u0108\u0110\u0115\u0119\u011d\u0121\u0125\u0128\u012c\u0130\u0134"+
		"\u0137\u013f\u0144\u014a\u0153\u015c\u0167\u0170\u0179\u0182\u018b\u0194"+
		"\u0198\u01a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}