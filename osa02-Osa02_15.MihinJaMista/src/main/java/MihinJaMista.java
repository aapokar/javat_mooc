
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Mihin asti?");
        int asti = Integer.valueOf(lukija.nextLine());

        System.out.print("Mistä lähtien?");
        int mista = Integer.valueOf(lukija.nextLine());
        
        while (mista <= asti) {

            System.out.println(mista);
            mista++;
        }
        // KIRJOITA OHJELMASI TÄNNE
    }
}
