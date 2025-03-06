package personnages;

public class Conteur {
	private String nom;

    public Conteur(String nom) {
        this.nom = nom;
    }

    public void raconterBataille(Bataille bataille) {
        System.out.println("Je suis " + nom + ", et voici une bataille :");
        bataille.raconter();
    }
}
