import Personne.*;

public class MaMain {

	public static void main(String[] args) {
		System.out.println("******");
		Personne B = new Arbitre();
		System.out.println("******");
		B.Afficher();
		Personne C= new Joueur();
		C.Afficher();
	}
}