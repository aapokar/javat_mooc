/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Aapo
 */
public class Maatila implements Eleleva{
    
    private String omistaja;
    private List<Lehma> lehmat;
    private Navetta navetta;

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.lehmat = new ArrayList<>();
        this.navetta = navetta;
        
    }

    public String getOmistaja() {
        return omistaja;
    }
    
    public void asennaNavettaanLypsyrobotti (Lypsyrobotti lypsyrobotti) {
    this.navetta.asennaLypsyrobotti(lypsyrobotti);
    }
    
    public void hoidaLehmat() {
        this.navetta.hoida(this.lehmat);
    }
    
    public void lisaaLehma(Lehma lehma) {
        this.lehmat.add(lehma);
    }

    @Override
    public void eleleTunti() {
        for (Lehma lehma1: this.lehmat) {
            lehma1.eleleTunti();
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String lehmia = "Ei lehmia";
        if (!this.lehmat.isEmpty()) {
            lehmia = this.lehmat.stream().map(i -> i.toString())
                    .reduce("Lehmät:\n", (edellinen, nyt) -> edellinen + "    " + nyt + "\n");
        }
        return "Maatilan omistaja: " + omistaja + "\n" + "Navetan maitosailio: " + navetta.getMaitosailio().toString()
                    + "\n" + lehmia;
    }
    
    
    
    
    
}
