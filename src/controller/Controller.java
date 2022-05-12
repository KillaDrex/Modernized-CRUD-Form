package controller;

import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Controller {
	public ImageView exitMark;

	public void initialize() {
		exitMark.setOnMouseClicked(e -> handleMouseClick("exitMark"));
	}
	
	public void handleMouseClick(String node) {
		if (node.equals("exitMark") ) {
			// get stage
			Stage primaryStage = (Stage)exitMark.getScene().getWindow();
			
			// close root stage - application exits
			primaryStage.close();	
		}
	}
}