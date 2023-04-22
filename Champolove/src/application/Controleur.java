package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.event.EventHandler;

public class Controleur implements EventHandler<ActionEvent>{
	//FXML
	private Stage Stage;
	@FXML
	private Button Inscription;
	@FXML
	private Button connection;
	

	private Modele modl;
	
	public Controleur (Modele modl) {
		this.modl=modl;
	}

	@Override
	public void handle(ActionEvent event) {
		System.out.println(event.getTarget());
		
	}
	
	@FXML
	void sInscrire(ActionEvent event) throws IOException {
	    	
	}

	@FXML
	void seConnecter(ActionEvent event) throws IOException {
		Parent rootLayout = FXMLLoader.load(getClass().getResource("/FXML/fenLogIn.fxml"));
		Scene scene = new Scene(rootLayout);
		Stage.setTitle("Champolove");
        Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
        Stage.setScene(scene);
        Stage.show();
	}
	
}
