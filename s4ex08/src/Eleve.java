public class Eleve {
    private String nomEleve, prenomEleve;
    private Cours coursPrincipal, coursComplementaire;

    public Eleve(String nNomEleve, String nPrenomEleve, Cours nCoursPrincipal, Cours nCoursComplementaire) {
        nomEleve = nNomEleve;
        prenomEleve = nPrenomEleve;
        coursPrincipal = nCoursPrincipal;
        coursComplementaire = nCoursComplementaire;
    }

    public String getNomEleve() {
        return nomEleve;
    }
    public String getPrenomEleve() {
        return prenomEleve;
    }
    public Cours getCoursPrincipal() {
        return coursPrincipal;
    }
    public Cours getCoursComplementaire() {
        return coursComplementaire;
    }

    public void setCoursComplementaire(Cours nCoursComplementaire) {
        coursComplementaire = nCoursComplementaire;
    }

    public String toString() {
        return prenomEleve + " " + nomEleve + "\nCours principal: " + coursPrincipal.getIntitule() + "\nCours complémentaire: " + coursComplementaire.getIntitule();
    }
}
