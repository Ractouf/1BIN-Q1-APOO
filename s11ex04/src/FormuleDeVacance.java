import java.time.LocalDate;

public abstract class FormuleDeVacance {
    private LocalDate dateDeDepart;
    private int duree;


    public FormuleDeVacance(LocalDate dateDeDepart, int duree) {
        this.dateDeDepart = dateDeDepart;
        this.duree = duree;
    }

    public LocalDate getDateDeDepart() {
        return dateDeDepart;
    }
    public int getDuree() {
        return duree;
    }

    public abstract double calculerPrix();

    @Override
    public String toString() {
        return "Vacances ";
    }
}
