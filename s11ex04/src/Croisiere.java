import java.time.LocalDate;

public class Croisiere extends VoyageOrganise {
    private Bateau bateau;

    public Croisiere(LocalDate dateDeDepart, int duree, double prix, String nom, Bateau bateau) {
        super(dateDeDepart, duree, prix, nom);
        this.bateau = bateau;
    }

    public Bateau getBateau() {
        return bateau;
    }

    @Override
    public String toString() {
        return "Croisière:\n" + bateau;
    }
}
