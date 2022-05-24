package fr.fondamentaux.animal.app;

public class Main {

	public static void main(String[] args) {
		Loup l = new Loup("Gris bleuté", 20);
	    l.boire();
	    l.manger();
	    l.seDeplacer();
	    l.crier();
	    System.out.println(l);
	}

}
