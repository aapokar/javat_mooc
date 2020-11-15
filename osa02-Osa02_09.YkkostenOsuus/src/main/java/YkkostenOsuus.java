
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        int ykkoset = 0;
        
        while (true) {
            int luku = Integer.valueOf (lukija.nextLine());
            
            if (luku == 0) {
                if (lukuja > 0){
                            double ykkostenosuus = 1.0 * ykkoset / lukuja;
                            System.out.println(ykkostenosuus);
                    break;
                }
                System.out.println("ykkösten osuutta ei voi laskea");
                break;
            }
            if (luku == 1) {
                ykkoset = ykkoset +1;
            }
            lukuja = lukuja + 1;
        }

    }
}
