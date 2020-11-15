
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku = Integer.valueOf(lukija.nextLine());
        
        while (nolla <= luku) {
                    int nolla = 0;
            System.out.println(nolla);
            nolla++;
        }
    }
}
