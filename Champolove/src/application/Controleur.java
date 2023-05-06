package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
	@FXML private TextArea descriptionProfil2;
	@FXML private TextArea descriptionPageProfil;
	@FXML private TextArea descriptionProfil;
	@FXML private Button ValideInscription;
	@FXML private ImageView imageView;
	@FXML private Button choisirImage;
	@FXML private CheckBox checkBoxRock;
	@FXML private CheckBox checkBoxHipHop;
	@FXML private CheckBox checkBoxRap;
	@FXML private CheckBox checkBoxPop;
	@FXML private CheckBox checkBoxJazz;
	@FXML private CheckBox checkBoxBlues;
	@FXML private CheckBox checkBoxSoul;
	@FXML private CheckBox checkBoxGospel;
	@FXML private CheckBox checkBoxCountry;
	@FXML private CheckBox checkBoxDisco;
	@FXML private CheckBox checkBoxTechno;
	@FXML private CheckBox checkBoxReggae;
	@FXML private CheckBox checkBoxSalsa;
	@FXML private CheckBox checkBoxFlamenco;
	@FXML private CheckBox checkBoxMetal;
	@FXML private CheckBox checkBoxFunk;
	@FXML private CheckBox checkBoxLoFi;
	@FXML private CheckBox checkBoxChien;
	@FXML private CheckBox checkBoxChat;
	@FXML private CheckBox checkBoxSerpent;
	@FXML private CheckBox checkBoxCheval;
	@FXML private CheckBox checkBoxPeroquet;
	@FXML private CheckBox checkBoxRat;
	@FXML private CheckBox checkBoxHamster;
	@FXML private CheckBox checkBoxCanari;
	@FXML private CheckBox checkBoxLapin;
	@FXML private CheckBox checkBoxPoule;
	@FXML private CheckBox checkBoxPoisson;
	@FXML private CheckBox checkBoxPatesalabolognaise;
	@FXML private CheckBox checkBoxPatesalacarbonara;
	@FXML private CheckBox checkBoxLasagnes;
	@FXML private CheckBox checkBoxCroquemonsieur;
	@FXML private CheckBox checkBoxGratindauphinois;
	@FXML private CheckBox checkBoxBurgerfrites;
	@FXML private CheckBox checkBoxMagretdecanard;
	@FXML private CheckBox checkBoxMoulesfrites;
	@FXML private CheckBox checkBoxCouscous;
	@FXML private CheckBox checkBoxBlanquettedeveau;
	@FXML private CheckBox checkBoxSteakfrites;
	@FXML private CheckBox checkBoxRaclette;
	@FXML private CheckBox checkBoxTomatesfarcies;
	@FXML private CheckBox checkBoxPizza;
	@FXML private CheckBox checkBoxOmelette;
	@FXML private CheckBox checkBoxScienceFiction;
	@FXML private CheckBox checkBoxComedie;
	@FXML private CheckBox checkBoxHorreur;
	@FXML private CheckBox checkBoxPolicier;
	@FXML private CheckBox checkBoxAventure;
	@FXML private CheckBox checkBoxHistoire;
	@FXML private CheckBox checkBoxDrame;
	@FXML private CheckBox checkBoxSuspense;
	@FXML private CheckBox checkBoxRomantique;
	@FXML private CheckBox checkBoxGuerre;
	@FXML private CheckBox checkBoxAction;
	@FXML private CheckBox checkBoxComedieDramatique;
	@FXML private CheckBox checkBoxFantastique;
	@FXML private CheckBox checkBoxWestern;
	@FXML private CheckBox checkBoxJeuVideo;
	@FXML private CheckBox checkBoxSport;
	@FXML private CheckBox checkBoxCuisine;
	@FXML private CheckBox checkBoxPeinture;
	@FXML private CheckBox checkBoxChant;
	@FXML private CheckBox checkBoxJardinage;
	@FXML private CheckBox checkBoxShopping;
	@FXML private CheckBox checkBoxDanse;
	@FXML private CheckBox checkBoxChasse;
	@FXML private CheckBox checkBoxPeche;
	@FXML private CheckBox checkBoxVelo;
	@FXML private CheckBox checkBoxMarche;
	@FXML private CheckBox checkBoxSportasensations;
	@FXML private CheckBox checkBoxSoireesentreamis;
	@FXML private CheckBox checkBoxSortiesculturelles;
	@FXML private CheckBox checkBoxFairedelamusique;
	@FXML private CheckBox checkBoxCueillettedechampignons;
	@FXML private CheckBox checkBoxLecture;

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
	@FXML private ImageView imageDuProfilMatcherEnCours;
	private int indexProfilMatchEnCoursDeLecture=0;
	@FXML private Label ageDuProfilMatchEnCoursDeLecture;
	@FXML private Label prenomProfilMatchEnCoursDeLecture;
	@FXML private Label RendezVous;
	@FXML private DatePicker DateDuRendezVous;
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

	@FXML
	private ListView<String> HobbiesPageProfil = new ListView<String>();

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

			c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age)+" ans");

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
		c.modl.memoiremixte.pUser.description=descriptionProfil.getText();



		if(checkBoxRock.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Rock");
		}
		if(checkBoxRap.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Rap");
		}
		if(checkBoxPop.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Pop");
		}
		if(checkBoxHipHop.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Hip-Hop");
		}
		if(checkBoxJazz.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Jazz");
		}
		if(checkBoxBlues.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Blues");
		}
		if(checkBoxSoul.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Soul");
		}
		if(checkBoxGospel.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Gospel");
		}
		if(checkBoxCountry.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Country");
		}
		if(checkBoxDisco.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Disco");
		}
		if(checkBoxTechno.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Techno");
		}
		if(checkBoxReggae.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Reggae");
		}
		if(checkBoxSalsa.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Salsa");
		}
		if(checkBoxFlamenco.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Flamenco");
		}
		if(checkBoxMetal.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Metal");
		}
		if(checkBoxFunk.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Funk");
		}
		if(checkBoxLoFi.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Lo-Fi");
		}
		if(checkBoxChien.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Chien");
		}
		if(checkBoxChat.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Chat");
		}
		if(checkBoxSerpent.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Serpent");
		}
		if(checkBoxCheval.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Cheval");
		}
		if(checkBoxPeroquet.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Peroquet");
		}
		if(checkBoxRat.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Rat");
		}
		if(checkBoxHamster.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Hamster");
		}
		if(checkBoxLapin.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Lapin");
		}
		if(checkBoxPoule.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Poule");
		}
		if(checkBoxCanari.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Canari");
		}
		if(checkBoxPoisson.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Poisson");
		}
		if(checkBoxPatesalabolognaise.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Pâtes à la bolognaise");
		}
		if(checkBoxPatesalacarbonara.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Pâtes à la carbonara");
		}
		if(checkBoxLasagnes.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Lasagnes");
		}
		if(checkBoxCroquemonsieur.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Croque-monsieur");
		}
		if(checkBoxGratindauphinois.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Gratin dauphinois");
		}
		if(checkBoxBurgerfrites.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Burger-frites");
		}
		if(checkBoxMagretdecanard.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Magret de canard");
		}
		if(checkBoxMoulesfrites.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Moules-frites");
		}
		if(checkBoxCouscous.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Couscous");
		}
		if(checkBoxBlanquettedeveau.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Blanquette de veau");
		}
		if(checkBoxSteakfrites.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Steak-frites");
		}
		if(checkBoxRaclette.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Raclette");
		}
		if(checkBoxTomatesfarcies.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Tomates farcies");
		}
		if(checkBoxPizza.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Pizza");
		}
		if(checkBoxOmelette.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Omelette");
		}
		if(checkBoxScienceFiction.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Science-Fiction");
		}
		if(checkBoxComedie.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Comédie");
		}

		if(checkBoxHorreur.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Horreur");
		}
		if(checkBoxSuspense.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Suspense");
		}
		if(checkBoxPolicier.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Policier");
		}
		if(checkBoxAventure.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Aventure");
		}
		if(checkBoxRomantique.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Romantique");
		}

		if(checkBoxGuerre.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Guerre");
		}
		if(checkBoxHistoire.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Histoire");
		}
		if(checkBoxAction.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Action");
		}
		if(checkBoxDrame.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Drame");
		}
		if(checkBoxComedieDramatique.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Comédie Dramatique");
		}

		if(checkBoxFantastique.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Fantastique");
		}
		if(checkBoxWestern.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Western");
		}



		if(checkBoxSport.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Sport");
		}
		if(checkBoxJeuVideo.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Jeu Vidéo");
		}
		if(checkBoxCuisine.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Cuisine");
		}
		if(checkBoxSportasensations.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Sport à sensations");
		}
		if(checkBoxSoireesentreamis.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Soirées entre amis");
		}
		if(checkBoxSortiesculturelles.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Sorties culturelles");
		}
		if(checkBoxFairedelamusique.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Faire de la musique");
		}
		if(checkBoxPeinture.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Peinture");
		}
		if(checkBoxChant.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Chant");
		}
		if(checkBoxJardinage.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Jardinage");
		}
		if(checkBoxMarche.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Marche");
		}
		if(checkBoxShopping.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Shopping");
		}
		if(checkBoxDanse.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Danse");
		}
		if(checkBoxPeche.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Pêche");
		}
		if(checkBoxVelo.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Vélo");
		}
		if(checkBoxChasse.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Chasse");
		}
		if(checkBoxCueillettedechampignons.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Cueillettedechampignons");
		}
		if(checkBoxLecture.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Lecture");
		}


		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=c.modl.memoiremixte.selectionDesProfilsOptimiserPourLePuser();


		c.actuelle=c.modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture);
		Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
		c.imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);
		System.out.println(c.actuelle.lien_photoProfil);

		c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age)+" ans");

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
	void profilSuivantCNON(ActionEvent event) {

		if(indexProfilEnCoursDeLecture<modl.memoiremixte.pUser.listeDesProfilsOptimale.size()-1) {
			indexProfilEnCoursDeLecture = indexProfilEnCoursDeLecture+1;

			actuelle=modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture);

			Image imageProfilSelectionEnCours=new Image(actuelle.lien_photoProfil);
			imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);

			ageDuProfilEnCoursDeLecture.setText(String.valueOf(actuelle.age)+" ans");
			prenomProfilEnCoursDeLecture.setText(actuelle.prenom);
		}
		else {

		}

	}


	@FXML
	void profilSuivantCOUI(ActionEvent event) {

		if(indexProfilEnCoursDeLecture<modl.memoiremixte.pUser.listeDesProfilsOptimale.size()-1) {
			indexProfilEnCoursDeLecture = indexProfilEnCoursDeLecture+1;

			modl.memoiremixte.pUser.memoireMatcher.add(actuelle);
			actuelle=modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture);


			Image imageProfilSelectionEnCours=new Image(actuelle.lien_photoProfil);
			imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);

			ageDuProfilEnCoursDeLecture.setText(String.valueOf(actuelle.age)+" ans");
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
		c.modl.memoiremixte.pUser.description=modl.memoiremixte.pUser.description;
		c.modl.memoiremixte.pUser.memoireMatcher=modl.memoiremixte.pUser.memoireMatcher;
		c.indexProfilMatchEnCoursDeLecture=indexProfilMatchEnCoursDeLecture;
		c.modl.memoiremixte.pUser.dictionnaireDesRendezVous=modl.memoiremixte.pUser.dictionnaireDesRendezVous;
		//////////////////////////////////////////////////////////////////////////////////////////////////


		c.nomPageProfil.setText(modl.memoiremixte.pUser.nom);
		c.prenomPageProfil.setText(modl.memoiremixte.pUser.prenom);
		c.adresseEmailPageProfil.setText(modl.memoiremixte.pUser.adresse_mail);
		c.mdpPageProfil.setText(modl.memoiremixte.pUser.mdp);
		c.agePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.age)+" ans");
		c.taillePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.taille));
		c.descriptionPageProfil.setText(modl.memoiremixte.pUser.description);


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
		c.modl.memoiremixte.pUser.description=modl.memoiremixte.pUser.description;
		c.modl.memoiremixte.pUser.memoireMatcher=modl.memoiremixte.pUser.memoireMatcher;
		c.indexProfilMatchEnCoursDeLecture=indexProfilMatchEnCoursDeLecture;
		c.modl.memoiremixte.pUser.dictionnaireDesRendezVous=modl.memoiremixte.pUser.dictionnaireDesRendezVous;
		//////////////////////////////////////////////////////////////////////////////////////////////////


		c.nomPageProfil.setText(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).nom);
		c.prenomPageProfil.setText(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).prenom);
		c.dateNaissancePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).date_naissance));
		c.agePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).age));
		c.taillePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).taille));
		c.genrePageProfil.setText(modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).sexe);

		for (int i=0; i<modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).Gouts.size(); i++) {

		}
	    ObservableList<String> observableList = FXCollections.observableArrayList(c.modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).Hobbies);
	    c.HobbiesPageProfil.setItems(observableList);
	    c.HobbiesPageProfil.getItems();
	    for (int j=0; j<c.modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture).Hobbies.size(); j++) {
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
		c.modl.memoiremixte.pUser.description=modl.memoiremixte.pUser.description;
		c.modl.memoiremixte.pUser.memoireMatcher=modl.memoiremixte.pUser.memoireMatcher;
		c.indexProfilMatchEnCoursDeLecture=indexProfilMatchEnCoursDeLecture;
		c.modl.memoiremixte.pUser.dictionnaireDesRendezVous=modl.memoiremixte.pUser.dictionnaireDesRendezVous;
		//////////////////////////////////////////////////////////////////////////////////////////////////


		c.actuelle=modl.memoiremixte.pUser.listeDesProfilsOptimale.get(indexProfilEnCoursDeLecture);
		Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
		c.imageDuProfilEnCoursDeLecture.setImage(imageProfilSelectionEnCours);
		System.out.println(c.actuelle.lien_photoProfil);

		c.ageDuProfilEnCoursDeLecture.setText(String.valueOf(c.actuelle.age)+" ans");

		c.prenomProfilEnCoursDeLecture.setText(c.actuelle.prenom);


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
		c.modl.memoiremixte.pUser.description=modl.memoiremixte.pUser.description;
		c.modl.memoiremixte.pUser.memoireMatcher=modl.memoiremixte.pUser.memoireMatcher;
		c.indexProfilMatchEnCoursDeLecture=indexProfilMatchEnCoursDeLecture;
		c.modl.memoiremixte.pUser.dictionnaireDesRendezVous=modl.memoiremixte.pUser.dictionnaireDesRendezVous;
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




		if(checkBoxRock.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Rock");
		}
		if(checkBoxRap.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Rap");
		}
		if(checkBoxPop.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Pop");
		}
		if(checkBoxHipHop.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Hip-Hop");
		}
		if(checkBoxJazz.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Jazz");
		}
		if(checkBoxBlues.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Blues");
		}
		if(checkBoxSoul.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Soul");
		}
		if(checkBoxGospel.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Gospel");
		}
		if(checkBoxCountry.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Country");
		}
		if(checkBoxDisco.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Disco");
		}
		if(checkBoxTechno.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Techno");
		}
		if(checkBoxReggae.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Reggae");
		}
		if(checkBoxSalsa.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Salsa");
		}
		if(checkBoxFlamenco.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Flamenco");
		}
		if(checkBoxMetal.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Metal");
		}
		if(checkBoxFunk.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Funk");
		}
		if(checkBoxLoFi.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Lo-Fi");
		}
		if(checkBoxChien.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Chien");
		}
		if(checkBoxChat.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Chat");
		}
		if(checkBoxSerpent.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Serpent");
		}
		if(checkBoxCheval.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Cheval");
		}
		if(checkBoxPeroquet.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Peroquet");
		}
		if(checkBoxRat.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Rat");
		}
		if(checkBoxHamster.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Hamster");
		}
		if(checkBoxLapin.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Lapin");
		}
		if(checkBoxPoule.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Poule");
		}
		if(checkBoxCanari.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Canari");
		}
		if(checkBoxPoisson.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Poisson");
		}
		if(checkBoxPatesalabolognaise.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Pâtes à la bolognaise");
		}
		if(checkBoxPatesalacarbonara.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Pâtes à la carbonara");
		}
		if(checkBoxLasagnes.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Lasagnes");
		}
		if(checkBoxCroquemonsieur.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Croque-monsieur");
		}
		if(checkBoxGratindauphinois.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Gratin dauphinois");
		}
		if(checkBoxBurgerfrites.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Burger-frites");
		}
		if(checkBoxMagretdecanard.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Magret de canard");
		}
		if(checkBoxMoulesfrites.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Moules-frites");
		}
		if(checkBoxCouscous.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Couscous");
		}
		if(checkBoxBlanquettedeveau.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Blanquette de veau");
		}
		if(checkBoxSteakfrites.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Steak-frites");
		}
		if(checkBoxRaclette.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Raclette");
		}
		if(checkBoxTomatesfarcies.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Tomates farcies");
		}
		if(checkBoxPizza.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Pizza");
		}
		if(checkBoxOmelette.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Omelette");
		}
		if(checkBoxScienceFiction.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Science-Fiction");
		}
		if(checkBoxComedie.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Comédie");
		}

		if(checkBoxHorreur.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Horreur");
		}
		if(checkBoxSuspense.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Suspense");
		}
		if(checkBoxPolicier.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Policier");
		}
		if(checkBoxAventure.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Aventure");
		}
		if(checkBoxRomantique.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Romantique");
		}

		if(checkBoxGuerre.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Guerre");
		}
		if(checkBoxHistoire.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Histoire");
		}
		if(checkBoxAction.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Action");
		}
		if(checkBoxDrame.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Drame");
		}
		if(checkBoxComedieDramatique.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Comédie Dramatique");
		}

		if(checkBoxFantastique.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Fantastique");
		}
		if(checkBoxWestern.isSelected()) {
			c.modl.memoiremixte.pUser.Gouts.add("Western");
		}



		if(checkBoxSport.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Sport");
		}
		if(checkBoxJeuVideo.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Jeu Vidéo");
		}
		if(checkBoxCuisine.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Cuisine");
		}
		if(checkBoxSportasensations.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Sport à sensations");
		}
		if(checkBoxSoireesentreamis.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Soirées entre amis");
		}
		if(checkBoxSortiesculturelles.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Sorties culturelles");
		}
		if(checkBoxFairedelamusique.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Faire de la musique");
		}
		if(checkBoxPeinture.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Peinture");
		}
		if(checkBoxChant.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Chant");
		}
		if(checkBoxJardinage.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Jardinage");
		}
		if(checkBoxMarche.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Marche");
		}
		if(checkBoxShopping.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Shopping");
		}
		if(checkBoxDanse.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Danse");
		}
		if(checkBoxPeche.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Pêche");
		}
		if(checkBoxVelo.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Vélo");
		}
		if(checkBoxChasse.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Chasse");
		}
		if(checkBoxCueillettedechampignons.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Cueillettedechampignons");
		}
		if(checkBoxLecture.isSelected()) {
			c.modl.memoiremixte.pUser.Hobbies.add("Lecture");
		}


		c.modl.memoiremixte.pUser.listeDesProfilsOptimale=c.modl.memoiremixte.selectionDesProfilsOptimiserPourLePuser();


		c.modl.memoiremixte.pUser.prenom=prenomProfil2.getText();
		c.modl.memoiremixte.pUser.nom=nomProfil2.getText();
		c.modl.memoiremixte.pUser.adresse_mail=adresseEmailProfil2.getText();
		c.modl.memoiremixte.pUser.taille=Integer.valueOf(TailleProfil2.getText());
		c.modl.memoiremixte.pUser.mdp=mdpProfil2.getText();
		c.modl.memoiremixte.pUser.date_naissance=DaTeNaissanceProfil2.toString();
		c.indexProfilEnCoursDeLecture=0;
		c.modl.memoiremixte.pUser.description=descriptionProfil2.getText();
		c.modl.memoiremixte.pUser.memoireMatcher=new ArrayList<Profil>();



		c.nomPageProfil.setText(c.modl.memoiremixte.pUser.nom);
		c.prenomPageProfil.setText(c.modl.memoiremixte.pUser.prenom);
		c.adresseEmailPageProfil.setText(c.modl.memoiremixte.pUser.adresse_mail);
		c.mdpPageProfil.setText(c.modl.memoiremixte.pUser.mdp);
		c.agePageProfil.setText(String.valueOf(c.modl.memoiremixte.pUser.age)+" ans");
		c.taillePageProfil.setText(String.valueOf(c.modl.memoiremixte.pUser.taille));
		c.descriptionPageProfil.setText(c.modl.memoiremixte.pUser.description);


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
	 * méthode de la page de conversation
	 * 
	 * 
	 * 
	 */

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
		c.modl.memoiremixte.pUser.description=modl.memoiremixte.pUser.description;
		c.modl.memoiremixte.pUser.memoireMatcher=modl.memoiremixte.pUser.memoireMatcher;
		c.indexProfilMatchEnCoursDeLecture=indexProfilMatchEnCoursDeLecture;
		c.modl.memoiremixte.pUser.dictionnaireDesRendezVous=modl.memoiremixte.pUser.dictionnaireDesRendezVous;
		//////////////////////////////////////////////////////////////////////////////////////////////////


		c.actuelle=modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture);

		Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
		c.imageDuProfilMatcherEnCours.setImage(imageProfilSelectionEnCours);

		c.ageDuProfilMatchEnCoursDeLecture.setText(String.valueOf(c.actuelle.age)+" ans");
		c.prenomProfilMatchEnCoursDeLecture.setText(c.actuelle.prenom);


		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();
	}
	
	@FXML private void enregistrezLeRendezVous(ActionEvent event) {


		modl.memoiremixte.pUser.dictionnaireDesRendezVous.put(indexProfilMatchEnCoursDeLecture, (String)("Rendez vous pris le "+String.valueOf(DateDuRendezVous.getValue())));
	}

	@FXML private void afficheDescriptionMatcher(ActionEvent event) throws IOException{
		Parent rootLayout;	
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/FXML/pageChat.fxml"));
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
		c.modl.memoiremixte.pUser.description=modl.memoiremixte.pUser.description;
		c.modl.memoiremixte.pUser.memoireMatcher=modl.memoiremixte.pUser.memoireMatcher;
		c.indexProfilMatchEnCoursDeLecture=indexProfilMatchEnCoursDeLecture;
		c.modl.memoiremixte.pUser.dictionnaireDesRendezVous=modl.memoiremixte.pUser.dictionnaireDesRendezVous;
		//////////////////////////////////////////////////////////////////////////////////////////////////


		c.nomPageProfil.setText(modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture).nom);
		c.prenomPageProfil.setText(modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture).prenom);
		c.dateNaissancePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture).date_naissance));
		c.agePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture).age));
		c.taillePageProfil.setText(String.valueOf(modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture).taille));
		c.genrePageProfil.setText(modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture).sexe);
		
		if(modl.memoiremixte.pUser.dictionnaireDesRendezVous.containsKey(indexProfilMatchEnCoursDeLecture)) {
			c.RendezVous.setText(modl.memoiremixte.pUser.dictionnaireDesRendezVous.get(indexProfilMatchEnCoursDeLecture));
		}
		

		for (int i=0; i<modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture).Gouts.size(); i++) {

		}

		for (int toto=0; toto<modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture).Hobbies.size(); toto++) {

		}

		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
		c.Stage.setScene(scene);
		c.Stage.show();
	}

	

	@FXML private void profilSuivantMatcherArrier(ActionEvent event) {

		if(indexProfilMatchEnCoursDeLecture>0) {
			indexProfilMatchEnCoursDeLecture = indexProfilMatchEnCoursDeLecture-1;

			actuelle=modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture);

			Image imageProfilSelectionEnCours=new Image(actuelle.lien_photoProfil);
			imageDuProfilMatcherEnCours.setImage(imageProfilSelectionEnCours);

			ageDuProfilMatchEnCoursDeLecture.setText(String.valueOf(actuelle.age)+" ans");
			prenomProfilMatchEnCoursDeLecture.setText(actuelle.prenom);
		}
		else {

		}
	}

	@FXML private void profilSuivantMatcherAvant() {
		if(indexProfilMatchEnCoursDeLecture<modl.memoiremixte.pUser.memoireMatcher.size()-1) {
			indexProfilMatchEnCoursDeLecture = indexProfilMatchEnCoursDeLecture+1;

			actuelle=modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture);

			Image imageProfilSelectionEnCours=new Image(actuelle.lien_photoProfil);
			imageDuProfilMatcherEnCours.setImage(imageProfilSelectionEnCours);

			ageDuProfilMatchEnCoursDeLecture.setText(String.valueOf(actuelle.age)+" ans");
			prenomProfilMatchEnCoursDeLecture.setText(actuelle.prenom);
		}
		else {

		}
	}


	@FXML private void retourPageConv(ActionEvent event) throws IOException{

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
		c.modl.memoiremixte.pUser.description=modl.memoiremixte.pUser.description;
		c.modl.memoiremixte.pUser.memoireMatcher=modl.memoiremixte.pUser.memoireMatcher;
		c.indexProfilMatchEnCoursDeLecture=indexProfilMatchEnCoursDeLecture;
		c.modl.memoiremixte.pUser.dictionnaireDesRendezVous=modl.memoiremixte.pUser.dictionnaireDesRendezVous;
		//////////////////////////////////////////////////////////////////////////////////////////////////


		c.actuelle=modl.memoiremixte.pUser.memoireMatcher.get(indexProfilMatchEnCoursDeLecture);

		Image imageProfilSelectionEnCours=new Image(c.actuelle.lien_photoProfil);
		c.imageDuProfilMatcherEnCours.setImage(imageProfilSelectionEnCours);

		c.ageDuProfilMatchEnCoursDeLecture.setText(String.valueOf(c.actuelle.age)+" ans");
		c.prenomProfilMatchEnCoursDeLecture.setText(c.actuelle.prenom);


		Scene scene = new Scene(rootLayout);
		c.Stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		c.Stage.setTitle("Champolove");
		c.Stage.getIcons().add(new Image("file:src/ressources/logo/logo.png"));
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
