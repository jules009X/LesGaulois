package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Village {
	private Gaulois chef;
	private static final int NB_GAULOIS_MAX = 4;
	private Gaulois[] gaulois = new Gaulois[NB_GAULOIS_MAX];
	private int nbHabitants;

	public Village(Gaulois Chef) {
		this.chef = Chef;
		Chef.parler("Je suis un grand guerrier et je vais créer mon village");
	}

	public Gaulois getChef() {
		return chef;

	}

	public void ajouterHabitant(Gaulois habitant) {
		if (nbHabitants < gaulois.length) {
			gaulois[nbHabitants] = habitant;
			nbHabitants++;
			chef.parler(" bienvenue " + habitant.getNom());
		} else {
			// System.out.println("Le village est plein, impossible d'ajouter plus
			// d'habitants !");

			chef.parler(" Désolé " + habitant.getNom() + " Mon village est bien rempli");
		}
	}

	public void afficherVillageois() {
		System.out.println("Le village  de " + chef.getNom() + "est habité par :");
		for (int i = 0; i < gaulois.length; i++) {
			System.out.println("- " + gaulois[i].getNom());

		}
	}

	public void changerCommandant(Gaulois gaulois) {
		chef.parler("Je laisse mon bouclier au grand " + gaulois.getNom());
		chef = gaulois;
		chef.parler(" Merci ");
	}

}