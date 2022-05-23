grammar MIDL;

/**
 * MIDL Lexer Rules
 * 词法规则
 */
fragment LETTER : [a-z] | [A-Z];
fragment DIGIT : [0-9];
fragment UNDERLINE : '_';
fragment INTEGER_TYPE_SUFFIX : 'l' | 'L';
fragment EXPONENT : ('e' | 'E') ('+' | '-')? [0-9]+;
fragment FLOAT_TYPE_SUFFIX : 'f'|'F'|'d'|'D';
fragment ESCAPE_SEQUENCE : '\\'('b' | 't' | 'n' | 'f' | 'r' | '"'| '\'' | '\\');

BOOLEAN : 'TRUE' | 'true' | 'FALSE' | 'false'; //BOOLEAN必须要放在ID前面，否则TRUE会匹配成ID（antlr4是贪心匹配的）
ID : LETTER (UNDERLINE? (LETTER | DIGIT))*;
INTEGER : ('0' | [1-9] [0-9]*) INTEGER_TYPE_SUFFIX?;
FLOATING_PT : [0-9]+ '.' [0-9]* EXPONENT? FLOAT_TYPE_SUFFIX?
            | '.' [0-9]+ EXPONENT? FLOAT_TYPE_SUFFIX?
            | [0-9]+ EXPONENT FLOAT_TYPE_SUFFIX?
            | [0-9]+ EXPONENT? FLOAT_TYPE_SUFFIX
            ;
CHAR : '\'' (ESCAPE_SEQUENCE | (~('\\' | '\'')) ) '\'';
STRING : '"' (ESCAPE_SEQUENCE | (~('\\' | '"')) )* '"';

WS : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines


/**
 * MIDL Parser Rules
 * 语法规则
 */
specification : definition (definition)*;
definition : type_decl semicolon | module semicolon;
module : module_literal id_lable left_curly_brace definition (definition)* right_curly_brace;
type_decl : struct_literal id_lable | struct_type;
struct_type : struct_literal id_lable left_curly_brace member_list right_curly_brace;
member_list : ( type_spec declarators semicolon)*;
type_spec : base_type_spec | struct_type | scoped_name;
scoped_name : (scoped_op)? id_lable (scoped_op id_lable)*;
base_type_spec : floating_pt_type | integer_type | char_literal | string_literal | boolean_literal;
floating_pt_type : float | double | long_double;
integer_type : signed_int | unsigned_int;
signed_int : (short | int16 )
           | (long | int32)
           | (long_long | int64)
           | int8
           ;
unsigned_int : (unsigned_short | unit16)
             | (unsigned_long | uint32)
             | (unsigned_long_long | uint64)
             | unit8
             ;
declarators : declarator ( comma declarator)*;
declarator : simple_declarator | array_declarator;
simple_declarator : id_lable ( equal_sign or_expr)?;
array_declarator : id_lable left_bracket or_expr right_bracket (equal_sign exp_list)?;
exp_list : left_bracket or_expr ( comma or_expr)* right_bracket;
or_expr : xor_expr ( or_op xor_expr)*;
xor_expr : and_expr ( xor_op and_expr)*;
and_expr : shift_expr ( and_op shift_expr)*;
shift_expr : add_expr ( (shift_op) add_expr)*;
add_expr : mult_expr ( (add_op) mult_expr)*;
mult_expr : unary_expr ( (mult_op) unary_expr)*;
unary_expr : (unary_op)? literal;
literal : integer_label | float_pt_label | char_label | string_label | boolean_label;

/**
 * Literal Parser Rules
 * 用于代替字面量的词法规则，这样就可以访问字面量的节点了，也可以使用 label 来实现这一点
 */
unary_op : '-' | '+' | '~';
mult_op : '*' | '/' | '%';
add_op : '+' | '-';
shift_op : '>>' | '<<';
and_op : '&';
xor_op : '^';
or_op : '|';
left_bracket : '[';
comma : ',';
right_bracket : ']';
equal_sign : '=';
unsigned_short : 'unsigned' 'short';
unit16 : 'uint16';
unsigned_long : 'unsigned' 'long';
uint32: 'uint32';
unsigned_long_long : 'unsigned' 'long' 'long';
uint64 : 'uint64';
unit8 : 'uint8';
short : 'short';
int16 : 'int16';
long : 'long';
int32 : 'int32';
long_long : 'long' 'long';
int64 : 'int64';
int8 : 'int8';
float : 'float';
double : 'double';
long_double : 'long' 'double';
char_literal : 'char';
string_literal : 'string';
boolean_literal : 'boolean';
scoped_op : '::';
semicolon : ';';
struct_literal : 'struct';
left_curly_brace : '{';
right_curly_brace : '}';
module_literal : 'module';

id_lable : ID;
integer_label: INTEGER;
float_pt_label: FLOATING_PT;
char_label: CHAR;
string_label: STRING;
boolean_label: BOOLEAN;

/**
 * Parser Test Rules
 * 测试用的语法规则，添加了 EOF 之后，字符串有完整匹配时才算合格的语法，部分匹配时则不行。
 */
id: ID EOF;
integer: INTEGER EOF;
float_pt: FLOATING_PT EOF;
char: CHAR EOF;
string: STRING EOF;
boolean: BOOLEAN EOF;

specification_test : specification EOF;
definition_test : definition EOF;
module_test : module EOF;
type_decl_test : type_decl EOF;
struct_type_test : struct_type EOF;
member_list_test : member_list EOF;
type_spec_test : type_spec EOF;
scoped_name_test : scoped_name EOF;
base_type_spec_test : base_type_spec EOF;
floating_pt_type_test : floating_pt_type EOF;
integer_type_test : integer_type EOF;
signed_int_test : signed_int EOF;
unsigned_int_test : unsigned_int EOF;
declarators_test : declarators EOF;
declarator_test : declarator EOF;
simple_declarator_test : simple_declarator EOF;
array_declarator_test : array_declarator EOF;
exp_list_test : exp_list EOF;
or_expr_test : or_expr EOF;
xor_expr_test : xor_expr EOF;
and_expr_test : and_expr EOF;
shift_expr_test : shift_expr EOF;
add_expr_test : add_expr EOF;
mult_expr_test : mult_expr EOF;
unary_expr_test : unary_expr EOF;
literal_test : literal EOF;
