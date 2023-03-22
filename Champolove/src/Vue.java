import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Vue extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setWidth(800);
		primaryStage.setHeight(800);
		primaryStage.setTitle("Champolove");
		
		Group fenetre = new Group();
		Scene scene = new Scene(fenetre);
		scene.setFill(Color.SKYBLUE);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}


}
