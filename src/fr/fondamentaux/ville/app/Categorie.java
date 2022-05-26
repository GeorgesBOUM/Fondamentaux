package fr.fondamentaux.ville.app;

public enum Categorie {
	INCONNUE, VILLAGE, PETITE_VILLE, VILLE_MOYENNE, GRANDE_VILLE, METROPOLE;

	@Override
	public String toString() {
		return name().equals("METROPOLE")?"métropole":name().toLowerCase();
	}
	
	
}
