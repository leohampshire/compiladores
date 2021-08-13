package fantasticlanguage.ast;

import fantasticlanguage.datastructures.FantasticSymbol;
import fantasticlanguage.datastructures.FantasticSymbolTable;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class FantasticProgram {
    private FantasticSymbolTable varTable;
    private ArrayList<AbstractCommand> comandos;
    private String programName;

    public void generateTarget() {
        StringBuilder str = new StringBuilder();
        str.append("import java.util.Scanner;\n");
        str.append("public class MainClass2{ \n");
        str.append("  public static void main(String args[]){\n ");
        str.append("      Scanner _key = new Scanner(System.in);\n");
        for (FantasticSymbol symbol: varTable.getAll()) {
            str.append(symbol.generateJavaCode()+"\n");
        }
        for (AbstractCommand command: comandos) {
            str.append(command.generateJavaCode()+"\n");
        }
        str.append("  }");
        str.append("}");

        try {
            FileWriter fr = new FileWriter(new File("MainClass2.java"));
            fr.write(str.toString());
            fr.close();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }

    public FantasticSymbolTable getVarTable() {
        return varTable;
    }

    public void setVarTable(FantasticSymbolTable varTable) {
        this.varTable = varTable;
    }

    public ArrayList<AbstractCommand> getComandos() {
        return comandos;
    }

    public void setComandos(ArrayList<AbstractCommand> comandos) {
        this.comandos = comandos;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

}
