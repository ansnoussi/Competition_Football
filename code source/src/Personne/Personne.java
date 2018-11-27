package Personne;
import java.util.*;

public abstract class Personne {
protected String nom;
protected int age;

static public Scanner Sc = new Scanner(System.in);

public Personne(String nom,int age) {
	this.nom= nom;
	this.age= age;
}

public abstract void Afficher();

}
