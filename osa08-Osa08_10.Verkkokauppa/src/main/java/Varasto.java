/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author Aapo
 */
public class Varasto {
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;
    
    public Varasto () {
        this.hinnat = new HashMap<>();
        this.saldot = new HashMap<>();
        
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinnat.put(tuote, hinta);
        this.saldot.put(tuote, saldo);
    }
    
    public int hinta(String tuote) {
        if (this.hinnat.containsKey(tuote)) {
            return this.hinnat.get(tuote);
        }
        return -99;
    }
    
    public int saldo(String tuote) {
        if (this.saldot.containsKey(tuote)) {
            return this.saldot.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote) {
        if (this.saldot.containsKey(tuote) && (this.saldot.get(tuote)>0)) {
            int i = this.saldot.get(tuote);
            i--;
            this.saldot.replace(tuote, i);
            return true;
        }
        return false;
    }
    
    public Set<String> tuotteet() {
        return this.hinnat.keySet();
        
    }
    
}
