package application;
import java.util.ArrayList;

public class Profil {

	String nom;
	String prenom;
	int taille;
	String date_naissance;
	int age = 0;
	String adresse_mail;
	String sexe;
	String lien_photoProfil;
	String description;
	int matcher = 0;
	String mdp;
	String VotrePreference="mixte";

	public ArrayList<String> Gouts; // question sur la musique, question sur la nourriture, choix taille
	ArrayList<String> Hobbies; // Sport ? Jeux ? Autre Activité ?
	
	public ArrayList<Profil> listeDesProfilsOptimale;
	public ArrayList<Profil> memoireMatcher;


	public Profil(String nom, String prenom, String date_naissance,int taille, int age, String adresse_mail, String sexe, String lien_photoP, String descri, int matcher, String motsDePasse) {
		this.nom=nom;
		this.prenom=prenom;
		this.date_naissance=date_naissance;
		this.taille=taille;
		this.age=0;
		this.adresse_mail = adresse_mail;
		this.sexe=sexe;
		this.lien_photoProfil=lien_photoP;
		this.description=descri;
		this.matcher = 0;
		this.mdp=motsDePasse;
		
		this.Gouts= new ArrayList<>();
		this.Hobbies= new ArrayList<>();
		this.listeDesProfilsOptimale=new ArrayList<>();
		this.memoireMatcher = new ArrayList<>();
		
		
	}


	public Double compareTo(Profil o) {
		Double res=0.0;
		int totalDesGouts=0;
		int totalDesHobbies=0;


		for(int i=0; i<this.Gouts.size(); i++) {
			for(int j=0; j<o.Gouts.size(); j++) {
				if(this.Gouts.get(i).equals(o.Gouts.get(j))) {
					res+=1;
				}
			}
		}
		totalDesGouts=(this.Gouts.size()+o.Gouts.size());
		
		
		for(int i=0; i<this.Hobbies.size(); i++) {
			for(int j=0; j<o.Hobbies.size(); j++) {
				if(this.Hobbies.get(i).equals(o.Hobbies.get(j))) {
					res+=1;
				}
			}
		}
		
		totalDesHobbies=(this.Hobbies.size()+o.Hobbies.size());


		return res/((totalDesGouts + totalDesHobbies) - res); ///ça donne un pourcentage, ce qu'il faut comprendre c'est que le deuxième res qui est a l extreminite sert juste a eleminer les doublons des points communs dans les totals de chaque gouts, hobbies et aEviter
	}
}
