/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Aapo
 */
public class Muutoshistoria {
    
    private ArrayList<Double> muutosHistoria;
    
    public Muutoshistoria() {
        this.muutosHistoria = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        this.muutosHistoria.add(tilanne);
    }
    
    public void nollaa() {
        this.muutosHistoria.clear();
    }

    @Override
    public String toString() {
        return muutosHistoria.toString();
    }

    
    public double maxArvo() {
        double suurin = 0;
        for (double luku: this.muutosHistoria) {
            if (luku > suurin) {
                suurin = luku;
                
            }
        }
        return suurin;
    }
    
    public double minArvo() {
        if (this.muutosHistoria.size()== 0) {
            return 0;
        }
        
        double pienin = Double.MAX_VALUE;
        
        for (double luku: this.muutosHistoria) {
            if (luku < pienin) {
                pienin = luku;
            }
        }
        return pienin;
        
    }
    
    public double keskiarvo() {
        if (this.muutosHistoria.isEmpty()) {
            return 0;
        }
        double summa = 0;
        
        for (double luku: this.muutosHistoria) {
            summa+=luku;
        }
        
        double ka = summa/this.muutosHistoria.size();
        
        return ka;
    }
    
}
