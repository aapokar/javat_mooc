
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä merkkijono!");
        String merkki = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double liuku = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean totuus = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + merkki);
        System.out.println("Syötit kokonaisluvun " + luku);
        System.out.println("Syötit liukuluvun " + liuku);
        System.out.println("Syötit totuusarvon " + totuus);

        // toteuta ohjelma tänne

    }
}
