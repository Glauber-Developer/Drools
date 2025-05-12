# DroolsSimples

Este repositório contém uma gramática simplificada para regras Drools (`*.drl`) implementada com ANTLR 4.13.0. A gramática é capaz de analisar regras básicas com atributos, cláusulas `when` e `then`, além de calcular uma métrica de complexidade simples com base na quantidade de condições.

## ⚙️ Repositório de Referência

- [Drools](https://github.com/kiegroup/drools)

## ⚙️ Requisitos

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [ANTLR 4.13.0](https://www.antlr.org/download.html)

## 🔧 Como compilar e executar

### 1. Gerar o parser com ANTLR

```bash
java -jar ~/antlr-4.13.0-complete.jar DroolsSimples.g4 -visitor
javac -cp .:/home/seu_usuario/antlr-4.13.0-complete.jar *.java
java -cp .:/home/seu_usuario/antlr-4.13.0-complete.jar org.antlr.v4.gui.TestRig DroolsSimples compilationUnit -gui exemplo1_simples.drl
java -cp .:/home/seu_usuario/antlr-4.13.0-complete.jar org.antlr.v4.gui.TestRig DroolsSimples compilationUnit -gui exemplo2_simples.drl
java -cp .:/home/seu_usuario/antlr-4.13.0-complete.jar org.antlr.v4.gui.TestRig DroolsSimples compilationUnit -gui exemplo3_simples.drl

✅ Funcionalidades
Análise de regras no estilo Drools

Identificação do nome da regra

Contagem de condições no bloco when

Cálculo de uma métrica simples de complexidade

🧠 Observações
A gramática é apenas um subconjunto da linguagem DRL do Drools.

O sistema imprime no terminal a quantidade de condições e a complexidade da regra durante a análise.

📄 Licença
Este projeto é apenas para fins educacionais.
