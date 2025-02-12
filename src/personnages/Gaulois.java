package personnages;

public class Gaulois extends Personnage {
	private double effetPotion = 1;
			
	// Constructeur
	public Gaulois(String nom, int force) {
		super(nom, force); // Appelle le constructeur de Personnage
	}

    @Override
    protected int donnerForceCoup() {
    	int forceCoup = (int) (force * effetPotion / 3);
    	if (effetPotion > 1) {
        	effetPotion -= 0.5;
    	}
    	return forceCoup;
    }
    
	// Implémentation de donnerAuteur pour un Gaulois
	@Override
	protected String donnerAuteur() {
		return "Le gaulois " ;
	}
	public void boire (int forcePotion){
		effetPotion = forcePotion;
	}
}
