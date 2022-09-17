public class CD extends Produit {
    private String titre;
    private String artiste;
    private int nbrMorceaux;


    public CD(String reference, double prix, String titre, String artiste, int nbrMorceaux) {
        super(reference, prix);
        this.titre = titre;
        this.artiste = artiste;
        this.nbrMorceaux = nbrMorceaux;
    }

    public String getTitre() {
        return titre;
    }
    public String getArtiste() {
        return artiste;
    }
    public int getNbrMorceaux() {
        return nbrMorceaux;
    }

    @Override
    public String toString() {
        return titre + " - " + artiste;
    }
}
