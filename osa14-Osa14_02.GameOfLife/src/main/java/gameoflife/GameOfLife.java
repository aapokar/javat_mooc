package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
        // säännöt kehittymiselle:

        // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
        // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
        // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
        // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];

        for (int x = 0; x < this.taulukko.length; x++) {
            for (int y = 0; y < this.taulukko[x].length; y++) {
                int viereiset = this.elossaOleviaNaapureita(this.taulukko, x, y);

                if (this.taulukko[x][y] == 1) {
                    
                    if (viereiset < 2) {
                        kopio[x][y] = 0;
                    }
                    
                    if (viereiset > 3) {
                        kopio[x][y] = 0;
                    } 
                    
                    if (viereiset ==2 || viereiset ==3) {
                        kopio[x][y] = 1;
                    }
                }
                
                if (taulukko[x][y] == 0) {
                if (viereiset == 3) {
                    kopio[x][y] = 1;
                    
                } else {
                    kopio[x][y] = 0;
                }
                
            }
        }
        }
        this.setTaulukko(kopio);

    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int summa = 0;
        int lahtorivi = x - 1;
        int lahtosarake = y - 1;

        if (lahtorivi < 0) {
            lahtorivi = 0;
        }

        if (lahtosarake < 0) {
            lahtosarake = 0;
        }

        int takaraja = x + 1;
        int alaraja = y + 1;

        if (takaraja > taulukko.length - 1) {
            takaraja = x;
        }
        if (alaraja > taulukko[x].length - 1) {
            alaraja = y;
        }

        while (lahtorivi <= takaraja) {
            int lahto = lahtosarake;
            while (lahto <= alaraja) {
                summa += taulukko[lahtorivi][lahto];
//                System.out.println(lahto);
//                System.out.println(lahtorivi);
                lahto++;
            }
            lahtorivi++;
        }

//        for (lahtorivi; lahtorivi <= takaraja; lahtorivi++) {
//            for (int rivi = y-1; rivi <= y+1; rivi++) {
//                summa += taulukko[rivi][sarake];
//            }
//        }
        return summa - taulukko[x][y];
    }
}
