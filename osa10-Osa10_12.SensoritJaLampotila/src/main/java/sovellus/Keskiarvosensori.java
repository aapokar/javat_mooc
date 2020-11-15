/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Aapo
 */
public class Keskiarvosensori implements Sensori {
    
    private ArrayList<Sensori> sensorit;
    private ArrayList<Integer> tulokset;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.tulokset = new ArrayList<>();
    }
    
    public void lisaaSensori(Sensori sensori) {
        this.sensorit.add(sensori);
    }
    
    @Override
    public boolean onPaalla() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    for (Sensori eka: this.sensorit) {
        if (!eka.onPaalla()) {
            return false;
        }
    }
    return true;
    }

    @Override
    public void paalle() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    for (Sensori sensori: this.sensorit) {
        sensori.paalle();
    }
    }

    @Override
    public void poisPaalta() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    for (Sensori sensori: this.sensorit){
        sensori.poisPaalta();
    }
    }

    @Override
    public int mittaa() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if (this.sensorit.isEmpty()||!this.onPaalla()) {
        throw new IllegalStateException("Keskiarvosensorilla ei ole sensoreita tai jokin niistä ei ole päällä.");
    }

int summa = 0;
    summa = this.sensorit.stream().map(i -> i.mittaa()).reduce(summa, Integer::sum);
    
    this.tulokset.add(summa/this.sensorit.size());
    return summa/this.sensorit.size();
    }
    
    public List<Integer> mittaukset() {
        return this.tulokset;
    }
    
    
}
