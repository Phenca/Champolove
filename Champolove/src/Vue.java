import java.util.Observer;
import javafx.application.Application;
import javafx.stage.Stage;

public class Vue extends Application implements Observer{

	@Override
	public void start(Stage Stage) throws Exception {

		pageAcceuil launchPage = new pageAcceuil();
		launchPage.start(Stage);

		
		Modele m=new Modele();
		Controleur c=new Controleur(m);

	}
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void update(java.util.Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
