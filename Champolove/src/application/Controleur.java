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

import application.Vue;

public class Controleur implements EventHandler<ActionEvent>, Initializable{
	private Vue Vue;
	@FXML
	private Stage Stage;
	@FXML
	private Button inscription;
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
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		inscription.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Parent rootLayout;
				try {
					rootLayout = FXMLLoader.load(getClass().getResource("/FXML/fenLogIn.fxml"));
					Scene scene = new Scene(rootLayout);
					Stage.setTitle("Champolove");
					Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
					Stage.setScene(scene);
					Stage.show();
				} catch (IOException e) {
					e.printStackTrace();
				}
			};	
		});
		connection.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Parent rootLayout;
				try {
					rootLayout = FXMLLoader.load(getClass().getResource("/FXML/fenLogIn.fxml"));
					Scene scene = new Scene(rootLayout);
					Stage.setTitle("Champolove");
					Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
					Stage.setScene(scene);
					Stage.show();
				} catch (IOException e) {
					e.printStackTrace();
				}
			};	
		});
	}
	public void setVue(Vue Vue) {
		this.Vue = Vue;
	}
}
