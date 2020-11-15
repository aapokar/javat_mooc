package gameoflife;


public class Main {

    public static void main(String[] args) {
        // voit tehdä tänne testikoodia

GameOfLife gol = new GameOfLife(4, 4);

int[][] taulukko = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}};
gol.setTaulukko(taulukko);
System.out.println(gol.elossaOleviaNaapureita(gol.getTaulukko(), 0, 1));
System.out.println(gol.elossaOleviaNaapureita(gol.getTaulukko(), 1, 1));
System.out.println(gol.elossaOleviaNaapureita(gol.getTaulukko(), 3, 3));
System.out.println(gol.elossaOleviaNaapureita(gol.getTaulukko(), 0, 3));


for (int x = 0; x < gol.getTaulukko().length; x++) {
            System.out.println("\n");
    for (int y = 0; y < gol.getTaulukko()[0].length; y++) {
            System.out.print(gol.getTaulukko()[x][y]);
    }}
gol.kehity();
for (int x = 0; x < gol.getTaulukko().length; x++) {
            System.out.println("\n");
    for (int y = 0; y < gol.getTaulukko()[0].length; y++) {
            System.out.print(gol.getTaulukko()[x][y]);
    }}
gol.kehity();
//for (int x = 0; x < gol.getTaulukko().length; x++) {
//            System.out.println("\n");
//    for (int y = 0; y < gol.getTaulukko()[0].length; y++) {
//            System.out.print(gol.getTaulukko()[x][y]);
//    }}
        // Jos ohjelmassa on useampi luokka, joka sisältää main-metodin, voi
        // halutun main metodin käynnistää valitsemalla luokka vasemmalla
        // olevasta projektilistauksesta ja painamalla oikealla
        // hiirennapilla "Run File".
    }

}
