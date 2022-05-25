package fr.fondamentaux.animal.app;

public class Main {

	public static void main(String[] args) {
		Loup l = new Loup("Gris bleuté", 20);
	    l.boire();
	    l.manger();
	    l.seDeplacer();
	    l.crier();
	    System.out.println(l);
	    
	    Chien c = new Chien("Noir", 15);
	    c.boire();
	    c.manger();
	    c.seDeplacer();
	    c.crier();
	    System.out.println("--------------------------------------------");
	    //Les méthodes de l'interface
	    c.faireCalin();
	    c.faireLeBeau();
	    c.faireLechouille();
			
	    System.out.println("--------------------------------------------");
	    //Utilisons le polymorphisme de notre interface
	    Rintintin r = new Chien();
	    r.faireLeBeau();
	    r.faireCalin();
	    r.faireLechouille();
	}

}
