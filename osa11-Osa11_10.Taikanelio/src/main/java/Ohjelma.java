
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa Taikanelio-luokkaasi täällä


        Taikaneliotehdas tt = new Taikaneliotehdas();
        Taikanelio tt1 = new Taikanelio(2);
        tt1.asetaArvo(0, 0, 1);
        tt1.asetaArvo(0, 1, 1);
        tt1.asetaArvo(1, 0, 2);
        System.out.println(tt.luoTaikanelio(5));
        System.out.println(tt1.rivienSummat());
        System.out.println(tt1.sarakkeidenSummat());
    }
}
