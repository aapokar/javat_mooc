
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        int i = 0;
        int suurin = lista.get(0);
        
        while (i < lista.size()) {
            if (suurin < lista.get(i)) {
                suurin = lista.get(i);
            }
            i++;
        }
        System.out.println("Listan suurin luku: " + suurin);
        

        // toteuta listan suurimman luvun selvittäminen tänne
    }
}
