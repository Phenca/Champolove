package application;
import java.util.ArrayList;
import java.util.Calendar;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Modele implements Observable{
	
	Profil ProfilPrincipal;
	int age = 0;
	ArrayList<Profil> historique_match;
	
	public static int calcul_age(ArrayList memoireP, int newage) {
		Calendar c = Calendar. getInstance();
		for (int i=0; i<memoireP.size(); i++) {
			Profil m =  (Profil) memoireP.get(i);
			String[] l = m.date_naissance.split("/");
			newage =  c.get(Calendar.YEAR)- Integer.valueOf(l[2]);
			int mois = (c.get(Calendar.MONTH)+1-Integer.valueOf(l[1]));
			int jour = (c.get(Calendar.DAY_OF_MONTH)-Integer.valueOf(l[0]));
			if (mois>0) {
					//m.date_naissance = String.valueOf(age);
			}
			else if (mois==0){
				if (jour<0) {
					newage = newage-1;
					m.age = newage;
					//m.date_naissance = String.valueOf(age);
				}
				else {
					m.age = newage;
					//m.date_naissance = String.valueOf(age);
				}
			}
			else{
				newage = newage -1;
				m.age = newage;
				//m.date_naissance = String.valueOf(age);				
			}
			//System.out.println("Age de profil " + i + " : " + age);
		}
		return newage;
	}
	
	public Modele() {
		ArrayList<Profil> memoirePuser = new ArrayList<>();
		Profil pUser = new Profil(null, null, null, null, 0, age, null, null, null, null, 0);
		memoirePuser.add(pUser);
		ArrayList<Profil> memoireP = new ArrayList<>();
		Profil p1 = new Profil("hawaj", "Levy", "Adolphe", "04/03/2002", 179, age, "Adolphe.Levy@yopmail.com", "masculin", "file:ressources/img_profil/Levy_Adolphe.png", "", 0);
		memoireP.add(p1);
		Profil p2 = new Profil("hajot", "Hamel", "Bertrand", "24/01/1983", 183, age, "Bertrand.Hamel@yopmail.com", "masculin", "file:ressources/img_profil/Hamel_Bertrand.png", "", 0);
		memoireP.add(p2);
		Profil p3 = new Profil("botub", "Hardy", "Rochelle", "03/11/1997", 165, age, "Rochelle.Hardy@yopmail.com", "féminin", "file:ressources/img_profil/Hardy_Rochelle.png", "", 0);
		memoireP.add(p3);
		Profil p4 = new Profil("gubureg", "Thomas", "Antoine", "10/09/2004", 170, age, "Antoine.Thomas@yopmail.com", "masculin", "file:ressources/img_profil/Thomas_Antoine.png", "", 0);
		memoireP.add(p4);
		Profil p5 = new Profil("tuhen", "Fort", "Lucy", "13/02/1999", 175, age, "Lucy.Fort@yopmail.com", "féminin", "file:ressources/img_profil/Fort_Lucy.png", "", 0);
		memoireP.add(p5);
		Profil p6 = new Profil("kugufid", "Andre", "Margot", "20/02/1992", 166, age, "Margot.Andre@yopmail", "féminin", "file:ressources/img_profil/Andre_Margot.png", "", 0);
		memoireP.add(p6);
		Profil p7 = new Profil("felix", "Drouet", "Charlie", "16/03/1965", 166, age, "Charlie.Drouet@yopmail", "masculin", "file:ressources/img_profil/Drouet_Charlie.png", "", 0);
		memoireP.add(p7);
		Profil p8 = new Profil("xevuju", "Grandjean", "Michelle", "29/12/1966", 157, age, "Michelle.Grandjean@yopmail.com", "féminin", "file:ressources/img_profil/Grandjean_Michelle.png", "", 0);
		memoireP.add(p8);
		Profil p9 = new Profil("qaqaqu", "Dupuis", "Lambert", "06/04/1967", 174, age, "Lambert.Dupuis@yopmail.com", "masculin", "file:ressources/img_profil/Dupuis_Lambert.png", "", 0);
		memoireP.add(p9);
		Profil p10 = new Profil("zapaveg", "Pasquier", "Colette", "01/01/1978", 167, age, "Colette.Pasquier@yopmail.com", "féminin", "file:ressources/img_profil/Pasquier_Colette.png", "", 0);
		memoireP.add(p10);
		
		calcul_age(memoireP, age);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	public void Historique(ArrayList<Profil> historique_match) {
		
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
