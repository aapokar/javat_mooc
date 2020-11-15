/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Aapo
 */
public class Sanakirja {
    
    private HashMap<String, String> sanat;
    
    public Sanakirja () {
        this.sanat = new HashMap<>();
    }
    
    public String kaanna(String sana) {
        return this.sanat.getOrDefault(sana, null);
    }
    
    public void lisaa(String sana, String kaannos) {
        this.sanat.put(sana, kaannos);
    }
    
    public int sanojenLukumaara() {
        return this.sanat.keySet().size();
    }
    
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> lista = new ArrayList<>();
        for (String sana: this.sanat.keySet()) {
            lista.add(sana + " = " + this.sanat.get(sana));
        }
        return lista;
    }
    
}
