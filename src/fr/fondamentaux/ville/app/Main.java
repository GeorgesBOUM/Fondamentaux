package fr.fondamentaux.ville.app;

public class Main {

	public static void main(String[] args) {
		Ville marseille;
		try {
			marseille = new Ville("Marseille", "France", 861635);
			System.out.println(marseille);
			System.out.println(marseille.description());
		} catch (NombreHabitantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Ville indefinie = new Ville();
		System.out.println(indefinie);
		System.out.println(indefinie.description());
		
		try {
			Capitale paris = new Capitale("Paris", "France", 2165423, "La tour eiffel");
			System.out.println(paris);
			System.out.println(paris.description());
		} catch (NombreHabitantException e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		System.out.println("Nombre de villes créées : " + Ville.getNombreDeVillesCreees());
	}

}
