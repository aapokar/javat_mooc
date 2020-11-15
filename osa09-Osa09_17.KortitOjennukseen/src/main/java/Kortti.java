import java.util.Comparator;

public class Kortti implements Comparable<Kortti> {

    private int arvo;
    private Maa maa;

    public Kortti(int arvo, Maa maa) {
        if (arvo < 2 || arvo > 14) {
            throw new IllegalArgumentException("Kortin arvon tulee olla väliltä 2...14.");
        }

        this.arvo = arvo;
        this.maa = maa;
    }

    @Override
    public String toString() {
        String kortinArvo = "" + arvo;
        if(arvo == 11) {
            kortinArvo = "J";
        } else if (arvo == 12) {
            kortinArvo = "Q";
        } else if (arvo == 13) {
            kortinArvo = "K";
        } else if (arvo == 14) {
            kortinArvo = "A";
        }
        
        return maa + " " + kortinArvo;
    }

    public int getArvo() {
        return arvo;
    }

    public Maa getMaa() {
        return maa;
    }

    @Override
    public int compareTo(Kortti o) {
        
        if (this.getArvo()-o.getArvo()!=0) {
            return this.getArvo()-o.getArvo();
        }
        
        return this.maa.ordinal()-o.maa.ordinal();
//Comparator<Kortti> vertailija = Comparator
//              .comparing(Kortti::getArvo)
//              .thenComparing(Elokuva::getMaa.);
    }

}
