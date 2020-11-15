/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author Aapo
 */
public class Lintu {
    private String nimi;
    private String nimiLatinaksi;
    private int havainnot;
    
    public Lintu(String nimi, String nimiLatinaksi) {
        this.nimi = nimi;
        this.nimiLatinaksi = nimiLatinaksi;
        this.havainnot = 0;
    }

    @Override
    public String toString() {
        return nimi + " (" + nimiLatinaksi + "): " + havainnot + " havaintoa";
    }
    
    
    public void havainto() {
        this.havainnot++;
    }

    public String getNimi() {
        return nimi;
    }

    public String getNimiLatinaksi() {
        return nimiLatinaksi;
    }

    public int getHavainnot() {
        return havainnot;
    }
    

    
}
