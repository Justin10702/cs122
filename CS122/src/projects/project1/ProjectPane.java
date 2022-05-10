package projects.project1;


import java.util.LinkedList;

import javafx.event.ActionEvent;


import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class ProjectPane extends GridPane {
	private final Label result = new Label();
	LinkedQueue q = new LinkedQueue();

	
	public ProjectPane() {

		
		Font font1 = Font.font("Courier New", FontWeight.BOLD, 12);
		Font font2 = Font.font("Courier New", FontWeight.BOLD, 18);
		
		
	
		Text t = new Text(10, 20, q.toString());
		t.setFont(font2);
		
		
		Button add = new Button("ADD");
		
		GridPane.setHalignment(add, HPos.CENTER);

		  

		add.setFont(font1);
		
		
		TextField textField = new TextField ();
		textField.setPromptText("What do you want to add to the linkedlist");
		GridPane.setConstraints(textField, 0, 0);
		


		
		Button remove = new Button ("Remove");
		remove.setFont(font1);
		GridPane.setHalignment(remove, HPos.RIGHT);
		
		Button clear = new Button("Clear");
		clear.setFont(font1);
		GridPane.setHalignment(clear, HPos.LEFT);
		
		add.setOnAction(event -> {
			String addit = textField.getText();
			q.enqueue(addit);
			t.setText(q.toString());
		});
		
		remove.setOnAction(event -> {
			q.dequeue();
			
			t.setText(q.toString());
		});
		
		clear.setOnAction(event -> {
			while(!q.isEmpty()) {
				q.dequeue();
			}
			t.setText(" ");
		});

		setAlignment(Pos.CENTER);
		setHgap(20);
		setVgap(10);
		setStyle("-fx-background-color: yellow");

		add(textField, 0 ,0);
		add(t, 0,25);
		add(add, 1, 0);
		add(remove, 3,0);
		add(clear, 6, 0 );
		add(result, 1, 1);
	
	}
}
	