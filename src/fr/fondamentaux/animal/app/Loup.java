package fr.fondamentaux.animal.app;

public class Loup extends Canin {
	
	public Loup() {

	}

	public Loup(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}
	
	@Override
	public void crier() {
		System.out.println("Je hurle à la Lune en faisant ouhouh !");
	}
}
