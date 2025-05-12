// Generated from DroolsSimples.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DroolsSimplesParser}.
 */
public interface DroolsSimplesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(DroolsSimplesParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(DroolsSimplesParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#packageDef}.
	 * @param ctx the parse tree
	 */
	void enterPackageDef(DroolsSimplesParser.PackageDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#packageDef}.
	 * @param ctx the parse tree
	 */
	void exitPackageDef(DroolsSimplesParser.PackageDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#importDef}.
	 * @param ctx the parse tree
	 */
	void enterImportDef(DroolsSimplesParser.ImportDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#importDef}.
	 * @param ctx the parse tree
	 */
	void exitImportDef(DroolsSimplesParser.ImportDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void enterRuleDef(DroolsSimplesParser.RuleDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void exitRuleDef(DroolsSimplesParser.RuleDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DroolsSimplesParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DroolsSimplesParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(DroolsSimplesParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(DroolsSimplesParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DroolsSimplesParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DroolsSimplesParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(DroolsSimplesParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(DroolsSimplesParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#patternBinding}.
	 * @param ctx the parse tree
	 */
	void enterPatternBinding(DroolsSimplesParser.PatternBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#patternBinding}.
	 * @param ctx the parse tree
	 */
	void exitPatternBinding(DroolsSimplesParser.PatternBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#constraintList}.
	 * @param ctx the parse tree
	 */
	void enterConstraintList(DroolsSimplesParser.ConstraintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#constraintList}.
	 * @param ctx the parse tree
	 */
	void exitConstraintList(DroolsSimplesParser.ConstraintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(DroolsSimplesParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(DroolsSimplesParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(DroolsSimplesParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(DroolsSimplesParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DroolsSimplesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DroolsSimplesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#thenClause}.
	 * @param ctx the parse tree
	 */
	void enterThenClause(DroolsSimplesParser.ThenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#thenClause}.
	 * @param ctx the parse tree
	 */
	void exitThenClause(DroolsSimplesParser.ThenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(DroolsSimplesParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(DroolsSimplesParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DroolsSimplesParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DroolsSimplesParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolsSimplesParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DroolsSimplesParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolsSimplesParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DroolsSimplesParser.StringLiteralContext ctx);
}