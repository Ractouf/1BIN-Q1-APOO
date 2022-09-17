public class Professeur {
    private String nomProfesseur, prenomProfesseur, matricule, specialisation;

    public Professeur(String nMatricule, String nNomProfesseur, String nPrenomProfesseur, String nSpecialisation) {
        matricule = nMatricule;
        nomProfesseur = nNomProfesseur;
        prenomProfesseur = nPrenomProfesseur;
        specialisation = nSpecialisation;
    }

    public String getNomProfesseur() {
        return nomProfesseur;
    }
    public String getPrenomProfesseur() {
        return prenomProfesseur;
    }
    public String getMatricule() {
        return matricule;
    }
    public String getSpecialisation() {
        return specialisation;
    }

    public String toString() {
        return matricule + " " + prenomProfesseur + " " + nomProfesseur + "\nSpécialisation: " + specialisation;
    }
}
