/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Sailio {
    private int neste;
    
    public Sailio() {
        this.neste = 0;
    }
    
    public int sisalto() {
        return this.neste;
    }
    
    public void lisaa(int maara) {
        if (maara > 0) {
            this.neste += maara;
                if (this.neste>100) {
                this.neste = 100;
                }
        }
    }
    
    public void poista(int maara) {
        if (maara > 0) {
            this.neste -= maara;
            if (this.neste < 0) {
                this.neste = 0;
            }
        }
    }
    
    public String toString() {
        return this.neste + "/100";
    }
}
