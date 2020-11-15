
public class Paaohjelma {

    public static void main(String[] args) {
Raha a = new Raha(10, 0);
Raha b = new Raha(3, 50);

Raha c = a.miinus(b);

System.out.println(a);  // 10.00e
System.out.println(b);  // 3.50e
System.out.println(c);  // 6.50e
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
    }
}
