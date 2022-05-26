package fr.fondamentaux.ville.app;

/**
 * Il faudra: penser à séparer les traitements du "model", le "calcul de la
 * catégorie par exemple, etc... la catégorie pourrait être intégrée dans une
 * énum voir la comparaison des objets (la méthode compareTo)
 */
public class Ville {

	private static int nombreDeVillesCreees = 0;
	private String nom;
	private String pays;
	private int nombreHabitants;
	private String categorie;

	public Ville() {
		System.out.println("Creation d'une ville sans paramèrtres");
		this.nom = "Inconnu";
		this.pays = "Inconnu";
		this.nombreHabitants = 0;
		this.categorie = "Inconnue";
		nombreDeVillesCreees += 1;
	}

	public Ville(String nom, String pays, int nombreHabitants) throws NombreHabitantException{
		if (nombreHabitants < 0) {
			throw new NombreHabitantException();
		} else {
			System.out.println("Creation d'une ville avec paramèrtres");
			this.nom = nom;
			this.pays = pays;
			this.nombreHabitants = nombreHabitants;
			this.setCategorie(nombreHabitants);
			nombreDeVillesCreees += 1;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNombreHabitants() {
		return nombreHabitants;
	}

	public void setNombreHabitants(int nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public static int getNombreDeVillesCreees() {
		return nombreDeVillesCreees;
	}

	public void setCategorie(int nombreHabitants) {
		if (nombreHabitants < 1000) {
			this.categorie = "village";
		} else if (nombreHabitants >= 1000 && nombreHabitants < 5000) {
			this.categorie = "petite ville";
		} else if (nombreHabitants >= 5000 && nombreHabitants < 25000) {
			this.categorie = "ville moyenne";
		} else if (nombreHabitants >= 25000 && nombreHabitants < 100000) {
			this.categorie = "grande ville";
		} else if (nombreHabitants >= 100000) {
			this.categorie = "métropole";
		}
	}

	public String description() {
		return this.getNom() + " est une ville de " + this.getPays() + " classée comme " + this.getCategorie() + ". ";
	}

	@Override
	public String toString() {
		return getNom() + "[Pays=" + getPays() + ", Nombre d'abitants=" + getNombreHabitants() + "]";
	}

}
