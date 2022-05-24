package fr.fondamentaux.animal.app;

public class Lion extends Felin {
	
	public Lion() {

	}

	public Lion(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}
	
	@Override
	public void crier() {
		System.out.println("Je rugis dans la savane !");
	}
}
