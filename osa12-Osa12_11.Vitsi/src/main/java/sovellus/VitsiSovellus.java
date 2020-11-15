package sovellus;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class VitsiSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        Button nappi1 = new Button ("Vitsi");
        Button nappi2 = new Button ("Vastaus");
        Button nappi3 = new Button("Selitys");
        
        String vitsi = "What do you call a bear with no teeth?";
        String vastaus = "A gummy bear.";
        String selitys = "Tämä vitsi ei toimi suomennettuna.";
        
        BorderPane asettelu = new BorderPane();
        HBox aliAsettelu = new HBox();

        
        aliAsettelu.setPadding(new Insets(10,10,10,10));
        aliAsettelu.setSpacing(10);
        aliAsettelu.getChildren().addAll(nappi1, nappi2, nappi3);
        aliAsettelu.setAlignment(Pos.CENTER);
        asettelu.setTop(aliAsettelu);
        
        nappi1.setOnAction((event) -> {
            asettelu.setCenter(luoNakyma(vitsi));
        });
        nappi2.setOnAction((event) -> {
            asettelu.setCenter(luoNakyma(vastaus));
        });
        nappi3.setOnAction((event) -> {
            asettelu.setCenter(luoNakyma(selitys));
        });
        
        Scene nakyma = new Scene(asettelu);
        asettelu.setCenter(luoNakyma(vitsi));
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    private StackPane luoNakyma(String teksti) {
        StackPane uusi = new StackPane();
        uusi.setPrefSize(300, 150);
        uusi.setAlignment(Pos.CENTER);
        uusi.getChildren().add(new Label(teksti));
        return uusi;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(VitsiSovellus.class);
    }
}
