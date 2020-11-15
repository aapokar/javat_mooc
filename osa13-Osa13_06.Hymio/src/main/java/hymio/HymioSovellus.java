package hymio;

//import java.awt.Color;
import javafx.scene.paint.Color;
import java.awt.Paint;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HymioSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {

        Canvas piirtoalusta = new Canvas(400, 400);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        ColorPicker varinValitsin = new ColorPicker();

        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);

        piirturi.setFill(Color.WHITE);
        piirturi.fill();
        piirturi.setFill(Color.BLACK);
        piirturi.fillRect(100, 50, 50, 50);
        piirturi.fillRect(250, 50, 50, 50);
        piirturi.fillRect(50, 200, 50, 50);
        piirturi.fillRect(100, 250, 50, 50);
        piirturi.fillRect(150, 250, 50, 50);
                piirturi.fillRect(200, 250, 50, 50);
                        piirturi.fillRect(250, 250, 50, 50);
                                piirturi.fillRect(300, 200, 50, 50);

//        piirtoalusta.setOnMouseDragged((event) -> {
//            double kohtaX = event.getX();
//            double kohtaY = event.getY();
//            piirturi.setFill(varinValitsin.getValue());
//            piirturi.fillOval(kohtaX, kohtaY, 4, 4);
//        });
        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        launch(HymioSovellus.class);
    }
}
