package Personne;

public class Entraineur extends Personne {
private String equipe;

public Entraineur(){
	setAll();
}

	public void Afficher() {
		System.out.println("Nom Entraineur : " + nom);
		System.out.println("Prenom Entraineur : " + prenom);	
		System.out.println("Age Entraineur : " + age);	
		System.out.println("Equipe entrainé :"+ equipe);
	}
	
	public void setNom() {
		System.out.print("Saisir le nom de l'entraineur  ");
		nom = Sc.nextLine();
	}

	public void setPrenom() {
		System.out.print("Saisir le prenom de l'entraineur  ");
		prenom = Sc.nextLine();	
		}

	public void setAge() {
		System.out.print("Saisir l'age de l'entraineur  ");
		age = Sc.nextInt();
	}
	
	public void setEquipe() {
		System.out.print("Saisir le nom de l'equipe entrainé  "); 
		equipe= Sc.nextLine();
	}
	
	public String getEquipe() {
	return equipe;
	}
	
	public void setAll(){
		setNom();
		setPrenom();
		setEquipe();
		setAge();
	}
	
	
}
