package fr.fondamentaux.animal.app;

public class Tigre extends Felin {

	public Tigre() {

	}

	public Tigre(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}
	
	@Override
	public void crier() {
		System.out.println("Je grogne très fort !");
	}

}
