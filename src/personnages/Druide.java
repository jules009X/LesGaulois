package personnages;


public class Druide extends Gaulois {
	private Chaudron chaudron;

	public Druide(String nom, int force) {
		super(nom, force);
		this.chaudron = new Chaudron();
	}

	public void fabriquerPotion() {
		chaudron.creerPotion();
		System.out.println("Le gaulois " + this.getNom() + "« J'ai concocté "+
				+chaudron.getNbDose() + " doses de potion magique. Elle a une force de " + chaudron.getForce()+ ". ».");

	}

	public void booster(Gaulois gaulois) {
		if (chaudron.resteDose()) {
			if ("Obelix".equals(gaulois.getNom())) {
				System.out.println("Non, Obélix Non !... Et tu le sais très bien !");
			} else {
				System.out.println("Tiens" + gaulois.getNom() + " un peu de potion magique.");
				gaulois.boire(chaudron.drinkDose());
			}
		}

	}

}
