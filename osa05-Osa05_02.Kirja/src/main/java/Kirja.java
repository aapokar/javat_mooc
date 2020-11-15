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
    private String kirjoittaja;
    private String kirjanNimi;
    private int sivut;
    
    
    public Kirja (String kirjailija, String nimi, int sivuja) {
        this.kirjoittaja = kirjailija;
        this.kirjanNimi = nimi;
        this.sivut = sivuja;
    }
    
    public String getKirjailija () {
        return this.kirjoittaja;
    }
    public String getNimi( ) {
        return this.kirjanNimi;
    }
    public int getSivuja ( ) {
        return this.sivut;
    }
    public String toString () {
        return this.kirjoittaja + ", " + this.kirjanNimi + ", " + this.sivut + " sivua";
    }
    
}
