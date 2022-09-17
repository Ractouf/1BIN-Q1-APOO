import java.time.LocalDate;

public class Circuit extends VoyageOrganise {
    private String description;

    public Circuit(LocalDate dateDeDepart, int duree, double prix, String nom, String description) {
        super(dateDeDepart, duree, prix, nom);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "";
    }
}
