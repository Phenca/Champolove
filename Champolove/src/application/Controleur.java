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
	public Controleur c;
	@FXML private Stage Stage;
	/*
	 * 
	 * 
	 * Instantiation contrôles fenêtre page d'acceuil
	 * 
	 * 
	 */
	@FXML private Button inscription;
	@FXML private Button connection;
	/*
	 * 
	 * 
	 * Instantiation contrôles fenêtre page de connexion
	 * 
	 * 
	 */
	@FXML private Button RetourAcceuil;
	@FXML private Button ValideConnexion;
	/*
	 * 
	 * 
	 * Instantiation contrôles fenêtre page d'inscription
	 * 
	 * 
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
     * 
     * 
	 * Instantiation contrôles fenêtre pagePrincipale
	 * 
	 * 
	 */
    @FXML private ImageView imageDuProfilEnCoursDeLecture;
    @FXML private Button CNON;
    @FXML private Button COUI;
    @FXML private Button afficheProfil;
    @FXML private Button afficheChat;
    @FXML private Label prenomProfilEnCoursDeLecture;  
    @FXML private Label ageDuProfilEnCoursDeLecture;
    public int indexProfilEnCoursDeLecture=0;
    public Profil actuelle;
    /*
     * 
     * 
	 * Instantiation contrôles fenêtre pageConv
	 * 
	 * 
	 */
    @FXML private Button retourPagePrincipale;
    /*
     * 
     * 
	 * Instantiation contrôles fenêtre pageProfil
	 * 
	 * 
	 */
    @FXML private Button modifProfil;
    /*
     * 
     * 
	 * Instantiation contrôles fenêtre pageGestionProfil
	 * 
	 * 
	 */
    @FXML private Button finModif;
    
	public Modele modl;
	


	public Controleur() {
		// constructeur sans arguments
	}
	

	@Override
	public void handle(ActionEvent event) {
		System.out.println(event.getTarget());

	}




	/*
	 * 
	 * 
	 * Création méthodes fenêtre page d'acceuil
	 * 
	 * 
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
	 * 
	 * 
	 * Création méthodes fenêtre page de connexion
	 * 
	 * 
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
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/FXML/pagePrincipale.fxml"));
			rootLayout = loader.load();
			c=loader.getController();

			if(this.modl.memoiremixte.pUser.VotrePreference=="mixte") {
				c.actuelle=c.modl.memoiremixte.memoirePMixtes.get(this.indexProfilEnCoursDeLecture);
				Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
				c.imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);
				System.out.println(c.actuelle.lien_photoProfil);

				c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age));

				c.prenomProfilEnCoursDeLecture.setText(c.actuelle.prenom);

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



	/*
	 * 
	 * 
	 * Création méthodes fenêtre page d'inscription
	 * 
	 * 
	 */
	@FXML private void ValideInscription(ActionEvent event) {
		/*
		modl.memoiremixte.pUser.prenom=prenomProfil.getText();
		modl.memoiremixte.pUser.nom=nomProfil.getText();
		modl.memoiremixte.pUser.adresse_mail=adresseEmailProfil.getText();
		modl.memoiremixte.pUser.taille=Integer.valueOf(TailleProfil.getText());
		modl.memoiremixte.pUser.mdp=mdpProfil.getText();
		modl.memoiremixte.pUser.date_naissance=DaTeNaissanceProfil.toString();
		*/
		
		
		
		Parent rootLayout;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/FXML/pagePrincipale.fxml"));
			rootLayout = loader.load();
			c=loader.getController();

			System.out.println(this.modl);
			if(this.modl.memoiremixte.pUser.VotrePreference=="mixte") {
				c.actuelle=c.modl.memoiremixte.memoirePMixtes.get(this.indexProfilEnCoursDeLecture);
				Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
				c.imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);
				System.out.println(c.actuelle.lien_photoProfil);

				c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age));

				c.prenomProfilEnCoursDeLecture.setText(c.actuelle.prenom);

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
			c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			c.Stage.setTitle("Champolove");
			c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
			c.Stage.setScene(scene);
			c.Stage.show();


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
	 * 
	 * 
	 * Création méthodes fenêtre pagePrincipale
	 * 
	 * 
	 */
	
    @FXML private void afficheProfil(ActionEvent event) {
    	Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/pageProfil.fxml"));
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
    
    @FXML private void afficheChat(ActionEvent event) {
    	Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/pageConv.fxml"));
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
	 * 
	 * 
	 * Création méthodes fenêtre pagePrincipale
	 * 
	 * 
	 */
    @FXML private void retourPagePrincipale(ActionEvent event) {
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
	 * 
	 * 
	 * Création méthodes fenêtre pageProfil
	 * 
	 * 
	 */
    @FXML private void modifProfil(ActionEvent event) {
    	Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/pageGestionProfil.fxml"));
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
	 * 
	 * 
	 * Création méthodes fenêtre pageGestionProfil
	 * 
	 * 
	 */
    @FXML private void finModif(ActionEvent event) {
    	Parent rootLayout;
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("/FXML/pageProfil.fxml"));
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
	void profilSuivant(ActionEvent event) {
		Parent rootLayout;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pagePrincipale.fxml"));
		
		
		try {
			rootLayout = loader.load();

			c =loader.getController();
			
			System.out.println(c.indexProfilEnCoursDeLecture);
			c.indexProfilEnCoursDeLecture = indexProfilEnCoursDeLecture+1;
			System.out.println(c.indexProfilEnCoursDeLecture);
			

			System.out.println(c.actuelle);
			c.actuelle=c.modl.memoiremixte.memoirePMixtes.get(c.indexProfilEnCoursDeLecture);
			System.out.println(c.actuelle);

			Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
			System.out.println(c.imageDuProfilEnCoursDeLecture);
			c.imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);

			c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age));

			c.prenomProfilEnCoursDeLecture.setText(c.actuelle.prenom);

			Scene scene = new Scene(rootLayout);
			c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			c.Stage.setTitle("Champolove");
			c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
			c.Stage.setScene(scene);
			c.Stage.show();



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.modl=new Modele();
	}
	public void setVue(Vue Vue) { 
		this.Vue = Vue;
	}
}
