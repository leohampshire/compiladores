package fantasticlanguage.main;

import fantasticlanguage.exceptions.FantasticSemanticException;
import fantasticlanguage.parser.FantasticLangLexer;
import fantasticlanguage.parser.FantasticLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MainClass {
    public static void main(String[] args) {
        try {
            FantasticLangLexer lexer;
            FantasticLangParser parser;
            //le o arquivo e é a entrada do analisador léxico
            lexer = new FantasticLangLexer(CharStreams.fromFileName("input.fantastic"));
            //cria um fluxo de tokens para passar o parser
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            //cria o parser a partir de tokenStream
            parser = new FantasticLangParser(tokenStream);

            parser.prog();
            System.out.println("Compilation Successful");


        } catch (FantasticSemanticException exception) {
            System.out.println("Semantic Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }

    }
}
