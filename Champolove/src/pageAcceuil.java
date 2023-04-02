import java.io.IOException;
import java.net.URL;
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
		/*
		URL location = getClass().getResource("View.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		fxmlLoader.setClassLoader(getClass().getClassLoader());
		AnchorPane box = fxmlLoader.load();
		Scene scene = new Scene(box);
		*/
		Stage.setTitle("Champolove");
        Stage.getIcons().add(new Image("file:ressources/logo/logo.png"));  
        Stage.setScene(scene);
        Stage.show();
        
	}
	public static void main(String[] args) {
		launch(args);
	}
}
