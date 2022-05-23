// Generated from /home/hzf/course/compilation_principle/experiment1_gradle/src/main/java/MIDL.g4 by ANTLR 4.10.1
package MIDL;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MIDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MIDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MIDLParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(MIDLParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(MIDLParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(MIDLParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(MIDLParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#struct_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type(MIDLParser.Struct_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list(MIDLParser.Member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(MIDLParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScoped_name(MIDLParser.Scoped_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type_spec(MIDLParser.Base_type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_pt_type(MIDLParser.Floating_pt_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type(MIDLParser.Integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_int(MIDLParser.Signed_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_int(MIDLParser.Unsigned_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarators(MIDLParser.DeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(MIDLParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declarator(MIDLParser.Simple_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declarator(MIDLParser.Array_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_list(MIDLParser.Exp_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expr(MIDLParser.Or_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(MIDLParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(MIDLParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(MIDLParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(MIDLParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(MIDLParser.Mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(MIDLParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MIDLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#id_lable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_lable(MIDLParser.Id_lableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#integer_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_label(MIDLParser.Integer_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#float_pt_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_pt_label(MIDLParser.Float_pt_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#char_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_label(MIDLParser.Char_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#string_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_label(MIDLParser.String_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#boolean_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_label(MIDLParser.Boolean_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(MIDLParser.Unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#mult_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_op(MIDLParser.Mult_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(MIDLParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#shift_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_op(MIDLParser.Shift_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#and_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_op(MIDLParser.And_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#xor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_op(MIDLParser.Xor_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#or_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_op(MIDLParser.Or_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#left_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_bracket(MIDLParser.Left_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(MIDLParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#right_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_bracket(MIDLParser.Right_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#equal_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_sign(MIDLParser.Equal_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unsigned_short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_short(MIDLParser.Unsigned_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unit16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit16(MIDLParser.Unit16Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unsigned_long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_long(MIDLParser.Unsigned_longContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#uint32}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUint32(MIDLParser.Uint32Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unsigned_long_long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_long_long(MIDLParser.Unsigned_long_longContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#uint64}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUint64(MIDLParser.Uint64Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unit8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit8(MIDLParser.Unit8Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort(MIDLParser.ShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#int16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt16(MIDLParser.Int16Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong(MIDLParser.LongContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#int32}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt32(MIDLParser.Int32Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#long_long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong_long(MIDLParser.Long_longContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#int64}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt64(MIDLParser.Int64Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#int8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt8(MIDLParser.Int8Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(MIDLParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(MIDLParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#long_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong_double(MIDLParser.Long_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(MIDLParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(MIDLParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(MIDLParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#scoped_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScoped_op(MIDLParser.Scoped_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(MIDLParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#struct_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_literal(MIDLParser.Struct_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#left_curly_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_curly_brace(MIDLParser.Left_curly_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#right_curly_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_curly_brace(MIDLParser.Right_curly_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#module_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_literal(MIDLParser.Module_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MIDLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MIDLParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#float_pt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_pt(MIDLParser.Float_ptContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(MIDLParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MIDLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(MIDLParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#specification_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification_test(MIDLParser.Specification_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#definition_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_test(MIDLParser.Definition_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#module_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_test(MIDLParser.Module_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#type_decl_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl_test(MIDLParser.Type_decl_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#struct_type_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type_test(MIDLParser.Struct_type_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#member_list_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list_test(MIDLParser.Member_list_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#type_spec_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec_test(MIDLParser.Type_spec_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#scoped_name_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScoped_name_test(MIDLParser.Scoped_name_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#base_type_spec_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type_spec_test(MIDLParser.Base_type_spec_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#floating_pt_type_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_pt_type_test(MIDLParser.Floating_pt_type_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#integer_type_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type_test(MIDLParser.Integer_type_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#signed_int_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_int_test(MIDLParser.Signed_int_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unsigned_int_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_int_test(MIDLParser.Unsigned_int_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#declarators_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarators_test(MIDLParser.Declarators_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#declarator_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator_test(MIDLParser.Declarator_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#simple_declarator_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declarator_test(MIDLParser.Simple_declarator_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#array_declarator_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declarator_test(MIDLParser.Array_declarator_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#exp_list_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_list_test(MIDLParser.Exp_list_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#or_expr_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expr_test(MIDLParser.Or_expr_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#xor_expr_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr_test(MIDLParser.Xor_expr_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#and_expr_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr_test(MIDLParser.And_expr_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#shift_expr_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr_test(MIDLParser.Shift_expr_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#add_expr_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr_test(MIDLParser.Add_expr_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#mult_expr_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr_test(MIDLParser.Mult_expr_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unary_expr_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr_test(MIDLParser.Unary_expr_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#literal_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_test(MIDLParser.Literal_testContext ctx);
}