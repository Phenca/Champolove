package ancienFichier;

import java.util.ArrayList;

import application.Profil;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Modele implements Observable{
	
	Profil ProfilPrincipal;
	
	public Modele() {
		
		ArrayList<Profil> memoireP = new ArrayList<>();
	}
	
	
	
	public void ajouterGoutAuProfilPrincipal(String unGout) {
		ProfilPrincipal.Gouts.add(unGout);
	}
	
	public void ajouterHobbieAuProfilPrincipal(String unHobbie) {
		ProfilPrincipal.Gouts.add(unHobbie);
	}
	
	public void ajouterUnTrucAEviterAuProfilPrincipal(String unTrucAEVITER) {
		ProfilPrincipal.Gouts.add(unTrucAEVITER);
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
