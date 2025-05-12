// Generated from DroolsSimples.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DroolsSimplesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, TRUE=27, FALSE=28, ID=29, INT=30, STRING=31, WS=32, 
		COMMENT=33, LINE_COMMENT=34;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDef = 1, RULE_importDef = 2, RULE_ruleDef = 3, 
		RULE_condition = 4, RULE_attributes = 5, RULE_attribute = 6, RULE_whenClause = 7, 
		RULE_patternBinding = 8, RULE_constraintList = 9, RULE_constraint = 10, 
		RULE_eval = 11, RULE_expression = 12, RULE_thenClause = 13, RULE_action = 14, 
		RULE_qualifiedName = 15, RULE_stringLiteral = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDef", "importDef", "ruleDef", "condition", 
			"attributes", "attribute", "whenClause", "patternBinding", "constraintList", 
			"constraint", "eval", "expression", "thenClause", "action", "qualifiedName", 
			"stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "';'", "'import'", "'.'", "'*'", "'rule'", "'end'", 
			"'salience'", "'dialect'", "'no-loop'", "'agenda-group'", "'duration'", 
			"'timer'", "'when'", "':'", "'('", "')'", "','", "'>'", "'>='", "'<'", 
			"'<='", "'=='", "'!='", "'eval'", "'then'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TRUE", "FALSE", "ID", "INT", "STRING", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DroolsSimples.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int countConditions(String text) {
	        int count = 0;
	        // Count occurrences of certain keywords as a simple heuristic
	        String[] tokens = text.split("\\s+");
	        for (String token : tokens) {
	            if (token.equals("eval") || token.contains(":") || token.contains("==") || 
	                token.contains("!=") || token.contains(">") || token.contains("<")) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    // Declarar a variável como membro da classe
	    int conditionCount = 0;

	public DroolsSimplesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DroolsSimplesParser.EOF, 0); }
		public PackageDefContext packageDef() {
			return getRuleContext(PackageDefContext.class,0);
		}
		public List<ImportDefContext> importDef() {
			return getRuleContexts(ImportDefContext.class);
		}
		public ImportDefContext importDef(int i) {
			return getRuleContext(ImportDefContext.class,i);
		}
		public List<RuleDefContext> ruleDef() {
			return getRuleContexts(RuleDefContext.class);
		}
		public RuleDefContext ruleDef(int i) {
			return getRuleContext(RuleDefContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(34);
				packageDef();
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(37);
				importDef();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(43);
				ruleDef();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDefContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterPackageDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitPackageDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitPackageDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDefContext packageDef() throws RecognitionException {
		PackageDefContext _localctx = new PackageDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			qualifiedName();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(53);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterImportDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitImportDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitImportDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefContext importDef() throws RecognitionException {
		ImportDefContext _localctx = new ImportDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__2);
			setState(57);
			qualifiedName();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(58);
				match(T__3);
				setState(59);
				match(T__4);
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(62);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleDefContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral;
		public WhenClauseContext whenClause;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public WhenClauseContext whenClause() {
			return getRuleContext(WhenClauseContext.class,0);
		}
		public ThenClauseContext thenClause() {
			return getRuleContext(ThenClauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public RuleDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterRuleDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitRuleDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitRuleDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleDefContext ruleDef() throws RecognitionException {
		RuleDefContext _localctx = new RuleDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleDef);

		    int complexityScore = 0;
		    conditionCount = 0;  // Inicializa a variável do escopo da classe
		    System.out.println("Analisando regra...");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__5);
			setState(66);
			((RuleDefContext)_localctx).stringLiteral = stringLiteral();

			    System.out.println("Nome da regra: " + (((RuleDefContext)_localctx).stringLiteral!=null?_input.getText(((RuleDefContext)_localctx).stringLiteral.start,((RuleDefContext)_localctx).stringLiteral.stop):null));
			  
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) {
				{
				setState(68);
				attributes();
				}
			}

			setState(71);
			((RuleDefContext)_localctx).whenClause = whenClause();
			setState(72);
			thenClause();
			setState(73);
			match(T__6);

			    // Ação semântica para analisar a complexidade da regra
			    if ((((RuleDefContext)_localctx).whenClause!=null?_input.getText(((RuleDefContext)_localctx).whenClause.start,((RuleDefContext)_localctx).whenClause.stop):null) != null) {
			        complexityScore += countConditions((((RuleDefContext)_localctx).whenClause!=null?_input.getText(((RuleDefContext)_localctx).whenClause.start,((RuleDefContext)_localctx).whenClause.stop):null));
			    }
			    System.out.println("Número de condições: " + conditionCount);
			    System.out.println("Complexidade da regra: " + complexityScore);
			    System.out.println("-------------------------------");
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public PatternBindingContext patternBinding() {
			return getRuleContext(PatternBindingContext.class,0);
		}
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				patternBinding();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				eval();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);

			    conditionCount++;  // Agora acessa a variável do escopo da classe

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				attribute();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DroolsSimplesParser.INT, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(DroolsSimplesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DroolsSimplesParser.FALSE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__7);
				setState(86);
				match(INT);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__8);
				setState(88);
				stringLiteral();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(T__9);
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(T__10);
				setState(92);
				stringLiteral();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(T__11);
				setState(94);
				match(INT);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(T__12);
				setState(96);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whenClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__13);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==ID) {
				{
				{
				setState(100);
				condition();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternBindingContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DroolsSimplesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DroolsSimplesParser.ID, i);
		}
		public ConstraintListContext constraintList() {
			return getRuleContext(ConstraintListContext.class,0);
		}
		public PatternBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterPatternBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitPatternBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitPatternBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternBindingContext patternBinding() throws RecognitionException {
		PatternBindingContext _localctx = new PatternBindingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_patternBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(T__14);
			setState(108);
			match(ID);
			setState(109);
			match(T__15);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(110);
				constraintList();
				}
			}

			setState(113);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintListContext extends ParserRuleContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ConstraintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterConstraintList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitConstraintList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitConstraintList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintListContext constraintList() throws RecognitionException {
		ConstraintListContext _localctx = new ConstraintListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constraintList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			constraint();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(116);
				match(T__17);
				setState(117);
				constraint();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(DroolsSimplesParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constraint);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ID);
				setState(124);
				((ConstraintContext)_localctx).op = match(T__18);
				setState(125);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(ID);
				setState(127);
				((ConstraintContext)_localctx).op = match(T__19);
				setState(128);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(ID);
				setState(130);
				((ConstraintContext)_localctx).op = match(T__20);
				setState(131);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(ID);
				setState(133);
				((ConstraintContext)_localctx).op = match(T__21);
				setState(134);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(ID);
				setState(136);
				((ConstraintContext)_localctx).op = match(T__22);
				setState(137);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(ID);
				setState(139);
				((ConstraintContext)_localctx).op = match(T__23);
				setState(140);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EvalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__24);
			setState(144);
			match(T__15);
			setState(145);
			expression();
			setState(146);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DroolsSimplesParser.ID, 0); }
		public TerminalNode INT() { return getToken(DroolsSimplesParser.INT, 0); }
		public TerminalNode TRUE() { return getToken(DroolsSimplesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DroolsSimplesParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(DroolsSimplesParser.STRING, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThenClauseContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ThenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterThenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitThenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitThenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenClauseContext thenClause() throws RecognitionException {
		ThenClauseContext _localctx = new ThenClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_thenClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__25);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(151);
				action();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DroolsSimplesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DroolsSimplesParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(158);
				match(T__3);
				setState(159);
				match(ID);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__15);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) {
				{
				setState(166);
				expression();
				}
			}

			setState(169);
			match(T__16);
			setState(170);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DroolsSimplesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DroolsSimplesParser.ID, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					match(T__3);
					setState(174);
					match(ID);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DroolsSimplesParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolsSimplesListener ) ((DroolsSimplesListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroolsSimplesVisitor ) return ((DroolsSimplesVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0003\u0000$\b\u0000\u0001\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0005\u0000"+
		"-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0003\u0002"+
		"@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"F\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005\u0004\u0005"+
		"R\b\u0005\u000b\u0005\f\u0005S\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007f\b\u0007\n\u0007\f\u0007i\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bp\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\tw\b\t\n\t\f\tz\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u008e\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r"+
		"\u0099\b\r\n\r\f\r\u009c\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00a1\b\u000e\n\u000e\f\u000e\u00a4\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00a8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00b0\b\u000f\n\u000f\f\u000f\u00b3"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0002\u0001\u0000\u001b\u001c\u0001\u0000\u001b\u001f\u00bf\u0000"+
		"#\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u00048\u0001"+
		"\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000"+
		"\u0000\nQ\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000\u0000\u000ec\u0001"+
		"\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000"+
		"\u0000\u0014\u008d\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000"+
		"\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u0096\u0001\u0000\u0000"+
		"\u0000\u001c\u009d\u0001\u0000\u0000\u0000\u001e\u00ac\u0001\u0000\u0000"+
		"\u0000 \u00b4\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$(\u0001\u0000\u0000\u0000"+
		"%\'\u0003\u0004\u0002\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000).\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000+-\u0003\u0006\u0003\u0000,+\u0001"+
		"\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000\u0000\u000034\u0005"+
		"\u0001\u0000\u000046\u0003\u001e\u000f\u000057\u0005\u0002\u0000\u0000"+
		"65\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0003\u0001\u0000"+
		"\u0000\u000089\u0005\u0003\u0000\u00009<\u0003\u001e\u000f\u0000:;\u0005"+
		"\u0004\u0000\u0000;=\u0005\u0005\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>@\u0005\u0002\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0005\u0001"+
		"\u0000\u0000\u0000AB\u0005\u0006\u0000\u0000BC\u0003 \u0010\u0000CE\u0006"+
		"\u0003\uffff\uffff\u0000DF\u0003\n\u0005\u0000ED\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0003\u000e\u0007"+
		"\u0000HI\u0003\u001a\r\u0000IJ\u0005\u0007\u0000\u0000JK\u0006\u0003\uffff"+
		"\uffff\u0000K\u0007\u0001\u0000\u0000\u0000LO\u0003\u0010\b\u0000MO\u0003"+
		"\u0016\u000b\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"O\t\u0001\u0000\u0000\u0000PR\u0003\f\u0006\u0000QP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005\b\u0000\u0000Vb\u0005"+
		"\u001e\u0000\u0000WX\u0005\t\u0000\u0000Xb\u0003 \u0010\u0000YZ\u0005"+
		"\n\u0000\u0000Zb\u0007\u0000\u0000\u0000[\\\u0005\u000b\u0000\u0000\\"+
		"b\u0003 \u0010\u0000]^\u0005\f\u0000\u0000^b\u0005\u001e\u0000\u0000_"+
		"`\u0005\r\u0000\u0000`b\u0003 \u0010\u0000aU\u0001\u0000\u0000\u0000a"+
		"W\u0001\u0000\u0000\u0000aY\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000"+
		"\u0000a]\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b\r\u0001\u0000"+
		"\u0000\u0000cg\u0005\u000e\u0000\u0000df\u0003\b\u0004\u0000ed\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000h\u000f\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000jk\u0005\u001d\u0000\u0000kl\u0005\u000f\u0000\u0000lm\u0005\u001d"+
		"\u0000\u0000mo\u0005\u0010\u0000\u0000np\u0003\u0012\t\u0000on\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005"+
		"\u0011\u0000\u0000r\u0011\u0001\u0000\u0000\u0000sx\u0003\u0014\n\u0000"+
		"tu\u0005\u0012\u0000\u0000uw\u0003\u0014\n\u0000vt\u0001\u0000\u0000\u0000"+
		"wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y\u0013\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005"+
		"\u001d\u0000\u0000|}\u0005\u0013\u0000\u0000}\u008e\u0003\u0018\f\u0000"+
		"~\u007f\u0005\u001d\u0000\u0000\u007f\u0080\u0005\u0014\u0000\u0000\u0080"+
		"\u008e\u0003\u0018\f\u0000\u0081\u0082\u0005\u001d\u0000\u0000\u0082\u0083"+
		"\u0005\u0015\u0000\u0000\u0083\u008e\u0003\u0018\f\u0000\u0084\u0085\u0005"+
		"\u001d\u0000\u0000\u0085\u0086\u0005\u0016\u0000\u0000\u0086\u008e\u0003"+
		"\u0018\f\u0000\u0087\u0088\u0005\u001d\u0000\u0000\u0088\u0089\u0005\u0017"+
		"\u0000\u0000\u0089\u008e\u0003\u0018\f\u0000\u008a\u008b\u0005\u001d\u0000"+
		"\u0000\u008b\u008c\u0005\u0018\u0000\u0000\u008c\u008e\u0003\u0018\f\u0000"+
		"\u008d{\u0001\u0000\u0000\u0000\u008d~\u0001\u0000\u0000\u0000\u008d\u0081"+
		"\u0001\u0000\u0000\u0000\u008d\u0084\u0001\u0000\u0000\u0000\u008d\u0087"+
		"\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0015"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0019\u0000\u0000\u0090\u0091"+
		"\u0005\u0010\u0000\u0000\u0091\u0092\u0003\u0018\f\u0000\u0092\u0093\u0005"+
		"\u0011\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0095\u0007"+
		"\u0001\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u009a\u0005"+
		"\u001a\u0000\u0000\u0097\u0099\u0003\u001c\u000e\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u001b\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a2\u0005"+
		"\u001d\u0000\u0000\u009e\u009f\u0005\u0004\u0000\u0000\u009f\u00a1\u0005"+
		"\u001d\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0005\u0010\u0000\u0000\u00a6\u00a8\u0003"+
		"\u0018\f\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0011"+
		"\u0000\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab\u001d\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b1\u0005\u001d\u0000\u0000\u00ad\u00ae\u0005\u0004"+
		"\u0000\u0000\u00ae\u00b0\u0005\u001d\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u001f\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u001f"+
		"\u0000\u0000\u00b5!\u0001\u0000\u0000\u0000\u0012#(.6<?ENSagox\u008d\u009a"+
		"\u00a2\u00a7\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}