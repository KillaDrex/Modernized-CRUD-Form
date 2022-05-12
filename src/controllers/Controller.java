package controller;

import javafx.scene.control.Button;

public class Controller {
	public Button addButton, updateButton, deleteButton, clearButton;
	
	public void initialize() {
		addButton.setOnAction(e -> handleButtonClick("Add Button"));
		updateButton.setOnAction(e -> handleButtonClick("Update Button"));
		deleteButton.setOnAction(e -> handleButtonClick("Delete Button"));
		clearButton.setOnAction(e -> handleButtonClick("Clear Button"));
	}
	
	public void handleButtonClick(String button) {
		System.out.println(button + " was clicked!");
	}
}