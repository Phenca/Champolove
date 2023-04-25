package application;

import java.util.ArrayList;
import java.util.Calendar;

public class MemoireProfil {
	
	int age = 0;
	ArrayList<Profil> memoirePuser;
	ArrayList<Profil> memoirePuserHomme;
	ArrayList<Profil> memoirePuserFemme;
	Profil pUser;
	ArrayList<Profil> memoireP;
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
	
	public  MemoireProfil() {
		memoirePuser= new ArrayList<>();
		pUser = new Profil(null, null, null, null, 0, age , null, null, null, null, 0, null);
		memoirePuser.add(pUser);
		memoireP = new ArrayList<>();
		p1 = new Profil("p1", "Levy", "Adolphe", "04/03/2002", 179, age, "Adolphe.Levy@yopmail.com", "masculin", "file:ressources/img_profil/Levy_Adolphe.png", "", 0,"courgette1");
		memoireP.add(p1);
		p2 = new Profil("p2", "Hamel", "Bertrand", "24/01/1983", 183, age, "Bertrand.Hamel@yopmail.com", "masculin", "file:ressources/img_profil/Hamel_Bertrand.png", "", 0,"courgette2");
		memoireP.add(p2);
		p3 = new Profil("p3", "Hardy", "Rochelle", "03/11/1997", 165, age, "Rochelle.Hardy@yopmail.com", "féminin", "file:ressources/img_profil/Hardy_Rochelle.png", "", 0,"courgette3");
		memoireP.add(p3);
		p4 = new Profil("p4", "Thomas", "Antoine", "10/09/2004", 170, age, "Antoine.Thomas@yopmail.com", "masculin", "file:ressources/img_profil/Thomas_Antoine.png", "", 0,"courgette4");
		memoireP.add(p4);
		p5 = new Profil("p5", "Fort", "Lucy", "13/02/1999", 175, age, "Lucy.Fort@yopmail.com", "féminin", "file:ressources/img_profil/Fort_Lucy.png", "", 0,"courgette5");
		memoireP.add(p5);
		p6 = new Profil("p6", "Andre", "Margot", "20/02/1992", 166, age, "Margot.Andre@yopmail", "féminin", "file:ressources/img_profil/Andre_Margot.png", "", 0,"courgette6");
		memoireP.add(p6);
		p7 = new Profil("p7", "Drouet", "Charlie", "16/03/1965", 166, age, "Charlie.Drouet@yopmail", "masculin", "file:ressources/img_profil/Drouet_Charlie.png", "", 0,"courgette7");
		memoireP.add(p7);
		p8 = new Profil("p8", "Grandjean", "Michelle", "29/12/1966", 157, age, "Michelle.Grandjean@yopmail.com", "féminin", "file:ressources/img_profil/Grandjean_Michelle.png", "", 0,"courgette8");
		memoireP.add(p8);
		p9 = new Profil("p9", "Dupuis", "Lambert", "06/04/1967", 174, age, "Lambert.Dupuis@yopmail.com", "masculin", "file:ressources/img_profil/Dupuis_Lambert.png", "", 0,"courgette9");
		memoireP.add(p9);
		p10 = new Profil("p10", "Pasquier", "Colette", "01/01/1978", 167, age, "Colette.Pasquier@yopmail.com", "féminin", "file:ressources/img_profil/Pasquier_Colette.png", "", 0,"courgette10");
		memoireP.add(p10);
		
		calcul_age(memoireP, age);
		
		memoirePuserHomme = new ArrayList<>();
		memoirePuserFemme = new ArrayList<>();
		
		for (int i=0; i<memoireP.size(); i++) {
			Profil m =  (Profil) memoireP.get(i);
			if (m.sexe == "masculin"){
				memoirePuserHomme.add(m);
			}
			else{
				memoirePuserFemme.add(m);
			}
		}

	}
	
}