
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true){
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.print("Kirjoitusvuosi: ");
            int vuosi = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi, sivuja, vuosi));
        }
        System.out.println("Mitä tulostetaan?");
        String mita = lukija.nextLine();
        if (mita.equals("kaikki")) {
            for (Kirja kaikki: kirjat) {
                System.out.println(kaikki);
            }
        } else if (mita.equals("nimi")) {
            for (Kirja nimi: kirjat) {
                System.out.println(nimi.getNimi());
            }
        }
    }
}
