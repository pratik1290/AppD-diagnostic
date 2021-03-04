package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Button nxt = new Button();
			Button cnl = new Button();
			nxt.setText("next");
	        cnl.setText("cancel");
	        nxt.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Next");
	            }
	        });
	        
	        cnl.setOnAction(new EventHandler<ActionEvent>() {
	        	
	        	@Override
	        	public void handle(ActionEvent event) {
	        		primaryStage.close();
	        		
	        	}
			});
	        
	        HBox buttons = new HBox(nxt, cnl);
	        buttons.setPadding(new Insets(18, 20, 18, 20));
	        buttons.setSpacing(10);
	        buttons.setAlignment(Pos.BOTTOM_RIGHT);
	        
	        
	        Scene scene = new Scene(buttons, 700, 450);
	        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	        primaryStage.setTitle("AppDynamics Diagnostic Tool");
	        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("logo.png")));
	        primaryStage.setScene(scene);
	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
