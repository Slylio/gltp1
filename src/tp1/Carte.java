package tp1;
public class Carte implements iCarte{
    public static enum Couleurs{TREFLE, CARREAU, COEUR, PIQUE}
    private Couleurs couleur;
    public static enum Valeurs{AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI}
    private Valeurs valeur;

    public Carte(Valeurs valeur,Couleurs couleur)throws Exception{
        this.couleur=couleur;
        this.valeur=valeur;
    }   
    
    /**
     * 
     * @param couleur1
     * @param couleur2
     * @return boolean
     */
    public static boolean equals(Couleurs c, Couleurs o){
        if (c==o){
            return true;
        } else {
            return false;
        }
    }
    /**
     * Compare deux cartes
     * @param carte1
     * @param carte2
     * @return -1 0 1
     */
    public int compareTo(Carte o){
        if (this.getValeur().ordinal()>o.getValeur().ordinal()){
            return 1;
        } else if (this.getValeur().ordinal()<o.getValeur().ordinal()){
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * renvoit la carte
     */
    public Carte donneCarte(){
        return this;
    }

    public Valeurs getValeur(){
        return valeur;
    }
    public Couleurs getCouleur(){
        return couleur;
    }
    
    public String toString(){
        return valeur+"-"+couleur;
    }
}