import Personne.*;

import java.util.*;
public class MaMain {

	private static Object Equipe;

	public static void main(String[] args){
		Competition MaCompetition = new Competition();
		int action = 1;
		while(action > 0) {
    	System.out.println("\nChoisir une action :");
		System.out.println("1. Ajout ou Mise a jour Joueur");
		System.out.println("2. Ajout ou Mise a jour Arbitre");
		System.out.println("3. Ajout ou Mise a jour Entraineur");
		System.out.println("4. Saisie d'un Match");
		System.out.println("5. Affichage des resultats des matches");
		System.out.println("6. Afficher une equipe");
		System.out.println("7. Afficher l'historique d'une rencontre entre deux equipes");
		System.out.println("8. Statistique d'une equipe");
		System.out.println("0. Exit !");
		Scanner Sc = new Scanner(System.in);
		action = Sc.nextInt();
		Sc.nextLine(); 
		switch (action) {
		case 1 : System.out.println("1. Nouveau Joueur");
		       	 System.out.println("2. MAJ Maillot Joueur");
			     System.out.println("3. MAJ Poste Joueur");
			     int action2 = Sc.nextInt();
			     Sc.nextLine(); 
			     switch (action2) {
			       case 1 : Joueur J= null; 
			    	        System.out.println("Saisir le Nom du joueur");
			    	        String temp = Sc.nextLine();
			    	        System.out.println("Saisir l'equipe actuel de " + temp);
			    	        String temp3 = Sc.nextLine();
			    	        boolean existeJoueur = false;
			    	        for(int i=0;i<MaCompetition.equipes.size();i++){
			    	        	if(MaCompetition.equipes.get(i).nom.equals(temp3)) {
			    	        	for(int j=0;j<MaCompetition.equipes.get(i).getTitulaires().size();j++) {
			    	        		if(MaCompetition.equipes.get(i).getTitulaires().get(j).getNom().equals(temp)){
			    	        			existeJoueur = true;
			    	        			System.out.println(temp + " est déjà enregistré !");
			    	        			break;
			    	        		}
			    	        }
			    	        		if(! existeJoueur) {
			    	            for(int j=0;j<MaCompetition.equipes.get(i).getRemplacants().size();j++) {
			    	            	if(MaCompetition.equipes.get(i).getRemplacants().get(j).getNom().equals(temp)){
			    	        			existeJoueur = true;
			    	        			System.out.println(temp + " est déjà enregistré !");
			    	        			break;
			    	        		}
			    	            }		
			    	        }
			    	        	}
			    	        }
			    	        if(! existeJoueur) {
				    	        System.out.println("Saisir l'age de " + temp);
				    	        int temp2 = Sc.nextInt();
				    	        Sc.nextLine();
			    	            J= new Joueur(temp,temp2,temp3);
			                System.out.println("1.Titulaire \n2.Remplacants ");
          		            int type = Sc.nextInt();
          		            Sc.nextLine();
			                boolean existeEquipe = false;
			                Equipe E=null;
			                for(int i=0;i<MaCompetition.equipes.size();i++){
			                	 if(MaCompetition.equipes.get(i).nom.equals(J.getEquipe())) {
			                		 existeEquipe = true;
			                		 if(type == 1)
			                			 MaCompetition.equipes.get(i).addTitulaire(J);
			                		 else
			                			 MaCompetition.equipes.get(i).addRemplacant(J);
			                		 break;
			                	 }
			                }
			                if(! existeEquipe) {
		                	E = new Equipe(temp3);
		                	MaCompetition.addEquipe(E);
		                		 if(type == 1)
		                			 E.addTitulaire(J);
		                		 else
		                			 E.addRemplacant(J);
		                	 }
			    	        }
			                break;
			                
			      case 2 :
			               break; 
			      case 3 : 
			               break;
			               
			     }
			     break;
			     
		// case 2:	  
			     
			     
		// case 3:
			     
			     
		case 4: 
			System.out.println("Saisir le nom de l'equipe 1");
			String e1=Sc.nextLine();
			System.out.println("Saisir le nom de l'equipe 2");
			String e2 = Sc.nextLine();
			System.out.println("Saisir le nombre de buts marqués par "+ e1);
			int e1b = Sc.nextInt();
			Sc.nextLine();
			System.out.println("Saisir le nombre de buts marqués par "+ e2);
			int e2b = Sc.nextInt();
			Sc.nextLine();
			System.out.println("Saisir le nom de l'arbitre");
			String a = Sc.nextLine();
			System.out.println("Saisir le numero du tour");
			int t = Sc.nextInt();
			Sc.nextLine();
			Match M = new Match(e1,e2,e1b,e2b,a,t);
			MaCompetition.addMatch(M);
			boolean existeEquipe1 = false;
            Equipe E1=null;
            for(int i=0;i<MaCompetition.equipes.size();i++){
            	 if(MaCompetition.equipes.get(i).nom.equals(e1)) {
            		 existeEquipe1 = true;
            		 E1 = MaCompetition.equipes.get(i);
            	 break;
            	 }
            }
            if(! existeEquipe1) {
        	E1 = new Equipe(e1);
        	MaCompetition.addEquipe(E1);
            }
			boolean existeEquipe2 = false;
            Equipe E2=null;
            for(int i=0;i<MaCompetition.equipes.size();i++){
            	 if(MaCompetition.equipes.get(i).nom.equals(e2)) {
            		 existeEquipe2 = true;
            		 E2 = MaCompetition.equipes.get(i);
            		 break;
            	 }
            }
            if(! existeEquipe2) {
        	E2 = new Equipe(e2);
        	MaCompetition.addEquipe(E2);
            }
			if(e1b>e2b) {
				E1.incrementVictoires();
				E2.incrementDefaites();
			}
			else if (e1b<e2b) {
			    E1.incrementDefaites();
				E2.incrementVictoires();
				}	
			else {
				E1.incrementNulles();
				E2.incrementNulles();
			}
            	
			break;
			
			
		case 5: 
			if(MaCompetition.matchs.size()>0)
				for (int i=0;i<MaCompetition.matchs.size();i++)
			    MaCompetition.matchs.get(i).afficheResultat();
			else
				System.out.println("Aucun match enregistré dans la competition !");
			break;
			
			
		case 6: System.out.println("Saisir le nom de l'equipe");
		        String nomAux= Sc.nextLine();
		        boolean auxbool= false;
		        for (int i=0;i<MaCompetition.equipes.size();i++) {
		        	auxbool = (MaCompetition.equipes.get(i).nom.equals(nomAux));
		        	if(auxbool) {
		        		MaCompetition.equipes.get(i).Affiche();
		        		break;
		        	}
		        }
		        if (! auxbool)
		        	System.out.println("Equipe Introuvable !");
		        break;
		        		
		 case 7: System.out.println("Saisir equipe 1");
		 String q1 = Sc.nextLine();
		 System.out.println("Saisir equipe 2");
		 String q2 = Sc.nextLine();
		 for(int i=0;i<MaCompetition.matchs.size();i++) {
			 if((MaCompetition.matchs.get(i).getEquipe1().equals(q1) && MaCompetition.matchs.get(i).getEquipe2().equals(q2)) || (MaCompetition.matchs.get(i).getEquipe1().equals(q2)&&MaCompetition.matchs.get(i).getEquipe2().equals(q1)))
				 MaCompetition.matchs.get(i).afficheMatch();
		 }
		 break;
		 
		 
		 case 8: System.out.println("Saisir le nom d'equipe");
		 String p = Sc.nextLine();
		 boolean equipetouve = false;
		 for(int i=0;i<MaCompetition.equipes.size();i++) {
			 if(MaCompetition.equipes.get(i).nom.equals(p)) {
				 equipetouve = true;
				 MaCompetition.equipes.get(i).afficherStatistiques();
				 break;
			 }
		        
		 }
		 if (! equipetouve)
			 System.out.println(p + " n'existe pas dans " + MaCompetition.nom);
		 break;
		        
		case 0: System.exit(0);
		
		}
		}
		}
	}
		
