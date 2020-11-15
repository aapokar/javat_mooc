/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;
import java.lang.Math;
/**
 *
 * @author Aapo
 */
public class Maitosailio {
    private double saldo;
    private double tilavuus;

    public Maitosailio() {
        this.tilavuus=2000;
        this.saldo = 0;
    }
    
    public Maitosailio(double tilavuus) {
        this.saldo = 0;
        this.tilavuus = tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTilavuus() {
        return tilavuus;
    }
    
    public double paljonkoTilaaJaljella() {
        return tilavuus-saldo;
    }
    
    public void lisaaSailioon(double maara) {
        this.saldo+=maara;
        if (saldo>this.tilavuus) {
            this.saldo=this.tilavuus;
        }
    }
    
    public double otaSailiosta(double maara) {
        if (maara>this.saldo) {
            this.saldo = 0;
        } else {
            this.saldo-=maara;
        }
        return saldo;
    }

    @Override
    public String toString() {
        double uusisaldo =  Math.ceil(saldo);
        double uusitilavuus = Math.ceil(tilavuus);
        return uusisaldo + "/" + uusitilavuus;
    }
    
    
    
}
