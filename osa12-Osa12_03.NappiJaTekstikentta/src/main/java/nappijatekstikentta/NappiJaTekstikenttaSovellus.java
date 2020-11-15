package nappijatekstikentta;

import javafx.scene.Scene;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;

public class NappiJaTekstikenttaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        Button nappi = new Button("Nappi");
        TextField tekstikentta = new TextField("Moi");
        FlowPane kp = new FlowPane(Orientation.VERTICAL);

        kp.getChildren().add(nappi);
        kp.getChildren().add(tekstikentta);
        Scene nakyma = new Scene(kp);
        ikkuna.setTitle("Moi!");
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
        System.out.println("Hello world!");
    }

}
