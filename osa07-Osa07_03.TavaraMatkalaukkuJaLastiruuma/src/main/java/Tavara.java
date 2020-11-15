/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Tavara {
    private int paino;
    private String nimi;
    
    public Tavara (String nimi, int paino) {
        this.paino = paino;
        this.nimi = nimi;
    }

    public int getPaino() {
        return this.paino;
    }

    public String getNimi() {
        return this.nimi;
    }
    
    public String toString() {
        return this.nimi + " (" + this.paino + " kg)";
    }
    
    
}
