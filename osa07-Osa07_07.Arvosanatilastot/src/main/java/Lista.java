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
public class Lista {
    
    private ArrayList<Integer> pisteet;
    
    public Lista() {
        this.pisteet = new ArrayList<>();
    }
    
    public void lisaa(int maara) {
        this.pisteet.add(maara);
    }
    
    public int koko() {
        return this.pisteet.size();
    }
    
    public double keskiarvo() {
        int i = 0;
        int summa = 0;
        while (i<this.pisteet.size()) {
            summa += this.pisteet.get(i);
            i++;
        }
        return 1.0*summa/this.pisteet.size();
    }
    
}
