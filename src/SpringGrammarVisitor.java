// Generated from SpringGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpringGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpringGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#controllerFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerFile(SpringGrammarParser.ControllerFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SpringGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#classKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassKeyword(SpringGrammarParser.ClassKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(SpringGrammarParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SpringGrammarParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(SpringGrammarParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SpringGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(SpringGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(SpringGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SpringGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SpringGrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SpringGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(SpringGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#modelAttributeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelAttributeStatement(SpringGrammarParser.ModelAttributeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SpringGrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SpringGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SpringGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SpringGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SpringGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpringGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(SpringGrammarParser.MethodCallContext ctx);
}