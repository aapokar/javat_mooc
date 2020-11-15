import java.util.Arrays;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
//        int[] taulukko = {3, 1, 5, 99, 3, 12};
//        System.out.println(Paaohjelma.pienin(taulukko));
//        System.out.println(Paaohjelma.pienimmanIndeksi(taulukko));
//        System.out.println("Pienin indeksi " + Paaohjelma.pienimmanIndeksiAlkaen(taulukko, 2 ));

int[] luvut = {8, 3, 7, 9, 1, 2, 4};
Paaohjelma.jarjesta(luvut);
//        int[] luvut = {3, 2, 5, 4, 8};
//
//System.out.println(Arrays.toString(luvut));
//
//Paaohjelma.vaihda(luvut, 1, 0);
//System.out.println(Arrays.toString(luvut));
//
//Paaohjelma.vaihda(luvut, 0, 3);
//System.out.println(Arrays.toString(luvut));
    }
    
    public static int pienin(int[] taulukko) {
        int i = 0;
        int pienin = taulukko[0];
        while (i < taulukko.length) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
            }
            i++;
        }
        return pienin;
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = pienin(taulukko);
        int i = 0;
        while (i< taulukko.length) {
            if (pienin == taulukko[i]) {
                return i;
            }
            i++;
        }
        return 0;
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pienin = taulukko[aloitusIndeksi];
        int pienimmanIndeksi = aloitusIndeksi;
        int i = aloitusIndeksi;
        while (i<taulukko.length) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                pienimmanIndeksi = i;
            }
            i++;
        }
        return pienimmanIndeksi;
    }
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int sailo = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = sailo;
    }
    
    public static void jarjesta(int[] taulukko){
        int i = 0;
        
        while (i<taulukko.length) {
            vaihda(taulukko, i, pienimmanIndeksiAlkaen(taulukko, i));
            System.out.println(Arrays.toString(taulukko));
            i++;
        }
    }

}
