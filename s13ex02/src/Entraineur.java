public class Entraineur extends MembreFederation {
    private String tactique;

    public Entraineur(String nom, String prenom, String nationalite, String tactique) {
        super(nom, prenom, nationalite);
        this.tactique = tactique;
    }
}
