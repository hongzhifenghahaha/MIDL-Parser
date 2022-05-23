// Generated from /home/hzf/course/compilation_principle/experiment1_gradle/src/main/java/MIDL.g4 by ANTLR 4.10.1
package MIDL;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MIDLParser}.
 */
public interface MIDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MIDLParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(MIDLParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(MIDLParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(MIDLParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(MIDLParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(MIDLParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(MIDLParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(MIDLParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(MIDLParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type(MIDLParser.Struct_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type(MIDLParser.Struct_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#member_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_list(MIDLParser.Member_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#member_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_list(MIDLParser.Member_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(MIDLParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(MIDLParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 */
	void enterScoped_name(MIDLParser.Scoped_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 */
	void exitScoped_name(MIDLParser.Scoped_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spec(MIDLParser.Base_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spec(MIDLParser.Base_type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_pt_type(MIDLParser.Floating_pt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_pt_type(MIDLParser.Floating_pt_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(MIDLParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(MIDLParser.Integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterSigned_int(MIDLParser.Signed_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitSigned_int(MIDLParser.Signed_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_int(MIDLParser.Unsigned_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_int(MIDLParser.Unsigned_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#declarators}.
	 * @param ctx the parse tree
	 */
	void enterDeclarators(MIDLParser.DeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#declarators}.
	 * @param ctx the parse tree
	 */
	void exitDeclarators(MIDLParser.DeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(MIDLParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(MIDLParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarator(MIDLParser.Simple_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarator(MIDLParser.Simple_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 */
	void enterArray_declarator(MIDLParser.Array_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 */
	void exitArray_declarator(MIDLParser.Array_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void enterExp_list(MIDLParser.Exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void exitExp_list(MIDLParser.Exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(MIDLParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(MIDLParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(MIDLParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(MIDLParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(MIDLParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(MIDLParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(MIDLParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(MIDLParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(MIDLParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(MIDLParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(MIDLParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(MIDLParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(MIDLParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(MIDLParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MIDLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MIDLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#id_lable}.
	 * @param ctx the parse tree
	 */
	void enterId_lable(MIDLParser.Id_lableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#id_lable}.
	 * @param ctx the parse tree
	 */
	void exitId_lable(MIDLParser.Id_lableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#integer_label}.
	 * @param ctx the parse tree
	 */
	void enterInteger_label(MIDLParser.Integer_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#integer_label}.
	 * @param ctx the parse tree
	 */
	void exitInteger_label(MIDLParser.Integer_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#float_pt_label}.
	 * @param ctx the parse tree
	 */
	void enterFloat_pt_label(MIDLParser.Float_pt_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#float_pt_label}.
	 * @param ctx the parse tree
	 */
	void exitFloat_pt_label(MIDLParser.Float_pt_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#char_label}.
	 * @param ctx the parse tree
	 */
	void enterChar_label(MIDLParser.Char_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#char_label}.
	 * @param ctx the parse tree
	 */
	void exitChar_label(MIDLParser.Char_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#string_label}.
	 * @param ctx the parse tree
	 */
	void enterString_label(MIDLParser.String_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#string_label}.
	 * @param ctx the parse tree
	 */
	void exitString_label(MIDLParser.String_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#boolean_label}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_label(MIDLParser.Boolean_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#boolean_label}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_label(MIDLParser.Boolean_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(MIDLParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(MIDLParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void enterMult_op(MIDLParser.Mult_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void exitMult_op(MIDLParser.Mult_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(MIDLParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(MIDLParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#shift_op}.
	 * @param ctx the parse tree
	 */
	void enterShift_op(MIDLParser.Shift_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#shift_op}.
	 * @param ctx the parse tree
	 */
	void exitShift_op(MIDLParser.Shift_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#and_op}.
	 * @param ctx the parse tree
	 */
	void enterAnd_op(MIDLParser.And_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#and_op}.
	 * @param ctx the parse tree
	 */
	void exitAnd_op(MIDLParser.And_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#xor_op}.
	 * @param ctx the parse tree
	 */
	void enterXor_op(MIDLParser.Xor_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#xor_op}.
	 * @param ctx the parse tree
	 */
	void exitXor_op(MIDLParser.Xor_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#or_op}.
	 * @param ctx the parse tree
	 */
	void enterOr_op(MIDLParser.Or_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#or_op}.
	 * @param ctx the parse tree
	 */
	void exitOr_op(MIDLParser.Or_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#left_bracket}.
	 * @param ctx the parse tree
	 */
	void enterLeft_bracket(MIDLParser.Left_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#left_bracket}.
	 * @param ctx the parse tree
	 */
	void exitLeft_bracket(MIDLParser.Left_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(MIDLParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(MIDLParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#right_bracket}.
	 * @param ctx the parse tree
	 */
	void enterRight_bracket(MIDLParser.Right_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#right_bracket}.
	 * @param ctx the parse tree
	 */
	void exitRight_bracket(MIDLParser.Right_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#equal_sign}.
	 * @param ctx the parse tree
	 */
	void enterEqual_sign(MIDLParser.Equal_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#equal_sign}.
	 * @param ctx the parse tree
	 */
	void exitEqual_sign(MIDLParser.Equal_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unsigned_short}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_short(MIDLParser.Unsigned_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unsigned_short}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_short(MIDLParser.Unsigned_shortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unit16}.
	 * @param ctx the parse tree
	 */
	void enterUnit16(MIDLParser.Unit16Context ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unit16}.
	 * @param ctx the parse tree
	 */
	void exitUnit16(MIDLParser.Unit16Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unsigned_long}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_long(MIDLParser.Unsigned_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unsigned_long}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_long(MIDLParser.Unsigned_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#uint32}.
	 * @param ctx the parse tree
	 */
	void enterUint32(MIDLParser.Uint32Context ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#uint32}.
	 * @param ctx the parse tree
	 */
	void exitUint32(MIDLParser.Uint32Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unsigned_long_long}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_long_long(MIDLParser.Unsigned_long_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unsigned_long_long}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_long_long(MIDLParser.Unsigned_long_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#uint64}.
	 * @param ctx the parse tree
	 */
	void enterUint64(MIDLParser.Uint64Context ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#uint64}.
	 * @param ctx the parse tree
	 */
	void exitUint64(MIDLParser.Uint64Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unit8}.
	 * @param ctx the parse tree
	 */
	void enterUnit8(MIDLParser.Unit8Context ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unit8}.
	 * @param ctx the parse tree
	 */
	void exitUnit8(MIDLParser.Unit8Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#short}.
	 * @param ctx the parse tree
	 */
	void enterShort(MIDLParser.ShortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#short}.
	 * @param ctx the parse tree
	 */
	void exitShort(MIDLParser.ShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#int16}.
	 * @param ctx the parse tree
	 */
	void enterInt16(MIDLParser.Int16Context ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#int16}.
	 * @param ctx the parse tree
	 */
	void exitInt16(MIDLParser.Int16Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#long}.
	 * @param ctx the parse tree
	 */
	void enterLong(MIDLParser.LongContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#long}.
	 * @param ctx the parse tree
	 */
	void exitLong(MIDLParser.LongContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#int32}.
	 * @param ctx the parse tree
	 */
	void enterInt32(MIDLParser.Int32Context ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#int32}.
	 * @param ctx the parse tree
	 */
	void exitInt32(MIDLParser.Int32Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#long_long}.
	 * @param ctx the parse tree
	 */
	void enterLong_long(MIDLParser.Long_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#long_long}.
	 * @param ctx the parse tree
	 */
	void exitLong_long(MIDLParser.Long_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#int64}.
	 * @param ctx the parse tree
	 */
	void enterInt64(MIDLParser.Int64Context ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#int64}.
	 * @param ctx the parse tree
	 */
	void exitInt64(MIDLParser.Int64Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#int8}.
	 * @param ctx the parse tree
	 */
	void enterInt8(MIDLParser.Int8Context ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#int8}.
	 * @param ctx the parse tree
	 */
	void exitInt8(MIDLParser.Int8Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(MIDLParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(MIDLParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(MIDLParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(MIDLParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#long_double}.
	 * @param ctx the parse tree
	 */
	void enterLong_double(MIDLParser.Long_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#long_double}.
	 * @param ctx the parse tree
	 */
	void exitLong_double(MIDLParser.Long_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(MIDLParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(MIDLParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(MIDLParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(MIDLParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(MIDLParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(MIDLParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#scoped_op}.
	 * @param ctx the parse tree
	 */
	void enterScoped_op(MIDLParser.Scoped_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#scoped_op}.
	 * @param ctx the parse tree
	 */
	void exitScoped_op(MIDLParser.Scoped_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(MIDLParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(MIDLParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#struct_literal}.
	 * @param ctx the parse tree
	 */
	void enterStruct_literal(MIDLParser.Struct_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#struct_literal}.
	 * @param ctx the parse tree
	 */
	void exitStruct_literal(MIDLParser.Struct_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#left_curly_brace}.
	 * @param ctx the parse tree
	 */
	void enterLeft_curly_brace(MIDLParser.Left_curly_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#left_curly_brace}.
	 * @param ctx the parse tree
	 */
	void exitLeft_curly_brace(MIDLParser.Left_curly_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#right_curly_brace}.
	 * @param ctx the parse tree
	 */
	void enterRight_curly_brace(MIDLParser.Right_curly_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#right_curly_brace}.
	 * @param ctx the parse tree
	 */
	void exitRight_curly_brace(MIDLParser.Right_curly_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#module_literal}.
	 * @param ctx the parse tree
	 */
	void enterModule_literal(MIDLParser.Module_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#module_literal}.
	 * @param ctx the parse tree
	 */
	void exitModule_literal(MIDLParser.Module_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MIDLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MIDLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MIDLParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MIDLParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#float_pt}.
	 * @param ctx the parse tree
	 */
	void enterFloat_pt(MIDLParser.Float_ptContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#float_pt}.
	 * @param ctx the parse tree
	 */
	void exitFloat_pt(MIDLParser.Float_ptContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#char}.
	 * @param ctx the parse tree
	 */
	void enterChar(MIDLParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#char}.
	 * @param ctx the parse tree
	 */
	void exitChar(MIDLParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MIDLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MIDLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MIDLParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MIDLParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#specification_test}.
	 * @param ctx the parse tree
	 */
	void enterSpecification_test(MIDLParser.Specification_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#specification_test}.
	 * @param ctx the parse tree
	 */
	void exitSpecification_test(MIDLParser.Specification_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#definition_test}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_test(MIDLParser.Definition_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#definition_test}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_test(MIDLParser.Definition_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#module_test}.
	 * @param ctx the parse tree
	 */
	void enterModule_test(MIDLParser.Module_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#module_test}.
	 * @param ctx the parse tree
	 */
	void exitModule_test(MIDLParser.Module_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#type_decl_test}.
	 * @param ctx the parse tree
	 */
	void enterType_decl_test(MIDLParser.Type_decl_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#type_decl_test}.
	 * @param ctx the parse tree
	 */
	void exitType_decl_test(MIDLParser.Type_decl_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#struct_type_test}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type_test(MIDLParser.Struct_type_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#struct_type_test}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type_test(MIDLParser.Struct_type_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#member_list_test}.
	 * @param ctx the parse tree
	 */
	void enterMember_list_test(MIDLParser.Member_list_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#member_list_test}.
	 * @param ctx the parse tree
	 */
	void exitMember_list_test(MIDLParser.Member_list_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#type_spec_test}.
	 * @param ctx the parse tree
	 */
	void enterType_spec_test(MIDLParser.Type_spec_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#type_spec_test}.
	 * @param ctx the parse tree
	 */
	void exitType_spec_test(MIDLParser.Type_spec_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#scoped_name_test}.
	 * @param ctx the parse tree
	 */
	void enterScoped_name_test(MIDLParser.Scoped_name_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#scoped_name_test}.
	 * @param ctx the parse tree
	 */
	void exitScoped_name_test(MIDLParser.Scoped_name_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#base_type_spec_test}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spec_test(MIDLParser.Base_type_spec_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#base_type_spec_test}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spec_test(MIDLParser.Base_type_spec_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#floating_pt_type_test}.
	 * @param ctx the parse tree
	 */
	void enterFloating_pt_type_test(MIDLParser.Floating_pt_type_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#floating_pt_type_test}.
	 * @param ctx the parse tree
	 */
	void exitFloating_pt_type_test(MIDLParser.Floating_pt_type_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#integer_type_test}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type_test(MIDLParser.Integer_type_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#integer_type_test}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type_test(MIDLParser.Integer_type_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#signed_int_test}.
	 * @param ctx the parse tree
	 */
	void enterSigned_int_test(MIDLParser.Signed_int_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#signed_int_test}.
	 * @param ctx the parse tree
	 */
	void exitSigned_int_test(MIDLParser.Signed_int_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unsigned_int_test}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_int_test(MIDLParser.Unsigned_int_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unsigned_int_test}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_int_test(MIDLParser.Unsigned_int_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#declarators_test}.
	 * @param ctx the parse tree
	 */
	void enterDeclarators_test(MIDLParser.Declarators_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#declarators_test}.
	 * @param ctx the parse tree
	 */
	void exitDeclarators_test(MIDLParser.Declarators_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#declarator_test}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator_test(MIDLParser.Declarator_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#declarator_test}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator_test(MIDLParser.Declarator_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#simple_declarator_test}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarator_test(MIDLParser.Simple_declarator_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#simple_declarator_test}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarator_test(MIDLParser.Simple_declarator_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#array_declarator_test}.
	 * @param ctx the parse tree
	 */
	void enterArray_declarator_test(MIDLParser.Array_declarator_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#array_declarator_test}.
	 * @param ctx the parse tree
	 */
	void exitArray_declarator_test(MIDLParser.Array_declarator_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#exp_list_test}.
	 * @param ctx the parse tree
	 */
	void enterExp_list_test(MIDLParser.Exp_list_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#exp_list_test}.
	 * @param ctx the parse tree
	 */
	void exitExp_list_test(MIDLParser.Exp_list_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#or_expr_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr_test(MIDLParser.Or_expr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#or_expr_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr_test(MIDLParser.Or_expr_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#xor_expr_test}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr_test(MIDLParser.Xor_expr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#xor_expr_test}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr_test(MIDLParser.Xor_expr_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#and_expr_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr_test(MIDLParser.And_expr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#and_expr_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr_test(MIDLParser.And_expr_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#shift_expr_test}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr_test(MIDLParser.Shift_expr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#shift_expr_test}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr_test(MIDLParser.Shift_expr_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#add_expr_test}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr_test(MIDLParser.Add_expr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#add_expr_test}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr_test(MIDLParser.Add_expr_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#mult_expr_test}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr_test(MIDLParser.Mult_expr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#mult_expr_test}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr_test(MIDLParser.Mult_expr_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unary_expr_test}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr_test(MIDLParser.Unary_expr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unary_expr_test}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr_test(MIDLParser.Unary_expr_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#literal_test}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_test(MIDLParser.Literal_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#literal_test}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_test(MIDLParser.Literal_testContext ctx);
}