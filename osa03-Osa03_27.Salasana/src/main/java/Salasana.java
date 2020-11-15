
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!
        
        String syote = "";
        while (true) {
            System.out.print("Anna salasana: ");
            syote = lukija.nextLine();
            if (syote.equals(salasana)) {
                break;
            }
            System.out.println("Väärin!");
        }
        System.out.println("Oikein!" + "\n");
        System.out.println("Salaisuus on: jrigjrig");
        // Toteuta ohjelmasi tähän.
    }
}
