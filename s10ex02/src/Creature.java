import com.sun.nio.sctp.AbstractNotificationHandler;

public class Creature extends Carte {
    private String nom;
    private int nbrPV, nbrPC;
    private final static int PV_DEFAUT = 0;
    private final static int PC_DEFAUT = 0;

    public Creature(int cout, String nom, int nbrPV, int nbrPC) {
        super(cout);
        this.nom = nom;
        this.nbrPV = nbrPV;
        this.nbrPC = nbrPC;
    }

    public Creature(int cout, String nom) {
        super(cout);
        this.nom = nom;
        this.nbrPV = PV_DEFAUT;
        this.nbrPC = PC_DEFAUT;
    }

    public String getNom() {
        return nom;
    }
    public int getNbrPV() {
        return nbrPV;
    }
    public int getNbrPC() {
        return nbrPC;
    }

    public String fournirDetail() {
        return "Créature - coût : " + getCout() +
                " nom : " + nom +" (" + nbrPV + "/" + nbrPC + ")";
    }
}
