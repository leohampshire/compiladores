package isilanguage.main;

import isilanguage.exceptions.IsiSemanticException;
import isilanguage.parser.IsiLangLexer;
import isilanguage.parser.IsiLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MainClass {
    public static void main(String[] args) {
        try {
            IsiLangLexer lexer;
            IsiLangParser parser;
            //le o arquivo e é a entrada do analisador léxico
            lexer = new IsiLangLexer(CharStreams.fromFileName("input.isi"));
            //cria um fluxo de tokens para passar o parser
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            //cria o parser a partir de tokenStream
            parser = new IsiLangParser(tokenStream);

            parser.prog();
            System.out.println("Compilation Successful");


        } catch (IsiSemanticException exception) {
            System.out.println("Semantic Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }

    }
}
