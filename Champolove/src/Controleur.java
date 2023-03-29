import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controleur implements EventHandler<ActionEvent>{
	
	private Modele modl;
	
	public Controleur (Modele modl) {
		this.modl=modl;
	}

	@Override
	public void handle(ActionEvent event) {
		System.out.println(event.getTarget());
		
	}
	
	
	
	
}
