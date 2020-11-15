
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> luvut = new ArrayList<>();
        
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) {
                break;
            }
            
            luvut.add(syote);
            
        }
        
        double keskiarvo =luvut.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
    }
}
