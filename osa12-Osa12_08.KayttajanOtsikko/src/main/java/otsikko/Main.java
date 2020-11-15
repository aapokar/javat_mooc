package otsikko;

import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Application.Parameters;

public class Main {

    public static void main(String[] args) {
        System.out.println("Syötä sovelluksen otsikko:");
        Scanner lukija = new Scanner(System.in);
        String syote = lukija.nextLine();
//        String otsikko = "Otsikko";
        Application.launch(KayttajanOtsikko.class, 
                "--otsikko=" + syote);
    }

}
