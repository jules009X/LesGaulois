package personnages;

public class Romain extends Personnage {

	// Constructeur
	public Romain(String nom, int force) {
		super(nom, force); // Appelle le constructeur de Personnage
	}

	// Implémentation de donnerAuteur pour un Romain
	@Override
	protected String donnerAuteur() {
		return "Le romain " ;
	}
	
}
