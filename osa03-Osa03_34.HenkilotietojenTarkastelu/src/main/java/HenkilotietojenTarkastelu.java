
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String pisinNimi = "";
        int ikienLkm = 0;
        int ikienSumma = 0;
        
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("")){
                break;
            }
            String[] lista = syote.split(",");
            if (lista[0].length() > pisinNimi.length()) {
                pisinNimi = lista[0];
            }
            ikienLkm ++;
            ikienSumma = ikienSumma + Integer.valueOf(lista[1]);
        }
        System.out.println("Pisin nimi: " + pisinNimi);
        double ikaKa = 1.0 * ikienSumma / ikienLkm;
        System.out.println("Syntymävuosien keskiarvo: " + ikaKa);


    }
}
