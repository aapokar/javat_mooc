
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int kertoma = 1;
        
        System.out.println("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());
        
        int i = 1;
        
        while (i <= luku) {
         
            kertoma = kertoma * i;
            i++;
        }            
        
        System.out.println("Kertoma on " + kertoma);
    }
}
