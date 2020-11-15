/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
/**
 *
 * @author Aapo
 */
public class MuistavaSanakirja {
    
    private Map<String, String> sanat;
    private String tiedosto;
    
    public MuistavaSanakirja() {
        this.sanat = new HashMap<>();
    }
    
    public MuistavaSanakirja(String tiedosto) {
        this.sanat = new HashMap<>();
        this.tiedosto=tiedosto;
        
    }
    
    public boolean tallenna() {
        
        try (PrintWriter tallentaja = new PrintWriter(this.tiedosto)) {
            
            for (String avain: this.sanat.keySet()) {
            tallentaja.println(avain + ":" + this.sanat.get(avain));                
            }

            tallentaja.close();
            return true;
                        
        } catch (Exception e){
            return false;
        }
        
    }
    
    public boolean lataa() {
        try (Scanner tiedostonLukija = new Scanner(new File(this.tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            String[] osat = rivi.split(":");   // pilkotaan rivi :-merkkien kohdalta
            this.sanat.put(osat[0], osat[1]);
//            System.out.println(osat[0]);     // ennen :-merkkiä ollut osa rivistä
//            System.out.println(osat[1]);     // :-merkin jälkeen ollut osa rivistä
}
            
            return true;
    } catch (Exception e) {
       return false; 
    }
    }
    
    public void lisaa(String sana, String kaannos) {
        if (this.sanat.containsKey(sana)) {
            return;
        }
        this.sanat.put(sana, kaannos);
    }
    
    public String kaanna(String sana) {
        if (this.sanat.containsKey(sana)) {
            return this.sanat.get(sana);
        }
        
        if (this.sanat.containsValue(sana)) {
//           return this.sanat.keySet().stream().filter(i -> (sanat.get(i).equals(sana))).findFirst().;
        String eka = "";
        for (String toka: this.sanat.keySet()) {
            if (this.sanat.get(toka).equals(sana)) {
                eka = toka;
            }
        }
        return eka;
        }
        return null;
    }
    
    public void poista(String sana) {
        if (this.sanat.containsKey(sana)) {
            this.sanat.remove(sana);
        }
        if (this.sanat.containsValue(sana)) {
            sana = this.kaanna(sana);
            this.sanat.remove(sana);
        }
    }
    
}
