/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Aapo
 */
public class Lauma implements Siirrettava {
//    private int x;
//    private int y;
    private ArrayList<Siirrettava> eliot;
    
    public Lauma() {
        this.eliot = new ArrayList<>();
//        this.x=dx;
//        this.y=dy;
    }

    @Override
    public String toString() {
        String lista = "";
        
        for (Siirrettava sijainti: this.eliot) {
            lista = lista + sijainti +"\n";
        }
        return  lista;
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.eliot.add(siirrettava);
    }
    
    public void siirra(int dx, int dy) {
        for (Siirrettava siirrettava: this.eliot) {
            siirrettava.siirra(dx, dy);
        }
    }
    
    
}
