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
public class Laatikko implements Talletettava {
    private double maksimiPaino;
    private ArrayList<Talletettava> tavarat;
    
    public Laatikko(double maksimiPaino) {
        this.maksimiPaino=maksimiPaino;
        this.tavarat= new ArrayList<>();
    }
    
    public void lisaa(Talletettava tavara) {
        if (tavara.paino() + paino() <= this.maksimiPaino) {
            this.tavarat.add(tavara);
        }
        
    }
    
    @Override
    public double paino() {
        double summa = 0.0;
        for (Talletettava kama: this.tavarat) {
            summa = summa + kama.paino();
        }
        return summa;
    }

    @Override
    public String toString() {
        return "Laatikko: " + this.tavarat.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }
    
    
    
    
    
}
