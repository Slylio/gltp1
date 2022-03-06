package teststp1;
import tp1.*;
import tp1.Carte;
public class test {
    public static void main(String[] args) throws Exception{
        /* Simulation de partie de bataille */
        PaquetDeCartes paquet = PaquetDeCartes.getInstance(); 
        for (int i=3; i<7;i++){    //on simule des parties allant avec [3;n] (ici n=5 sinon au dessus ça prend énormément de temps) cartes car on veut éviter le cas ou on a deux mains de doublons
            Main main1= new Main();
            Main main2= new Main();
            int compteur=0;
            paquet.shuffle(); //on mélange le paquet avant de distribuer
            paquet.tirage(main1, i);
            paquet.tirage(main2, i);

            System.out.println("Affichage de la main 1 : "+main1);

            //On commence à jouer
            while (main1.size()!=0 && main2.size()!=0){
                Carte carte1=main1.carteAuDessus();
                Carte carte2=main2.carteAuDessus();
                System.out.println(main1.taille()+" "+main2.taille());
                System.out.println(carte1+" contre "+carte2);
                if (carte1.compareTo(carte2)==1){   //carte 1 plus forte
                    System.out.println(carte1+" l'emporte");    //affichage
                    main1.inserer(0, carte2);   //on prend la carte perdante  et on l'insère dans la main du joueur gagnant
                    main2.retirer(carte2);
                    main1.metAuFond();
                } else if (carte1.compareTo(carte2)==-1){   //carte 2 plus forte
                    System.out.println(carte2+" l'emporte");
                    main1.retirer(carte1);
                    main2.inserer(0,carte1);
                    main2.metAuFond();
                } else {
                    System.out.println("Egalité on relance les jeux ");
                    main1.shuffle();
                    main2.shuffle();
                }
                compteur+=1;
            }
            System.out.println("La partie s'est terminé au bout de "+compteur+" coups");
        }
    }            
}
