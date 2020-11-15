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
public class Lastiruuma {
    private int maksimiPaino;
    private ArrayList<Matkalaukku> laukut;
    private int painoNyt;
    
    public Lastiruuma (int makspaino) {
        this.maksimiPaino = makspaino;
        this.laukut = new ArrayList<>();
        this.painoNyt = 0;
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (laukku.yhteispaino() + this.painoNyt <= this.maksimiPaino){
            this.laukut.add(laukku);
            this.painoNyt += laukku.yhteispaino();
        }
    }
    
    public void tulostaTavarat() {
        ArrayList<Tavara> kamat = new ArrayList<>();
        for (Matkalaukku laukku: this.laukut) {
            laukku.tulostaTavarat();
        }
    }
    
    public String toString() {
        return this.laukut.size() + " matkalaukkua (" + this.painoNyt + " kg)"; 
    }
    
}
