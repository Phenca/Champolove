import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class pageAcceuil extends Application {
	@Override
	public void start(Stage Stage) throws Exception {
		Parent rootLayout = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(rootLayout);
		Stage.setTitle("Champolove");
        Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));  
        Stage.setScene(scene);
        Stage.show();   
	}
	public static void main(String[] args) {
		launch(args);
	}
}
