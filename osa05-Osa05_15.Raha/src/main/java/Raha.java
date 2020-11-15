
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }
    
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa+lisattava.euroa, this.senttia+lisattava.senttia);
        return uusi;
    }
    
    public boolean vahemman(Raha verrattava) {
        if (this.euroa < verrattava.euroa) {
            return true;
        } else if (this.euroa == verrattava.euroa && this.senttia < verrattava.senttia) {
                return true;
                }
        return false;
    }
    
    public Raha miinus(Raha vahentaja){
        int eurot = this.euroa - vahentaja.euroa;
        int sentit = this.senttia - vahentaja.senttia;
        
        if (sentit<0) {
            eurot--;
            sentit = 100 + sentit;
        }
        if (eurot<0) {
            eurot = 0;
            sentit = 0;
        }
        
        Raha uusi = new Raha(eurot,sentit);
        return uusi;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

}
