package tp1;
import java.util.Comparator;
public class Tri implements Comparator<iCarte> {
    
    /** 
     * @param o1
     * @param o2
     * @return Main
     */
    public int compare(iCarte o1, iCarte o2){
        if(((Carte)o1).getValeur()> ((Carte)o2).getValeur()){
            return 1;
        }else if(o1==o2){
            return 0;
        }
        return -1;
    }
} 