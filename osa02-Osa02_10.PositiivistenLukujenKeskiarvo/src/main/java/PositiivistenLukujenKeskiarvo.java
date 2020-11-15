
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int positiivisia = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            
            if (luku > 0) {
                summa = summa + luku;
                positiivisia = positiivisia +1;
            }
        }
        if (positiivisia == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            double keskiarvo = 1.0 * summa / positiivisia;
            System.out.println(keskiarvo);
        }
    }
}
