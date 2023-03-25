import java.util.Observer;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Vue extends Application implements Observer{
	@Override
	public void start(Stage Stage) throws Exception {
		Label title = new Label("Champolove");
		title.relocate(110, 50);

		Label lblLog = new Label("Déjà inscrit ?");
		lblLog.relocate(110, 150);
		Button loginBtn = new Button("Login");
		loginBtn.relocate(120, 175);
		
		Label lblSign = new Label("Pas encore inscrit ?");
		lblSign.relocate(110, 225);
		Button signinBtn = new Button("Sign in");
		signinBtn.relocate(120, 250);
		
		Pane fenetre = new Pane();
		fenetre.getChildren().addAll(title, lblLog, loginBtn, lblSign, signinBtn);	
		
		fenetre.setPrefSize(300, 500);
		
		Scene scene = new Scene(fenetre);
		Stage.setScene(scene);
		Stage.setTitle("Champolove");
		//Stage.getIcons().add(new Image(getClass().getResourceAsStream("logo.png")));
		Stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void update(java.util.Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
