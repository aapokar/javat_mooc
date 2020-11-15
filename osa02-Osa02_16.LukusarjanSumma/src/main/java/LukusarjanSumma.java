
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        
        System.out.println("Mihin asti?");
        int monta = Integer.valueOf(lukija.nextLine());
        
        int i = 0;
        while (i <= monta) {
            summa = summa + i;
            i++;
        }
        System.out.println("Lukujen summa " + summa);

    }
}
