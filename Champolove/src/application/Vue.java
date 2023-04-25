package application;

import java.util.Observer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Vue extends Application implements Observer{
	

	@Override
	public void start(Stage Stage) throws Exception {
		
		Parent rootLayout = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(rootLayout);
		Stage.setTitle("Champolove");
        Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));  
        Stage.setScene(scene);
        Stage.show(); 
		
		Modele m=new Modele();
		Controleur c=new Controleur(m);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void update(java.util.Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
