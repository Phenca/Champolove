import java.util.ArrayList;

public class Profil {
	
	String nom;
	String prenom;
	int age;
	String sexe;
	String orientation_sexuelle;
	String lien_photoProfil;
	String description;
	
	ArrayList<String> Gouts; // question sur la musique, question sur la nourriture
	ArrayList<String> Hobbies;
	ArrayList<String> aEviter;
	
	public Profil(String nom, String prenom, int age, String sexe, String orienta_sex, String lien_photoP, String descri) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.sexe=sexe;
		this.orientation_sexuelle=orienta_sex;
		this.lien_photoProfil=lien_photoP;
		this.description=descri;
		
		ArrayList<String> Gouts= new ArrayList<>();
		ArrayList<String> Hobbies= new ArrayList<>();
		ArrayList<String> aEviter= new ArrayList<>();
	}
	
}
