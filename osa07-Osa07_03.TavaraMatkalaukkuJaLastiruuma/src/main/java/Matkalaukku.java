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
public class Matkalaukku {
    private int maksimiPaino;
    private ArrayList<Tavara> tavarat;
    
    public Matkalaukku(int maksPaino) {
        this.maksimiPaino = maksPaino;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara) {
        if (this.yhteispaino() + tavara.getPaino() <= this.maksimiPaino) {
        this.tavarat.add(tavara);
        }
    }
    
    public void tulostaTavarat() {
        for (Tavara tavara: this.tavarat) {
            System.out.println(tavara);
        }
    }
    
    public int yhteispaino() {
        int summa = 0;
        for (Tavara tavara: this.tavarat) {
            summa += tavara.getPaino();
        }
        return summa;
    }
    
    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()){
            return null;
        }
        Tavara tavara = new Tavara(null, 0);
        for (Tavara kama: this.tavarat) {
            if (kama.getPaino()> tavara.getPaino()) {
                tavara = kama;
            }
        }
        return tavara;
        
    }
    
//    public ArrayList<Tavara> getTavarat() {
//        return this.tavarat;
//    }
    
    public String toString() {
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (0kg)";
        } else if (this.tavarat.size() == 1) {
            return "1 tavara (" + this.yhteispaino() + " kg)"; 
        }
        return this.tavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
    }
    
    
    
}
