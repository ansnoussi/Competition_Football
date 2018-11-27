package Personne;

public class Joueur extends Personne{
private int numMaillot;
private String poste;
private String equipe;

public Joueur(String nom,int age,String equipe) {
	super(nom,age);
	this.equipe=equipe;
	setNumMaillot();
    setPoste();
}


public void Afficher() {
	System.out.println("Nom Joueur : " + nom);
	System.out.println("Equipe actuel : "+ equipe);
	System.out.println("Numero Maillot : " + numMaillot);	
	System.out.println("Poste : " + poste);	
	}
	
// Un joueur peut changer son numero de maillot
public void setNumMaillot() {
	System.out.println("Saisir le numero de maillot de " + nom);
	numMaillot = Sc.nextInt();
	Sc.nextLine(); 
}

// un joueur peut changer sa poste de jeu
public void setPoste() {
	System.out.println("Saisir la poste de " + nom);
	poste = Sc.nextLine();
}

// Un joueur peut changer d'equipe
public void setEquipe(String E) {
	equipe = E;
}

public int getNumMaillot() {
	return numMaillot;
}

public String getEquipe() {
	return equipe;
}

public String getNom() {
	return nom;
}

}
