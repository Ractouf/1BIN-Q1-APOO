public class Vin extends BoissonAlcoolisee {

    private final static String[] COULEURS_EXISTANTES = {"rouge","blanc","rosé"};
    private String cepage, couleur, region, pays;

    public Vin(String nom, int contenance, double prix, double degreAlcool, String cepage,
               String couleur, String region, String pays) {
        super(nom, contenance, prix,  degreAlcool);
        this.cepage = cepage;
        this.region = region;
        this.pays = pays;

        if (couleur == null)
            throw new IllegalArgumentException("La couleur doit être choisie parmi les valeurs suivantes : rouge, blanc, rosé");

        for (int i = 0; i < COULEURS_EXISTANTES.length; i++) {
            if (COULEURS_EXISTANTES[i].equals(couleur) ) {
                this.couleur = couleur;
                break;
            }
        }
        if (this.couleur == null)
            throw new IllegalArgumentException("La couleur doit être choisie parmi les valeurs suivantes : rouge, blanc, rosé");
    }

    public String getCepage() {
        return cepage;
    }
    public String getCouleur() {
        return couleur;
    }
    public String getRegion() {
        return region;
    }
    public String getPays() {
        return pays;
    }

    public String toString() {
        if (couleur.equals("rouge"))
            return "Vin rouge : " + super.toString() + "\nCépage : " + cepage + "\nOrigine : " + region + " - " + pays;
        if (couleur.equals("blanc"))
            return "Vin blanc : " + super.toString() + "\nCépage : " + cepage + "\nOrigine : " + region + " - " + pays;
        return "Vin rosé : " + super.toString() + "\nCépage : " + cepage + "\nOrigine : " + region + " - " + pays;
    }
}
