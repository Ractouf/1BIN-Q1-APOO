public class Habitation {
    private Personne proprietaire;
    private Adresse adresse;
    private double revenuCadastral;
    private int anneeConstruction, surface;

    public Habitation(Personne proprietaire, Adresse adresse, double revenuCadastral, int anneeConstruction, int surface) {
        if (revenuCadastral <= 0)
            throw new IllegalArgumentException("Le revenu cadastral doit être strictement positif");
        if (surface <= 0)
            throw new IllegalArgumentException("La surface doit être strictement positive");
        setProprietaire(proprietaire);
        this.adresse = adresse;
        this.revenuCadastral = revenuCadastral;
        this.anneeConstruction = anneeConstruction;
        this.surface = surface;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }
    public Adresse getAdresse() {
        return adresse;
    }
    public double getRevenuCadastral() {
        return revenuCadastral;
    }
    public int getAnneeConstruction() {
        return anneeConstruction;
    }
    public int getSurface() {
        return surface;
    }

    public void setProprietaire(Personne proprietaire) {
        if (proprietaire == null)
            throw new IllegalArgumentException("Le proprietaire peux pas être vide");
        this.proprietaire = proprietaire;
    }

    public void changerRevenuCadastral(double coefficient) {
        if (coefficient <= 1)
            throw new IllegalArgumentException("Le coefficient doit être strictement supérieur a 1");

        revenuCadastral *= coefficient;
    }
    public double calculerPrecompte(double pourcentage){
        if (pourcentage <= 0 || pourcentage >= 100)
            throw new IllegalArgumentException("Le pourcentage doit être entre 0 et 100");

        return (revenuCadastral * pourcentage) / 100;
    }

    public String toString() {
        return "Propriétaire: " + proprietaire + "\nAdresse: " + adresse + "\nRevenu cadastral: " + revenuCadastral + "\nAnnée de construction: " + anneeConstruction + "\nSurface: " + surface;
    }
}
