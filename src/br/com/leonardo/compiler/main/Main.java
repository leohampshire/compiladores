package br.com.leonardo.compiler.main;

import br.com.leonardo.compiler.exceptions.LexicalException;
import br.com.leonardo.compiler.lexico.ScannerLexico;
import br.com.leonardo.compiler.lexico.Token;

public class Main {

    public static void main(String[] args) {

        try {
            ScannerLexico sl = new ScannerLexico("input.isi");
            Token token;

            do {
                token = sl.nextToken();
                if (token != null){
                    System.out.println(token);
                }
            } while (token != null);
        }catch (LexicalException e) {
            System.out.println("Lexical Error " + e.getMessage());
        }catch (Exception e){
            System.out.println("Generic Error");
        }
    }
}
