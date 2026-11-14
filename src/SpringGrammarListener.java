// Generated from SpringGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpringGrammarParser}.
 */
public interface SpringGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#controllerFile}.
	 * @param ctx the parse tree
	 */
	void enterControllerFile(SpringGrammarParser.ControllerFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#controllerFile}.
	 * @param ctx the parse tree
	 */
	void exitControllerFile(SpringGrammarParser.ControllerFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SpringGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SpringGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#classKeyword}.
	 * @param ctx the parse tree
	 */
	void enterClassKeyword(SpringGrammarParser.ClassKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#classKeyword}.
	 * @param ctx the parse tree
	 */
	void exitClassKeyword(SpringGrammarParser.ClassKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(SpringGrammarParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(SpringGrammarParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SpringGrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SpringGrammarParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(SpringGrammarParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(SpringGrammarParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SpringGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SpringGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(SpringGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(SpringGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(SpringGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(SpringGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SpringGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SpringGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SpringGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SpringGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SpringGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SpringGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SpringGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SpringGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#modelAttributeStatement}.
	 * @param ctx the parse tree
	 */
	void enterModelAttributeStatement(SpringGrammarParser.ModelAttributeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#modelAttributeStatement}.
	 * @param ctx the parse tree
	 */
	void exitModelAttributeStatement(SpringGrammarParser.ModelAttributeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SpringGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SpringGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SpringGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SpringGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(SpringGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(SpringGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SpringGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SpringGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SpringGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SpringGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpringGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(SpringGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpringGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(SpringGrammarParser.MethodCallContext ctx);
}