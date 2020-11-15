
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Random arpoja = new Random();
        System.out.println("Montako satunnaislukua tulostetaan?");
        String syote = lukija.nextLine();
        int maara = Integer.valueOf(syote);
        
        for (int i=0; i<maara; i++) {
            System.out.println(arpoja.nextInt(11));
        }
    }

}
