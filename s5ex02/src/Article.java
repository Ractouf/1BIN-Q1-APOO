public class Article {
    private String reference, nom, description;
    private double prixHorsTVA, tauxTVA;

    public Article(String reference, String nom, String description, double prixHorsTVA, double tauxTVA) {
        if (reference == null || nom == null)
            throw new IllegalArgumentException("la référence et le nom d’un article ne peuvent pas être null");
        if (prixHorsTVA <= 0)
            throw new IllegalArgumentException("le prix d’un article doit être strictement positif");
        if (tauxTVA < 0 || tauxTVA > 100)
            throw new IllegalArgumentException("Le taux de TVA dois être compris entre 0 et 100");

        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHorsTVA = prixHorsTVA;
        this.tauxTVA = tauxTVA;
    }
    public Article(String reference, String nom, String description, double prixHorsTVA) {
        this(reference,nom,description,prixHorsTVA,21);
    }

    public String getReference() {
        return reference;
    }
    public String getNom() {
        return nom;
    }
    public String getDescription() {
        return description;
    }
    public double getPrixHorsTVA() {
        return prixHorsTVA;
    }
    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrixHorsTVA(double prixHorsTVA) {
        this.prixHorsTVA = prixHorsTVA;
    }
    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public double calculerPrixTVAComprise(){
        return prixHorsTVA * (1 + (tauxTVA / 100));
    }

    public double calculerPrixTVAComprise(int reduction){
        if (reduction <= 0 || reduction >= 100)
            throw new IllegalArgumentException("une réduction doit être comprise entre 0 et 100\n");
        return calculerPrixTVAComprise() / (1.0 - (reduction / 100.0));
    }

    public String toString() {
        return nom + "\nRéférence : " + reference ;
    }
}
