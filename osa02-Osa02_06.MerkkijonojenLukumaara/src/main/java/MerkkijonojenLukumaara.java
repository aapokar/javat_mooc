
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = 0;
        
        while (true) {
          String sana = lukija.nextLine();
          
          if (sana.equals("loppu")) {
              break;
          }
          luku = luku +1;
        }
        System.out.println(luku);
        
        
        
    }
}
