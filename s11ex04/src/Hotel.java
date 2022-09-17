public class Hotel {
    private String nom;
    private int nombreEtoiles;
    private double prixNuit;

    public Hotel(String nom, int nombreEtoiles, double prixNuit) {
        this.nom = nom;
        this.nombreEtoiles = nombreEtoiles;
        this.prixNuit = prixNuit;
    }

    public String getNom() {
        return nom;
    }
    public int getNombreEtoiles() {
        return nombreEtoiles;
    }
    public double getPrixNuit() {
        return prixNuit;
    }

    @Override
    public String toString() {
        return "Hotel: " + nom + " avec " + nombreEtoiles + " étoiles\n" + "Prix: " + prixNuit;
    }
}
