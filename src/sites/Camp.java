package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[50];
	private int nbSoldats = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain.");
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldats < soldats.length) {
			soldats[nbSoldats] = soldat;
			nbSoldats++;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom());
		} else {
			// System.out.println("Le camp est plein, impossible d'ajouter plus de soldats
			// !");
			commandant.parler("Désolée " + soldat.getNom() + "notre camp est complet");
		}
	}

	public void afficherCamp() {
		System.out.println("Le camp dirigé par  " + commandant.getNom() + "contient les soldats :");
		for (int i = 0; i < nbSoldats; i++) {
			System.out.println("- " + soldats[i].getNom());

		}

	}

	public void changerCommandant(Soldat soldat) {
		commandant.parler(
				"Je ne suis pas sulffisament gradé pour prendre la direction du camp romain  " + soldat.getNom());
		commandant = soldat;
		commandant.parler("Moi je prends la direction du camp romain  ");
	}
}
