/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author Aapo
 */
public class Lypsyrobotti {
    
    private Maitosailio Maitosailio;

    public Lypsyrobotti() {
        this.Maitosailio = null;
    }

    public Maitosailio getMaitosailio() {
        return Maitosailio;
    }

    public void setMaitosailio(Maitosailio sailio) {
        this.Maitosailio = sailio;
    }
    
    public void lypsa(Lypsava lypsava) {
        if (this.getMaitosailio()!=null){
            this.Maitosailio.lisaaSailioon(lypsava.lypsa());
        } else {
            lypsava.lypsa();
            System.out.println("Maidot menevät hukkaan!");
        }
    }
    
    
    
}
