/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Aapo
 */
public class Kasi implements Comparable<Kasi> {
    
    private ArrayList<Kortti> kortit;
    
    public Kasi() {
        this.kortit = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti) {
        this.kortit.add(kortti);
    }
    
    public void tulosta() {
        Iterator<Kortti> iteraattori = kortit.iterator();
        
        while (iteraattori.hasNext()) {
            Kortti eka = iteraattori.next();
            System.out.println(eka);
        }
    }
    
    public void jarjesta() {
        Comparator<Kortti> vertailija = Comparator
              .comparing(Kortti::getArvo)
              .thenComparing(Kortti::getMaa);
    this.kortit.sort(vertailija);
//Collections.sort(kortit, vertailija);
    }

    @Override
    public int compareTo(Kasi o) {
        int kasi1 = this.kortit.stream().mapToInt(s->s.getArvo()).reduce(0, (edellinen,s) -> edellinen +s);
        int kasi2 = o.kortit.stream().mapToInt(s->s.getArvo()).reduce(0, (edellinen,s) -> edellinen +s);
        return kasi1-kasi2;
    }
    
    public void jarjestaMaittain() {
        Collections.sort(kortit, new SamatMaatVierekkainArvojarjestykseen());
    }
    
}
