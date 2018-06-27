import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

// Main is the subclass and Application is the superclass
public class Main extends Application
{

	public static void main(String[] args) 
	{
		launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{		
		Label greeting = new Label("Welcome");
	
	    // Set and save fonts to variables
		Font f1 = new Font("Times New Roman", 20);	     
	    Font f2 = new Font("Sanserif", 14);
	    Font f3 = new Font("Verdana", 18);
	    
	    greeting.setFont(f3);		
		
	/*
	    Stage is everything in the outside
	    Scene is everything in the inside the stage
	*/
	    
	    // Create a radio button and pick its color
	 	RadioButton rb1 = new RadioButton("Red");
	 	RadioButton rb2 = new RadioButton("Green");
	 	RadioButton rb3 = new RadioButton("Blue");
	 	
	 	// Add a text field
	 	TextField textbox = new TextField();
					     
		// This creates buttons
		Button OKbtn = new Button("OK"); 
		OKbtn.setFont(f2);
		OKbtn.setMinWidth(70);
	
		// This is called an event handler
		// Gives function to the OK button when clicked
		OKbtn.setOnAction(e -> {
			
			if(rb1.isSelected())
				textbox.setText("Red is selected");
						
			else if(rb2.isSelected())
				textbox.setText("Green is selected");
			
			else if(rb3.isSelected())
				textbox.setText("Blue is selected");
				
						
		});
		
		Button Stopbtn = new Button("Stop"); 
		Stopbtn.setFont(f2);
		Stopbtn.setMinWidth(70);
		
		// Give function to stop button
		Stopbtn.setOnAction(e ->{
			System.exit(0);
			
		});
				
		// This makes horizontal buttons
		HBox horizontalBox = new HBox(); 		
		horizontalBox.getChildren().addAll(OKbtn, Stopbtn);
		horizontalBox.setSpacing(10);
		horizontalBox.setPadding(new Insets(20, 10, 10, 10));
				
		// ToggleGroup makes it so that when you
		// click one radio button, another one 
		// gets de-selected
		ToggleGroup group = new ToggleGroup();
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
				
		// This makes rb1 pre-selected
		rb1.setSelected(true);
			
		// This presets text in the text field
		textbox.setText("Select a color and click OK");
		
	
		// Add Images
		// Make sure to save the image in 
		// the same folder as source code
		ImageView img = new ImageView("CS.jpg");
		

		// This makes vertical buttons
		VBox verticleBox = new VBox();
		verticleBox.getChildren().addAll(greeting, rb1, rb2, rb3, textbox, img, horizontalBox);
		verticleBox.setSpacing(10);
		verticleBox.setPadding(new Insets(20, 10, 10, 20));
		
   		// This creates the actual window
		// size in pixels (410 X 410)
		Scene scene = new Scene(verticleBox, 410, 410); 
		stage.setScene(scene);
		stage.setTitle("My GUI");
		stage.show();
		
	}

}
