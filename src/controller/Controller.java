package controller;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Controller {
	public ImageView exitMark;
	public VBox table;
	
	public void initialize() {
		exitMark.setOnMouseClicked(e -> handleMouseClick("exitMark"));
		// add some records to table
        Node[] nodes = new Node[10];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("/record.fxml"));

                //give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #192448");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #04103A");
                });
                table.getChildren().add(nodes[i]);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
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