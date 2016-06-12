package Game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.animation.*;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext shapes) {
        shapes.setStroke(Color.BLUE);
        shapes.strokeRect(85, 95, 690, 615);
        shapes.strokeRect(85, 95, 10, 615);
        shapes.strokeRect(765, 95, 10, 615);
        shapes.strokeRect(85, 95, 690, 10);
        shapes.strokeRect(85, 700, 690, 10);
      //  shapes.strokeOval(95, 105, 105, 105);
       // shapes.strokeOval(660, 105, 105, 105);
      //  shapes.strokeOval(95, 595, 105, 105);
      //  shapes.strokeOval(660, 595, 105, 105);
        shapes.strokeRect(195, 135, 468, 3);
        shapes.strokeRect(197, 154, 465, 3);
        shapes.strokeRect(198, 625, 463, 3);
        shapes.strokeRect(198, 645, 463, 3);
        shapes.strokeRect(720, 208, 15, 392);
        shapes.strokeRect(160, 475, 3, 125);
        shapes.strokeRect(128, 480, 3, 119);
        shapes.strokeRect(95, 475, 40, 3);
        shapes.strokeRect(160, 450, 45, 3);
        shapes.strokeRect(95, 450, 37, 3);
        shapes.strokeRect(160, 475, 45, 3);
        shapes.strokeRect(130, 205,3, 245);
        shapes.strokeRect(160, 205, 3, 245);
        shapes.strokeRect(160, 515,35, 15);
        shapes.strokeRect(225,515,75, 15);
        shapes.strokeRect(325, 515,125,15);
        shapes.strokeRect(370,515, 15, 110 );
        shapes.strokeRect(480, 515, 105, 15);
        shapes.strokeRect(209, 550, 8, 60);
        shapes.strokeRect(235, 550, 8, 60);
        shapes.strokeRect(261, 550, 8, 60);
        shapes.strokeRect(287, 550, 8, 60);
        shapes.strokeRect(327, 570, 15, 35);
        shapes.strokeRect(570, 420, 15, 205);
        shapes.strokeRect(570, 275, 15, 100);
        shapes.strokeRect(570, 190, 15, 55);
        shapes.strokeRect(570, 190, 105, 10);
        shapes.strokeRect(570, 330, 150, 15);
        shapes.strokeRect(670, 210, 30, 40);
        shapes.strokeOval(320, 200, 50, 50);
        shapes.strokeOval(535, 455, 25,25);
       // shapes.strokeArc(95, 105, 105, 105, 18, 236, ArcType.ROUND);
       // shapes.strokeArc(660, 105, 105, 105, 280, 240, ArcType.ROUND);
       shapes.strokeArc(95, 105, 105, 105, 18, 236, ArcType.OPEN);
       shapes.strokeArc(660, 105, 105, 105, 280, 236, ArcType.OPEN);
        shapes.strokeArc(95, 595, 105, 105, 110, 250, ArcType.OPEN);
        shapes.strokeArc(660, 595, 105, 105, 180, 290, ArcType.OPEN);

        shapes.strokeArc(95, 105, 105, 105, 288, 75, ArcType.OPEN);
        shapes.strokeArc(660, 105, 105, 105, 180, 100, ArcType.OPEN);
        shapes.strokeArc(95, 595, 105, 105, 20, 60, ArcType.OPEN);

    }
}
