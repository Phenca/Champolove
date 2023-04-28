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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
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
	
	
	/*
	 * les variables des données du profilPrincipale
	 */
	@FXML private DatePicker DaTeNaissanceProfil;
	 
	@FXML private TextField adresseEmailProfil;

	@FXML private PasswordField mdpProfil;

	@FXML private TextField nomProfil;

	@FXML private TextField TailleProfil;
	
	@FXML private ChoiceBox<?> SexeProfil;

    @FXML private TextField prenomProfil;
    
    
    /*
	 * les variables Pour la fenêtre principale
	 */
    
    @FXML
    private ImageView imageDuProfilEnCoursDeLecture;

    @FXML
    private Button CNON;

    @FXML
    private Button COUI;
       
    public int indexProfilEnCoursDeLecture=0;
    
    @FXML
    private Label prenomProfilEnCoursDeLecrture;
    
    public Profil actuelle;
    
    @FXML
    private Label ageDuProfilEnCoursDeLecture;
    
    
    
    
	public Modele modl;
	
	
	
	
	public Controleur() {
		// constructeur sans arguments
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
		Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/pagePrincipale.fxml"));
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
	 * Création méthodes fenêtre page d'inscription
	 */
	@FXML private void ValideInscription(ActionEvent event) {
		Parent rootLayout;
		try {
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource("/FXML/pagePrincipale.fxml"));
	        rootLayout = loader.load();
	        Controleur c=loader.getController();
			System.out.println(this.modl);
			if(this.modl.memoiremixte.pUser.VotrePreference=="mixte") {
				c.actuelle=c.modl.memoiremixte.memoirePMixtes.get(indexProfilEnCoursDeLecture);
				Image imageProfilSelectionEnCours=new Image(this.actuelle.lien_photoProfil);
				c.imageView.setImage(imageProfilSelectionEnCours);
				
				c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(this.actuelle.age));
				
				c.prenomProfilEnCoursDeLecrture.setText(this.actuelle.prenom);
				
			}
			if(this.modl.memoiremixte.pUser.VotrePreference=="femme") {
				this.actuelle=this.modl.memoiremixte.memoirePFemme.get(indexProfilEnCoursDeLecture);
				System.out.println(this.actuelle);
				System.out.println(this.actuelle.lien_photoProfil);
				Image imageProfilSelectionEnCours=new Image(this.actuelle.lien_photoProfil);
				imageView.setImage(imageProfilSelectionEnCours);
				
			}
			if(this.modl.memoiremixte.pUser.VotrePreference=="homme") {
				this.actuelle=this.modl.memoiremixte.memoirePHomme.get(indexProfilEnCoursDeLecture);
				System.out.println(this.actuelle);
				System.out.println(this.actuelle.lien_photoProfil);
				Image imageProfilSelectionEnCours=new Image(this.actuelle.lien_photoProfil);
				imageView.setImage(imageProfilSelectionEnCours);
				
			}
			
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
	@FXML private void choisirImage(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
	    fileChooser.setTitle("Select an image");
	    fileChooser.getExtensionFilters().addAll(
	            new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"));
	    File selectedFile = fileChooser.showOpenDialog(Stage);
	    if (selectedFile != null && selectedFile.exists()) {
	        Image image = new Image(selectedFile.toURI().toString());
	        System.out.println(selectedFile.toURI().toString());
	        imageView.setImage(image);
	    }
	    
	    
	    
	}
	
	
	
	/*
	 * méthode pour changer de profil en cours de selection
	 */
    @FXML
    void profilSuivant(ActionEvent event) {
    	indexProfilEnCoursDeLecture+=1;
    	System.out.println(this.ageDuProfilEnCoursDeLecture.getText());
    	
    }
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.modl=new Modele();
		
	}
	public void setVue(Vue Vue) {
		this.Vue = Vue;
	}
}
