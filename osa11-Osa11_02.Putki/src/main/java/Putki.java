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
public class Putki<T> {
    private ArrayList<T> lista;

    public Putki() {
        this.lista=new ArrayList<>();
    }
    
    public void lisaaPutkeen(T arvo) {
        this.lista.add(arvo);
    }
    
    public T otaPutkesta() {
        if (this.lista.isEmpty()) {
            return null;
        }
        
        T palautus = this.lista.get(0);
        this.lista.remove(0);
        return palautus;
    }
    
    public boolean onkoPutkessa() {
        return !this.lista.isEmpty();
    }
    
    
    
}
