
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        kayttoLiittyma kali = new kayttoLiittyma(lukija);
        
        kali.kaynnista();
        


//        while (true) {
//            System.out.print("> ");
//
//            String luettu = lukija.nextLine();
//            if (luettu.equals("lopeta")) {
//                break;
//            }
//
//        }
    }

}
