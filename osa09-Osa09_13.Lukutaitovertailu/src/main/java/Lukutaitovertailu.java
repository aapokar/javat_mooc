
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        List<String> rivit = new ArrayList<>();
        List<String[]> trimmatut = new ArrayList<>();
        try {
            // luetaan tiedosto "presidentit.txt" riveittäin
            Files.lines(Paths.get("lukutaito.csv"))
                    .forEach(henkilo -> rivit.add(henkilo));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        
        for (String rivi: rivit) {
            String mjono=rivi;
            String[] palat =mjono.split(",");
             for (String rivi2: palat) {
                 rivi2.trim();
             }
             if (palat[2].contains("f")) {
                 palat[2] = "female";
             } else {
                 palat[2] = "male";
             }
             
             trimmatut.add(palat);
        }
        
        
        trimmatut.stream().sorted((h1, h2) -> {return h1[5].compareTo(h2[5]);})
                .forEach(hi -> System.out.println
        (hi[3]+ " ("+ hi[4]+ "), " + hi[2] +", " +hi[5]));
        
        }
        
//        for (String[] rivi1: trimmatut) {
//        System.out.println(rivi1[5]);
//        }
        
//        rivit.stream().sorted((h1, h2) -> {return h1[4].compareTo(h2[4])})
//                .forEach(rivi -> System.out.println(rivi));

    
        
        
        
//       String mjono = "Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513";
//String[] palat = mjono.split(",");
//// nyt palat[0] sisältää "Adult literacy rate"
//// palat[1] sisältää " population 15+ years"
//// jne.
//
//// saat välilyönnit pois alusta ja lopusta trim-metodilla:
//palat[1] = palat[1].trim();
    }

