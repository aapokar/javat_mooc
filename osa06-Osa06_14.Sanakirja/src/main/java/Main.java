
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Sanakirja sanakirja = new Sanakirja();
//        sanakirja.lisaa("apina", "monkey");
//        sanakirja.lisaa("banaani", "banana");
//        sanakirja.lisaa("cembalo", "harpsichord");
//
//        System.out.println(sanakirja.kaanna("apina"));
//        System.out.println(sanakirja.kaanna("porkkana"));
//        System.out.println(sanakirja.sanojenLukumaara());
//        ArrayList<String> kaannokset = sanakirja.kaannoksetListana();

Scanner lukija = new Scanner(System.in);
Sanakirja sanakirja = new Sanakirja();

Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija, sanakirja);
kayttoliittyma.kaynnista();

//for (String kaannos: kaannokset) {
//    System.out.println(kaannos);
//}
    }
}
