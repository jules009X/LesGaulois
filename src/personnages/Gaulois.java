package personnages;

public class Gaulois extends Personnage {

	// Constructeur
	public Gaulois(String nom, int force) {
		super(nom, force); // Appelle le constructeur de Personnage
	}

	// Implémentation de donnerAuteur pour un Gaulois
	@Override
	protected String donnerAuteur() {
		return "Le gaulois " ;
	}
}
