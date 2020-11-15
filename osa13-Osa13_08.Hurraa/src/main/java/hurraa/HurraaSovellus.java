package hurraa;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        AudioClip hurraa = new AudioClip("file:Applause-Yannick_Lemieux.wav");

        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);
        
        
                nappi.setOnAction((event) -> hurraa.play());
//        nappi.setOnMouseClicked((MouseEvent event) -> 
//            aani.play()
////            System.out.println("moi!");
//        );

        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
