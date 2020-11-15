package sovellus;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.control.Slider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class SaastolaskuriSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        asettelu.setPrefSize(650, 450);

        VBox ylalaita = new VBox();
        ylalaita.setPadding(new Insets(5, 5, 5, 5));
        ylalaita.setSpacing(10);
        BorderPane tallennus = new BorderPane();

        Font tasaleveys = Font.font("Monospaced", 15);
        Label tallennusTeksti = new Label("Kuukausittainen tallennus");
        tallennusTeksti.setFont(tasaleveys);
        tallennus.setLeft(tallennusTeksti);

        Slider tallennusSlider = new Slider();
        tallennusSlider.setMin(25);
        tallennusSlider.setMax(250);
        tallennusSlider.setValue(40);
        tallennusSlider.setShowTickLabels(true);
        tallennusSlider.setShowTickMarks(true);
        tallennusSlider.setMajorTickUnit(50);
        tallennusSlider.setMinorTickCount(1);
        tallennusSlider.setBlockIncrement(5);
        tallennusSlider.setSnapToTicks(true);
        tallennus.setCenter(tallennusSlider);

        int tallennuksenAlkuarvo = (int) tallennusSlider.getValue();
        Label tallennusArvo = new Label(Integer.toString(tallennuksenAlkuarvo));
        tallennus.setRight(tallennusArvo);
        tallennusArvo.setPrefWidth(25);

        BorderPane korko = new BorderPane();
        Label korkoTeksti = new Label("Vuosittainen korko");
        korkoTeksti.setFont(tasaleveys);
        korko.setLeft(korkoTeksti);

        Slider korkoSlider = new Slider(0, 10, 0);
        korkoSlider.setMajorTickUnit(1);
        korkoSlider.setShowTickLabels(true);
        korkoSlider.setShowTickMarks(true);
        korko.setCenter(korkoSlider);
        Label korkoArvo = new Label(Double.toString(korkoSlider.getValue()));
        korko.setRight(korkoArvo);
        korkoArvo.setPrefWidth(25);

        ylalaita.getChildren().addAll(tallennus, korko);
        asettelu.setTop(ylalaita);

        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis();
        LineChart viivakaavio = new LineChart(xAkseli, yAkseli);
        viivakaavio.setTitle("Säästölaskuri");
        viivakaavio.setLegendVisible(false);

        asettelu.setCenter(viivakaavio);
        Scene nakyma = new Scene(asettelu);

        korkoSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov, Number old_val,
                    Number new_val) {
                korkoArvo.setText(String.format("%.2f", new_val));
                viivakaavio.getData().clear();
                XYChart.Series data1 = new XYChart.Series();
                XYChart.Series data2 = new XYChart.Series();
                double korolla = 0.0;
                double jokavuosi = tallennusSlider.getValue()*12D;
                for (int i = 0; i <= 30; i++) {
                    int tallennusMaara = (int) tallennusSlider.getValue();
                    int vuosittain = i * tallennusMaara * 12;
                    System.out.println(vuosittain);
                    data1.getData().add(new XYChart.Data(i, vuosittain));
                    double todellinenKorko = (new_val.doubleValue()+ 100D)/100D;
//                    System.out.println(todellinenKorko);
                    if (i == 0) {
                        korolla = 0;
                    } else {
                    korolla = (korolla + jokavuosi) * todellinenKorko;
                    System.out.println(korolla);
                    }
                    data2.getData().add(new XYChart.Data(i, korolla));
                }
                viivakaavio.getData().add(data1);
                viivakaavio.getData().add(data2);
            }

        });

        tallennusSlider.valueProperty()
                .addListener(
                        (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                            tallennusArvo.setText(String.format("%.0f", new_val));
                            viivakaavio.getData().clear();
                            XYChart.Series data1 = new XYChart.Series();
                            XYChart.Series data2 = new XYChart.Series();
                            double korolla = 0.0;
                            double jokavuosi = new_val.doubleValue() *12D;
                            for (int i = 0; i <= 30; i++) {
                                int vuosittain = i * new_val.intValue() * 12;
                                data1.getData().add(new XYChart.Data(i, vuosittain));
                                double todellinenKorko = korkoSlider.getValue();
                                todellinenKorko = (todellinenKorko+ 100D) /100D;
//                                System.out.println(todellinenKorko);
                                if (i == 0) {
                                    korolla = 0;
                                } else {
                                korolla = (korolla + jokavuosi) * todellinenKorko;
                                }
//                                System.out.println(korolla);
                                data2.getData().add(new XYChart.Data(i,korolla));
                            }
                            viivakaavio.getData().add(data1);
                            viivakaavio.getData().add(data2);
//                            data2.getData().stream()
//                                    .forEach(i -> System.out.println(i.toString()));
                        }
                );

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SaastolaskuriSovellus.class);
    }

}
