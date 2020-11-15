package sovellus;

import java.util.Scanner;
import java.util.HashMap;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.File;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class PuolueetSovellus extends Application {

    @Override
    public void start(Stage ikkuna) throws Exception {
        HashMap<String, HashMap<Integer, Double>> lista = luoData("puoluedata.tsv");
        lista.remove("Puolue");
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
        NumberAxis yAkseli = new NumberAxis();
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Suhteellinen kannatus (%)");

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        

        lista.keySet().stream().forEach(puolue -> {
            // jokaiselle puolueelle luodaan oma datajoukko
            XYChart.Series data = new XYChart.Series();
            data.setName(puolue);
            
             lista.get(puolue).entrySet().stream().forEach(pari -> {
                 data.getData().add(new XYChart.Data(pari.getKey(),pari.getValue()));
//                 System.out.println(pari.getKey() + ", " +pari.getValue());
             });
                 viivakaavio.getData().add(data);
        });
        
        Scene nakyma = new Scene(viivakaavio);
        
        ikkuna.setScene(nakyma);
ikkuna.show();

        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
//        launch(PuolueetSovellus.class);
//        HashMap<String, HashMap<Integer, Double>> lista = luoData("puoluedata.tsv");

        launch(PuolueetSovellus.class);
    }

    public static HashMap<String, HashMap<Integer, Double>> luoData(String tiedosto) {

        HashMap<String, HashMap<Integer, Double>> puolueet = new HashMap<>();

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {

                String rivi = tiedostonLukija.nextLine();
                String[] palat = rivi.split("\t");
                int vuosi = 1968;

                HashMap<Integer, Double> vuodetJaKannatus = new HashMap<>();

                for (int i = 1; i < palat.length; i++) {
                    if (!palat[i].equals("-")) {
                        double arvo = Double.valueOf(palat[i]);
                        vuodetJaKannatus.put(vuosi, arvo);
                    }

//                    System.out.println(vuodetJaKannatus.get(vuosi));
                    vuosi += 4;
                }

                puolueet.put(palat[0], vuodetJaKannatus);
                //System.out.println(rivi);
            }

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return puolueet;
    }

}
