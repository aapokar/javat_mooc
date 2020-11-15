package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class ShanghaiSovellus extends Application {

    @Override
    public void start(Stage ikkuna) throws Exception {
        NumberAxis xAkseli = new NumberAxis(2006, 2018, 1);
        NumberAxis yAkseli = new NumberAxis();

        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Suhteellinen kannatus vuosina 1968-2008");
 //       viivakaavio.setLegendVisible(false);
        Scene nakyma = new Scene(viivakaavio, 460, 320);
        XYChart.Series hyData = new XYChart.Series();
        hyData.setName("HY");
        hyData.getData().add(new XYChart.Data(2007, 73));
        hyData.getData().add(new XYChart.Data(2008, 68));
        hyData.getData().add(new XYChart.Data(2009, 72));
        hyData.getData().add(new XYChart.Data(2010, 72));
        hyData.getData().add(new XYChart.Data(2011, 74));
        hyData.getData().add(new XYChart.Data(2012, 73));
        hyData.getData().add(new XYChart.Data(2013, 76));
        hyData.getData().add(new XYChart.Data(2014, 73));
        hyData.getData().add(new XYChart.Data(2015, 67));
        hyData.getData().add(new XYChart.Data(2016, 56));
        hyData.getData().add(new XYChart.Data(2017, 56));
        viivakaavio.getData().add(hyData);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ShanghaiSovellus.class);
    }

}
