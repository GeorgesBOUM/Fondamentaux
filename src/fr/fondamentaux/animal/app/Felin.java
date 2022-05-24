package fr.fondamentaux.animal.app;

public abstract class Felin extends Animal {

	@Override
	void seDeplacer() {
		System.out.println("Je me déplace seul");
	}

	@Override
	abstract void crier();

}
