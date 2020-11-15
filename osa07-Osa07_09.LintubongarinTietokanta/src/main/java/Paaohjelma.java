
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
//        Kayttoliittyma kayttis = new Kayttoliittyma(lukija);
        ArrayList<Lintu> linnut = new ArrayList<>();

        while (true) {
            System.out.print("?");
            String syote = lukija.nextLine();
            if (syote.equals("Lopeta")) {
                break;
            }
        
        if (syote.equals("Lisaa")) {
            System.out.print("Nimi: ");
            String nimi1 = lukija.nextLine();
            System.out.println("Latinakielinen nimi: ");
            String nimi2 = lukija.nextLine();
            Lintu lintu = new Lintu(nimi1, nimi2);
            linnut.add(lintu);
        }
        
        if (syote.equals("Havainto")) {
            boolean loytyi = false;
            System.out.print("Mikä havaittu?");
            String havaittu = lukija.nextLine();
            for (Lintu lintu: linnut) {
                if (havaittu.equals(lintu.getNimi())) {
                    lintu.havainto();
                    loytyi = true;
                }
            
            }
            if (!loytyi) {
                System.out.println("Ei ole lintu!");
            }
        }
        
        if (syote.equals("Tilasto")) {
            for (Lintu lintu: linnut) {
                System.out.println(lintu);
            }
        }
        
        if (syote.equals("Nayta")) {
            System.out.println("Mikä?");
            String mika = lukija.nextLine();
            for (Lintu lintu: linnut) {
                if (mika.equals(lintu.getNimi())) {
                    System.out.println(lintu);
                }
            }
        }
    

    }

}
}

