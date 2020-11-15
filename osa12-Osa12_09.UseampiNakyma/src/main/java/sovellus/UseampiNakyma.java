package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {
    
    @Override
    public void start(Stage ikkuna) {
   
        
        Button nappi1 = new Button("Tokaan näkymään!");
        Label ekaNakyma = new Label("Eka näkymä!");
        BorderPane bp = new BorderPane();
        bp.setTop(ekaNakyma);
        bp.setCenter(nappi1);
        Scene eka = new Scene(bp);
        ikkuna.setScene(eka); 

        
        Label tokaNakyma = new Label("Toka näkymä!");
        Button nappi2 = new Button("Kolmanteen näkymään!");
        VBox vb = new VBox(nappi2, tokaNakyma);
        vb.setSpacing(10);
        Scene toka = new Scene(vb);
        
        Label kolmasNakyma = new Label("Kolmas näkymä!");
        Button nappi3 = new Button("Ekaan näkymään!");
        GridPane gp = new GridPane();
        gp.add(kolmasNakyma, 0, 0);
        gp.add(nappi3, 1, 1);

        Scene kolmas = new Scene(gp);
                
        nappi1.setOnAction((event) -> {
            ikkuna.setScene(toka);
        });
        nappi2.setOnAction((event) -> {
            ikkuna.setScene(kolmas);
        });
        nappi3.setOnAction((event) -> {
            ikkuna.setScene(eka);
        });


    ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(UseampiNakyma.class);
    }

}
