
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
        
            if (luku == -1) {
            break;
            }
            lista.add(luku);
        }
        
        int summa = 0;
        int i = 0;
        
        while (i < lista.size()) {
            summa = summa + lista.get(i);
            i++;
        }
        double keskiarvo = 1.0 * summa / lista.size();
        System.out.println("Keskiarvo: " + keskiarvo);

        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
    }
}
