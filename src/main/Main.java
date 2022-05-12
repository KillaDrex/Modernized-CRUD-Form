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
	private double rootWidth = 879.2000122070312, rootHeight = 573.5999755859375;
	
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
		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		primaryStage.setX((screenBounds.getWidth() - rootWidth) / 2);
		primaryStage.setY((screenBounds.getHeight() - rootHeight) / 2);
		
		// allow resizing for undecorated stage
		ResizeHelper.addResizeListener(primaryStage, rootWidth, rootHeight);
		
		// show stage
		primaryStage.show();		
	}
	
	
}