/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author Aapo
 */
public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat;
    
    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {

        if (this.omistajat.containsKey(rekkari)) {
            return false;
        }
        this.omistajat.put(rekkari, omistaja);
        return true;
    }
    
    public String hae(Rekisterinumero rekkari) {
                if (!(this.omistajat.containsKey(rekkari))) {
            return null;
        }
        return this.omistajat.get(rekkari);
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if (this.omistajat.containsKey(rekkari)) {
            this.omistajat.remove(rekkari);
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.omistajat);
        return hash;
    }
    
    public void tulostaRekisterinumerot() {
        for (Rekisterinumero rekkari: this.omistajat.keySet()) {
            System.out.println(rekkari);
        }
    }
    
    public void tulostaOmistajat() {
        ArrayList<String> lista = new ArrayList<>();
        for (String omistaja: this.omistajat.values()) {
            if (lista.contains(omistaja)) {
                continue;
            }
            lista.add(omistaja);
            System.out.println(omistaja);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ajoneuvorekisteri other = (Ajoneuvorekisteri) obj;
        if (!Objects.equals(this.omistajat, other.omistajat)) {
            return false;
        }
        return true;
    }
    
    
}
