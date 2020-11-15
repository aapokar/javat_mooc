package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

/**
 *
 * @author Aapo
 */
public class Alus extends Hahmo{

    private Polygon hahmo;
    private Point2D liike;

    public Alus(int x, int y) {
        super(new Polygon(-5, -5, 10, 0, -5, 5), x, y);
//        this.hahmo.setTranslateX(x);
//        this.hahmo.setTranslateY(y);
//
//        this.liike = new Point2D(0, 0);
    }

//    public Polygon getHahmo() {
//        return hahmo;
//    }
//
//    public void kaannaVasemmalle() {
//        this.hahmo.setRotate(this.hahmo.getRotate() - 5);
//    }
//
//    public void kaannaOikealle() {
//        this.hahmo.setRotate(this.hahmo.getRotate() + 5);
//    }
//
//    public void liiku() {
//        this.hahmo.setTranslateX(this.hahmo.getTranslateX() + this.liike.getX());
//        this.hahmo.setTranslateY(this.hahmo.getTranslateY() + this.liike.getY());
//    }
//
//    public void kiihdyta() {
//        double muutosX = Math.cos(Math.toRadians(this.hahmo.getRotate()));
//        double muutosY = Math.sin(Math.toRadians(this.hahmo.getRotate()));
//
//        muutosX *= 0.05;
//        muutosY *= 0.05;
//
//        this.liike = this.liike.add(muutosX, muutosY);
//    }
}
