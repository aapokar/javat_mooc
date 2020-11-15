package sovellus;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;


public class TervehtijaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        Button nappi = new Button("Aloita");
        Label alkuteksti = new Label("Kirjoita nimesi ja aloita.");
        TextField kentta = new TextField();
        Label lopputeksti = new Label("");

        GridPane asettelu = new GridPane();

        asettelu.add(alkuteksti, 0, 0);
        asettelu.add(kentta, 0, 1);
        asettelu.add(nappi, 0, 2);
              asettelu.setVgap(10);
      asettelu.setHgap(10);
      asettelu.setPrefSize(350, 200);
        asettelu.setAlignment(Pos.CENTER);
//        asettelu.setPadding(new Insets(10,50,50,20));

        Scene eka = new Scene(asettelu);
        
        GridPane asettelu2 = new GridPane();
        asettelu2.add(lopputeksti, 0, 0);
        asettelu2.setPrefSize(150, 150);
        asettelu2.setAlignment(Pos.CENTER);
        Scene toka = new Scene(asettelu2);
        
        nappi.setOnAction((event) -> {
            lopputeksti.setText("Tervetuloa " + kentta.getText() + "!");
            ikkuna.setScene(toka);
        });
        
        ikkuna.setScene(eka);
        ikkuna.show();
    
    }

    public static void main(String[] args) {
        System.out.println("Hellow world!");
        launch(TervehtijaSovellus.class);
    }
}
