package application;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Modele implements Observable{
	
	Profil ProfilPrincipal;
	int age = 0;
	ArrayList<Profil> historique_match;
	
	HashMap<String,String[]> dictionnaireDesGouts = new HashMap<>();
	ArrayList<String> listeHobbies=new ArrayList<>();	
	
	
	public Modele() {
		String[] tableauDesStylesDeMusiques= {"Rock","Rap","Pop","Hip-hop", "Jazz", "Blues", "Soul", "Gospel", "Country", "Disco", "Techno", "Reggae", "Salsa", "Flamenco", "Metal", "Funk",
				"Lofi"};
		
		String[] tableauMonAnimalPref = {"Chien", "Chat", "Serpent", "Cheval", "Peroquet"};
		
		String[] tableauMonPlatPref = { "Pâtes à la bolognaise", "Pâtes à la carbonara", "Lasagnes", "Croque-monsieur", "Gratin dauphinois", "Burger-frites", "Magret de canard" 
				,"Moules-frites", "Couscous", "Blanquette de veau" ,"Steak-frites", "Raclette" ,"Tomates farcies"};
		
		String[] tableauDesStylesFilmsEtSerie = {"Science-fiction", "Comédie", "Horreur", "Suspence", "Policier", "Aventure", "Romantique", "Guerre", "Histoire", "Action"
				,"Drame", "Comédie dramatique", "Fantastique", "Western"};
		
		dictionnaireDesGouts.put("Tes styles de musiques ?", tableauDesStylesDeMusiques);
		dictionnaireDesGouts.put("Ton animal favoris", tableauMonAnimalPref);
		dictionnaireDesGouts.put("Mon plat préféré", tableauMonPlatPref);
		dictionnaireDesGouts.put("Tes styles de films/séries ?", tableauDesStylesFilmsEtSerie);
		
		listeHobbies.add("Jeux vidéo");
		listeHobbies.add("sport");
		listeHobbies.add("cuisiner");
		listeHobbies.add("sport à sensation forte");
		listeHobbies.add("soirée entre amis");
		listeHobbies.add("sortie au musée");
		listeHobbies.add("jouer d'un instrument");
		listeHobbies.add("peindre");
		listeHobbies.add("chanter");
		
		
		
	}
	
	public static int calcul_age(ArrayList memoireP, int age) {
		Calendar c = Calendar. getInstance();
		for (int i=0; i<memoireP.size(); i++) {
			Profil m =  (Profil) memoireP.get(i);
			String[] l = m.date_naissance.split("/");
			age =  c.get(Calendar.YEAR)- Integer.valueOf(l[2]);
			int mois = (c.get(Calendar.MONTH)+1-Integer.valueOf(l[1]));
			int jour = (c.get(Calendar.DAY_OF_MONTH)-Integer.valueOf(l[0]));
			if (mois>0) {
					//m.date_naissance = String.valueOf(age);
			}
			else if (mois==0){
				if (jour<0) {
					age = age-1;					
					//m.date_naissance = String.valueOf(age);
				}
				else {
					//m.date_naissance = String.valueOf(age);
				}
			}
			else{
				age = age -1;
				//m.date_naissance = String.valueOf(age);				
			}
			//System.out.println("Age de profil " + i + " : " + age);
		}
		return age;
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<Profil> memoirePuser = new ArrayList<>();
		Profil pUser = new Profil(null, null, null, null, 0, null, null, null, null, 0, null);
		memoirePuser.add(pUser);
		ArrayList<Profil> memoireP = new ArrayList<>();
		Profil p1 = new Profil("p1", "Levy", "Adolphe", "04/03/2002", 179, "Adolphe.Levy@yopmail.com", "masculin", "file:ressources/img_profil/Levy_Adolphe.png", "", 0,"courgette1");
		memoireP.add(p1);
		Profil p2 = new Profil("p2", "Hamel", "Bertrand", "24/01/1983", 183, "Bertrand.Hamel@yopmail.com", "masculin", "file:ressources/img_profil/Hamel_Bertrand.png", "", 0,"courgette2");
		memoireP.add(p2);
		Profil p3 = new Profil("p3", "Hardy", "Rochelle", "03/11/1997", 165, "Rochelle.Hardy@yopmail.com", "féminin", "file:ressources/img_profil/Hardy_Rochelle.png", "", 0,"courgette3");
		memoireP.add(p3);
		Profil p4 = new Profil("p4", "Thomas", "Antoine", "10/09/2004", 170, "Antoine.Thomas@yopmail.com", "masculin", "file:ressources/img_profil/Thomas_Antoine.png", "", 0,"courgette4");
		memoireP.add(p4);
		Profil p5 = new Profil("p5", "Fort", "Lucy", "13/02/1999", 175, "Lucy.Fort@yopmail.com", "féminin", "file:ressources/img_profil/Fort_Lucy.png", "", 0,"courgette5");
		memoireP.add(p5);
		Profil p6 = new Profil("p6", "Andre", "Margot", "20/02/1992", 166, "Margot.Andre@yopmail", "féminin", "file:ressources/img_profil/Andre_Margot.png", "", 0,"courgette6");
		memoireP.add(p6);
		Profil p7 = new Profil("p7", "Drouet", "Charlie", "16/03/1965", 166, "Charlie.Drouet@yopmail", "masculin", "file:ressources/img_profil/Drouet_Charlie.png", "", 0,"courgette7");
		memoireP.add(p7);
		Profil p8 = new Profil("p8", "Grandjean", "Michelle", "29/12/1966", 157, "Michelle.Grandjean@yopmail.com", "féminin", "file:ressources/img_profil/Grandjean_Michelle.png", "", 0,"courgette8");
		memoireP.add(p8);
		Profil p9 = new Profil("p9", "Dupuis", "Lambert", "06/04/1967", 174, "Lambert.Dupuis@yopmail.com", "masculin", "file:ressources/img_profil/Dupuis_Lambert.png", "", 0,"courgette9");
		memoireP.add(p9);
		Profil p10 = new Profil("p10", "Pasquier", "Colette", "01/01/1978", 167, "Colette.Pasquier@yopmail.com", "féminin", "file:ressources/img_profil/Pasquier_Colette.png", "", 0,"courgette10");
		memoireP.add(p10);
		
		int age=0;
		calcul_age(memoireP, age);
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
