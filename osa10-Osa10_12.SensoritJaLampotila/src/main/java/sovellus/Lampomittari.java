/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;
import java.util.Random;

/**
 *
 * @author Aapo
 */
public class Lampomittari implements Sensori {

    private boolean tila;

    public Lampomittari() {
        this.tila = false;
    }
    
    
    
    @Override
    public boolean onPaalla() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.tila;
    }

    @Override
    public void paalle() {
        this.tila = true;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void poisPaalta() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.tila=false;
    }

    @Override
    public int mittaa() {
        
        if (this.tila == false) {
            throw new IllegalStateException("Ei ole päällä!!!!1");
        }
        
        return (new Random().nextInt(61))-30;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
