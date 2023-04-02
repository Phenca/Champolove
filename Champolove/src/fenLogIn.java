import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class fenLogIn extends Application {
	@Override
	public void start(Stage Stage) throws Exception {
		//Creation de la fenêtre graphique
		GridPane fenetre = new GridPane();
		
		//Centrage du conteneur sur l'écran
		fenetre.setAlignment(Pos.TOP_CENTER);
		
		//Label nom application
		Label title = new Label("Connexion à Champolove");
		fenetre.add(title, 0, 0);
		GridPane.setMargin(title, new Insets(20, 10, 20, 25));
		
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
