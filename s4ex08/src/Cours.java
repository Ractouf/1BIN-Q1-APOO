public class Cours {
    private String intitule, niveau;
    private int nombreInscrits = 0;
    private Professeur professeur;

    public Cours(String nIntitule, String nNiveau, Professeur nProfesseur) {
        intitule = nIntitule;
        niveau = nNiveau;
        professeur = nProfesseur;
    }

    public String getIntitule() {
        return intitule;
    }
    public String getNiveau() {
        return niveau;
    }
    public int getNombreInscrits() {
        return nombreInscrits;
    }
    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur nProfesseur) {
        professeur = nProfesseur;
    }

    public void inscriptionEleve(int nNombreinscrits){
        nombreInscrits = nombreInscrits + nNombreinscrits;
    }
    public void desinscriptionEleve(int nNombreInscrits){
        nombreInscrits = nombreInscrits - nNombreInscrits;
    }

    public String toString() {
        return intitule + "\nCours de niveau " + niveau + " donné par " + professeur.getPrenomProfesseur() + " " + professeur.getNomProfesseur() + "\nNombre d'élèves inscrits: " + nombreInscrits;
    }
}
