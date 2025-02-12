package test_fonctionnel;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;
import personnages.Personnage;
import personnages.Soldat;
import sites.Camp;
import sites.Village;
import personnages.Grade;

public class TestGaulois {
	public static void main(String[] args) {
		// Création de personnages
		//Personnage asterix = new Gaulois("Astérix", 12);
		//Personnage minus = new Romain("Minus", 10);
		//System.out.println(asterix.parler("Bonjour à tous"));
		//System.out.println(minus.parler("UN GAU... UN GAUGAU..."));

		//for (int i = 0; i < 2; i++) {

		//	asterix.frapper(minus);
		//	minus.frapper(asterix);
		//}
	//	asterix.frapper(minus);
		
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);

        Soldat minus = new Soldat("Minus", 2, Grade.CENTURION);
        Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
        Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
        Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
        Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);

        // Création des sites
        Village village = new Village(vercingetorix);
        Camp camp = new Camp(minus);

        // Ajout des soldats dans le camp
        camp.ajouterSoldat(brutus);
        camp.ajouterSoldat(milexcus);
        camp.ajouterSoldat(tulliusOctopus);
        camp.ajouterSoldat(ballondebaudrus); // Devrait afficher que le camp est plein

        // Ajout des habitants dans le village
        village.ajouterHabitant(agecanonix);
        village.ajouterHabitant(assurancetourix);
        village.ajouterHabitant(asterix);
        village.ajouterHabitant(obelix); // Devrait afficher que le village est plein
        village.ajouterHabitant(prolix); 
		
        village.afficherVillageois();
        camp.afficherCamp();
        Druide panoramix= new Druide("panoramix",6);
        panoramix.fabriquerPotion();
		
	}
}