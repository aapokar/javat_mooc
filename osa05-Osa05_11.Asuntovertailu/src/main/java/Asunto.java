
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        return (this.nelioita > verrattava.nelioita);
    }
    
    public int hintaero (Asunto verrattava) {
        int erotus = (this.neliohinta*this.nelioita) - (verrattava.neliohinta*verrattava.nelioita);
        if (erotus < 0) {
            erotus = -(erotus);
        }
        return erotus;
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        int erotus = (this.neliohinta*this.nelioita) - (verrattava.neliohinta*verrattava.nelioita);
        if (erotus > 0) {
            return true;
        }
        return false;
    }

}
