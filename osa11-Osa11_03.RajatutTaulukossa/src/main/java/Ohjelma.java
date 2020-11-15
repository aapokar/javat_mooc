
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
int[] arvot = {8, -2, 3, 1, 1, 1, 2, 3}; System.out.println(summa(arvot, 5, arvot.length, 0, 999));
    }
    
    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
//        mista = mista-1;
        if (mista < 0) {
            mista= 0;
        }
        
        if (mihin>=taulukko.length) {
            mihin = taulukko.length-1;
        }
        
        if (mihin<0) {
            mihin = 0;
        }
        int summa1 = 0;
        for (int i = mista; i<=mihin; i++) {
            if (taulukko[i] >= pienin && taulukko[i] <= suurin) {
                summa1+=taulukko[i];
            }
        }
        return summa1;
    }

}
