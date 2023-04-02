import java.util.ArrayList;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Modele implements Observable{
	
	Profil ProfilPrincipal;
	
	public Modele() {
		
		
		
	}
	
	public static void main(String[] args) {
		ArrayList<Profil> memoirePuser = new ArrayList<>();
		Profil pUser = new Profil(null, null, null, 0, 0, null, null, null, null);
		memoirePuser.add(pUser);
		ArrayList<Profil> memoireP = new ArrayList<>();
		Profil p1 = new Profil("hawaj", "Levy", "Adolphe", 179, 21, "Adolphe.Levy@yopmail.com", "masculin", "file:ressources/img_profil/Levy_Adolphe.png", "");
		memoireP.add(p1);
		Profil p2 = new Profil("hajot", "Hamel", "Bertrand", 183, 39, "Bertrand.Hamel@yopmail.com", "masculin", "file:ressources/img_profil/Hamel_Bertrand.png", "");
		memoireP.add(p2);
		Profil p3 = new Profil("botub", "Hardy", "Rochelle", 165, 25, "Rochelle.Hardy@yopmail.com", "féminin", "file:ressources/img_profil/Hardy_Rochelle.png", "");
		memoireP.add(p3);
		Profil p4 = new Profil("gubureg", "Thomas", "Antoine", 170, 18, "Antoine.Thomas@yopmail.com", "masculin", "file:ressources/img_profil/Thomas_Antoine.png", "");
		memoireP.add(p4);
		Profil p5 = new Profil("tuhen", "Fort", "Lucy", 175, 24, "Lucy.Fort@yopmail.com", "féminin", "file:ressources/img_profil/Fort_Lucy.png", "");
		memoireP.add(p5);
		Profil p6 = new Profil("kugufid", "Andre", "Margot", 166, 31, "Margot.Andre@yopmail", "féminin", "file:ressources/img_profil/Andre_Margot.png", "");
		memoireP.add(p6);
		Profil p7 = new Profil("felix", "Drouet", "Charlie", 166, 58, "Charlie.Drouet@yopmail", "masculin", "file:ressources/img_profil/Drouet_Charlie.png", "");
		memoireP.add(p7);
		Profil p8 = new Profil("xevuju", "Grandjean", "Michelle", 1157, 56, "Michelle.Grandjean@yopmail.com", "féminin", "file:ressources/img_profil/Grandjean_Michelle.png", "");
		memoireP.add(p8);
		Profil p9 = new Profil("qaqaqu", "Dupuis", "Lambert", 174, 56, "Lambert.Dupuis@yopmail.com", "masculin", "file:ressources/img_profil/Dupuis_Lambert.png", "");
		memoireP.add(p9);
		Profil p10 = new Profil("zapaveg", "Pasquier", "Colette", 167, 45, "Colette.Pasquier@yopmail.com", "féminin", "file:ressources/img_profil/Pasquier_Colette.png", "");
		memoireP.add(p10);
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
