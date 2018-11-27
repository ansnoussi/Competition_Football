import Personne.*;
import java.util.ArrayList;

public class Equipe {

	// Chaque Equipe est composee par un ensemble de joueurs titulaires, d'autres remplaçants et Entraineur.

        public String nom;
	    private ArrayList <Joueur> titulaires;
	    private ArrayList <Joueur> remplacants;
	    private Entraineur entraineur ;
	    private int victoires;
	    private int defaites;
	    private int nulles;
	    
	   public Equipe(String nom){
	    	victoires=0;
	    	defaites=0;
	    	nulles=0;
	    	this.nom= nom;
	        this.titulaires = new ArrayList <>();
	        remplacants = new ArrayList<>();
	    }
	    
	    public void addTitulaire(Joueur J) {
	    	titulaires.add(J);
	    }
	    
	    public void addRemplacant(Joueur J) {
	     remplacants.add(J);
	    }
	    
	    public void addEntraineur(Entraineur E) {
	    	entraineur=E;
	    }
	    
	    public void Affiche() {
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
	    
	    // Un equipe peut changer son nom
	    public void setNom(String nom) {
	    	this.nom = nom;
	    }
	    
	    public ArrayList<Joueur> getTitulaires() {
	    	return titulaires;
	    }
	    
	    public ArrayList<Joueur> getRemplacants() {
	    	return remplacants;
	    }
	    
	    public void afficherStatistiques() {
	    	System.out.println(nom);
	    	System.out.println("Nombre de matchs gagnés = " + victoires);
	    	System.out.println("Nombre de matchs nulles = " + nulles);
	    	System.out.println("Nombre de matchs perdus  = " + defaites);
	    	
	    }
	    
	    public void incrementVictoires() {
	    	victoires++;
	    }
	    
	    public void incrementDefaites() {
	    	defaites++;
	    }
	    
	    public void incrementNulles() {
	    	nulles++;
	    }
	    
	    // On va ajouter deleteJoueur aussi !!
  
	}
