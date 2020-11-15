package tekstitilastointia;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import java.util.Arrays;

public class TekstitilastointiaSovellus extends Application{


    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage Ikkuna) {
        TextArea kentta = new TextArea("");
        Label kirjaimet = new Label("Kirjaimia: 0");
        Label sanoja = new Label("Sanoja: 0");
        Label pisinSana = new Label("Pisin sana on:");
        
        kentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst().get().toString();
            kirjaimet.setText("Kirjaimia: " + merkkeja);
            sanoja.setText("Sanoja: " + palat.length);
            pisinSana.setText("Pisin sana on: " + pisin);
        });
        
        HBox hb = new HBox();
        hb.setSpacing(10);
        hb.getChildren().add(kirjaimet);
        hb.getChildren().add(sanoja);
        hb.getChildren().add(pisinSana);
        
        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(kentta);
        asettelu.setBottom(hb);
        
        Scene nakyma = new Scene(asettelu);
        Ikkuna.setScene(nakyma);
        Ikkuna.show();
    }

}
