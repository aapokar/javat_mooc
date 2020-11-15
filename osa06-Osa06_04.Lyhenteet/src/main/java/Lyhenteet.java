/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author Aapo
 */
public class Lyhenteet {
    private HashMap<String,String> lista;
    public Lyhenteet(){
        this.lista= new HashMap<>();
    }
    
    public void lisaaLyhenne(String lyhenne,String selite) {
        this.lista.put(lyhenne,selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne) {
        return this.lista.containsKey(lyhenne);
    }
    
    public String haeLyhenne(String lyhenne) {
        return this.lista.get(lyhenne);
    }
    
}
