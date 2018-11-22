package Personne;

public class Joueur extends Personne{
private int numMaillot;
private String poste;

public Joueur() {
	setAll();
}


public void Afficher() {
	System.out.println("Nom Joueur : " + nom);
	System.out.println("Prenom Joueur : " + prenom);	
	System.out.println("Age Joueur : " + age);	
	System.out.println("Numero Maillot : " + numMaillot);	
	System.out.println("Poste : " + poste);	
	}

public void setNom() {
	System.out.print("Saisir le nom du joueur  ");
	nom = Sc.nextLine();
}

public void setPrenom() {
	System.out.print("Saisir le prenom du joueur  ");
	prenom = Sc.nextLine();	
	}

public void setAge() {
	System.out.print("Saisir l'age du joueur  ");
	age = Sc.nextInt();
}

public void setNumMaillot() {
	System.out.print("Saisir le numero de maillot  ");
	numMaillot = Sc.nextInt();
}

public int getNumMaillot() {
	return numMaillot;
}

public void setPoste() {
	System.out.print("Saisir la poste du joueur  ");
	poste = Sc.nextLine();
	poste = Sc.nextLine();
}

public String getPoste() {
	return poste;
}


public void setAll() {
	setNom();
	setPrenom();
	setAge();
	setNumMaillot();
	setPoste();
}


}
