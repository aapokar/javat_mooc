/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Maksukortti {
    private double saldo;
 //   private String nimi;
    
    public Maksukortti (double saldoAlussa) {
        this.saldo = saldoAlussa;
//        this.nimi = nimiAlussa;
    }
    
    public void lataaRahaa (double rahamaara) {
        if (rahamaara >= 0) {
        this.saldo = this.saldo + rahamaara;
        }
        if (this.saldo > 150.0) {
            this.saldo = 150.0;
        }
    }
    
    public String toString() {
            return "Kortilla on rahaa " + this.saldo + " euroa";
    }
    
    public void syoEdullisesti() {
        if (this.saldo >= 2.60){
        this.saldo = this.saldo -2.60;
        }
    }
    
    public void syoMaukkaasti() {
        if (this.saldo >= 4.60) {
        this.saldo = this.saldo - 4.60;
        }
    }
    
}
