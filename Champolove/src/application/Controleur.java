package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Controleur implements EventHandler<ActionEvent>, Initializable{
	public Vue Vue;
	@FXML
	public Stage Stage;
	@FXML
	public Button inscription;
	@FXML
	public Button connection;
	

	private Modele modl;
	public Controleur() {
		// constructeur sans arguments
	}
	
	public Controleur (Modele modl) {
		this.modl=modl;
	}

	@Override
	public void handle(ActionEvent event) {
		System.out.println(event.getTarget());
		
	}
	@FXML
	private void sInscrire(ActionEvent event) {
		Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/fenLogIn.fxml"));
			Scene scene = new Scene(rootLayout);
			this.Stage=new Stage();
			Stage.setTitle("Champolove");
			Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
			Stage.setScene(scene);
			Stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@FXML
	private void seConnecter(ActionEvent event) {
		Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/fenLogIn.fxml"));
			Scene scene = new Scene(rootLayout);
			this.Stage=new Stage();
			Stage.setTitle("Champolove");
			Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
			Stage.setScene(scene);
			Stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	public void setVue(Vue Vue) {
		this.Vue = Vue;
	}
}
