package fr.fondamentaux.animal.app;

public class Chien extends Canin implements Rintintin {

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

	@Override
	public void faireCalin() {
		System.out.println("je fais un gros câlin");
	}

	@Override
	public void faireLechouille() {
		System.out.println("je fais des léchouilles");
	}

	@Override
	public void faireLeBeau() {
		System.out.println("je fais le beau");
	}

}
