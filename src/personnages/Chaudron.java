package personnages;

import java.security.SecureRandom;

public class Chaudron {

	private int forcePotion = 1;
	private int nbDose = 0;
	private static final int FORCE_MIN = 2;
	private static final int FORCE_MAX = 6;
	private static final int DOSE_MIN = 1;
	private static final int DOSE_MAX = 3;
	private SecureRandom random = new SecureRandom();

	public void creerPotion() {
		this.forcePotion = random.nextInt(FORCE_MIN, FORCE_MAX);
		this.nbDose = random.nextInt(DOSE_MIN, DOSE_MAX);

		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getForce() {
		return forcePotion;
	}

	public int getNbDose() {
		return nbDose;
	}

	public boolean resteDose() {
		return nbDose > 0;
	}

	public int drinkDose() {
		int forceDose = 1;
		if (resteDose()) {
			nbDose--;
			forceDose = forcePotion;
		} else {
			System.out.println("nous n'avons plus de dose desolée");
		}
		return forceDose;
	}
}