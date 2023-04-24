import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Controleur implements EventHandler<MouseEvent>{
	
	private Modele modl;
	private String[] recuperationDuNomDuBouton;
	
	public Controleur (Modele modl) {
		this.modl=modl;
	}


	@Override
	public void handle(MouseEvent event) {
		
		if(String.valueOf(event.getTarget()).startsWith("Text")) {
			recuperationDuNomDuBouton=String.valueOf(event.getTarget()).split(",");
			recuperationDuNomDuBouton=recuperationDuNomDuBouton[0].split("=");
			System.out.println(recuperationDuNomDuBouton[1]);
		}else {
			recuperationDuNomDuBouton=String.valueOf(event.getTarget()).split("'");
			System.out.println(recuperationDuNomDuBouton[1]);
		}
		
		
		
	}
	
	
	
	
}
