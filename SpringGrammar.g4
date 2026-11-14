
grammar SpringGrammar;

// القاعدة الرئيسية للملف
controllerFile
    : classDeclaration EOF
    ;
classDeclaration
    : '@Controller' annotation* classKeyword? IDENTIFIER '{' member* '}'
    ;

classKeyword
    : 'public' | 'private' | 'protected'
    ;

member
    : methodDeclaration
    | fieldDeclaration
    ;

annotation
    : '@' IDENTIFIER ('(' (elementValuePair | value)? ')')?
    ;

elementValuePair
    : IDENTIFIER '=' (expression | STRING)
    ;

value
    : STRING | IDENTIFIER
    ;

fieldDeclaration
    : annotation* type IDENTIFIER ('=' expression)? ';'
    ;

methodDeclaration
    : annotation* 'public' type IDENTIFIER '(' parameterList? ')' '{' methodBody* '}'
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : annotation* type IDENTIFIER
    ;

type
    : IDENTIFIER ('<' type '>')?
    | 'String' | 'int' | 'long' | 'boolean' | 'List' | 'Model'
    ;

methodBody
    : statement
    | returnStatement
    | modelAttributeStatement
    ;

// جملة إضافة المتغيرات مثل model.addAttribute("products", list);
modelAttributeStatement
    : 'model' '.' 'addAttribute' '(' STRING ',' expression ')' ';'
    ;

// جملة الإرجاع مثل return "products-list";
returnStatement
    : 'return' STRING ';'
    ;

statement
    : assignmentStatement
    | expressionStatement
    ;

assignmentStatement
    : IDENTIFIER '=' expression ';'
    ;

expressionStatement
    : expression ';'
    ;

expression
    : methodCall
    | IDENTIFIER
    | STRING
    | NUMBER
    ;

methodCall
    : IDENTIFIER '.' IDENTIFIER '(' (expression (',' expression)*)? ')'
    ;

// الـ Lexer Rules (الرموز الأساسية)
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

STRING
    : '"' ~["\r\n]* '"'
    | '\'' ~['\r\n]* '\''
    ;

NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

WS
    : [ \t\r\n]+ -> skip
    ;