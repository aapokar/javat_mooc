import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
    Scanner lukija = new Scanner(System.in);

// tee tänne testikoodia josta kutsut ohjelmoitavia metodeja    
        System.out.println("Anna merkkijono");
        String sana = lukija.nextLine();
        Tarkistin tarkistin = new Tarkistin(sana);
        if (tarkistin.kellonaika(sana)) {
            System.out.println("Muoto on oikea");
        } else {
            System.out.println("Muoto ei ole oikea");
        }
    }
}
