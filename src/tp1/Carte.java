package tp1;
public class Carte implements iCarte{
    public static enum Couleurs{TREFLE, CARREAU, COEUR, PIQUE}
    private Couleurs couleur;
    private int valeur;

    public static void main(String[] args) {
        try{
            Carte carte1=new Carte(2,Couleurs.PIQUE);
            Carte carte2=new Carte(9,Couleurs.PIQUE);
            Carte carte3=new Carte(96,Couleurs.COEUR);
            testDisplayEnum();
            System.out.println(carte1.getCouleur());
            System.out.println(carte1.getValeur());
            System.out.println(carte3);
            System.out.println(compareTo(carte1.getValeur(),carte2.getValeur()));
            System.out.println(equals(carte1.getCouleur(),carte2.getCouleur()));

        } catch (Exception e){
            System.err.println(e);
        }
        

    }
    public Carte(int valeur,Couleurs couleur)throws Exception{
        if (valeur<0 || valeur>13){
            throw new Exception("Veuillez entrer une valeur correcte !");
        }
        this.couleur=couleur;
        this.valeur=valeur;
    }   

    public static void testDisplayEnum(){
        for (Couleurs couleur : Couleurs.values()){
            System.out.println(couleur);
        }
    }
    public static boolean equals(Couleurs c, Couleurs o){
        if (c==o){
            return true;
        } else {
            return false;
        }
    }

    public static int compareTo(int v, int o){
        if (v>o){
            return 1;
        } else if (o> v){
            return -1;
        } else {
            return 0;
        }
    }
    public int getValeur(){
        return valeur;
    }
    public Couleurs getCouleur(){
        return couleur;
    }
    
    public String toString(){
        return valeur+" "+couleur;
    }

    public iCarte donneCarte(){
        return this;
    }

}