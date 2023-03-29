import java.util.ArrayList;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Modele implements Observable{
	
	Profil PersonnePrincipal;
	
	public Modele() {
		
		
		ArrayList<String> memoireP = new ArrayList<>();
	}
	
	public void ajouterGoutAuProfilPrincipal(String unGout) {
		PersonnePrincipal.Gouts.add(unGout);
	}
	
	public void ajouterHobbieAuProfilPrincipal(String unHobbie) {
		PersonnePrincipal.Gouts.add(unHobbie);
	}
	
	public void ajouterUnTrucAEviterAuProfilPrincipal(String unTrucAEVITER) {
		PersonnePrincipal.Gouts.add(unTrucAEVITER);
	}

	@Override
	public void addListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}
}
