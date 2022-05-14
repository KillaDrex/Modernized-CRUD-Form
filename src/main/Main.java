package main;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.fxml.FXMLLoader;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.paint.Color;

public class Main extends Application {
	private double x, y;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
		
		Scene scene = new Scene(root);
		scene.setFill(Color.TRANSPARENT); // remove white background
		
		primaryStage.initStyle(StageStyle.TRANSPARENT); // remove white background
		primaryStage.setScene(scene);

		// center stage (window)
		double rootWidth = 1338, rootHeight = 574; // from scenebuilder
		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		primaryStage.setX((screenBounds.getWidth() - rootWidth) / 2);
		primaryStage.setY((screenBounds.getHeight() - rootHeight) / 2);
		
		// make stage draggable
        root.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {

            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);

        });
		
		// show stage
		primaryStage.show();
	}
}