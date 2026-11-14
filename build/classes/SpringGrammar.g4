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
    | ifStatement
    | forStatement
    ;

// جملة إضافة المتغيرات مثل model.addAttribute("products", list);
modelAttributeStatement
    : 'model' '.' 'addAttribute' '(' STRING ',' expression ')' ';'
    ;

// جملة الإرجاع مثل return "products-list";
returnStatement
    : 'return' expression ';'
    ;

// إضافة الجمل الشرطية والحلقات لدعم الـ Controller بشكل كامل
ifStatement
    : 'if' '(' expression ')' block ('else' block)?
    ;

forStatement
    : 'for' '(' statement expression ';' expression ')' block
    ;

block
    : '{' methodBody* '}'
    | statement
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

// تطوير الـ expressions لتشمل العمليات الحسابية والمقارنات
expression
    : methodCall
    | IDENTIFIER
    | STRING
    | NUMBER
    | 'true' | 'false' | 'null'
    | '(' expression ')'
    | expression op=( '*' | '/' | '%' ) expression
    | expression op=( '+' | '-' ) expression
    | expression op=( '<' | '>' | '<=' | '>=' ) expression
    | expression op=( '==' | '!=' ) expression
    | expression op=( '&&' | '||' ) expression
    ;

methodCall
    : IDENTIFIER '.' IDENTIFIER '(' (expression (',' expression)*)? ')'
    ;

// ---------------------------------------------------------
// الـ Lexer Rules (الرموز الأساسية)
// ---------------------------------------------------------

TEXT
    : ~[<>]+
    ;

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

// ---------------------------------------------------------
// قواعد الـ HTML داخل صفحات القوالب (Views)
// ---------------------------------------------------------
htmlDocument
    : htmlElement*
    ;

htmlElement
    : htmlTagContent htmlBody* htmlCloseTag
    | htmlSelfClosingTag
    ;

htmlTagContent
    : '<' IDENTIFIER htmlAttribute* '>'
    ;

htmlCloseTag
    : '</' IDENTIFIER '>'
    ;

htmlSelfClosingTag
    : '<' IDENTIFIER htmlAttribute* '/>'
    ;

htmlBody
    : htmlElement
    | TEXT
    | expression
    ;

htmlAttribute
    : IDENTIFIER '=' (STRING | expression)
    ;

// ---------------------------------------------------------
// قواعد الـ CSS البسيطة لتنسيق الصفحات
// ---------------------------------------------------------
styleBlock
    : '<style>' cssRule* '</style>'
    ;

cssRule
    : cssSelector '{' cssProperty+ '}'
    ;

cssSelector
    : IDENTIFIER | '.' IDENTIFIER | '#' IDENTIFIER
    ;

cssProperty
    : IDENTIFIER ':' (STRING | NUMBER | IDENTIFIER ) ';'
    ;