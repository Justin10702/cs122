package projects.project1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Project1 extends Application {
	
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new ProjectPane(), 1280, 720);

		primaryStage.setTitle("Project Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
