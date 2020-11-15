
public class Kasvatuslaitos {
    
    private int maara;
    
    public Kasvatuslaitos() {
        this.maara = 0;
    }


    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        this.maara++;
        return henkilo.getPaino();
    }
    
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }
    
    public int punnitukset() {
        return this.maara;
    }

}
