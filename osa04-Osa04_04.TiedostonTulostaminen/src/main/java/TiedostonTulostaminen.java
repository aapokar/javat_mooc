
import java.io.File;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
        
        // luodaan lukija tiedoston lukemista varten
    try (Scanner tiedostonLukija = new Scanner(new File("data.txt"))) {

    // luetaan tiedostoja kunnes kaikki rivit on luettu
        while (tiedostonLukija.hasNextLine()) {
        // luetaan yksi rivi
        String rivi = tiedostonLukija.nextLine();
        // tulostetaan luettu rivi
        System.out.println(rivi);
        }
    } 
    
    catch (Exception e) {
    System.out.println("Virhe: " + e.getMessage());
    }

    }
}
