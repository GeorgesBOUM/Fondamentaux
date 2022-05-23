package fr.fondamentaux.app;

public class Capitale extends Ville {
	private String monument;
	public Capitale() {
		super();
		this.monument = "aucun";
	}
	public Capitale(String nom, String pays, int nombreHabitants, String monument) {
		super(nom, pays, nombreHabitants);
		this.monument = monument;
	}
	public String getMonument() {
		return monument;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}
	@Override
	public String description() {
		return super.description() + this.getMonument() + " en est un monument.";
	}
	@Override
	public String toString() {
		return super.getNom() + 
				"[Pays=" + super.getPays() + ", Nombre d'abitants=" + getNombreHabitants() + 
				"Monument=" + this.getMonument() + "]";
	}
	
}
