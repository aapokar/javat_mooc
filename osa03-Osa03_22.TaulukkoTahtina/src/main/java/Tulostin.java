
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        
        int i = 0;
        
        while (i < taulukko.length) {
            int apu = taulukko[i];
            while (apu != 0) {
                System.out.print("*");
                apu--;
            }
            System.out.println("");
            i++;
        }
        // Kirjoita tulostuskoodi tänne
    }

}
