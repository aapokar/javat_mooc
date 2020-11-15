
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int lukuja = 0;
        int parittomia = 0;
        int parillisia = 0;
        
        System.out.println("Syötä luvut:");

        
        while (true) {
                    int luku = Integer.valueOf (lukija.nextLine());
            if (luku != -1) {
                summa = summa + luku;
                if (luku % 2 == 0) {
                    parillisia++;
                } else {
                    parittomia++;
                }
                lukuja++;
            } else {
                break;
            }
        }
        
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukuja);
        double keskiarvo = 1.0 * summa / lukuja;
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);

    }
}
