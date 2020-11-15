/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Tuotevarasto extends Varasto {
    
    private String nimi;
    
    public Tuotevarasto(String nimi, double tilavuus) {
        super(tilavuus);
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void setNimi(String uusiNimi) {
        this.nimi = uusiNimi;
    }

    @Override
    public String toString() {
        return nimi + ": " + super.toString() ;
    }
    
    
    
}
