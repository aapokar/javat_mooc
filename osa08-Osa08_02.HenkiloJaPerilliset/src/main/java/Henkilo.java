/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Henkilo {
    
    private String nimi;
    private String osoite;
    
    public Henkilo (String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }

    public String getNimi() {
        return nimi;
    }

    public String getOsoite() {
        return osoite;
    }
    
    

    @Override
    public String toString() {
        return nimi + "\n  " + osoite;
    }
    
    
            
    
}
