/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
//import java.util.ArrayList;
/**
 *
 * @author Aapo
 */
public class Ostoskori {

    private Map<String, Ostos> ostokset;
    
    public Ostoskori() {
        this.ostokset = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        if (this.ostokset.containsKey(tuote)) {
            this.ostokset.get(tuote).kasvataMaaraa();
            return;
        }
        this.ostokset.put(tuote, new Ostos(tuote, 1, hinta));
    }
    
    public int hinta() {
        int summa = 0;
//        ArrayList<String> avaimet = new ArrayList<>();
        for (Ostos ostos: this.ostokset.values()) {
            summa+=ostos.hinta();
        }
        
        return summa;
    }
    
    public void tulosta() {
        for (String ostos: this.ostokset.keySet()) {
        System.out.println(this.ostokset.get(ostos));
    
        }
    }
    
}
