
import java.util.HashMap;
import java.util.ArrayList;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private ArrayList<Integer> koepisteet;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.koepisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.koepisteet.add(pisteet);
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }


    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    public double koepisteidenKeskiarvo() {
        int summa = 0;
        for (int luku: this.koepisteet) {
            summa+=luku;
        }
        double ka = 1.0*summa/this.koepisteet.size();
        return ka;
    }
    
    public double arvosanojenKeskiarvo() {
        int summa = 0;
        int yhteensa = 0;
        for (int luku: this.arvosanat.keySet()) {
//            System.out.println(luku);
//            System.out.println(this.arvosanat.get(luku));
            summa = summa + this.arvosanat.get(luku) * luku;
            yhteensa+= this.arvosanat.get(luku);
        }
        return 1.0*summa/yhteensa;
    }
}
