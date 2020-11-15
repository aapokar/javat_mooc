
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int maara = 0;
        double keskiarvo = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            maara = maara +1;
            summa = summa + luku;
        }
        keskiarvo = 1.0 * summa / maara;
        System.out.println("Lukujen keskiarvo " + keskiarvo);
    }
}
