package application;

import java.io.File;
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
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Controleur implements EventHandler<ActionEvent>, Initializable{
	private Vue Vue;
	@FXML private Stage Stage;
	/*
	 * Instantiation contrôles fenêtre page d'acceuil
	 */
	@FXML private Button inscription;
	@FXML private Button connection;
	/*
	 * Instantiation contrôles fenêtre page de connexion
	 */
	@FXML private Button RetourAcceuil;
	@FXML private Button ValideConnexion;
	/*
	 * Instantiation contrôles fenêtre page d'inscription
	 */
	@FXML private Button ValideInscription;
	@FXML private ImageView imageView;
	@FXML private Button choisirImage;
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
	/*
	 * Création méthodes fenêtre page d'acceuil
	 */
	@FXML private void sInscrire(ActionEvent event) {
		Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/fenSignIn.fxml"));
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
	@FXML private void seConnecter(ActionEvent event) {
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
	/*
	 * Création méthodes fenêtre page de connexion
	 */
	@FXML private void RetourAcceuil(ActionEvent event) {
		Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/View.fxml"));
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
	@FXML private void ValideConnexion(ActionEvent event) {
		//A définir
	}
	/*
	 * Création méthodes fenêtre page d'inscription
	 */
	@FXML private void ValideInscription(ActionEvent event) {
		//A définir
	}
	@FXML private void choisirImage(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
	    fileChooser.setTitle("Select an image");
	    fileChooser.getExtensionFilters().addAll(
	            new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"));
	    File selectedFile = fileChooser.showOpenDialog(Stage);
	    if (selectedFile != null && selectedFile.exists()) {
	        Image image = new Image(selectedFile.toURI().toString());
	        imageView.setImage(image);
	    }
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	public void setVue(Vue Vue) {
		this.Vue = Vue;
	}
}
