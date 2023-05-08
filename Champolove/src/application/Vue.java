package application;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Group;
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
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Vue extends Application implements Observer, Initializable {
	private Stage Stage;
	private AnchorPane root;
	public static AnchorPane rootP;
	private Media media;

	public static void main(String[] args) {
		launch(args);
	}

	

	@Override
	public void start(Stage Stage) throws Exception {
		this.Stage = Stage;
		initialize(null, null);
		fenetreLancement();

	}



	private void loadSplashScreen(Stage primaryStage){		
		try {
			StackPane pane = new StackPane();
			Media media = new Media("file:src/ressources/intro_ChampoLove.mp4");
			System.out.println(media);
			MediaPlayer mediaPlayer = new MediaPlayer(media);
			MediaView mediaView = new MediaView(mediaPlayer);
			Group root = new Group();
			root.getChildren().add(mediaView);
			Scene scene = new Scene(root, 800, 600);
			primaryStage.setScene(scene);
			pane.getChildren().add(mediaView);
			Scene scene1 = new Scene(pane);
			Stage stage = new Stage();
			stage.initOwner(Stage);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene1);
			stage.show();

			mediaPlayer.setOnReady(() -> {
				mediaPlayer.play();
				mediaView.fitWidthProperty().bind(stage.widthProperty());
				mediaView.fitHeightProperty().bind(stage.heightProperty());
			});

			mediaPlayer.setOnEndOfMedia(() -> {
				stage.close();
				try {
					AnchorPane parentContent = FXMLLoader.load(getClass().getResource("/FXML/View.fxml"));
					root.getChildren().setAll(parentContent);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loadSplashScreen(Stage);
		rootP = root;
	}

	private Media Media(InputStream is) {
		// TODO Auto-generated method stub
		return null;
	}

	public void fenetreLancement() {
		Parent rootLayout;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/FXML/View.fxml"));
			rootLayout = loader.load();
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add("/CSS/View.css");
			Stage.setTitle("Champolove");
			Stage.getIcons().add(new Image("file:src/ressources/logo/logo.png"));
			Stage.setScene(scene);
			Stage.show();

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
