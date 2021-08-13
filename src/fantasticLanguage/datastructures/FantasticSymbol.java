package fantasticlanguage.datastructures;

public abstract class fantasticSymbol {

    protected String name;

    public abstract String generateJavaCode();
    public fantasticSymbol(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "fantasticSymbol [name=" + name + "]";
    }




}
