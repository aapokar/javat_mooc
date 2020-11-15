package sovellus;

import java.sql.SQLException;
import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner lukija;
    private TodoDao tietokanta;

    public Kayttoliittyma(Scanner lukija, TodoDao tietokanta) {
        this.lukija = lukija;
        this.tietokanta = tietokanta;
    }

    public void kaynnista() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Syötä komento:");
            System.out.println("1) listaa");
            System.out.println("2) lisää");
            System.out.println("3) aseta tehdyksi");
            System.out.println("4) poista");
            System.out.println("x) lopeta");

            System.out.print("> ");
            String komento = this.lukija.nextLine();
            if (komento.equals("x")) {
                break;
            }
            
            if (komento.equals("1")) {
                for (Todo rivi: tietokanta.listaa()) {
                System.out.println(rivi);
                }
            }
            
            if (komento.equals("2")) {
                System.out.println("Lisätään tehtävää");
                System.out.println("Syötä nimi");
                String nimi = lukija.nextLine();
                System.out.println("Syötä kuvaus");
                String kuvaus = lukija.nextLine();
                this.tietokanta.lisaa(new Todo(nimi,kuvaus,false));
            }
            
            if (komento.equals("3")) {
                System.out.println("");
                System.out.println("Mikä asetetaan tehdyksi (syötä id)?");
                int id = Integer.valueOf(lukija.nextLine());
                this.tietokanta.asetaTehdyksi(id);
            }
            
            if (komento.equals("4")) {
                System.out.println("");
                System.out.println("Mikä poistetaan (syötä id)?");
                int id = Integer.valueOf(lukija.nextLine());
                this.tietokanta.poista(id);
            }

            // toteuta toiminnallisuus tänne
        }

        System.out.println("Kiitos!");
    }

}
