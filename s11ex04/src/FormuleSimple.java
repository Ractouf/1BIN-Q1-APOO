import java.time.LocalDate;

public class FormuleSimple extends FormuleDeVacance {

    private Vol volAller;
    private Vol volRetour;

    public FormuleSimple(LocalDate dateDeDepart, int duree, Vol volAller, Vol volRetour) {
        super(dateDeDepart, duree);
        this.volAller = volAller;
        this.volRetour = volRetour;
    }

    public Vol getVolAller() {
        return volAller;
    }
    public Vol getVolRetour() {
        return volRetour;
    }

    public double calculerPrix() {
        return volAller.getPrix() + volRetour.getPrix();
    }

    @Override
    public String toString() {
        return super.toString() + "simples:\n" + "Vol aller:\n" + volAller + "\nVol retour:\n" + volRetour;
    }
}
