/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class MuistavaTuotevarasto extends Tuotevarasto{
//    private double alkuSaldo;
    private Muutoshistoria historia;
    
            
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi,tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.historia= new Muutoshistoria();
        this.historia.lisaa(alkuSaldo);
    }
    
    public String historia() {
        return this.historia.toString();
    }
    
    @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        this.historia.lisaa(super.getSaldo());
    }
    
    @Override
    public double otaVarastosta(double maara) {
        double luku = super.otaVarastosta(maara);
        
        this.historia.lisaa(super.getSaldo());
        return luku;
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + historia.toString());
        System.out.println("Suurin tuotemäärä: " + historia.maxArvo());
        System.out.println("Pienin tuotemäärä: " + historia.minArvo());
        System.out.println("Keskiarvo: " + historia.keskiarvo());
    }
}
