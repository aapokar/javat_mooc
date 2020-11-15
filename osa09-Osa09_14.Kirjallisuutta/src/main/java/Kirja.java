/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Kirja implements Comparable<Kirja>{
    
    private String nimi;
    private int kohdeIka;
    
    public Kirja (String nimi, int ika) {
        this.nimi = nimi;
        this.kohdeIka = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getKohdeIka() {
        return kohdeIka;
    }

    @Override
    public String toString() {
        return nimi + " (" + kohdeIka+ " vuotiaille ja vanhemmille)";
    }

    @Override
    public int compareTo(Kirja o) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if (this.kohdeIka== o.kohdeIka) {
        return this.getNimi().compareTo(o.getNimi());
    }
    return this.kohdeIka - o.getKohdeIka();
    }
    
    
    
}
