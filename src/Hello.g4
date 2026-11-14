grammar Hello;

start : 'hello' ID EOF;

ID : [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;