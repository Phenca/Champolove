package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Controleur implements EventHandler<ActionEvent>, Initializable{
	private Vue Vue;
	@FXML
	private Stage Stage;
	@FXML
	private Button inscription;
	@FXML
	private Button connection;
	

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
			this.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			this.Stage.setTitle("Champolove");
			this.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
			this.Stage.setScene(scene);
			this.Stage.show();
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
			this.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			this.Stage.setTitle("Champolove");
			this.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
			this.Stage.setScene(scene);
			this.Stage.show();
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
