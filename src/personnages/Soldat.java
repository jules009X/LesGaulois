package personnages;

public class Soldat extends Romain {

	private Protection[] equipement = new Protection[3];
	private int nbEquipement = 0;
	private Grade grade;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}

	public Grade getGrade() {
		return grade;
	}

	@Override
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force <= 0) {
			force = 0;
			parler("J'abandonne...");
		} else {
			parler("Aïe !");
		}
	}

	public void sequiper(Protection protection) {

		for (int i = 0; i < nbEquipement; i++) {
			if (nbEquipement == 3) {
				System.out.println("j'ai déjà tous les equipements ");
			} else if (protection == equipement[i]) {
				System.out.println("non je l'ai déjà ");
			} else {
				System.out.println(donnerAuteur() + " s'equipe avec un " + protection);
				equipement[nbEquipement] = protection;
				nbEquipement++;
			}

		}
	}

	@Override
	protected String donnerAuteur() {
		return "Le " + grade + " ";
	}
}
