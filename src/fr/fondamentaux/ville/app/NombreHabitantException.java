package fr.fondamentaux.ville.app;

public class NombreHabitantException extends Exception {

	private static final long serialVersionUID = 1L;

	public NombreHabitantException() {
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
	}

}
