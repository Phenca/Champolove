package application;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Modele implements Observable{
	
	ArrayList<Profil> historique_match;
	MemoireProfil memoiremixte;
	HashMap<String,String[]> dictionnaireDesGouts = new HashMap<>();
	ArrayList<String> listeHobbies=new ArrayList<>();	
	
	
	public Modele() {
		memoiremixte = new MemoireProfil();
		
		String[] tableauDesStylesDeMusiques= {"Rock","Rap","Pop","Hip-Hop", "Jazz", "Blues", "Soul", "Gospel", "Country", "Disco", "Techno", "Reggae", "Salsa", "Flamenco", "Metal", "Funk",
				"Lo-Fi"};
		
		String[] tableauMonAnimalCompagnie = {"Chien", "Chat", "Serpent", "Cheval", "Peroquet", "Rat", "Hamster", "Lapin", "Poule", "Canari", "Poisson"};
		
		String[] tableauMonPlatPref = { "Pâtes à la bolognaise", "Pâtes à la carbonara", "Lasagnes", "Croque-monsieur", "Gratin dauphinois", "Burger-frites", "Magret de canard" 
				,"Moules-frites", "Couscous", "Blanquette de veau" ,"Steak-frites", "Raclette" ,"Tomates farcies","Pizza"};
		
		String[] tableauDesStylesFilmsEtSerie = {"Science-Fiction", "Comédie", "Horreur", "Suspence", "Policier", "Aventure", "Romantique", "Guerre", "Histoire", "Action"
				,"Drame", "Comédie Dramatique", "Fantastique", "Western"};
		
		dictionnaireDesGouts.put("Tes styles de musiques ?", tableauDesStylesDeMusiques);
		dictionnaireDesGouts.put("Ton animal favoris", tableauMonAnimalCompagnie);
		dictionnaireDesGouts.put("Mon plat préféré", tableauMonPlatPref);
		dictionnaireDesGouts.put("Tes styles de films/séries ?", tableauDesStylesFilmsEtSerie);
		
		listeHobbies.add("Jeu vidéo");//0
		listeHobbies.add("Sport");//1
		listeHobbies.add("Cuisine");//2
		listeHobbies.add("Sport à sensations");//3
		listeHobbies.add("Soirées entre amis");//4
		listeHobbies.add("Sorties culturelles");//5
		listeHobbies.add("Faire de la musique");//6
		listeHobbies.add("Peinture");//7
		listeHobbies.add("Chant");//8
		listeHobbies.add("Jardinage");//9
		listeHobbies.add("Marche");//10
		listeHobbies.add("Shopping");//11
		listeHobbies.add("Lecture");//12
		listeHobbies.add("Danse");//13
		listeHobbies.add("Pêche");//14
		listeHobbies.add("Vélo");//15
		listeHobbies.add("Chasse");//16
		listeHobbies.add("Cueillette de champignons");//17

		//pour p1
		memoiremixte.p1.Gouts.add(tableauDesStylesDeMusiques[0]);
		memoiremixte.p1.Gouts.add(tableauDesStylesDeMusiques[1]);
		memoiremixte.p1.Gouts.add(tableauMonAnimalCompagnie[1]);
		memoiremixte.p1.Gouts.add(tableauMonPlatPref[0]);
		memoiremixte.p1.Gouts.add(tableauDesStylesFilmsEtSerie[0]);
		memoiremixte.p1.Gouts.add(tableauDesStylesFilmsEtSerie[1]);
		memoiremixte.p1.Hobbies.add(listeHobbies.get(0));
		memoiremixte.p1.Hobbies.add(listeHobbies.get(1));
		memoiremixte.p1.Hobbies.add(listeHobbies.get(4));

		//pour p2
		memoiremixte.p2.Gouts.add(tableauDesStylesDeMusiques[4]);
		memoiremixte.p2.Gouts.add(tableauDesStylesDeMusiques[5]);
		memoiremixte.p2.Gouts.add(tableauDesStylesDeMusiques[6]);
		memoiremixte.p2.Gouts.add(tableauDesStylesDeMusiques[8]);
		memoiremixte.p2.Gouts.add(tableauMonAnimalCompagnie[0]);
		memoiremixte.p2.Gouts.add(tableauMonPlatPref[12]);
		memoiremixte.p2.Gouts.add(tableauDesStylesFilmsEtSerie[7]);
		memoiremixte.p2.Gouts.add(tableauDesStylesFilmsEtSerie[13]);
		memoiremixte.p2.Hobbies.add(listeHobbies.get(2));
		memoiremixte.p2.Hobbies.add(listeHobbies.get(7));
		
		//pour p3
		memoiremixte.p3.Gouts.add(tableauDesStylesDeMusiques[10]);
		memoiremixte.p3.Hobbies.add(listeHobbies.get(8));

		
		//pour p4
		memoiremixte.p4.Gouts.add(tableauMonAnimalCompagnie[0]);
		memoiremixte.p4.Gouts.add(tableauMonAnimalCompagnie[1]);
		memoiremixte.p4.Gouts.add(tableauMonAnimalCompagnie[6]);
		memoiremixte.p4.Gouts.add(tableauMonPlatPref[3]);
		memoiremixte.p4.Gouts.add(tableauMonPlatPref[5]);
		memoiremixte.p4.Gouts.add(tableauMonPlatPref[7]);
		memoiremixte.p4.Hobbies.add(listeHobbies.get(2));
		memoiremixte.p4.Hobbies.add(listeHobbies.get(5));
		memoiremixte.p4.Hobbies.add(listeHobbies.get(4));

		
		//pour p5
		memoiremixte.p5.Gouts.add(tableauDesStylesDeMusiques[0]);
		memoiremixte.p5.Gouts.add(tableauDesStylesDeMusiques[1]);
		memoiremixte.p5.Gouts.add(tableauDesStylesDeMusiques[2]);
		memoiremixte.p5.Gouts.add(tableauDesStylesDeMusiques[3]);
		memoiremixte.p5.Gouts.add(tableauDesStylesDeMusiques[8]);
		memoiremixte.p5.Gouts.add(tableauMonPlatPref[3]);
		memoiremixte.p5.Gouts.add(tableauMonPlatPref[9]);
		memoiremixte.p5.Gouts.add(tableauMonPlatPref[10]);
		memoiremixte.p5.Gouts.add(tableauDesStylesFilmsEtSerie[0]);
		memoiremixte.p5.Gouts.add(tableauDesStylesFilmsEtSerie[12]);
		memoiremixte.p5.Gouts.add(tableauDesStylesFilmsEtSerie[6]);
		memoiremixte.p5.Gouts.add(tableauDesStylesFilmsEtSerie[9]);
		memoiremixte.p5.Hobbies.add(listeHobbies.get(1));
		memoiremixte.p5.Hobbies.add(listeHobbies.get(4));
		memoiremixte.p5.Hobbies.add(listeHobbies.get(3));
		memoiremixte.p5.Hobbies.add(listeHobbies.get(8));


		//pour p6
		memoiremixte.p6.Gouts.add(tableauDesStylesDeMusiques[0]);
		memoiremixte.p6.Gouts.add(tableauDesStylesDeMusiques[14]);
		memoiremixte.p6.Gouts.add(tableauDesStylesFilmsEtSerie[3]);
		memoiremixte.p6.Gouts.add(tableauDesStylesFilmsEtSerie[4]);
		memoiremixte.p6.Hobbies.add(listeHobbies.get(7));


		//pour p7
		memoiremixte.p7.Gouts.add(tableauMonAnimalCompagnie[4]);
		memoiremixte.p7.Gouts.add(tableauMonPlatPref[2]);
		memoiremixte.p7.Gouts.add(tableauMonPlatPref[6]);
		memoiremixte.p7.Gouts.add(tableauMonPlatPref[12]);
		memoiremixte.p7.Gouts.add(tableauDesStylesFilmsEtSerie[2]);
		memoiremixte.p7.Gouts.add(tableauDesStylesFilmsEtSerie[3]);
		memoiremixte.p7.Gouts.add(tableauDesStylesFilmsEtSerie[4]);
		memoiremixte.p7.Hobbies.add(listeHobbies.get(6));

		//pour p8
		memoiremixte.p8.Gouts.add(tableauDesStylesDeMusiques[11]);
		memoiremixte.p8.Gouts.add(tableauDesStylesDeMusiques[12]);
		memoiremixte.p8.Gouts.add(tableauDesStylesDeMusiques[13]);
		memoiremixte.p8.Gouts.add(tableauMonAnimalCompagnie[2]);
		memoiremixte.p8.Gouts.add(tableauMonAnimalCompagnie[3]);
		memoiremixte.p8.Hobbies.add(listeHobbies.get(7));
		memoiremixte.p8.Hobbies.add(listeHobbies.get(9));
		memoiremixte.p8.Hobbies.add(listeHobbies.get(10));
		memoiremixte.p8.Hobbies.add(listeHobbies.get(12));

		//pour p9
		memoiremixte.p9.Gouts.add(tableauMonAnimalCompagnie[9]);
		memoiremixte.p9.Gouts.add(tableauMonAnimalCompagnie[10]);
		memoiremixte.p9.Gouts.add(tableauMonPlatPref[0]);
		memoiremixte.p9.Gouts.add(tableauMonPlatPref[1]);
		memoiremixte.p9.Gouts.add(tableauMonPlatPref[9]);
		memoiremixte.p9.Gouts.add(tableauDesStylesFilmsEtSerie[8]);
		memoiremixte.p9.Gouts.add(tableauDesStylesFilmsEtSerie[11]);
		memoiremixte.p9.Hobbies.add(listeHobbies.get(12));
		memoiremixte.p9.Hobbies.add(listeHobbies.get(14));
		memoiremixte.p9.Hobbies.add(listeHobbies.get(16));
		memoiremixte.p9.Hobbies.add(listeHobbies.get(17));

		//pour p10
		memoiremixte.p10.Gouts.add(tableauDesStylesDeMusiques[16]);
		memoiremixte.p10.Gouts.add(tableauMonAnimalCompagnie[0]);
		memoiremixte.p10.Gouts.add(tableauMonAnimalCompagnie[1]);
		memoiremixte.p10.Gouts.add(tableauMonAnimalCompagnie[5]);
		memoiremixte.p10.Gouts.add(tableauMonPlatPref[8]);
		memoiremixte.p10.Gouts.add(tableauMonPlatPref[11]);
		memoiremixte.p10.Gouts.add(tableauDesStylesFilmsEtSerie[1]);
		memoiremixte.p10.Gouts.add(tableauDesStylesFilmsEtSerie[6]);
		memoiremixte.p10.Gouts.add(tableauDesStylesFilmsEtSerie[10]);
		memoiremixte.p10.Hobbies.add(listeHobbies.get(0));//championne de candy crush
		memoiremixte.p10.Hobbies.add(listeHobbies.get(1));
		memoiremixte.p10.Hobbies.add(listeHobbies.get(4));
		memoiremixte.p10.Hobbies.add(listeHobbies.get(12));

		
	}
	
	public static void main(String[] args) {
		
	}
	
	public void Historique(ArrayList<Profil> historique_match) {
		
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
