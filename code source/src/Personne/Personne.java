package Personne;
import java.util.*;

public abstract class Personne {
protected String nom;
protected String prenom;
protected int age;

static public Scanner Sc = new Scanner(System.in);

public Personne() {
}

public abstract void Afficher();

public String getNom() {
	return nom;
}

public String getPrenom() {
	return prenom;
}

public int getAge() {
return age;
}

public void setNom() {
	System.out.print("Saisir le nom ");
	nom = Sc.nextLine();
}

public void setPrenom() {
	System.out.print("Saisir le prenom ");
	prenom = Sc.nextLine();	
	}

public void setAge() {
	System.out.print("Saisir l'age ");
	age = Sc.nextInt();
}

public void setAll() {
	setNom();
	setPrenom();
	setAge();
}

}
