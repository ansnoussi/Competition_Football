package Sport;
import Personne.*;
import java.util.ArrayList;

public class Equipe {

	// Chaque Equipe est composee par un ensemble de joueurs titulaires, d'autres remplacants et Entraineur.

        public String nom;
	    private ArrayList <Joueur> titulaires;
	    private ArrayList <Joueur> remplacants;
	    private Entraineur entraineur;
	    private int victoires;
	    private int defaites;
	    private int nulles;
	    private int points;
	    
	    
	   public Equipe(String nom,Entraineur entraineur){
		    this.nom= nom;
		    this.entraineur=entraineur;
		    titulaires = new ArrayList <>();
	        remplacants = new ArrayList<>();
	    	victoires=0;
	    	defaites=0;
	    	nulles=0;
	    	points=0;
	       
	    }
	    
	    public void addTitulaire(Joueur J) {
	    	titulaires.add(J);
	    }
	    
	    public void addRemplacant(Joueur J) {
	     remplacants.add(J);
	    }
	    
	    
	    // Une equipe peut changer son entraineur
	    public void setEntraineur(Entraineur E) {
	    	entraineur=E;
	    }
	    
	    // Calculer le nombre de points de l'equipe
	    public void setPoints() {
	    	points = 3*victoires + nulles;
	    }
	    
	    //Un joueur peut changer d'equipe sera donc supprimer de son equipe actuel 
	    public void deleteJoueur(Joueur j) {
	    	for(int i=0;i<titulaires.size();i++) {
	    		if(titulaires.get(i).equals(j))
	    	 titulaires.remove(j);
	       }
	    
	    for(int i=0;i<remplacants.size();i++) {
    		if(remplacants.get(i).equals(j))
    	 remplacants.remove(j);
    		}
        }
	    
	    // Afficher la liste de joueurs d'une equipe donnee
	    public void Affiche() {
	    	System.out.println("********* " + nom + "*********");
	    	System.out.println("** Liste des Joueurs Titulaires **");
	    	System.out.println();
	    	for (int i=0;i<titulaires.size();i++) {
	    		System.out.println();
	    		titulaires.get(i).Afficher();
	    		System.out.println();
	    }
	    	System.out.println("** Liste des Joueurs Remplacants **");
	    	System.out.println();
	    	for(int i=0;i<remplacants.size();i++) {
	    		System.out.println();
	    		remplacants.get(i).Afficher();
	    		System.out.println();
	    	}
	    }
	    
	    
	    public void afficherStatistiques() {
	    	System.out.println("    **** " + nom + " ****");
	    	System.out.println("Nombre de matchs gagnes = " + victoires);
	    	System.out.println("Nombre de matchs nulles = " + nulles);
	    	System.out.println("Nombre de matchs perdus  = " + defaites);
	    	System.out.println("Nombre de points = " + points);
	    	
	    }
	    
	    
	    public void incrementVictoires() {
	    	victoires++;
	    	points+=3;
	    }
	    
	    
	    public void incrementDefaites() {
	    	defaites++;
	    }
	    
	    
	    public void incrementNulles() {
	    	nulles++;
	    	points+=1;
	    }
	    
	    // Verifie l'existence d'une joueur e une equipe grace a son nom pour eviter la redondance de donnee
		public boolean existeJoueur(String name) {
		   	for(int i=0;i<titulaires.size();i++) {
		       if(titulaires.get(i).getNom().equals(name))
		    		return true;
		    	}
		    for(int i=0;i<remplacants.size();i++) {
		    	if(remplacants.get(i).getNom().equals(name))
		    		return true;
		    }
		     return false;
		  }
		 
		
		// Verifie si un num de maillot appratient deja a un joueur d'une equipe donnee car deux joueurs ne peuvent pas porter le meme numero
		 public boolean existeNumMaillot(int num) {
		   for(int i=0;i<titulaires.size();i++) {
		    	if(titulaires.get(i).getNumMaillot() == num)
		    		return true;
		    	}
		   for(int i=0;i<remplacants.size();i++) {
		    	if(remplacants.get(i).getNumMaillot() == num)
		    		return true;
		    	}
		    return false;
		   }
		 
		// Necessaire pour le MAJ d'un joueur donnee et pour eviter la redondance lors de saisie
	 public Joueur getJoueurByName(String name) {
		  for(int i=0;i<titulaires.size();i++) {
		    if (titulaires.get(i).getNom().equals(name))
			   return titulaires.get(i);
		 }
		  for(int i=0;i<remplacants.size();i++) {
		   if (remplacants.get(i).getNom().equals(name))
			   return remplacants.get(i);
	    }
			   return null;	   
    }		 
	    
	    
	    public ArrayList<Joueur> getTitulaires() {
	    	return titulaires;
	    }
	    
	    public ArrayList<Joueur> getRemplacants() {
	    	return remplacants;
	    }
	   
	   
	  public  Entraineur getEntraineur() {
		   return entraineur;
	   }
	  
	  
	  public int getPoints() {
		  return points;
	  }
	    
  
	}