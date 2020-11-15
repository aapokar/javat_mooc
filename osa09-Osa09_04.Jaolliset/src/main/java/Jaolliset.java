
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Jaolliset {

    public static void main(String[] args) {
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(-17);
        luvut.add(-5);
        luvut.add(7);

        ArrayList<Integer> jaolliset = jaolliset(luvut);

        jaolliset.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> jaolliset(ArrayList<Integer> luvut) {
        ArrayList<Integer> jaolliset = new ArrayList<>(); 
        luvut.stream().filter(s -> s % 2== 0).forEach(s -> jaolliset.add(s));
        luvut.stream().filter(l -> l%3 == 0).forEach(d -> jaolliset.add(d));
        luvut.stream().filter(i -> i % 5== 0).forEach(f -> jaolliset.add(f));
        return jaolliset;
    }

}
