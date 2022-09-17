import java.time.LocalDate;

public class Utilitaire extends Vehicule {
    private int nombreMaxKilometres;
    private double kilometrageAuDernierControle;
    private final static int KILOMETRES_CONTROLE_DEFAUT = 50000;

    public Utilitaire(String immatriculation, LocalDate miseEnCirculation, int nombreMaxKilometres) {
        super(immatriculation, miseEnCirculation);
        this.nombreMaxKilometres = nombreMaxKilometres;
    }

    public Utilitaire(String immatriculation, LocalDate miseEnCirculation) {
        super(immatriculation, miseEnCirculation);
        nombreMaxKilometres = KILOMETRES_CONTROLE_DEFAUT;
    }

    public int getNombreMaxKilometres() {
        return nombreMaxKilometres;
    }
    public double getKilometrageAuDernierControle() {
        return kilometrageAuDernierControle;
    }

    public boolean estEnOrdre() {
        if (getKilometrage() > nombreMaxKilometres && getDernierControle() == getMiseEnCirculation())
            return false;
        return !(getKilometrage() - kilometrageAuDernierControle > nombreMaxKilometres);
    }

    @Override
    public String toString() {
        return "Utilitaire: " + getImmatriculation() + "\nMise en circulation: " + getMiseEnCirculation() + "\nKilomètrage: " + getKilometrage() + "\nDernier contrôle: " + getDernierControle() + "\n";
    }
}
