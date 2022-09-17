import java.time.LocalDate;

public class Voiture extends Vehicule {
    private final static int DUREE_AVANT_CONTROLE = 4, DUREE_ENTRE_CONTROLE = 1;

    public Voiture(String immatriculation, LocalDate miseEnCirculation) {
        super(immatriculation, miseEnCirculation);
    }

    public boolean estEnOrdre() {
        int anneeActuelle = LocalDate.now().getYear();

        int calculPremierControle = anneeActuelle - getMiseEnCirculation().getYear();
        int calculEntreControle = anneeActuelle - getDernierControle().getYear();

        if (calculPremierControle >= DUREE_AVANT_CONTROLE && getDernierControle() == getMiseEnCirculation())
            return false;
        else return calculEntreControle <= DUREE_ENTRE_CONTROLE;
    }

    @Override
    public String toString() {
        return "Voiture: " + getImmatriculation() + "\nMise en circulation: " + getMiseEnCirculation() + "\nKilomètrage: " + getKilometrage() + "\nDernier contrôle: " + getDernierControle() + "\n";
    }
}
