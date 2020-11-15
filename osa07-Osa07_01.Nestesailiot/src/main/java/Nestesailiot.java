
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eka = 0;
        int toka = 0;


        while (true) {
            System.out.println("Ensimmäinen: " + eka + "/100");
            System.out.println("Toinen: " + toka + "/100");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);
            
            if (komento.equals("lisaa")) {
                if (maara > 0) {
                    eka += maara;
                    if (eka > 100) {
                        eka = 100;
                    }
                }
            }
            
            if (komento.equals("siirra")) {
                if (maara > 0) {
                    if (eka > maara) {
                        eka -= maara;
                        toka += maara;
                        if (toka > 100) {
                            toka = 100;
                        }
                    } else {
                        toka += eka;
                        eka = 0;
                        if (toka > 100) {
                            toka = 100;
                        }
                    }
                    
                }
            }
            
            if (komento.equals("poista")) {
                if (maara > 0) {
                    if (toka > maara) {
                        toka -=maara;
                    } else {
                        toka = 0;
                    }
                }
            }

        }
    }

}
