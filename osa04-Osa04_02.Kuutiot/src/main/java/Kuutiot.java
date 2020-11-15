
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
        String sana = lukija.nextLine();
        
        if (sana.equals("loppu")) {
            break;
        }
        int i = Integer.valueOf(sana);
            System.out.println(i*i*i);
        
        }
    }
}
