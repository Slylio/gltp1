package tp1;
import java.util.*;
public class Main extends Vector<Carte>{
    
    public Main(){
    }

    
    public int taille(){
        return this.size();
    }
    
    /**
     * Pioche la carte supérieure dans le paquet de carte
     * @param e
     */

    public void piocher(){
        this.add(PaquetDeCartes.getInstance().cartes.get(PaquetDeCartes.getInstance().cartes.size()-1)); //ajout dans la main de la dernière carte du paquet
        PaquetDeCartes.getInstance().cartes.remove(PaquetDeCartes.getInstance().cartes.size()-1);   //on la retire car sinon elle se duplique c'est pas ce qu'on veut
    }

    /**
     * Dis si la main est triée ou non
     * @return boolean
     */
    public boolean estTriee(){
        for (int i=0;i<this.size()-1;i++){
            if(this.get(i).getValeur().ordinal()> this.get(i+1).getValeur().ordinal()){
                return false;
            }
        }
        return true;
    }

    /**
     * trie la main
     */
    public void trie(){
        this.sort(new Tri());
    }

    /**
     * ajoute une carte a la main
     * @param carte
     */
    public void ajouter(Carte carte){
        this.add(carte);
    }
}
