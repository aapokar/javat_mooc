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
public class Pakkaus {
    
    private ArrayList<Lahja> lahjat;
    
    public Pakkaus() {
        this.lahjat = new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja) {
        this.lahjat.add(lahja);
    }
    
    public int yhteispaino() {
         int paino=0;
         
         int i = 0;
         while (i<this.lahjat.size()) {
             Lahja lahja = this.lahjat.get(i);
             paino += lahja.getPaino();
             i++;
                 }
         return paino;
    }
    
}
