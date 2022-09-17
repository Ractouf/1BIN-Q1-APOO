public class livre extends Produit {
    private String titre, auteur;
    private int nbrPages;
    
    public livre(String reference, double prix, String titre, String auteur, int nbrPages) {
        super(reference, prix);
        this.titre = titre;
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public int getNbrPages() {
        return nbrPages;
    }

    @Override
    public String toString() {
        return titre + " - " + auteur;
    }
}
