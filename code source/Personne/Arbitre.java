package Personne;

public class Arbitre extends Personne{
private int nbMatches;

public Arbitre(String nom,int age,int NbMathches){
     super(nom,age);
     this.nbMatches= NbMathches; // Contient le nombre de matchs deja deroule par un arbitre avant qu'il est ajoute aux base de donnes
}

	public void Afficher() {
		System.out.println("Nom Arbitre : " + nom);	
		System.out.println("Age Arbitre : " + age);	
		System.out.println("Nombre de Matches :"+ nbMatches);
		}
	
    // Le nombre de matches s'incremente automatiquement si un arbitre vient de se charger de la deroulement d'un match
   public void IncrementNbMatches() {
	   nbMatches++;
   }
   
    // on en besoin a l'affichage d'un match
    public String getNom() {
    	return nom;
    }
    
    }