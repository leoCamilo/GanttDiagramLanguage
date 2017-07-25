package com;

import gen.grammar.GanttGrammarLexer;
import gen.grammar.GanttGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        GanttGrammarLexer lexer = new GanttGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GanttGrammarParser parser = new GanttGrammarParser(tokens);

        GanttGrammarParser.ProgramContext ctx = parser.program();

        if (ctx.exception != null) {
            System.out.println("Erro...");
        } else {
            FileWriter arq = new FileWriter("Gantt Diagram.html");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(ctx.diagram.generateHTML());
            arq.close();
        }
    }
}