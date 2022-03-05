package tp1;
import java.util.Comparator;
public class Tri implements Comparator<Carte> {
    
    /** 
     * @param o1
     * @param o2
     * @return Main
     */
    public int compare(Carte o1, Carte o2){
        if(o1.getValeur().ordinal() >o2.getValeur().ordinal()){
            return 1;
        }else if(((Carte)o1).getValeur().ordinal() == ((Carte)o2).getValeur().ordinal()){
            return 0;
        }
        return -1;
    }
} 