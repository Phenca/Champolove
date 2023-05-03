package application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemoireProfil {

	int age = 0;
	ArrayList<Profil> memoirePHomme;
	ArrayList<Profil> memoirePFemme;
	Profil pUser;
	ArrayList<Profil> memoirePMixtes;
	ArrayList<Profil> memoireMatcher;
	Profil p1;
	Profil p2;
	Profil p3;
	Profil p4;
	Profil p5;
	Profil p6;
	Profil p7;
	Profil p8;
	Profil p9;
	Profil p10;
	TreeMap<Double,Profil> dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale;


	public static int calcul_age(ArrayList<Profil> memoireP, int newage) {
		Calendar c = Calendar. getInstance();
		for (int i=0; i<memoireP.size(); i++) {
			Profil m =  (Profil) memoireP.get(i);
			String[] l = m.date_naissance.split("/");
			newage =  c.get(Calendar.YEAR)- Integer.valueOf(l[2]);
			int mois = (c.get(Calendar.MONTH)+1-Integer.valueOf(l[1]));
			int jour = (c.get(Calendar.DAY_OF_MONTH)-Integer.valueOf(l[0]));
			if (mois>0) {
				//m.date_naissance = String.valueOf(age);
				m.age = newage;
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

	public  MemoireProfil() {
		dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale=new TreeMap<Double,Profil>(Collections.reverseOrder());
		pUser = new Profil(null, null, null, 0, age , null, null, null, null, 0, null);
		memoirePMixtes = new ArrayList<>();
		p1 = new Profil("Levy", "Adolphe", "04/03/2002", 179, age, "Adolphe.Levy@yopmail.com", "masculin", "file:src/ressources/img_profil/Levy_Adolphe.png", "", 0,"courgette1");
		memoirePMixtes.add(p1);
		p2 = new Profil("Hamel", "Bertrand", "24/01/1983", 183, age, "Bertrand.Hamel@yopmail.com", "masculin", "file:src/ressources/img_profil/Hamel_Bertrand.png", "", 0,"courgette2");
		memoirePMixtes.add(p2);
		p3 = new Profil("Hardy", "Rochelle", "03/11/1997", 165, age, "Rochelle.Hardy@yopmail.com", "féminin", "file:src/ressources/img_profil/Hardy_Rochelle.png", "", 0,"courgette3");
		memoirePMixtes.add(p3);
		p4 = new Profil("Thomas", "Antoine", "10/09/2004", 170, age, "Antoine.Thomas@yopmail.com", "masculin", "file:src/ressources/img_profil/Thomas_Antoine.png", "", 0,"courgette4");
		memoirePMixtes.add(p4);
		p5 = new Profil("Fort", "Lucy", "13/02/1999", 175, age, "Lucy.Fort@yopmail.com", "féminin", "file:src/ressources/img_profil/Fort_Lucy.png", "", 0,"courgette5");
		memoirePMixtes.add(p5);
		p6 = new Profil("Andre", "Margot", "20/02/1992", 166, age, "Margot.Andre@yopmail", "féminin", "file:src/ressources/img_profil/Andre_Margot.png", "", 0,"courgette6");
		memoirePMixtes.add(p6);
		p7 = new Profil("Drouet", "Charlie", "16/03/1965", 166, age, "Charlie.Drouet@yopmail", "masculin", "file:src/ressources/img_profil/Drouet_Charlie.png", "", 0,"courgette7");
		memoirePMixtes.add(p7);
		p8 = new Profil("Grandjean", "Michelle", "29/12/1966", 157, age, "Michelle.Grandjean@yopmail.com", "féminin", "file:src/ressources/img_profil/Grandjean_Michelle.png", "", 0,"courgette8");
		memoirePMixtes.add(p8);
		p9 = new Profil("Dupuis", "Lambert", "06/04/1967", 174, age, "Lambert.Dupuis@yopmail.com", "masculin", "file:src/ressources/img_profil/Dupuis_Lambert.png", "", 0,"courgette9");
		memoirePMixtes.add(p9);
		p10 = new Profil("Pasquier", "Colette", "01/01/1978", 167, age, "Colette.Pasquier@yopmail.com", "féminin", "file:src/ressources/img_profil/Pasquier_Colette.png", "", 0,"courgette10");
		memoirePMixtes.add(p10);

		calcul_age(memoirePMixtes, age);

		memoirePHomme = new ArrayList<>();
		memoirePFemme = new ArrayList<>();
		memoireMatcher = new ArrayList<>();

		for (int i=0; i<memoirePMixtes.size(); i++) {
			Profil m =  (Profil) memoirePMixtes.get(i);
			if (m.sexe == "masculin"){
				memoirePHomme.add(m);
			}
			else{
				memoirePFemme.add(m);
			}
		}

	}

	public ArrayList<Profil> selectionDesProfilsOptimiserPourLePuser(){
		ArrayList<Profil> listeOpti=new ArrayList<Profil>();

		if(pUser.VotrePreference=="mixte") {

			for(int i=0;i<memoirePMixtes.size();i++) {
				dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.put(pUser.compareTo(memoirePMixtes.get(i)), memoirePMixtes.get(i));
			}

			for(Map.Entry mapentr : dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.entrySet()) {
				listeOpti.add((Profil)mapentr.getValue());
			}


		}
		else if(pUser.VotrePreference=="homme") {

			for(int i=0;i<memoirePHomme.size();i++) {
				dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.put(pUser.compareTo(memoirePHomme.get(i)), memoirePHomme.get(i));
			}

			for(Map.Entry mapentr : dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.entrySet()) {
				listeOpti.add((Profil)mapentr.getValue());
			}


		}
		else if(pUser.VotrePreference=="femme") {

			for(int i=0;i<memoirePFemme.size();i++) {
				dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.put(pUser.compareTo(memoirePFemme.get(i)), memoirePFemme.get(i));
			}

			for(Map.Entry mapentr : dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.entrySet()) {
				listeOpti.add((Profil)mapentr.getValue());
			}

		}
		
		return listeOpti;

	}

}
