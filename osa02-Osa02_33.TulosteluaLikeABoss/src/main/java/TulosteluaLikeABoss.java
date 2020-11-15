
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
                int i = 0;
        while (i < maara){
            System.out.print("*");
            i++;
            
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
               int i = 0;
        while (i < maara){
            System.out.print(" ");
            i++; 
        }
    }
        // tehtävän osa 1

    public static void tulostaKolmio(int koko) {
        
        int i = 1;
        
        while (i <= koko) {
        tulostaTyhjaa((koko-i));
        tulostaTahtia(i);
        i++;
        }
    }
        // tehtävän osa 2

    public static void jouluKuusi(int korkeus) {
        
        int i = 0;
        int leveys = (korkeus-1) * 2 +1;
        
        while (i < korkeus){

        tulostaTyhjaa((leveys - (1 + i * 2))/2);
        tulostaTahtia(2 * i + 1);
            i++;
        }
        tulostaTyhjaa((leveys - 3) / 2);
        tulostaTahtia(3);
        tulostaTyhjaa((leveys - 3) / 2);
        tulostaTahtia(3);
        // tehtävän osa 3
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
