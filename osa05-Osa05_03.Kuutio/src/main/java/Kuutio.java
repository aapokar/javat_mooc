/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Kuutio {
    private int sarma;
    
    public Kuutio (int sarmanPituus) {
        this.sarma = sarmanPituus;
    }
    
    public int tilavuus() {
        return this.sarma * this.sarma * this.sarma;
    }
    
    public String toString () {
        return "Kuution sarman pituus on " + this.sarma + ", tilavuus on " + this.tilavuus();
    }
}
