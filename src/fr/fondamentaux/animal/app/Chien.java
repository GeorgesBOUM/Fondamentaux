package fr.fondamentaux.animal.app;

public class Chien extends Canin {

	public Chien() {

	}

	public Chien(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	public void crier() {
		System.out.println("J'aboie!");
	}

}
