
import java.util.HashMap;
import java.util.ArrayList;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, String> taulu = new HashMap<>();
        taulu.put("esim.", "esimerkiksi");
        taulu.put("jne.", "ja niin edelleen");
        taulu.put("yms.", "ynnä muuta sellaista");
        
        System.out.println(taulu.keySet());

        tulostaAvaimet(taulu);
        System.out.println("---");
        System.out.println("---");
        tulostaAvaimetJoissa(taulu, "m");
        System.out.println("---");
        tulostaArvotJosAvaimessa(taulu, "ne");
    }
    
    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        for(String nimi : hajautustaulu.keySet()) {
            System.out.println(nimi);
        }
    }
    
    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        ArrayList<String> lista = new ArrayList();
        for(String nimi : hajautustaulu.keySet()) {
            if (!nimi.contains(merkkijono)) {
                continue;
            }
            lista.add(nimi);
        }
        System.out.println(lista);
    }
    
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        ArrayList<String> lista = new ArrayList();
        merkkijono=merkkijono.trim();
        for(String nimi : hajautustaulu.keySet()) {
            if (!nimi.contains(merkkijono)) {
                continue;
            }
            lista.add(hajautustaulu.get(nimi));
        }
        System.out.println(lista);       
    }
    

}
