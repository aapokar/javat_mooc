package borderpane;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.scene.control.Label;

public class BorderPaneSovellus extends Application{
    
    @Override
    public void start(Stage ikkuna) {
        BorderPane BP = new BorderPane();
        BP.setBottom(new Label("SOUTH"));
        Label ita = new Label("EAST");
        BP.setRight(ita);
        BP.setTop(new Label("NORTH"));
        Scene nakyma = new Scene(BP);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(BorderPaneSovellus.class);
        System.out.println("Hello world!");
    }

}
