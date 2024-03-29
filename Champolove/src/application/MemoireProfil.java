package application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MemoireProfil {

	int age = 0;
	ArrayList<Profil> memoirePHomme;
	ArrayList<Profil> memoirePFemme;
	Profil pUser;
	ArrayList<Profil> memoirePMixtes;
	ArrayList<Profil> memoireUtilisateur;
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
	Profil p11;
	Profil p12;
	Profil p13;
	Profil p14;
	Profil p15;
	Profil p16;
	Profil p17;
	Profil p18;
	Profil p19;
	Profil p20;
	Profil p21;
	Profil p22;
	Profil p23;
	Profil p24;
	Profil p25;
	Profil p26;
	Profil p27;
	Profil p28;
	Profil p29;
	Profil p30;

	TreeMap<Double,ArrayList<Profil>> dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale;


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
		dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale=new TreeMap<Double,ArrayList<Profil>>(Collections.reverseOrder());
		pUser = new Profil(null, null, null, 0, age , null, null, null, null, 0, null);
		memoirePMixtes = new ArrayList<>();
		p1 = new Profil("Levy", "Adolphe", "04/03/2002", 179, age, "Adolphe.Levy@yopmail.com", "masculin", "file:src/ressources/img_profil/Levy_Adolphe.png", "Je suis un passionné de jeux vidéo et de sport, j'adore les compétitions et les défis. J'aime passer du temps avec mes amis, organiser des soirées et partager des moments de rigolade. Je suis ouvert d'esprit, honnête et j'aime rencontrer de nouvelles personnes. Si tu cherches un partenaire de jeu ou un ami pour partager des soirées animées, fais-moi signe !", 0,"courgette1");
		memoirePMixtes.add(p1);
		p2 = new Profil("Hamel", "Bertrand", "24/01/1983", 183, age, "Bertrand.Hamel@yopmail.com", "masculin", "file:src/ressources/img_profil/Hamel_Bertrand.png", "Je suis un homme passionné de cuisine et de peinture, j'aime créer et explorer de nouvelles saveurs et couleurs. Je suis également un amoureux de la nature, j'aime les randonnées et les balades en forêt. Je suis un homme calme, attentionné et romantique, à la recherche d'une femme qui partage mes passions et mes valeurs. Si tu cherches un partenaire de vie qui te fera découvrir de nouveaux horizons, contacte-moi ", 0,"courgette2");
		memoirePMixtes.add(p2);
		p3 = new Profil("Hardy", "Rochelle", "03/11/1997", 165, age, "Rochelle.Hardy@yopmail.com", "féminin", "file:src/ressources/img_profil/Hardy_Rochelle.png", "Je suis une jeune femme passionnée de chant depuis mon enfance. J'adore chanter pour exprimer mes émotions et raconter des histoires. En dehors de ma passion pour le chant, j'aime voyager, découvrir de nouvelles cultures et rencontrer de nouvelles personnes. Je suis également une personne attentionnée, fidèle et généreuse, à la recherche d'un homme qui partage mes passions et mes valeurs. Si tu cherches une partenaire de vie qui te fera vibrer au son de sa voix, fais-moi signe ", 0,"courgette3");
		memoirePMixtes.add(p3);
		p4 = new Profil("Thomas", "Antoine", "10/09/2004", 170, age, "Antoine.Thomas@yopmail.com", "masculin", "file:src/ressources/img_profil/Thomas_Antoine.png", "Je suis un jeune homme passionné de cuisine, j'aime cuisiner pour mes amis et ma famille, et explorer de nouvelles recettes. J'apprécie également les sorties culturelles, les musées et les expositions. Je suis un amateur d'art et d'histoire, et j'adore en apprendre davantage sur le monde qui m'entoure. Enfin, j'aime passer du temps avec mes amis, organiser des soirées et partager des moments de convivialité. Si tu cherches un compagnon de vie qui te fera découvrir de nouvelles saveurs et de nouvelles cultures, contacte-moi", 0,"courgette4");
		memoirePMixtes.add(p4);
		p5 = new Profil("Fort", "Lucy", "13/02/1999", 175, age, "Lucy.Fort@yopmail.com", "féminin", "file:src/ressources/img_profil/Fort_Lucy.png", "Je suis une jeune femme dynamique et passionnée par le sport, surtout les sports à sensations comme le surf et le saut en parachute. J'aime aussi chanter pour m'exprimer et partager mes émotions. En dehors de cela, j'adore passer du temps avec mes amis, organiser des soirées et m'amuser. Je suis une personne spontanée, aventurière et joyeuse, à la recherche d'un homme qui partage mes passions et mon énergie. Si tu cherches une partenaire de vie qui te fera vibrer et te surprendra à chaque instant, contacte-moi !", 0,"courgette5");
		memoirePMixtes.add(p5);
		p6 = new Profil("Andre", "Margot", "20/02/1992", 166, age, "Margot.Andre@yopmail", "féminin", "file:src/ressources/img_profil/Andre_Margot.png", "Je suis une femme passionnée par la peinture depuis mon adolescence. J'aime m'exprimer à travers les couleurs et les formes, et créer des œuvres qui racontent des histoires. J'apprécie également la nature, les balades en forêt et les voyages qui m'inspirent dans mon art. Je suis une personne curieuse, sensible et créative, à la recherche d'un homme qui partage mes passions et mes valeurs. Si tu cherches une partenaire de vie qui te fera découvrir des univers colorés et inspirants, fais-moi signe !", 0,"courgette6");
		memoirePMixtes.add(p6);
		p7 = new Profil("Drouet", "Charlie", "16/03/1965", 166, age, "Charlie.Drouet@yopmail", "masculin", "file:src/ressources/img_profil/Drouet_Charlie.png", "Je suis un homme mature et passionné par la musique. Depuis mon adolescence, j'ai appris à jouer de plusieurs instruments et j'adore composer de nouvelles mélodies. La musique est une partie importante de ma vie, elle me permet de m'évader et de m'exprimer. En dehors de cela, j'apprécie les promenades dans la nature, les soirées tranquilles chez moi ou en compagnie de mes amis. Je suis une personne calme, réfléchie et sensible, à la recherche d'une femme qui partage mes passions et mes centres d'intérêts. Si tu cherches un compagnon de vie avec qui tu pourras partager des moments de douceur et de musique, fais-moi signe !", 0,"courgette7");
		memoirePMixtes.add(p7);
		p8 = new Profil("Grandjean", "Michelle", "29/12/1966", 157, age, "Michelle.Grandjean@yopmail.com", "féminin", "file:src/ressources/img_profil/Grandjean_Michelle.png", "Je suis une femme mature et épanouie qui aime la peinture, le jardinage, la marche et la lecture. Ces activités me permettent de me détendre et de me ressourcer, de me connecter à la nature et à mes émotions. J'aime aussi voyager, découvrir de nouvelles cultures et apprendre de nouvelles choses. Je suis une personne bienveillante, ouverte d'esprit et curieuse, à la recherche d'un homme qui partage mes passions et mes valeurs. Si tu cherches une compagne de vie qui te fera découvrir de nouveaux horizons et te fera vibrer, contacte-moi !", 0,"courgette8");
		memoirePMixtes.add(p8);
		p9 = new Profil("Dupuis", "Lambert", "06/04/1967", 174, age, "Lambert.Dupuis@yopmail.com", "masculin", "file:src/ressources/img_profil/Dupuis_Lambert.png", "Je suis un homme mature et passionné par la nature. J'aime passer mes journées à lire, pêcher, chasser ou encore cueillir des champignons en forêt. Ces activités me permettent de me ressourcer, de me reconnecter avec la nature et de vivre des moments simples et authentiques. J'apprécie également la littérature, les voyages et les rencontres qui m'enrichissent et m'inspirent. Je suis une personne honnête, sincère et bienveillante, à la recherche d'une femme qui partage mes centres d'intérêts et mes valeurs. Si tu cherches un compagnon de vie qui te fera découvrir des univers naturels et authentiques, n'hésite pas à me contacter ", 0,"courgette9");
		memoirePMixtes.add(p9);
		p10 = new Profil("Pasquier", "Colette", "01/01/1978", 167, age, "Colette.Pasquier@yopmail.com", "féminin", "file:src/ressources/img_profil/Pasquier_Colette.png", "Je suis une femme de 45 ans qui aime vivre pleinement sa vie. J'aime les jeux vidéo, le sport, les soirées entre amis et la lecture. Ces activités me permettent de me divertir, de me détendre et de me cultiver. J'apprécie également les voyages, la musique et la cuisine qui me permettent de découvrir de nouvelles cultures et de m'enrichir. Je suis une personne souriante, ouverte d'esprit et passionnée, à la recherche d'un homme qui partage mes centres d'intérêts et mes valeurs. Si tu cherches une compagne de vie qui te fera vivre des moments forts et intenses, contacte-moi !", 0,"courgette10");
		memoirePMixtes.add(p10);
		p11 = new Profil("Guillou", "Amélie", "05/09/2003", 164, age, "Amélie.Guillou@yopmail.com", "féminin", "file:src/ressources/img_profil/Guillou_Amélie.png", "Je suis une jeune femme de 19 ans passionnée par le sport et les activités à sensation forte. J'aime le dépassement de soi que cela implique, ainsi que les émotions fortes que cela procure. J'apprécie également les sorties culturelles, car elles me permettent de découvrir de nouveaux horizons et de m'ouvrir l'esprit. Je suis une personne dynamique, enthousiaste et curieuse de tout, à la recherche d'un partenaire de vie qui partage mes passions et mes valeurs. Si tu cherches une complice pour vivre des moments intenses et découvrir de nouveaux univers, n'hésite pas à me contacter !", 0, "courgette11");
		memoirePMixtes.add(p11);
		p12 = new Profil("Marme", "Jennifer", "11/07/1980", 180, age, "Jennifer.Marme@yopmail.com", "féminin", "file:src/ressources/img_profil/Marme_Jennifer.png", "Je suis une femme de 42 ans qui aime profiter de la vie. J'aime le shopping pour le plaisir de découvrir de nouveaux styles, la danse pour me défouler et me sentir vivante, et le vélo pour prendre l'air et profiter de la nature. J'apprécie également les moments de détente et de convivialité avec mes amis et ma famille. Je suis une personne joyeuse, spontanée et généreuse, à la recherche d'un partenaire de vie qui saura me comprendre et m'accompagner dans mes projets. Si tu cherches une femme avec qui partager des moments de complicité et de bonne humeur, n'hésite pas à me contacter !", 0, "courgette12");
		memoirePMixtes.add(p12);
		p13 = new Profil("Rossi", "Dimitri", "25/05/1964", 165, age, "Dimitri.Rossi@yopmail.com", "masculin", "file:src/ressources/img_profil/Rossi_Dimitri.png", "Bonjour, je suis un homme de 58 ans qui aime profiter de la vie et de ses plaisirs simples. J'aime cuisiner pour mes proches, organiser des soirées entre amis, jouer de la musique et composer de nouvelles chansons. J'aime également passer du temps dans mon jardin, observer la nature et cueillir des champignons. J'apprécie les balades en nature et les randonnées pour me ressourcer et rester en forme. Je suis une personne sociable, à l'écoute des autres et prête à partager mes passions avec une femme qui saura me comprendre et m'accepter tel que je suis. Si tu cherches un homme sincère et authentique pour construire une relation solide et durable, n'hésite pas à me contacter !", 0, "courgette13");
		memoirePMixtes.add(p13);
		p14 = new Profil("Chevalier", "Léo", "21/11/2000", 189, age, "Léo.Chevalier@yopmail.com", "masculin", "file:src/ressources/img_profil/Chevalier_Léo.png", "Salut, je suis un jeune homme de 22 ans qui aime s'amuser et découvrir de nouvelles choses. J'adore cuisiner, inventer de nouvelles recettes et partager mes créations avec mes amis. J'aime aussi jouer aux jeux-vidéos, me plonger dans des univers fantastiques et vivre des aventures palpitantes. La lecture est une autre de mes passions, j'aime me plonger dans des romans historiques ou de science-fiction pour m'évader. Enfin, j'apprécie la chasse, un loisir qui me permet de me reconnecter à la nature et de me ressourcer. Si tu es une femme curieuse, ouverte d'esprit et prête à partager des moments de complicité, n'hésite pas à me contacter !", 0, "courgette14");
		memoirePMixtes.add(p14);
		p15 = new Profil("Gicquel", "Suzanne", "21/11/1992", 168, age, "Suzanne.Gicquel@yopmail.com", "féminin", "file:src/ressources/img_profil/Gicquel_Suzanne.png", " ", 0, "courgette15");
		memoirePMixtes.add(p15);
		p16 = new Profil("Bouche", "Ignace", "27/06/2001", 190, age, "Ignace.Bouche@yopmail.com", "masculin", "file:src/ressources/img_profil/Bouche_Ignace.png", " ", 0, "courgette16");
		memoirePMixtes.add(p16);
		p17 = new Profil("Perrot", "Stéphanie", "22/07/1990", 169, age, "Stéphanie.Perrot@yopmail.com", "féminin", "file:src/ressources/img_profil/Perrot_Stéphanie.png", " ", 0, "courgette17");
		memoirePMixtes.add(p17);
		p18 = new Profil("Flament", "Marc", "30/03/2004", 185, age, "Marc.Flament@yopmail.com", "masculin", "file:src/ressources/img_profil/Flament_Marc.png", " ", 0, "courgette18");
		memoirePMixtes.add(p18);
		p19 = new Profil("Henry", "Rose", "06/07/1988", 175, age, "Rose.Henry@yopmail.com", "féminin", "file:src/ressources/img_profil/Henry_Rose.png", " ", 0, "courgette19");
		memoirePMixtes.add(p19);
		p20 = new Profil("Serre", "Mathieu", "21/06/1986", 172, age, "Mathieu.Serre@yopmail.com", "masculin", "file:src/ressources/img_profil/Serre_Mathieu.png", " ", 0, "courgette20");
		memoirePMixtes.add(p20);
		p21 = new Profil("Coulon", "Hyacinthe", "10/06/1979", 162, age, "Hyacinthe.coulon@yopmail.com", "féminin", "file:src/ressources/img_profil/Coulon_Hyacinthe.png", " ", 0, "courgette21");
		memoirePMixtes.add(p21);
		p22 = new Profil("Pons", "Adam", "29/12/1993", 178, age, "Adam.Pons@yopmail.com", "masculin", "file:src/ressources/img_profil/Pons_Adam.png", " ", 0, "courgette22");
		memoirePMixtes.add(p22);
		p23 = new Profil("Vienne", "Gilles", "25/09/1995", 164, age, "Gilles.Vienne@yopmail.com", "masculin", "file:src/ressources/img_profil/Vienne_Gilles.png", " ", 0, "courgette23");
		memoirePMixtes.add(p23);
		p24 = new Profil("Marais", "Catherine", "15/02/1964", 160, age, "Catherine.Marais@yopmail.com", "féminin", "file:src/ressources/img_profil/Marais_Catherine.png", " ", 0, "courgette24");
		memoirePMixtes.add(p24);
		p25 = new Profil("Grosjean", "Hercule", "02/01/2003", 185, age, "Hercule.Grosjean@yopmail.com", "masculin", "file:src/ressources/img_profil/Grosjean_Hercule.png", " ", 0, "courgette25");
		memoirePMixtes.add(p25);
		p26 = new Profil("Maud", "Jolie", "19/08/1992", 175, age, "Jolie.Maud@yopmail.com", "féminin", "file:src/ressources/img_profil/Maud_Jolie.png", " ", 0, "courgette26");
		memoirePMixtes.add(p26);
		p27 = new Profil("Salmon", "Maxime", "27/11/1996", 180, age, "Maxime.Salmon@yopmail.com", "masculin", "file:src/ressources/img_profil/Salmon_Maxime.png", " ", 0, "courgette27");
		memoirePMixtes.add(p27);
		p28 = new Profil("Nelly", "Héloïse", "24/07/1976", 166, age, "Héloïse.Nelly@yopmail.com", "féminin", "file:src/ressources/img_profil/Nelly_Héloïse.png", " ", 0, "courgette28");
		memoirePMixtes.add(p28);
		p29 = new Profil("Aubry", "Léopold", "16/04/1977", 174, age, "Leopold.Aubry@yopmail.com", "masculin", "file:src/ressources/img_profil/Aubry_Léopold.png", " ", 0, "courgette29");
		memoirePMixtes.add(p29);
		p30 = new Profil("Maury", "Ré mi", "09/06/1998", 171, age, "Ré_mi.Maury@yopmail.com", "masculin", "file:src/ressources/img_profil/Maury_Ré_mi.png", " ", 0, "courgette30");
		memoirePMixtes.add(p30);
		
		
		calcul_age(memoirePMixtes, age);

		memoirePHomme = new ArrayList<>();
		memoirePFemme = new ArrayList<>();


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
		ArrayList<Profil> listeAucuneCompatibiliterDonc0DansLeCompareTo=new ArrayList<>();

		if(pUser.VotrePreference=="mixte") {

			for(Profil pno : memoirePMixtes) {

				if(pUser.compareTo(pno)==0.0) {
					System.out.println("abababababab");
					listeAucuneCompatibiliterDonc0DansLeCompareTo.add(pno);
				}else {
					if (dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.containsKey(pUser.compareTo(pno))) {
						dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.get(pUser.compareTo(pno)).add(pno);
					}else {
						ArrayList<Profil> listeDeProfilPourLeDico=new ArrayList<>();
						listeDeProfilPourLeDico.add(pno);
						dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.put(pUser.compareTo(pno), listeDeProfilPourLeDico);
					}

				}

			}

			for(Map.Entry mapentr : dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.entrySet()) {
				System.out.println(mapentr.getKey());
				for(Profil ptruc : ((ArrayList<Profil>)mapentr.getValue())) {
					listeOpti.add(ptruc);
				}
				
			}
			for(Profil p : listeAucuneCompatibiliterDonc0DansLeCompareTo) {
				System.out.println(p.nom);
				listeOpti.add(p);
			}
			System.out.println(listeOpti.size());
			


		}
		else if(pUser.VotrePreference=="homme") {

			for(Profil pno : memoirePHomme) {

				if(pUser.compareTo(pno)==0.0) {
					System.out.println("abababababab");
					listeAucuneCompatibiliterDonc0DansLeCompareTo.add(pno);
				}else {
					if (dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.containsKey(pUser.compareTo(pno))) {
						dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.get(pUser.compareTo(pno)).add(pno);
					}else {
						ArrayList<Profil> listeDeProfilPourLeDico=new ArrayList<>();
						listeDeProfilPourLeDico.add(pno);
						dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.put(pUser.compareTo(pno), listeDeProfilPourLeDico);
					}

				}

			}

			for(Map.Entry mapentr : dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.entrySet()) {
				for(Profil ptruc : ((ArrayList<Profil>)mapentr.getValue())) {
					listeOpti.add(ptruc);
				}
			}
			for(Profil p : listeAucuneCompatibiliterDonc0DansLeCompareTo) {
				System.out.println(p.nom);
				listeOpti.add(p);
			}

		}
		else if(pUser.VotrePreference=="femme") {

			for(Profil pno : memoirePFemme) {

				if(pUser.compareTo(pno)==0.0) {
					System.out.println("abababababab");
					listeAucuneCompatibiliterDonc0DansLeCompareTo.add(pno);
				}else {
					if (dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.containsKey(pUser.compareTo(pno))) {
						dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.get(pUser.compareTo(pno)).add(pno);
					}else {
						ArrayList<Profil> listeDeProfilPourLeDico=new ArrayList<>();
						listeDeProfilPourLeDico.add(pno);
						dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.put(pUser.compareTo(pno), listeDeProfilPourLeDico);
					}

				}

			}

			for(Map.Entry mapentr : dictionnaireTrierDeProfilAvecLeurPourcentageDeAffiniterAvecLeProfilPrincipale.entrySet()) {
				for(Profil ptruc : ((ArrayList<Profil>)mapentr.getValue())) {
					listeOpti.add(ptruc);
				}
			}
			for(Profil p : listeAucuneCompatibiliterDonc0DansLeCompareTo) {
				System.out.println(p.nom);
				listeOpti.add(p);
			}

		}
		return listeOpti;

	}
}
