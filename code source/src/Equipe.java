import Personne.*;

//Chaque équipe est composée par un ensemble de joueurs titulaires, d'autres remplaçants et Entraineur.

public class Equipe {

    private Joueur titulaires[] ;
    private Joueur remplcants[] ;
    private Entraineur entraineur ;
    
    public Equipe(){
        titulaires = new Joueur[11];
        remplcants = new Joueur[10];
        entraineur = new Entraineur();
    }

}