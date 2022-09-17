public abstract class MembreFederation {
    private String nom, prenom, nationalite;
    private Club club;
    private boolean engage, licencie;

    public MembreFederation(String nom, String prenom, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public void licenieDuClub() {

    }
    public boolean estDansUnClub() {
        return true;
    }
    public void estEngage() {}
    public void estLicencie() {}
}
