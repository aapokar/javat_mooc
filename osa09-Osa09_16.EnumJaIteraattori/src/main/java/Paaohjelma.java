
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
//        Tyontekijat yliopisto = new Tyontekijat();
//yliopisto.lisaa(new Henkilo("Petrus", Koulutus.FT));
//yliopisto.lisaa(new Henkilo("Arto", Koulutus.FilYO));
////yliopisto.lisaa(new Henkilo("Elina", Koulutus.FT));
//
//yliopisto.tulosta();
//
//yliopisto.irtisano(Koulutus.FilYO);
//
//System.out.println("==");
//
//yliopisto.tulosta(Koulutus.FT);


Tyontekijat t = new Tyontekijat(); 
Henkilo h = new Henkilo("Arto", Koulutus.FT); 
//Henkilo f = new Henkilo("FArto", Koulutus.FT); 
//Henkilo g = new Henkilo ("Penis", Koulutus.FM);
t.lisaa(h); 
////t.lisaa(f); 
////t.lisaa(g); 
t.tulosta(Koulutus.FT); 
    }
}
