
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String nimi = "";
        String nuorin = "";
        int ika = 0;
        int nuorinIka = 170;
        
        while (true) {
            String syote = lukija.nextLine();
            String[] osat = syote.split(",");
            nimi = osat[0];

            
            if (nimi.equals("loppu")){
                break;
            } else {
            ika = Integer.valueOf(osat[1]);           
            if (ika < nuorinIka) {
                nuorinIka = ika;
                nuorin = nimi;
            }
            }
        }
        System.out.println("Nuorin oli: " + nuorin);

    }
}
