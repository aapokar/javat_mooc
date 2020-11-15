
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> syotteet = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, loppu lopettaa ");
        
        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("loppu")) {
                System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
                syote = lukija.nextLine();
                if (syote.equals("n")) {
                    tulostaNegatiivistenKeskiarvo(syotteet);                    
                } else if (syote.equals("p")) {
                    tulostaPositiivistenKeskiarvo(syotteet);
                }
                break;
            }
            
            syotteet.add(syote);
        }
        

        }
    public static void tulostaPositiivistenKeskiarvo(List<String> lista) {
        double keskiarvo = lista.stream().mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku >= 0).average().getAsDouble();
        System.out.println("Positiivisten lukujen keskiarvo: " + keskiarvo);
    }
    
    public static void tulostaNegatiivistenKeskiarvo(List<String> lista) {
         double keskiarvo = lista.stream().mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku <= 0).average().getAsDouble();    
         System.out.println("Negatiivisten lukujen keskiarvo: " + keskiarvo);
    }
        

    }
    


