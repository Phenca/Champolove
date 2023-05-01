package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Vue extends Application implements Observer, Initializable {
	private Stage Stage;
	private AnchorPane root;
	public static AnchorPane rootP;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loadSplashScreen();

		rootP = root;
	}
	
	@Override
	public void start(Stage Stage) throws Exception {
		this.Stage = Stage;
		fenetreLancement();

	}
	
	private void loadSplashScreen(){
		try {
			StackPane pane = FXMLLoader.load(getClass().getResource(("ressources/Intro_ChampoLove.gif")));
			root.getChildren().setAll(pane);
			
			FadeTransition fadeIn = new FadeTransition(Duration.seconds(1), pane);
			fadeIn.setFromValue(0);
			fadeIn.setToValue(1);
			fadeIn.setCycleCount(1);
			
			FadeTransition fadeOut = new FadeTransition(Duration.seconds(1), pane);
			fadeOut.setFromValue(1);
			fadeOut.setToValue(0);
			fadeOut.setCycleCount(1);
			
			fadeIn.play();
			
			fadeIn.setOnFinished((e) -> {
				fadeOut.play(); 
			});
			
			fadeOut.setOnFinished((e) -> {
				try {
					AnchorPane parentContent = FXMLLoader.load(getClass().getResource(("FXMLDocument.fxml")));
					root.getChildren().setAll(pane);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fenetreLancement() {
		Parent rootLayout;
		try {
			FXMLLoader loader = new FXMLLoader();
		    loader.setLocation(getClass().getResource("/FXML/View.fxml"));
		    rootLayout = loader.load();
			Scene scene = new Scene(rootLayout);
			Stage.setTitle("Champolove");
			Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));
			Stage.setScene(scene);
			Stage.show();
			
			String video = "ressources/intro_ChampoLove.mp4";
		} catch (IOException e){
			e.printStackTrace();
		}

	}
	
	public Stage getStage() {
		return Stage;
	}
	
	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	
}
