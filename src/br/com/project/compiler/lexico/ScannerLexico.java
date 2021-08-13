package br.com.project.compiler.lexico;

import br.com.project.compiler.exceptions.LexicalException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScannerLexico
{

    private char[] content;
    private int estado;
    private int position;

    public ScannerLexico(String file)
    {
        try {
            String textContent;
            textContent = new String(Files.readAllBytes(Paths.get(file)), StandardCharsets.UTF_8);
            System.out.println("------------DEBUG------------");
            System.out.println(textContent);
            System.out.println("------------------------------");
            content = textContent.toCharArray();
            position = 0;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public Token nextToken()
    {
        char currentChar;
        StringBuilder term = new StringBuilder();
        Token token;

        if (isEOF()) {
            return null;
        }
        estado = 0;
        while (true) {
            currentChar = nextChar();

            switch (estado){
                case 0:
                    if (isChar(currentChar)) {
                        term.append(currentChar);
                        estado = 1;
                    }
                    else if (isDigit(currentChar)) {
                        term.append(currentChar);
                        estado = 3;
                    }
                    else if ((isSpace(currentChar))) {
                        break;
                    }
                    else if (isOperator(currentChar)) {
                        term.append(currentChar);
                        estado = 5;
                    }
                    else {
                        throw new LexicalException("Unrecognized Symbol");
                    }
                    break;
                case 1:
                    if (isChar(currentChar) || isDigit(currentChar)){
                        term.append(currentChar);
                        break;
                    }
                    else if (isSpace(currentChar) || isOperator(currentChar)){
                        estado = 2;
                    }else {
                        throw new LexicalException("Malformed Indentifier");
                    }
                    break;
                case 2:
                    back();
                    token = new Token();
                    token.setType(Token.TK_IDENTIFIER);
                    token.setText(term.toString());
                    return token;
                case 3:
                    if (isDigit(currentChar)) {
                        term.append(currentChar);
                        break;
                    }
                    else if (!isChar(currentChar)) {
                        estado = 4;
                    }
                    else {
                        throw new LexicalException("Unrecognized Number");
                    }
                    break;
                case 4:
                    token = new Token();
                    token.setType(Token.TK_NUMBER);
                    token.setText(term.toString());
                    back();
                    return token;
                case 5:
                    token = new Token();
                    token.setType(Token.TK_OPERATOR);
                    token.setText(term.toString());
                    return token;
            }
        }
    }

    private boolean isDigit(char c)
    {
        return c >= '0' && c <= '9';
    }

    private boolean isChar(char c)
    {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private boolean isOperator(char c)
    {
        return c == '>' || c == '<' || c == '=' || c == '!';
    }

    private boolean isSpace (char c)
    {
        return c == ' ' || c == '\t' || c == '\n' || c == '\r';
    }

    private char nextChar()
    {
        return content[position++];
    }

    private boolean isEOF()
    {
        return position == content.length;
    }

    private void back() {
        position --;
    }

}
