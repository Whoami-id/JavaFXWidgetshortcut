
package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    @Override
    public void start(final Stage primaryStage) {
        try {
            final HBox root = new HBox();
            root.setPrefSize(340.0, 70.0);
            root.setSpacing(10.0);

            root.setAlignment(Pos.CENTER);

            final Button button1 = new Button();
            final Button button2 = new Button();
            final Button button3 = new Button();
            final Button button4 = new Button();
            final Button button5 = new Button();

            button1.setPrefSize(64.0, 64.0);
            button2.setPrefSize(64.0, 64.0);
            button3.setPrefSize(64.0, 64.0);
            button4.setPrefSize(64.0, 64.0);
            button5.setPrefSize(64.0, 64.0);

            button1.getStyleClass().add("button1");
            button2.getStyleClass().add("button2");
            button3.getStyleClass().add("button3");
            button4.getStyleClass().add("button4");
            button5.getStyleClass().add("button5");

            root.getChildren().add(button1);
            root.getChildren().add(button2);
            root.getChildren().add(button3);
            root.getChildren().add(button4);
            root.getChildren().add(button5);

            button1.setOnAction(event -> getHostServices().showDocument("https://www.youtube.com/"));

            button2.setOnAction(event -> getHostServices().showDocument("https://www.amazon.de/"));

            button3.setOnAction(event -> getHostServices().showDocument("https://twitter.com/"));

            button4.setOnAction(event -> getHostServices().showDocument("https://de-de.facebook.com/"));

            button5.setOnAction(event -> System.exit(0));

            final Scene scene = new Scene(root, 400, 400);
            scene.setFill(Color.TRANSPARENT);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setX(screenSize.getWidth() / 2 - 180);
            primaryStage.setY(-170.0);
            primaryStage.initStyle(StageStyle.TRANSPARENT);

            primaryStage.show();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        launch(args);
    }

}
