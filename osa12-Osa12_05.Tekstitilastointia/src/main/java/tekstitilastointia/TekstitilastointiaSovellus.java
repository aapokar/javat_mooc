package tekstitilastointia;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;

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
        Label pisin = new Label("Pisin sana on:");
        
        HBox hb = new HBox();
        hb.setSpacing(10);
        hb.getChildren().add(kirjaimet);
        hb.getChildren().add(sanoja);
        hb.getChildren().add(pisin);
        
        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(kentta);
        asettelu.setBottom(hb);
        
        Scene nakyma = new Scene(asettelu);
        Ikkuna.setScene(nakyma);
        Ikkuna.show();
    }

}
