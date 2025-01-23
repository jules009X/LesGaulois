package personnages;

public abstract class Personnage {
	private String nom;
	private int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	// Getter pour le nom
	public String getNom() {
		return nom;
	}

	// Méthode pour parler
	public void parler(String texte) {
		System.out.println( donnerAuteur() +getNom()+ ": <<" + texte + ">>");
	}

	// Méthode pour frapper un adversaire
	// public void frapper(Personnage adversaire) {
	// System.out.println(nom + " envoie un coup à " + adversaire.getNom());
	// int forceDuCoup = this.force / 3;
	// adversaire.recevoirCoup(forceDuCoup);
	// }
	public void frapper(Personnage adversaire) {
		System.out.println(donnerAuteur() + " donne un grand coup au " + adversaire.donnerAuteur());
		adversaire.recevoirCoup(force / 3);
	}

	// Méthode pour recevoir un coup
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force <= 0) {
			force = 0;
		     parler("J'abandonne...");
		} else {
			parler("Aïe !");
		}
	}

	// Méthode protégée pour fournir l'auteur (personnalisation selon la
	// sous-classe)
	protected abstract String donnerAuteur();
}
