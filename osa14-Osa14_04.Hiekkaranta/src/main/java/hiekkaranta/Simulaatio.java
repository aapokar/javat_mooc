package hiekkaranta;

import java.util.Random;
import java.util.ArrayList;

public class Simulaatio {

    private Tyyppi[][] taulukko;

    public Simulaatio(int leveys, int korkeus) {
        this.taulukko = new Tyyppi[leveys][korkeus];
        for (int x = 0; x < leveys; x++) {
            for (int y = 0; y < korkeus; y++) {
                this.taulukko[x][y] = Tyyppi.TYHJA;
            }
        }
    }

    public void lisaa(int x, int y, Tyyppi tyyppi) {
        if (x >= 0 && x < taulukko.length && y >= 0 && y < this.taulukko[x].length) {
            this.taulukko[x][y] = tyyppi;
        }
    }

    public Tyyppi sisalto(int x, int y) {
        if (x < 0 || x >= taulukko.length || y < 0 || y >= taulukko[x].length) {
            return Tyyppi.METALLI;
        }
        return this.taulukko[x][y];
    }

    public void paivita() {
//        int x = 0;
//        int y = 0;
        Random rnd = new Random();
        for (int x = 0; x < this.taulukko.length; x++) {
            for (int y = 0; y < this.taulukko[x].length; y++) {
                if (this.sisalto(x, y) == Tyyppi.HIEKKA) {

                    if (this.allaVetta(x, y)) {
                        this.siirraAlas(x, y);
                        continue;
                    }
                    if (this.allaTilaa(x, y)) {
                        this.siirryAlas(x, y, Tyyppi.HIEKKA);
                    }
                }

                if (this.sisalto(x, y) == Tyyppi.VESI) {

                    if (this.allaTilaa(x, y)) {
                        this.siirryAlas(x, y, Tyyppi.VESI);
                        continue;
                    }
                    if (this.oikeaTyhja(x, y) && this.vasenTyhja(x, y)) {
                        if (Math.random() < 0.5) {
                            this.siirraVasemmalle(x, y, Tyyppi.VESI);
                        } else {
                            this.siirraOikealle(x, y, Tyyppi.VESI);
                        }
                        continue;
                    }
                    if (this.vasenTyhja(x, y)) {
                        this.siirraVasemmalle(x, y, Tyyppi.VESI);
                        continue;
                    }
                    if (this.oikeaTyhja(x, y)) {
                        this.siirraOikealle(x, y, Tyyppi.VESI);
                    }
                }

//                    if (tama == Tyyppi.VESI && !this.allaTilaa(x, y)) {
//
//                        if (this.vasenTyhja(x, y) && this.oikeaTyhja(x, y)) {
//                            if (Math.random() < 0.5) {
//                                this.siirraVasemmalle(x, y, tama);
//                            } else {
//                                this.siirraOikealle(x, y, tama);
//                            }
//                        }
//                    }
//                        if (this.vasenTyhja(x, y)&& !this.oikeaTyhja(x, y)) {
//                            this.siirraVasemmalle(x, y, Tyyppi.VESI);
//                        } else {
//                            this.siirraOikealle(x, y, Tyyppi.VESI);
//                        }
//                    }
            }
        }
    }

    public boolean vasenTyhja(int x, int y) {
        return this.sisalto(x - 1, y) == Tyyppi.TYHJA;
    }

    public boolean oikeaTyhja(int x, int y) {
        return this.sisalto(x + 1, y) == Tyyppi.TYHJA;
    }

    public void siirraVasemmalle(int x, int y, Tyyppi tyyppi) {
        this.lisaa(x - 1, y, tyyppi);
        this.lisaa(x, y, Tyyppi.TYHJA);
    }

    public void siirraOikealle(int x, int y, Tyyppi tyyppi) {
        this.lisaa(x + 1, y, tyyppi);
        this.lisaa(x, y, Tyyppi.TYHJA);
    }

    public void siirraAlas(int x, int y) {
        //       Tyyppi eka = this.sisalto(x, y);
        this.lisaa(x, y, Tyyppi.VESI);
        this.lisaa(x, y + 1, Tyyppi.HIEKKA);
    }

    public boolean allaVetta(int x, int y) {
        return this.sisalto(x, y + 1) == Tyyppi.VESI;
    }

    public boolean allaTilaa(int x, int y) {
        for (int x1 = x - 1; x1 <= x + 1; x1++) {
            if (this.sisalto(x1, y + 1) == Tyyppi.TYHJA) {
//                System.out.println("on tilaa");
                return true;
            }
        }
//        System.out.println("ei tilaa");
        return false;
    }

    public void siirryAlas(int x, int y, Tyyppi tyyppi) {
        ArrayList<Integer> tyhjat = new ArrayList<>();
        Random rnd = new Random();
        for (int x1 = x - 1; x1 <= x + 1; x1++) {
            if (this.sisalto(x1, y + 1) == Tyyppi.TYHJA) {
                tyhjat.add(x1);
            }
        }
//        if (!tyhjat.isEmpty()){
        int indeksi;
        if (tyhjat.size() > 1) {

            indeksi = rnd.nextInt(tyhjat.size());
        } else {
            indeksi = 0;
        }
//        if (y + 2 < 200) {
        this.lisaa(tyhjat.get(indeksi), y + 1, tyyppi);
        this.lisaa(x, y, Tyyppi.TYHJA);
//        }
    }

}
