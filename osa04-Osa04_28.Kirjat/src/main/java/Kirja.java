/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Kirja {
    private String kirjanNimi;
    private int sivujenLkm;
    private int kirjoitusVuosi;
    
    public Kirja (String nimi, int pituus, int vuosi) {
        this.kirjanNimi = nimi;
        this.sivujenLkm = pituus;
        this.kirjoitusVuosi = vuosi;
    }
    
    public String getNimi() {
        return this.kirjanNimi;
    }
    
    @Override
    public String toString() {
       return this.kirjanNimi + ", " + this.sivujenLkm + " sivua, " + this.kirjoitusVuosi;
    }
    
}
