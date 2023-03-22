import java.util.ArrayList;

public class Profil {
	
	String identifiant;
	String nom;
	String prenom;
	int taille;
	int age;
	String adresse_mail;
	String sexe;
	String orientation_sexuelle;
	String lien_photoProfil;
	String description;

	ArrayList<String> Gouts; // question sur la musique, question sur la nourriture, choix âge, choix taille, choix sexe
	ArrayList<String> Hobbies; // Sport ? Jeux ? Autre Activité ?
	ArrayList<String> aEviter; // Allergie ?

	
	public Profil(String id, String nom, String prenom, int age,int taille, String adresse_mail, String sexe, String orienta_sex, String lien_photoP, String descri) {
		this.identifiant= id;
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.taille=taille;
		this.adresse_mail = adresse_mail;
		this.sexe=sexe;
		this.orientation_sexuelle=orienta_sex;
		this.lien_photoProfil=lien_photoP;
		this.description=descri;
		
		ArrayList<String> Gouts= new ArrayList<>();
		ArrayList<String> Hobbies= new ArrayList<>();
		ArrayList<String> aEviter= new ArrayList<>();
	}
	
	
	@Override
	public compareTo(Object o) {
		
	}
}
