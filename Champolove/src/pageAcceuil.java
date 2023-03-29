import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class pageAcceuil extends Application {
	public void start(Stage Stage) throws Exception {
		//Creation de la fenêtre graphique
		GridPane fenetre = new GridPane();
		
		//Centrage du conteneur sur l'écran
		fenetre.setAlignment(Pos.TOP_CENTER);
		
		//Label nom application
		Label title = new Label("Champolove");
		fenetre.add(title, 0, 0);
		GridPane.setMargin(title, new Insets(20, 10, 20, 25));
		
		//Label catch Line
		Label catchLine = new Label("Insérer une catchLine ici");
		fenetre.add(catchLine, 0, 2);
		GridPane.setMargin(catchLine, new Insets(0, 0, 40, 0));
		
		//Label connexion
		Label lblLog = new Label("Déjà inscrit ?");
		lblLog.relocate(110, 150);
		fenetre.add(lblLog, 0, 3);
		
		//Bouton connexion (mène vers une autre page pour la connexion)
		Button loginBtn = new Button("Login");
				
		fenetre.add(loginBtn, 0, 4);
		loginBtn.setPrefSize(100, 20);
		GridPane.setMargin(loginBtn, new Insets(10, 0, 10, 0));
		
		//Label inscription
		Label lblSign = new Label("Pas encore inscrit ?");
		fenetre.add(lblSign, 0, 5);
		
		//Bouton connexion (mène vers une autre page pour l'inscription)
		Button signinBtn = new Button("Sign in");	
		GridPane.setMargin(signinBtn, new Insets(10, 0, 10, 0));
		fenetre.add(signinBtn, 0, 6);
		signinBtn.setPrefSize(100, 10);
		
		fenetre.setPadding(new Insets(40, 40, 40, 40));
		fenetre.setPrefSize(300, 400);
		
		Scene scene = new Scene(fenetre);
		Stage.setScene(scene);
		Stage.setTitle("Champolove");
		Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
		Stage.show();	
	}

	public static void main(String[] args) {
		launch(args);
	}

}
