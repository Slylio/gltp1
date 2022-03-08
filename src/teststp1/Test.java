package teststp1;
import tp1.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
    /* Simulation de partie de bataille */
    PaquetDeCartes paquet = PaquetDeCartes.getInstance(); 
        
        Main main1= new Main();
        Main main2= new Main();
        Main commun= new Main();
        int compteur=0;
        paquet.shuffle(); //on mélange le paquet avant de distribuer
        paquet.tirage(main1, 26);
        paquet.tirage(main2, 26);

        System.out.println("Affichage de la main 1 : "+main1);
        //On commence à jouer
        while (main1.size()!=0 && main2.size()!=0){
            Carte carte1=main1.carteAuDessus();
            Carte carte2=main2.carteAuDessus();
            System.out.println(main1.taille()+" "+main2.taille());
            System.out.println(carte1+" contre "+carte2);
            if (carte1.compareTo(carte2)==1){   //carte 1 plus forte
                if (commun.size()>1){
                    commun.gagnePotCommun(main1);
                }
                System.out.println(carte1+" l'emporte");    //affichage
                main1.inserer(0, carte2);   //on prend la carte perdante  et on l'insère dans la main du joueur gagnant
                main2.retirer(carte2);
                main1.metAuFond();
            } else if (carte1.compareTo(carte2)==-1){   //carte 2 plus forte
                if (commun.size()>1){
                    commun.gagnePotCommun(main2);
                }
                System.out.println(carte2+" l'emporte");
                main1.retirer(carte1);
                main2.inserer(0,carte1);
                main2.metAuFond();
            } else {
                System.out.println("On met les cartes en jeux celui qui gagne le prochain gagne les cartes");
                commun.ajouter(carte2);
                commun.ajouter(carte1); 
                main2.retirer(carte2);
                main1.retirer(carte1);
            }
            compteur+=1;
        }
        System.out.println("La partie s'est terminé au bout de "+compteur+" coups");
    }
    
}            

