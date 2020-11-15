
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        Random arpoja = new Random();
        this.numerot = new ArrayList<>();
        
        while (this.numerot.size() <= 6) {
            int arvottu = arpoja.nextInt(40) +1;
            if (!this.sisaltaaNumeron(arvottu)) {
                this.numerot.add(arvottu);
            } 
        }
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        if (this.numerot.contains(numero)) {
            return true;
        }
        return false;
    }
}
