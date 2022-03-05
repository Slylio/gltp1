package teststp1;
import tp1.*;
public class test {
    public static void main(String[] args) throws Exception{
        PaquetDeCartes paquet = PaquetDeCartes.getInstance(); 
        Main main1= new Main();
        paquet.tirage(main1, 25);
        System.out.println("paquet trié sans main1 : "+paquet);
        System.out.println("main1 : "+main1);
        paquet.shuffle();
        System.out.println("paquet shuffle sans main1 : "+paquet);

        System.out.println("");System.out.println("");System.out.println("");
        System.out.println("main taille : "+main1.size());
        System.out.println("paquet taille : "+paquet.size());
        main1.piocher();
        main1.piocher();
        main1.piocher();
        System.out.println("main taille : "+main1.size());
        System.out.println("paquet taille : "+paquet.size());
        System.out.println("Main est triée ?" +main1.estTriee());
        main1.trie();
        System.out.println("Main est triée ?(après tri)"+main1.estTriee());
    }
}
