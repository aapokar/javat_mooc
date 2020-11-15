
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
       
            if (luku == 9999) {
                break;
            }
            lista.add(luku);
        }
        
        int i = 0;
        int pienin = lista.get(0);
        while (i < lista.size()) {
            if (pienin > lista.get(i)) {
                pienin = lista.get(i);
            }
            i++;
        }
        System.out.println("Pienin luku on " + pienin);
        
        i=i-1;
        while (i >= 0) {
            if (pienin == lista.get(i)) {
                System.out.println("Pienin luku löytyy indeksistä " + i);
        
            }
            i--;
        }
        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
    }
}
