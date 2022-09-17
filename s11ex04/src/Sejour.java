import java.time.LocalDate;

public class Sejour extends FormuleSimple {
    private Hotel reservation;

    public Sejour(LocalDate dateDeDepart, int duree, Vol volAller, Vol volRetour, Hotel reservation) {
        super(dateDeDepart, duree, volAller, volRetour);
        this.reservation = reservation;
    }

    public Hotel getReservation() {
        return reservation;
    }

    public double calculerPrix() {
        return getVolAller().getPrix() + getVolRetour().getPrix() + reservation.getPrixNuit();
    }

    @Override
    public String toString() {
        return "Sejour:\n" + reservation;
    }
}
