package nappijatekstielementti;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class NappiJaTekstielementtiSovellus extends Application{

    
        @Override
    public void start(Stage ikkuna) {
        Button nappi = new Button("Nappi");
        Label teksti = new Label("Teksti");
                nappi.setContentDisplay(ContentDisplay.LEFT);
        teksti.setContentDisplay(ContentDisplay.RIGHT);
        nappi.setAlignment(Pos.TOP_LEFT);
        teksti.setAlignment(Pos.BOTTOM_RIGHT);
        FlowPane komponenttiRyhmä = new FlowPane();
                komponenttiRyhmä.getChildren().add(nappi);
        komponenttiRyhmä.getChildren().add(teksti);


        Scene nakyma = new Scene(komponenttiRyhmä);
        ikkuna.setScene(nakyma);
        ikkuna.setTitle("Sovellukseni");
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
        System.out.println("Hello world!");
    }

}
