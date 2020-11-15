/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Aapo
 */
public class Kellari {
    private HashMap<String, ArrayList<String>> komerot;

    public Kellari() {
        this.komerot=new HashMap<>();
    }
    public void lisaa(String komero, String tavara) {
        this.komerot.putIfAbsent(komero, new ArrayList<>());
        this.komerot.get(komero).add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero) {
        return this.komerot.getOrDefault(komero, new ArrayList<>());
    }
    
    public void poista(String komero, String tavara) {
        if (this.komerot.get(komero).contains(tavara)) {
            this.komerot.get(komero).remove(tavara);
        
            if (this.komerot.get(komero).isEmpty()) {
                this.komerot.remove(komero);
            }
        }
    }
    
    public ArrayList<String> komerot() {
        ArrayList<String> luvut =new ArrayList<>();
        for (String lista: this.komerot.keySet()) {
            if (!(lista.isEmpty())) {
                luvut.add(lista);
            }
        }
        return luvut;
    }
}
