
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);
        int keskella = (koko-1)/2;
        int[] sijainti = new int[2];
        sijainti[0] = 0;
        sijainti[1] = keskella;
        
        int taulukossaNumeroita = koko*koko;
        for (int i =1; i<= taulukossaNumeroita; i++) {
            
            nelio.asetaArvo(sijainti[0], sijainti[1], i);
            int[] vanhaSijainti;
            vanhaSijainti = sijainti;
            sijainti = uusiSijainti(sijainti, koko);
            
            
            
            if (nelio.annaArvo(sijainti[0], sijainti[1])> 0) {
                
//                vanhaSijainti[0] = siirryYksiAlas(sijainti[0], koko);
                vanhaSijainti[0] = vanhaSijainti[0] +1;
                sijainti = vanhaSijainti;
            }
            
        
        }
        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        return nelio;
    }
    
//        private int siirryKaksiVasemmalle(int sarake, int koko) {
//            int palautus = sarake-2;
//            if (palautus <0) {
//                palau
//            }
//        }
    
    private int[] uusiSijainti (int[] vanhaSijainti, int koko) {
        int [] palautus = new int[2];
        palautus[0] = vanhaSijainti[0] -1;
        palautus[1] = vanhaSijainti[1] +1;
        if (palautus[0] <= -1) {
            palautus[0] = koko-1;
        }
        if (palautus[1] >= koko) {
            palautus[1] = 0;
        }
        

        
    return palautus;
    }
    
    private int siirryYksiAlas(int rivi, int koko) {
        int uusi = rivi +1;
        if (uusi >= koko) {
            uusi = 0;
        }
        return uusi;
    }

}
