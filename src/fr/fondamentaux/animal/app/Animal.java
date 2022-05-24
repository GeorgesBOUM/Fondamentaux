package fr.fondamentaux.animal.app;

public abstract class Animal {

	protected int poids;
	protected String couleur;

	protected void manger() {
		System.out.println("Je mange de la viande");
	}

	protected void boire() {
		System.out.println("Je bois de l'eau");
	}

	abstract void seDeplacer();

	abstract void crier();

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String toString() {
		return "Je suis un objet de la " + this.getClass() + ", je suis " + this.getCouleur() + ", je pèse "
				+ this.getPoids();
	}
}
