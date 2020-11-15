
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        while (true) {
        String syote = lukija.nextLine();
        
        if (syote.equals("loppu")) {
            break;
        } 
        lista.add(syote);
        }
        
        System.out.println(lista.size());
        
    }
}
