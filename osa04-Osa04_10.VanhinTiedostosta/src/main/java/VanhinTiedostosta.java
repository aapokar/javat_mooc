
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String vanhin = "";
        int vanhinIka = -1;
        
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            
            while (tiedostonLukija.hasNextLine()) {
                String syote = (tiedostonLukija.nextLine());
                String[] osat = syote.split(",");
                
                int ika = Integer.valueOf(osat[1]);
                if (vanhin.equals("") || ika > vanhinIka) {
                    
                    vanhin = osat[0];
                    vanhinIka = ika;
                }
                    
            }
            System.out.println("Vanhin oli: " + vanhin);
        }
        catch (Exception e) {
            System.out.println("Virhe!!!!!");
        }
        

    }
}
