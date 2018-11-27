import java.util.*;


public class Match {

    private String equipe1 ;
    private String equipe2 ;
    int nombreButEquipe1;
    int nombreButEquipe2;
    private String arbitre ;
    private int numeroTour ;
    Scanner Sc = new Scanner(System.in);
    
    public Match(String e1,String e2,int nbButsE1,int nbButsE2,String arbitre,int tour) {
    equipe1=e1;
    equipe2=e2;
    nombreButEquipe1=nbButsE1;
    nombreButEquipe2=nbButsE2;
    this.arbitre=arbitre;
    numeroTour=tour;
    }
    
    // Necessaire pour afficher l'historique des matches
    public void afficheMatch() {
    	System.out.println();
    	System.out.println("Tour :" + numeroTour);
    	System.out.println(equipe1 +" " + nombreButEquipe1 + "-"+ nombreButEquipe2 + " "+ equipe2);
    	System.out.println("Arbitre :" + arbitre);
    	System.out.println();
    	}
    
    public void afficheResultat() {
    	System.out.println(equipe1 +" " + nombreButEquipe1 + "-"+ nombreButEquipe2 + " "+ equipe2);
    	}
    
   public String getEquipe1(){
	   return(equipe1);
   }
   
   public String getEquipe2(){
	   return(equipe2);
   }
   
   
   
}