package perfumes;

import java.util.ArrayList;
import java.util.Collections;

public class PerfumeList {

    private ArrayList<String> BD;

    public PerfumeList() {
        BD = new ArrayList();
    }

    public void setPerfume(String nome) {
        this.BD.add(nome);
        System.out.println("Perfume adicionado.");
    }

    public String getName(int ind) {
        String item = " ";
        if (!BD.isEmpty()) {
            if (ind > 0 && ind <= BD.size()) {
                item = (String) BD.get((ind - 1));
            } else {
                System.out.println("Item não existe.");
            }
        } else {
            System.out.println("Lista vazia");
        }
        return item;
    }

    public int getIndex(String searchedIndex) {
         return BD.indexOf(searchedIndex);
    }

    public String getPerfume(String searchedName) {
    String name = null;
    if (!BD.isEmpty()) {
        int ind = BD.indexOf(searchedName);
        if (ind != -1) {
            name = BD.get(ind);  
            System.out.println("Posição: " + (ind + 1));
        } else {
            System.out.println("Perfume não encontrado.");
        }
    }
    return name;
}

    public String removePerfume(String namePerfume) {
    String name = getPerfume(namePerfume); 
    if (name != null) {
        BD.remove(name);  
    }
    return name;
}

    public void replacePerfume(String oldName, String newName) {

        BD.set(getIndex(oldName), newName);
    }

    public String listPerfume() {

        String lista = "Lista de perfumes \n";
        if (!BD.isEmpty()) {
            for (int ind = 0; ind < BD.size(); ind++) {
                lista += BD.get(ind) + "\n";
            }
        }
        return lista;

    }

    public void sizeList() {
        int size = BD.size();
        System.out.println("A lista contém " + size + " itens.");
    }

    public String alphaticalOrder() {
        Collections.sort(BD);
        String lista = "Lista de perfumes \n";
        if (!BD.isEmpty()) {
            for (int ind = 0; ind < BD.size(); ind++) {
                lista += BD.get(ind) + "\n";
            }
        }
        return lista;
    }
}
