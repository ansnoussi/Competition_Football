package Personne;

public class Entraineur extends Personne {
private String equipe;

public Entraineur(String nom,int age){
    super(nom,age);
    setEquipe();
}

	public void Afficher() {
		System.out.println("Nom Entraineur : " + nom);
		System.out.println("Age Entraineur : " + age);	
		System.out.println("Equipe entrainé :"+ equipe);
	}
	
	// Un entraineur peut changer l'equipe qu'il l'entraine
	public void setEquipe() {
		System.out.println("Saisir le nom de l'equipe entrainé par Mr. "+ nom);
		equipe= Sc.nextLine();
	}
	
	
	
}
