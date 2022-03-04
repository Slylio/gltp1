package tp1;
import java.util.Vector;
public abstract class Main extends Vector<iCarte> implements iCarte{
    
    public Main(){
        super();
    }

    public int taille(){
        return this.size();
    }
    
    public void inserer(iCarte e){
        this.add(e);
    }

    public void tri(){
        this.sort(new Tri());
    }
    public boolean estTriee(){
        for (int i=0;i<this.size()-1;i++){
            if(((Carte)this.elementAt(i)).getValeur()> ((Carte)this.elementAt(i+1)).getValeur()){
                return false;
            }
        }
        return true;
    }
}
