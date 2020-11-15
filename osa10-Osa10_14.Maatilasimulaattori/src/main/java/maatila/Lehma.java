/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;
import java.util.Random;
/**
 *
 * @author Aapo
 */
public class Lehma implements Eleleva, Lypsava{
    private String nimi;
    private double tilavuus;
    private double maara;
    
    public Lehma() {
        this.nimi = NIMIA[new Random().nextInt(31)];
        this.tilavuus = 15 + new Random().nextInt(16);
        this.maara = 0;
    }
    
    public Lehma (String nimi) {
        this.nimi = nimi;
        this.tilavuus = 15 + new Random().nextInt(16);
        this.maara = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getMaara() {
        return maara;
    }    
    
    @Override
    public void eleleTunti() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            this.maara+= 0.7 + (new Random().nextDouble() * 1.3);
            if (this.maara>this.tilavuus) {
                this.maara = this.tilavuus;
    }
    }

    @Override
    public double lypsa() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    double palaute = this.maara;
    this.maara = 0.0;
    return palaute;
    }
    
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    @Override
    public String toString() {
    double uusimaara = Math.ceil(maara);
        return nimi + " " + uusimaara + "/" + tilavuus;
    }
    
    
    
}
