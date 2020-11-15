package testausta;

import java.util.Scanner;
import java.util.ArrayList;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println(suorita(lukija));
    }

    public static String suorita(Scanner lukija) {
        int pulloja = 0;
        int oppilaita = 0;
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote == -1) {
                break;
            }
            if (syote >= 0) {
                pulloja += syote;
                oppilaita++;
            }
        }
        if (pulloja == 0) {
            return "Pulloja: 0 \nOppilaita: 0\n Keskiarvoa ei voida laskea";
        }
            double ka = 1.0 * pulloja / oppilaita;
            return "Pulloja: " + pulloja + "\nOppilaita: " + oppilaita + "\nKeskiarvo: " + ka;
        }
    }
