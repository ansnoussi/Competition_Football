package Personne;

public class Arbitre extends Personne{
private int nbMatches;

public Arbitre(String nom,int age,int NbMathches){
     super(nom,age);
     this.nbMatches= NbMathches;
}

	public void Afficher() {
		System.out.println("Nom Arbitre : " + nom);	
		System.out.println("Age Arbitre : " + age);	
		System.out.println("Nombre de Matches :"+ nbMatches);
		}
	
    // Le nombre de matches s'incr�mente automatiquement si un arbitre vient de se charge de la d�roulement d'un match
   void IncrementNbMatches() {
	   nbMatches++;
   }
   
    // on en besoin � l'affichage d'un match
    public String getNom() {
    	return nom;
    }
    
    }

