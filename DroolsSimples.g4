grammar DroolsSimples;

@members {
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
}

// Parser rules
compilationUnit : packageDef? importDef* ruleDef* EOF ;

packageDef : 'package' qualifiedName ';'? ;

importDef : 'import' qualifiedName ('.' '*')? ';'? ;

// Adicione isso na inicialização da regra ruleDef
ruleDef 
@init {
    int complexityScore = 0;
    conditionCount = 0;  // Inicializa a variável do escopo da classe
    System.out.println("Analisando regra...");
}
: 'rule' stringLiteral
  {
    System.out.println("Nome da regra: " + $stringLiteral.text);
  }
  attributes?
  whenClause
  thenClause
  'end'
  {
    // Ação semântica para analisar a complexidade da regra
    if ($whenClause.text != null) {
        complexityScore += countConditions($whenClause.text);
    }
    System.out.println("Número de condições: " + conditionCount);
    System.out.println("Complexidade da regra: " + complexityScore);
    System.out.println("-------------------------------");
  }
;

// Modificar a regra condition para contar as condições
condition 
@after {
    conditionCount++;  // Agora acessa a variável do escopo da classe
}
: patternBinding | eval ;

attributes : attribute+ ;

attribute
    : 'salience' INT
    | 'dialect' stringLiteral
    | 'no-loop'(TRUE | FALSE)
    | 'agenda-group' stringLiteral
    | 'duration' INT
    | 'timer' stringLiteral
    ;

whenClause : 'when' condition* ;


patternBinding : ID ':' ID '(' constraintList? ')' ;

constraintList : constraint (',' constraint)* ;

constraint : ID op='>' expression
           | ID op='>=' expression
           | ID op='<' expression
           | ID op='<=' expression
           | ID op='==' expression
           | ID op='!=' expression
           ;

eval : 'eval' '(' expression ')' ;

// Modifique a regra expression para incluir números
expression : ID | INT | TRUE | FALSE | STRING ;

// Adicione uma regra para números com ponto flutuante
// NUMBER : [0-9]+ ('.' [0-9]+)? ;

thenClause : 'then' action* ;

// E também atualize a regra action para suportar System.out.println e cliente.setCategoria
action : ID ('.' ID)* '(' expression? ')' ';' ;

qualifiedName : ID ('.' ID)* ;

// Lexer rules
TRUE : 'true' ;
FALSE : 'false' ;
ID : [a-zA-Z_$][a-zA-Z_$0-9]* ;
INT : [0-9]+ ;
STRING : '"' ~["]* '"' ;
stringLiteral : STRING ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;