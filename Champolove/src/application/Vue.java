package application;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Vue extends Application implements Observer {
	private Stage Stage;

	@Override
	public void start(Stage Stage) throws Exception {
		this.Stage = Stage;
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/FXML/View.fxml"));
			AnchorPane rootLayout = (AnchorPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			Stage.setTitle("Champolove");
	        Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));  
	        Stage.setScene(scene);
	        Stage.show(); 
		} catch (IOException e){
			e.printStackTrace();
		}
		
		Modele m=new Modele();

		Controleur c=new Controleur(m);
		
	}
	
	public Stage getStage() {
		return Stage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}