import java.util.*;
import Personne.Arbitre;

public class Competition{
	
	public String nom;
	public ArrayList <Equipe> equipes;
	public ArrayList <Match> matchs;
	public ArrayList <Arbitre> arbitres;
	;Scanner Sc = new Scanner(System.in);
	public Competition() {
		System.out.println("Saisir le nom du Competition");
		nom = Sc.nextLine();
		this.equipes = new ArrayList<>();
		this.matchs = new ArrayList<>();
		this.arbitres = new ArrayList<>();
	}
	
	public void addEquipe(Equipe E) {
		equipes.add(E);
	}
	public void addMatch(Match M) {
		matchs.add(M);
	}
	void addArbitre(Arbitre A) {
		arbitres.add(A);
	}
	
	public void rechercheRencontre(Equipe e1,Equipe e2){
		System.out.println("** Historique de rencontres entre "+ e1.nom + " Vs " + e2.nom);
		for(int i=0;i<matchs.size();i++) {
			if(e1.equals(matchs.get(i).getEquipe1()) && e2.equals(matchs.get(i).getEquipe2()))
				matchs.get(i).afficheMatch();;
		}
		
	}
	
	
}