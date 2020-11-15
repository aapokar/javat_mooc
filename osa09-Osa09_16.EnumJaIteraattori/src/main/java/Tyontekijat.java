/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Optional;
/**
 *
 * @author Aapo
 */
public class Tyontekijat {
    private ArrayList<Henkilo> lista;
    
    public Tyontekijat() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Henkilo henkilo) {
        this.lista.add(henkilo);
    }
    
    public void lisaa(List<Henkilo> henkilot) {
        henkilot.stream().forEach(s -> this.lisaa(s));
    }
    
    public void tulosta() {
        Iterator<Henkilo> iteraattori = lista.iterator();
        
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
// lista.stream().forEach(s -> System.out.println(s));
    }
    
    public void tulosta(Koulutus koulutus) {
        
        
        Iterator<Henkilo> iteraattori = lista.iterator();
        
        if (lista.size()==1) {
            Henkilo eka = iteraattori.next();
            if (eka.getKoulutus()==koulutus)
            System.out.println(eka);
        
        return;
        }
        
        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus()==koulutus) {
                System.out.println(iteraattori.next());
            }
        }
    }
    
    public void irtisano (Koulutus koulutus) {
        Iterator <Henkilo> iteraattori = lista.iterator();
        
        
        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus()==koulutus) {
                iteraattori.remove();
            }
        }
    }
    
    
    
}
