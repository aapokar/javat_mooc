
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        kayttoLiittyma kayttis = new kayttoLiittyma(lukija);
        System.out.println("Syötä yhteispisteet, -1 lopettaa");
        kayttis.kaynnista();
        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
    }
}
