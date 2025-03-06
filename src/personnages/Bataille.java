package personnages;

public class Bataille {
	private String contexte;
    private String combattants;
    private String preparation;
    private String descriptionCombat;
    private String resultat;

    public Bataille(String contexte, String combattants, String preparation, String descriptionCombat, String resultat) {
        this.contexte = contexte;
        this.combattants = combattants;
        this.preparation = preparation;
        this.descriptionCombat = descriptionCombat;
        this.resultat = resultat;
    }

    public void raconter() {
        System.out.println("Contexte : " + contexte);
        System.out.println("Combattants : " + combattants);
        System.out.println("Préparation : " + preparation);
        System.out.println("Description du combat : " + descriptionCombat);
        System.out.println("Résultat : " + resultat);
    }
}
