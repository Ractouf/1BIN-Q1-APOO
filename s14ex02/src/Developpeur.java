public class Developpeur {
    private String nom, specialite;
    private double salaire;
    private int nbProjetsEnCours;
    private final static String SPECIALITE_PAR_DEFAUT = "full-stack";

    public Developpeur(String nom, String specialite, double salaire) {
        if (nom == null)
            throw new IllegalArgumentException("Nom invalide");
        if (specialite == null)
            throw new IllegalArgumentException("Specialité invalide");
        this.nom = nom;
        this.specialite = specialite;
        this.salaire = salaire;
        nbProjetsEnCours = 0;
    }

    public Developpeur(String nom, double salaire) {
        this(nom, SPECIALITE_PAR_DEFAUT, salaire);
    }

    public String getNom() {
        return nom;
    }
    public String getSpecialite() {
        return specialite;
    }
    public double getSalaire() {
        return salaire;
    }
    public int getNbProjetsEnCours() {
        return nbProjetsEnCours;
    }

    public void setSpecialite(String specialite) {
        if (specialite == null)
            throw new IllegalArgumentException("Specialité invalide");
        this.specialite = specialite;
    }

    public void signalerNouveauProjet() {
        nbProjetsEnCours ++;
    }
    public void signalerFinDUnProjet() {
        nbProjetsEnCours --;
    }

    @Override
    public String toString() {
        return "Developpeur : " + nom + ", Specialité : " + specialite + ", Salaire : " + salaire +", Nombre de projets en cours : " + nbProjetsEnCours;
    }
}
