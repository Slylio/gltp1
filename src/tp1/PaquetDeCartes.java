package tp1;
import java.util.Vector;

public class PaquetDeCartes extends Vector<Carte>{
    private iCarte[] cartes;
    public PaquetDeCartes(){
        cartes=new iCarte[52];
    }

    public void generatePaquetDeCartes(){
    
    }

    public void trie(){
        this.sort(new Tri());
    }
    public void shuffle(){
        this.shuffle();
    }
}
