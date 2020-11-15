
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String sana = lukija.nextLine();
            if (sana.equals("lopeta")) {
                System.out.println("hurraa!");
                break;
            } else {
                System.out.println("hip!");
            }
        }

    }
}
