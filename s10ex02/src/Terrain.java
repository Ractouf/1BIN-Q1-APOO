public class Terrain extends Carte {
    private final static char[] COULEURS = {'B','b','n','r','v'};
    private final static int COUT_DEFAUT = 0;
    private char couleur;

    public Terrain(char couleur) {
        super(COUT_DEFAUT);
        this.couleur = couleur;

    }

    public char getCouleur() {
        return couleur;
    }

    public String fournirDetail() {
        return "Terrain - coût : " + getCout() + " couleur : " + couleur;
    }
}
