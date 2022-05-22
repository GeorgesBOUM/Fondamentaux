package fr.fondamentaux.app;

public class Main {

	public static void main(String[] args) {
		Ville marseille = new Ville("Marseille", "France", 861635);
		System.out.println(marseille);
		System.out.println(marseille.description());
		Ville indefinie = new Ville();
		System.out.println(indefinie);
		System.out.println(indefinie.description());
		System.out.println("Nombre de villes créées : " + Ville.getNombreDeVillesCreees());
	}

}