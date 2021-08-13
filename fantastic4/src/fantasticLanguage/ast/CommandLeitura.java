package fantasticlanguage.ast;


import fantasticlanguage.datastructures.FantasticVariable;

public class CommandLeitura extends AbstractCommand {

    private String id;
    private FantasticVariable var;

    public CommandLeitura (String id, FantasticVariable var) {
        this.id = id;
        this.var = var;
    }
    @Override
    public String generateJavaCode() {
        // TODO Auto-generated method stub
        return id +"= _key." + (var.getType()==FantasticVariable.NUMBER? "nextDouble();": "nextLine();");
    }
    @Override
    public String toString() {
        return "CommandLeitura [id=" + id + "]";
    }

}
