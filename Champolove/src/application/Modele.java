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
				"Lo-Fi", "Classique"};
		//Rock =0, Rap=1, Pop=2, Hip-Hop=3, Jazz=4, Blues=5, Soul=6, Gospel=7, Country=8, Disco=9, Techno=10, Reggae=11, Salsa=12, Flamenco=13, Metal=14, Funk=15, Lo-Fi=16, Classique=17 
		
		String[] tableauMonAnimalCompagnie = {"Chien", "Chat", "Serpent", "Cheval", "Peroquet", "Rat", "Hamster", "Lapin", "Poule", "Canari", "Poisson"};
		//Chien=0, Chat=1, Serpent=2, Cheval=3, Peroquet=4, Rat=5, Hamster=6, Lapin=7, Poule=8, Canari=9, Poisson=10
		
		String[] tableauMonPlatPref = { "Pâtes à la bolognaise", "Pâtes à la carbonara", "Lasagnes", "Croque-monsieur", "Gratin dauphinois", "Burger-frites", "Magret de canard" 
				,"Moules-frites", "Couscous", "Blanquette de veau" ,"Steak-frites", "Raclette" ,"Tomates farcies","Pizza", "Omelette"};
		//Pâtes à la bolognaise=0, Pâtes à la carbonara=1, Lasagnes=2, Croque-monsieur=3, Gratin dauphinois=4, Burger-frites=5, Magret de canard=6, Moules-frites=7, Couscous=8, Blanquette de veau=9
		//Steak-frites=10, Raclette=11, Tomates farcies=12, Pizza=13, Omelette=14
		
		String[] tableauDesStylesFilmsEtSerie = {"Science-Fiction", "Comédie", "Horreur", "Suspense", "Policier", "Aventure", "Romantique", "Guerre", "Histoire", "Action"
				,"Drame", "Comédie Dramatique", "Fantastique", "Western"};
		//Science-Fiction=0, Comédie=1, Horreur=2, Suspence=3, Policier=4, Aventure=5, Romantique=6, Guerre=7, Histoire=8, Action=9, Drame=10, Comédie Dramatique=11
		//Fantastique=12, Western=13
		
		dictionnaireDesGouts.put("Tes styles de musiques ?", tableauDesStylesDeMusiques);
		dictionnaireDesGouts.put("Ton animal favoris", tableauMonAnimalCompagnie);
		dictionnaireDesGouts.put("Mon plat préféré", tableauMonPlatPref);
		dictionnaireDesGouts.put("Tes styles de films/séries ?", tableauDesStylesFilmsEtSerie);
		
		listeHobbies.add("Jeu Vidéo");//0
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
		listeHobbies.add("Danse");//12
		listeHobbies.add("Pêche");//13
		listeHobbies.add("Vélo");//14
		listeHobbies.add("Chasse");//15
		listeHobbies.add("Cueillette de champignons");//16

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

		//pour p9
		memoiremixte.p9.Gouts.add(tableauMonAnimalCompagnie[9]);
		memoiremixte.p9.Gouts.add(tableauMonAnimalCompagnie[10]);
		memoiremixte.p9.Gouts.add(tableauMonPlatPref[0]);
		memoiremixte.p9.Gouts.add(tableauMonPlatPref[1]);
		memoiremixte.p9.Gouts.add(tableauMonPlatPref[9]);
		memoiremixte.p9.Gouts.add(tableauDesStylesFilmsEtSerie[8]);
		memoiremixte.p9.Gouts.add(tableauDesStylesFilmsEtSerie[11]);
		memoiremixte.p9.Hobbies.add(listeHobbies.get(13));
		memoiremixte.p9.Hobbies.add(listeHobbies.get(15));
		memoiremixte.p9.Hobbies.add(listeHobbies.get(16));

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
		memoiremixte.p10.Hobbies.add(listeHobbies.get(0));
		memoiremixte.p10.Hobbies.add(listeHobbies.get(1));
		memoiremixte.p10.Hobbies.add(listeHobbies.get(4));
		memoiremixte.p10.Hobbies.add(listeHobbies.get(12));
		
		//pour p11
		memoiremixte.p11.Gouts.add(tableauDesStylesDeMusiques[0]);
		memoiremixte.p11.Gouts.add(tableauDesStylesDeMusiques[14]);
		memoiremixte.p11.Gouts.add(tableauDesStylesDeMusiques[17]);
		memoiremixte.p11.Gouts.add(tableauMonAnimalCompagnie[0]);
		memoiremixte.p11.Gouts.add(tableauMonAnimalCompagnie[1]);
		memoiremixte.p11.Gouts.add(tableauMonAnimalCompagnie[1]);
		memoiremixte.p11.Gouts.add(tableauMonAnimalCompagnie[1]);
		memoiremixte.p11.Gouts.add(tableauMonPlatPref[13]);
		memoiremixte.p11.Gouts.add(tableauMonPlatPref[14]);
		memoiremixte.p11.Gouts.add(tableauDesStylesFilmsEtSerie[0]);
		memoiremixte.p11.Gouts.add(tableauDesStylesFilmsEtSerie[9]);
		memoiremixte.p11.Gouts.add(tableauDesStylesFilmsEtSerie[12]);
		memoiremixte.p11.Hobbies.add(listeHobbies.get(1));
		memoiremixte.p11.Hobbies.add(listeHobbies.get(3));
		memoiremixte.p11.Hobbies.add(listeHobbies.get(5));
		
		//pour p12
		memoiremixte.p12.Gouts.add(tableauMonAnimalCompagnie[4]);
		memoiremixte.p12.Gouts.add(tableauMonAnimalCompagnie[6]);
		memoiremixte.p12.Gouts.add(tableauMonPlatPref[6]);
		memoiremixte.p12.Gouts.add(tableauMonPlatPref[9]);
		memoiremixte.p12.Hobbies.add(listeHobbies.get(11));
		memoiremixte.p12.Hobbies.add(listeHobbies.get(13));
		memoiremixte.p12.Hobbies.add(listeHobbies.get(15));

		//pour p13
		memoiremixte.p13.Gouts.add(tableauDesStylesDeMusiques[5]);
		memoiremixte.p13.Gouts.add(tableauDesStylesDeMusiques[9]);
		memoiremixte.p13.Gouts.add(tableauDesStylesDeMusiques[12]);
		memoiremixte.p13.Gouts.add(tableauMonPlatPref[6]);
		memoiremixte.p13.Gouts.add(tableauMonPlatPref[13]);
		memoiremixte.p13.Gouts.add(tableauDesStylesFilmsEtSerie[8]);
		memoiremixte.p13.Gouts.add(tableauDesStylesFilmsEtSerie[11]);
		memoiremixte.p13.Hobbies.add(listeHobbies.get(2));
		memoiremixte.p13.Hobbies.add(listeHobbies.get(4));
		memoiremixte.p13.Hobbies.add(listeHobbies.get(6));
		memoiremixte.p13.Hobbies.add(listeHobbies.get(9));
		memoiremixte.p13.Hobbies.add(listeHobbies.get(10));
		memoiremixte.p13.Hobbies.add(listeHobbies.get(16));
		
		//pour p14
		memoiremixte.p14.Gouts.add(tableauDesStylesDeMusiques[1]);
		memoiremixte.p14.Gouts.add(tableauDesStylesDeMusiques[2]);
		memoiremixte.p14.Gouts.add(tableauDesStylesDeMusiques[10]);
		memoiremixte.p14.Gouts.add(tableauMonPlatPref[1]);
		memoiremixte.p14.Gouts.add(tableauMonPlatPref[3]);
		memoiremixte.p14.Gouts.add(tableauMonPlatPref[4]);
		memoiremixte.p14.Gouts.add(tableauMonPlatPref[7]);
		memoiremixte.p14.Gouts.add(tableauDesStylesFilmsEtSerie[3]);
		memoiremixte.p14.Hobbies.add(listeHobbies.get(0));
		memoiremixte.p14.Hobbies.add(listeHobbies.get(2));
		memoiremixte.p14.Hobbies.add(listeHobbies.get(12));
		memoiremixte.p14.Hobbies.add(listeHobbies.get(15));

		//pour p15

		
		
		
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
