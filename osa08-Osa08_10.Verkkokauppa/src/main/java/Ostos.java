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
public class Ostos {
    
    private String tuote;
    private int kpl;
    private int yksikkohinta;
//    private HashMap<String, Integer> kappaleet;
//    private HashMap<String, Integer> hinnat;
    
    public Ostos(String tuote, int kpl, int yksikkohinta) {
//        this.hinnat.put(tuote, yksikkohinta);
//        this.kappaleet.put(tuote, kpl);
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta=yksikkohinta;
    }
    
    public int hinta() {
        int summa = 0;
        summa = this.kpl * this.yksikkohinta;
        return summa;
        
    }
    
    public void kasvataMaaraa() {
        this.kpl++;
    }

    @Override
    public String toString() {
        return tuote + ": " + kpl;
    }
    
    
    
}
