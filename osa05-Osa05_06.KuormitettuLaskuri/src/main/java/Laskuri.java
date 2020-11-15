/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Laskuri {
    private int arvo;
    
    public Laskuri(int alkuArvo) {
        this.arvo = alkuArvo;
    }
    public Laskuri() {
        this(0);
    }
    public int arvo() {
        return this.arvo;
    }
    public void lisaa() {
        this.arvo ++;
    }
    public void vahenna() {
        this.arvo--;
    }
    public void lisaa(int arvo) {
        if (arvo >= 0) {
            this.arvo += arvo;
        }
    }
    public void vahenna(int arvo) {
        if (arvo >= 0) {
            this.arvo -= arvo;
        }
    }
}
