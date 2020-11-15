/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Kissa extends Elain implements Aanteleva{
    
    public Kissa(){
        super("Kissa");
    }
    
    public Kissa(String nimi) {
        super(nimi);
    }
    
    public void mourua() {
        System.out.println(this.getNimi()+" mouruaa");
    }

    @Override
    public void aantele() {
        this.mourua();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
