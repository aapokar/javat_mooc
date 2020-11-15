package ilmoitin;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class IlmoitinSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        TextField kentta = new TextField();
        Button nappi = new Button("Päivitä");
        Label teksti = new Label();
        
        nappi.setOnAction((event) -> {
            teksti.setText(kentta.getText());
        });
        
        VBox asettelu = new VBox();
        asettelu.getChildren().addAll(kentta, nappi, teksti);
        Scene nakyma = new Scene(asettelu);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(IlmoitinSovellus.class);
    }

}
