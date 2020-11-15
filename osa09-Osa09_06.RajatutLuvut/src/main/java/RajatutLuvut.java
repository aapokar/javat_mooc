
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
        
        while (true) {
            String syote = lukija.nextLine();
            if (Integer.valueOf(syote)<0) {
                break;
            }
            luvut.add(Integer.valueOf(syote));
        }
        
        luvut.stream().filter(s -> s >= 1 && s<=5).forEach(l -> System.out.println(l));

    }
}
