package tp1;

import tp1.Carte.Couleurs;
import tp1.Carte.Valeurs;
import java.util.*;

public class PaquetDeCartes{
    ArrayList<Carte> cartes;
    
    private static PaquetDeCartes Instance;
    
    /**
     * Constructeur en privé
     * Génère un paquet de carte trié par défault
     */
    private PaquetDeCartes(){
        cartes=new ArrayList<Carte>();
        int i=0;
        for (Couleurs couleur : Couleurs.values()){
            for (Valeurs valeur : Valeurs.values()){
                try {
                    Carte carte=new Carte(valeur,couleur);
                    cartes.add(carte);
                    /*System.out.println(carte);*/ //Affichage génération du jeu de Cartes
                    i++;
                } catch(Exception e) {
                    System.err.println(e);
                }
            }
        }
    }
    /**
     * @return Instance (Singleton)
     */
    public static PaquetDeCartes getInstance() {
        if (null == Instance) {
            Instance = new PaquetDeCartes();
        }

        return Instance;
    }
    /**
     * Tire un certain de nombre de cartes et les met dans une main
     * @param main
     * @param nombre
     */
    public void tirage(Main main, int nombre){
        for (int i=0; i<nombre;i++) {
            main.piocher();
        }
    }
    /**
     * Trie le paquet de cartes
     */
    public void trie(){
        for (int i=0; i<cartes.size();i++){
            for (int j=1;j<cartes.size()-1;j++){
                if (cartes.get(j-1).getValeur().ordinal() > cartes.get(j).getValeur().ordinal()){
                    Collections.swap(cartes,j,j-1);
                }
            }
        }
    }

    /**
     * Mélange le paquet de cartes
     */
    public void shuffle(){
        Collections.shuffle(cartes);
    }

    public String toString(){
        String res="";
        for (Carte c : cartes){
            res+=c.toString()+" ";
        }
        return res;
    }

    /**
     * 
     * @return taille du paquet
     */
    public int size(){
        return cartes.size();
    }
}
