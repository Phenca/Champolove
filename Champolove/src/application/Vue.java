package application;

import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Vue extends Application implements Observer {
	private Stage Stage;
	Media media;
	protected MediaPlayer lire_video;
	MediaView voir_video;

	@Override
	public void start(Stage Stage) throws Exception {
		this.Stage = Stage;
		
		fenetreLancement();

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
			media = new Media(new File(video).toURI().toString());

			lire_video = new MediaPlayer(media);
			lire_video.setAutoPlay(true);
			
			voir_video = new MediaView(lire_video);
			
			((Pane) rootLayout).getChildren().add(voir_video);
			
		} catch (IOException e){
			e.printStackTrace();
		}

	}
	
	public Stage getStage() {
		return Stage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
