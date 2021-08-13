package fantasticlanguage.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FantasticSymbolTable {

    private HashMap<String, FantasticSymbol> map;

    public FantasticSymbolTable() {
        map = new HashMap<String, FantasticSymbol>();

    }

    public void add(FantasticSymbol symbol) {
        map.put(symbol.getName(), symbol);
    }

    public boolean exists(String symbolName) {
        return map.get(symbolName) != null;
    }

    public FantasticSymbol get(String symbolName) {
        return map.get(symbolName);
    }

    public ArrayList<FantasticSymbol> getAll(){
        ArrayList<FantasticSymbol> lista = new ArrayList<FantasticSymbol>();
        for (FantasticSymbol symbol : map.values()) {
            lista.add(symbol);
        }
        return lista;
    }



}
