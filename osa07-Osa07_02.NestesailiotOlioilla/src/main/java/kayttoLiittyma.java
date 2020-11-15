/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Aapo
 */
public class kayttoLiittyma {
    private Scanner lukija;
    public kayttoLiittyma (Scanner lukija) {
        this.lukija = new Scanner(System.in);
    }
    
        Sailio sailio1 = new Sailio();
        Sailio sailio2 = new Sailio();

    
    public void kaynnista() {
        
        while (true) {
        System.out.println("Ensimmäinen: " + sailio1);
        System.out.println("Toinen: " + sailio2);

        String luettu = lukija.nextLine();
        if (luettu.equals("lopeta")) {
            break;
        }

        String[] osat = luettu.split(" ");
        String komento = osat[0];
        int maara = Integer.valueOf(osat[1]);
        toteutaKomento(komento, maara);
        }
    }
    
    public void toteutaKomento(String komento, int maara) {
        if (komento.equals("lisaa")) {
            sailio1.lisaa(maara);
        }
        if (komento.equals("poista")) {
            sailio2.poista(maara);
        }
        if (komento.equals("siirra")) {
            if (maara > sailio1.sisalto()) {
                maara = sailio1.sisalto();
            }
            sailio1.poista(maara);
            sailio2.lisaa(maara);
        }
    }
}
