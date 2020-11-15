
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

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
        
        System.out.println("Mitä etsitään?");
        int haku = Integer.valueOf(lukija.nextLine());
        
        int i = 0;
        
        while (i < lista.size()) {
            if (haku == lista.get(i)) {
                System.out.println("Luku " + haku + " on indeksissä " + i);
            }            
            i++;
        }

        // toteuta tänne toiminnallisuus luvun etsimiseen
    }
}
