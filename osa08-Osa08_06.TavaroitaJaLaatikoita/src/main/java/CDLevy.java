/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class CDLevy implements Talletettava{
    
    private String artisti;
    private String nimi;
    private int julkaisuvuosi;
    private double paino;
    
    public CDLevy (String artisti, String nimi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.nimi = nimi;
        this.julkaisuvuosi= julkaisuvuosi;
        this.paino = 0.1;
    }

    @Override
    public double paino() {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.paino;
    }

    @Override
    public String toString() {
        return artisti + ": " + nimi + " (" + julkaisuvuosi + ")";
    }
    
    
}
