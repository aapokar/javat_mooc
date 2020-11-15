
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.valueOf (lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.valueOf (lukija.nextLine());
        int summa = eka + toka;
        System.out.println(eka + " + " + toka + " = " + summa);
        int erotus = eka - toka;
        System.out.println(eka + " - " + toka + " = " + erotus);
        int tulo = eka * toka;
        System.out.println(eka + " * " + toka + " = " + tulo);
        double jako = 1.0 * eka / toka;
        System.out.println(eka + " / " + toka + " = " + jako);
        // toteuta ohjelma tänne

    }
}
