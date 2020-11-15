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
          Lista arvosanat = new Lista();
          Lista hyvaksytyt = new Lista();
    int ykkoset = 0;
    int nollat = 0;
    int neloset = 0;
    int vitoset = 0;
    int kakkoset = 0;
    int kolmoset = 0;
//        Sailio sailio1 = new Sailio();
//        Sailio sailio2 = new Sailio();

    
    public void kaynnista() {
        
        while (true) {
//        System.out.println("Ensimmäinen: " + sailio1);
//        System.out.println("Toinen: " + sailio2);

        String luettu = lukija.nextLine();
        int kasky = Integer.valueOf(luettu);
        if (kasky == -1) {
            System.out.println("Pisteiden keskiarvo (kaikki): " + arvosanat.keskiarvo());
            if (hyvaksytyt.koko() != 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + hyvaksytyt.keskiarvo());
            } else {
                System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
            }
            System.out.println("Hyväksymisprosentti: " + hyvaksytytProsentteina());
            tulostaTahtia();
            break;
        }

        if (kasky >= 0 && kasky <= 100) {
        toteutaKomento(kasky);
        }
    }
    }
    
    public void toteutaKomento(int maara) {
        arvosanat.lisaa(maara);
        if (maara >= 50) {
            hyvaksytyt.lisaa(maara);
        } else {
            nollat++;
        }
        
        if (maara >= 50 && maara < 60) {
            ykkoset++;
        }
        
        if (maara >= 60 && maara < 70) {
            kakkoset++;
        }
        
        if (maara >=70 && maara < 80) {
            kolmoset++;
        }
        
        if (maara >= 80 && maara < 90) {
            neloset++;
        }
        
        if (maara >= 90) {
            vitoset++;
        }
            
            
//        if (komento.equals("lisaa")) {
////            sailio1.lisaa(maara);
//        }
//        if (komento.equals("poista")) {
////            sailio2.poista(maara);
//        }
//        if (komento.equals("siirra")) {
//            if (maara > sailio1.sisalto()) {
//                maara = sailio1.sisalto();
//            }
//            sailio1.poista(maara);
//            sailio2.lisaa(maara);
    }
    
    public double hyvaksytytProsentteina() {
        return 100.0*hyvaksytyt.koko()/arvosanat.koko();
    }
    
    public void tulostaTahtia() {
        System.out.print("5:");  
        tahdet(vitoset);
//        System.out.println("");
        System.out.print("4:"); 
        tahdet(neloset);
//        System.out.println("");
        System.out.print("3:");
        tahdet(kolmoset);
        System.out.print("2:");
        tahdet(kakkoset);
        System.out.print("1:");
        tahdet(ykkoset);
        System.out.print("0:");
        tahdet(nollat);
    }
    
    public void tahdet(int maara) {
        int i= 0;
        while (i<maara) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
}
    

