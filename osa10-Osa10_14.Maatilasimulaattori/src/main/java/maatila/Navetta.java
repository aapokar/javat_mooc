/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;
import java.util.List;

/**
 *
 * @author Aapo
 */
public class Navetta {
    private Maitosailio Maitosailio;
    private Lypsyrobotti Lypsyrobotti;
    
    public Navetta (Maitosailio Maitosailio) {
        this.Maitosailio = Maitosailio;
        this.Lypsyrobotti = null;
    }

    public Maitosailio getMaitosailio() {
        return Maitosailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        lypsyrobotti.setMaitosailio(this.Maitosailio);
        this.Lypsyrobotti= lypsyrobotti;
    }
    
    public void hoida(Lehma lehma) {
        if (this.Lypsyrobotti==null) {
            throw new IllegalStateException ("Ei ole lypsyrobottia!!!1");
        }
        this.Lypsyrobotti.lypsa(lehma);
    }
    
    public void hoida(List<Lehma> lehmat) {
        if (this.Lypsyrobotti==null) {
            throw new IllegalStateException ("Ei ole robottia...");
        }
        for (Lehma lehma: lehmat) {
            this.Lypsyrobotti.lypsa(lehma);
        }
    }

    @Override
    public String toString() {
        return this.Maitosailio.toString();
    }
    
    
    
}
