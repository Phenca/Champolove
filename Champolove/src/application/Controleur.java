package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.ListView;
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
	@FXML private PasswordField mdpConnexion;
	@FXML private TextField adresseEmailConnexion;
	@FXML private Text messageLogIn;
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
	 * 
	 * 
	 * Instantiation contrôles fenêtre profilPrincipale
	 * 
	 * 
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
	@FXML private Button afficheDescription;
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

	@FXML
	private Text taillePageProfil;

	@FXML
	private Text nomPageProfil;

	@FXML
	private Text dateNaissancePageProfil;

	@FXML
	private Text prenomPageProfil;

	@FXML
	private Text agePageProfil;

	@FXML
	private Text genrePageProfil;

	@FXML
	private Text mdpPageProfil;

	@FXML
	private Text adresseEmailPageProfil;
	
	//@FXML
	//private ListView<String> HobbiesPageProfil;
	/*
	 * 
	 * 
	 * Instantiation contrôles fenêtre pageGestionProfil
	 * 
	 * 
	 */
	@FXML private Button finModif;
	@FXML private DatePicker DaTeNaissanceProfil2;
	@FXML private TextField adresseEmailProfil2;
	@FXML private PasswordField mdpProfil2;
	@FXML private TextField nomProfil2;
	@FXML private TextField TailleProfil2;	
	@FXML private ChoiceBox<?> SexeProfil2;
	@FXML private TextField prenomProfil2;   




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
			this.Stage.getIcons().add(new Image("file:src/ressources/logo/logo.png"));
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
			this.Stage.getIcons().add(new Image("file:src/ressources/logo/logo.png"));
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
			this.Stage.getIcons().add(new Image("file:src/ressources/logo/logo.png"));
			this.Stage.setScene(scene);
			this.Stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML private void ValideConnexion(ActionEvent event) throws IOException{

		Parent rootLayout;

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pagePrincipale.fxml"));
		rootLayout = loader.load();
		Controleur c=loader.getController();

		System.out.println(adresseEmailConnexion.getText());
		System.out.println(mdpConnexion.getText());
		if(adresseEmailConnexion.getText().equals("root") && mdpConnexion.getText().equals("root")) {
			System.out.println("life");
			c.modl.memoiremixte.pUser.prenom="Admin";
			c.modl.memoiremixte.pUser.nom="Admin";
			c.modl.memoiremixte.pUser.adresse_mail="root";
			c.modl.memoiremixte.pUser.taille=2727;
			c.modl.memoiremixte.pUser.mdp="root";
			c.modl.memoiremixte.pUser.date_naissance="";

			c.modl.memoiremixte.pUser.listeDesProfilsOptimale=modl.memoiremixte.memoirePMixtes;

			c.actuelle=c.modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture);
			Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
			c.imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);
			System.out.println(c.actuelle.lien_photoProfil);

			c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age));

			c.prenomProfilEnCoursDeLecture.setText(c.actuelle.prenom);



			Scene scene = new Scene(rootLayout);
			c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			c.Stage.setTitle("Champolove");
			c.Stage.getIcons().add(new Image("file:src/ressources/logo/logo.png"));
			c.Stage.setScene(scene);
			c.Stage.show();

		}else {
			messageLogIn.setText("Mots de passe ou adresse mail incorrect, veuillez ressayez");
		}




	}
	/*
	 * 
	 * 
	 * Création méthodes fenêtre page d'inscription
	 * 
	 * 
	 */
	@FXML private void ValideInscription(ActionEvent event) throws IOException{

		Parent rootLayout;

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pagePrincipale.fxml"));
		rootLayout = loader.load();
		Controleur c=loader.getController();

		c.modl.memoiremixte.pUser.prenom=prenomProfil.getText();
		c.modl.memoiremixte.pUser.nom=nomProfil.getText();
		c.modl.memoiremixte.pUser.adresse_mail=adresseEmailProfil.getText();
		c.modl.memoiremixte.pUser.taille=Integer.valueOf(TailleProfil.getText());
		c.modl.memoiremixte.pUser.mdp=mdpProfil.getText();
		c.modl.memoiremixte.pUser.date_naissance=DaTeNaissanceProfil.toString();

		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=modl.memoiremixte.memoirePMixtes;

		c.actuelle=c.modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture);
		Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
		c.imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);
		System.out.println(c.actuelle.lien_photoProfil);

		c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age));

		c.prenomProfilEnCoursDeLecture.setText(c.actuelle.prenom);


		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:src/ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();

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

	@FXML
	void profilSuivant(ActionEvent event) {

		if(indexProfilEnCoursDeLecture<modl.memoiremixte.pUser.listeDesProfilsOptimale.size()-1) {
			indexProfilEnCoursDeLecture = indexProfilEnCoursDeLecture+1;
			actuelle=modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture);
			Image imageProfilSelectionEnCours=new Image(actuelle.lien_photoProfil);
			imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);

			ageDuProfilEnCoursDeLecture.setText(String.valueOf(actuelle.age));

			prenomProfilEnCoursDeLecture.setText(actuelle.prenom);
		}
		else {

		}

	}



	@FXML private void afficheProfil(ActionEvent event) throws IOException{
		Parent rootLayout;

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pageProfil.fxml"));
		rootLayout = loader.load();
		Controleur c=loader.getController();


		//Cette Partie sert à sauvergarder les données utiles qui changent constament, c'est à garder//////
		c.modl.memoiremixte.pUser.prenom=modl.memoiremixte.pUser.prenom;
		c.modl.memoiremixte.pUser.nom=modl.memoiremixte.pUser.nom;
		c.modl.memoiremixte.pUser.adresse_mail=modl.memoiremixte.pUser.adresse_mail;
		c.modl.memoiremixte.pUser.taille=modl.memoiremixte.pUser.taille;
		c.modl.memoiremixte.pUser.mdp=modl.memoiremixte.pUser.mdp;
		c.modl.memoiremixte.pUser.date_naissance=modl.memoiremixte.pUser.date_naissance;
		c.indexProfilEnCoursDeLecture=indexProfilEnCoursDeLecture;
		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=modl.memoiremixte.pUser.listeDesProfilsOptimale;
		//////////////////////////////////////////////////////////////////////////////////////////////////


		c.nomPageProfil.setText(modl.memoiremixte.pUser.nom);
		c.prenomPageProfil.setText(modl.memoiremixte.pUser.prenom);
		c.adresseEmailPageProfil.setText(modl.memoiremixte.pUser.adresse_mail);
		c.mdpPageProfil.setText(modl.memoiremixte.pUser.mdp);
		c.agePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.age));
		c.taillePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.taille));

		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();

	}

	@FXML private void afficheChat(ActionEvent event) throws IOException{
		Parent rootLayout;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pageConv.fxml"));
		rootLayout = loader.load();
		Controleur c=loader.getController();

		//Cette Partie sert à sauvergarder les données utiles qui changent constament, c'est à garder//////
		c.modl.memoiremixte.pUser.prenom=modl.memoiremixte.pUser.prenom;
		c.modl.memoiremixte.pUser.nom=modl.memoiremixte.pUser.nom;
		c.modl.memoiremixte.pUser.adresse_mail=modl.memoiremixte.pUser.adresse_mail;
		c.modl.memoiremixte.pUser.taille=modl.memoiremixte.pUser.taille;
		c.modl.memoiremixte.pUser.mdp=modl.memoiremixte.pUser.mdp;
		c.modl.memoiremixte.pUser.date_naissance=modl.memoiremixte.pUser.date_naissance;
		c.indexProfilEnCoursDeLecture=indexProfilEnCoursDeLecture;
		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=modl.memoiremixte.pUser.listeDesProfilsOptimale;
		//////////////////////////////////////////////////////////////////////////////////////////////////

		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();
	}
	@FXML private void afficheDescription(ActionEvent event) throws IOException{
		Parent rootLayout;	
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pageDescription.fxml"));
		rootLayout = loader.load();
		Controleur c=loader.getController();

		//Cette Partie sert à sauvergarder les données utiles qui changent constament, c'est à garder//////
		c.modl.memoiremixte.pUser.prenom=modl.memoiremixte.pUser.prenom;
		c.modl.memoiremixte.pUser.nom=modl.memoiremixte.pUser.nom;
		c.modl.memoiremixte.pUser.adresse_mail=modl.memoiremixte.pUser.adresse_mail;
		c.modl.memoiremixte.pUser.taille=modl.memoiremixte.pUser.taille;
		c.modl.memoiremixte.pUser.mdp=modl.memoiremixte.pUser.mdp;
		c.modl.memoiremixte.pUser.date_naissance=modl.memoiremixte.pUser.date_naissance;
		c.indexProfilEnCoursDeLecture=indexProfilEnCoursDeLecture;
		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=modl.memoiremixte.pUser.listeDesProfilsOptimale;
		//////////////////////////////////////////////////////////////////////////////////////////////////
		

		c.nomPageProfil.setText(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).nom);
		c.prenomPageProfil.setText(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).prenom);
		c.dateNaissancePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).date_naissance));
		c.agePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).age));
		c.taillePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).taille));
		c.genrePageProfil.setText(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).sexe);
		//ObservableList<String> items =FXCollections.observableArrayList (modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).Hobbies);
		//HobbiesPageProfil.setItems(items);
		for (int i=0; i<modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).Gouts.size(); i++) {
			
		}
		

		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();

	}
	/*
	 * 
	 * 
	 * Création méthodes fenêtre pagePrincipale
	 * 
	 * 
	 */

	@FXML private void retourPagePrincipale(ActionEvent event) throws IOException{


		Parent rootLayout;

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pagePrincipale.fxml"));
		rootLayout = loader.load();
		Controleur c=loader.getController();


		//Cette Partie sert à sauvergarder les données utiles qui changent constament, c'est à garder//////
		c.modl.memoiremixte.pUser.prenom=modl.memoiremixte.pUser.prenom;
		c.modl.memoiremixte.pUser.nom=modl.memoiremixte.pUser.nom;
		c.modl.memoiremixte.pUser.adresse_mail=modl.memoiremixte.pUser.adresse_mail;
		c.modl.memoiremixte.pUser.taille=modl.memoiremixte.pUser.taille;
		c.modl.memoiremixte.pUser.mdp=modl.memoiremixte.pUser.mdp;
		c.modl.memoiremixte.pUser.date_naissance=modl.memoiremixte.pUser.date_naissance;
		c.indexProfilEnCoursDeLecture=indexProfilEnCoursDeLecture;
		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=modl.memoiremixte.pUser.listeDesProfilsOptimale;
		//////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println(this.modl);
		if(this.modl.memoiremixte.pUser.VotrePreference=="mixte") {
			c.actuelle=modl.memoiremixte.memoirePMixtes.get(indexProfilEnCoursDeLecture);
			Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
			c.imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);
			System.out.println(c.actuelle.lien_photoProfil);

			c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age));

			c.prenomProfilEnCoursDeLecture.setText(c.actuelle.prenom);

		}
		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:src/ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();
	}
	/*
	 * 
	 * 
	 * Création méthodes fenêtre pageProfil
	 * 
	 * 
	 */
	@FXML private void modifProfil(ActionEvent event) throws IOException{
		Parent rootLayout;


		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pageGestionProfil.fxml"));
		rootLayout = loader.load();
		Controleur c=loader.getController();

		//Cette Partie sert à sauvergarder les données utiles qui changent constament, c'est à garder//////
		c.modl.memoiremixte.pUser.prenom=modl.memoiremixte.pUser.prenom;
		c.modl.memoiremixte.pUser.nom=modl.memoiremixte.pUser.nom;
		c.modl.memoiremixte.pUser.adresse_mail=modl.memoiremixte.pUser.adresse_mail;
		c.modl.memoiremixte.pUser.taille=modl.memoiremixte.pUser.taille;
		c.modl.memoiremixte.pUser.mdp=modl.memoiremixte.pUser.mdp;
		c.modl.memoiremixte.pUser.date_naissance=modl.memoiremixte.pUser.date_naissance;
		c.indexProfilEnCoursDeLecture=indexProfilEnCoursDeLecture;
		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=modl.memoiremixte.pUser.listeDesProfilsOptimale;
		//////////////////////////////////////////////////////////////////////////////////////////////////



		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();

	}
	/*
	 * 
	 * 
	 * Création méthodes fenêtre pageGestionProfil
	 * 
	 * 
	 */

	@FXML private void finModif(ActionEvent event) throws IOException{

		Parent rootLayout;

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pageProfil.fxml"));
		rootLayout = loader.load();
		Controleur c=loader.getController();


		c.modl.memoiremixte.pUser.prenom=prenomProfil2.getText();
		c.modl.memoiremixte.pUser.nom=nomProfil2.getText();
		c.modl.memoiremixte.pUser.adresse_mail=adresseEmailProfil2.getText();
		c.modl.memoiremixte.pUser.taille=Integer.valueOf(TailleProfil2.getText());
		c.modl.memoiremixte.pUser.mdp=mdpProfil2.getText();
		c.modl.memoiremixte.pUser.date_naissance=DaTeNaissanceProfil2.toString();
		c.indexProfilEnCoursDeLecture=indexProfilEnCoursDeLecture;
		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=modl.memoiremixte.pUser.listeDesProfilsOptimale;


		c.nomPageProfil.setText(c.modl.memoiremixte.pUser.nom);
		c.prenomPageProfil.setText(c.modl.memoiremixte.pUser.prenom);
		c.adresseEmailPageProfil.setText(c.modl.memoiremixte.pUser.adresse_mail);
		c.mdpPageProfil.setText(c.modl.memoiremixte.pUser.mdp);
		c.agePageProfil.setText(String.valueOf(c.modl.memoiremixte.pUser.age));
		c.taillePageProfil.setText(String.valueOf(c.modl.memoiremixte.pUser.taille));


		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();

	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.modl=new Modele();
	}
	public void setVue(Vue Vue) { 
		this.Vue = Vue;
	}
}
