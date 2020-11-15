
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(-3);
        System.out.println(positiiviset(lista));
    }
    
    public static List<Integer> positiiviset(List<Integer> luvut) {
        return luvut.stream().filter(l-> l>=0).collect(Collectors.toList());
    }

}
