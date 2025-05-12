// Generated from DroolsSimples.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DroolsSimplesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DroolsSimplesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(DroolsSimplesParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#packageDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDef(DroolsSimplesParser.PackageDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#importDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDef(DroolsSimplesParser.ImportDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#ruleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleDef(DroolsSimplesParser.RuleDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DroolsSimplesParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(DroolsSimplesParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(DroolsSimplesParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(DroolsSimplesParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#patternBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternBinding(DroolsSimplesParser.PatternBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#constraintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintList(DroolsSimplesParser.ConstraintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(DroolsSimplesParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(DroolsSimplesParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DroolsSimplesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#thenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenClause(DroolsSimplesParser.ThenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(DroolsSimplesParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DroolsSimplesParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolsSimplesParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DroolsSimplesParser.StringLiteralContext ctx);
}