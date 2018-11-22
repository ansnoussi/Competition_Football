package Personne;

public class Arbitre extends Personne{
private int nbMatches;

public Arbitre(){
	setAll();
}

	public void Afficher() {
		System.out.println("Nom Arbitre : " + nom);
		System.out.println("Prenom Arbitre : " + prenom);	
		System.out.println("Age Arbitre : " + age);	
		System.out.println("Nombre de Matches :"+ nbMatches);
		}
	
	public void setNom() {
		System.out.print("Saisir le nom de l'arbitre  ");
		nom = Sc.nextLine();
	}

	public void setPrenom() {
		System.out.print("Saisir le prenom de l'arbitre  ");
		prenom = Sc.nextLine();	
		}

	public void setAge() {
		System.out.print("Saisir l'age de l'arbitre  ");
		age = Sc.nextInt();
	}
	
    public void setNbMatches() {
		System.out.println("Saisir le nombre de matches  ");
		nbMatches= Sc.nextInt();
		}
    
	public int getNbMatches() {
		return nbMatches;
	}
	
	public void setAll() {
		setNom();
		setPrenom();
		setAge();
        setNbMatches();
	}
	
	
	
	}
