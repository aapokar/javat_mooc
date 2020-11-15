
public class Main {

    public static void main(String[] args) {
        // testaa täällä luokkiesi toimintaa
    Laatikko laatikkoPieni = new Laatikko(2);
    Laatikko laatikkoIso = new Laatikko(10);

    laatikkoPieni.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 1)) ;
    laatikkoIso.lisaa(new Kirja("Robert Martin", "Clean Code", 2));
    laatikkoIso.lisaa(laatikkoPieni);
        System.out.println(laatikkoIso);
    laatikkoIso.lisaa(laatikkoIso);

//    laatikko.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
//    laatikko.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
//    laatikko.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));

    System.out.println(laatikkoPieni);
        System.out.println(laatikkoIso);
    }

}
