package personnages;

public class Gaulois {
	//Attributs 
	private String nom ;
	private int force;
	
	//Constructeur 
    public Gaulois(String nom, int force){
    	this.nom=nom;
    	this.force=force;
    }
 // Getter pour le nom
    
    public String getNom() {
        return nom;
    }
    public String parler(String texte) {
    	return "Le gaulois "+ this.nom+": <<"+texte+">>";
    }
    public static void main(String[] args) {
     Gaulois asterix = new Gaulois("Astérix",8);
   	 System.out.println(asterix.getNom());
   	 
	}
}
