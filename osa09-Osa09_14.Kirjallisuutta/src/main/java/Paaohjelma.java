
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String syote = lukija.nextLine();
            if (syote.equals("")) {
                break;
            }
            System.out.println("Syötä kirjan pienin kohdeikä:");
            int luku = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(syote, luku));
        }
        
//        Comparator<Kirja> vertailija = Comparator
//                .comparing(Kirja::getKohdeIka)
//                .thenComparing(Kirja::getNimi);
//
//        Collections.sort(kirjat, vertailija);
//        
        System.out.println("Yhteensä " + kirjat.stream().count() +" kirjaa.");
        
        kirjat.stream()
                .sorted()
                        .forEach(s-> System.out.println(s));
        
    }
    



}
