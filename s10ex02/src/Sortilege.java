public class Sortilege extends Carte {
    private String nom, expliaction;

    public Sortilege(int cout, String nom, String expliaction) {
        super(cout);
        this.nom = nom;
        this.expliaction = expliaction;
    }

    public String getNom() {
        return nom;
    }
    public String getExpliaction() {
        return expliaction;
    }

    public String fournirDetail() {
        return "Sortilège - coût : " + getCout() + " nom : " + nom + " " + expliaction;
    }
}
