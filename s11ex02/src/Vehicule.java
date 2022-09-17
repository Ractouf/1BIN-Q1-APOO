import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public abstract class Vehicule {
    private String immatriculation;
    private LocalDate miseEnCirculation, dernierControle;
    private double kilometrage;

    public Vehicule(String immatriculation, LocalDate miseEnCirculation) {
        this.immatriculation = immatriculation;
        this.miseEnCirculation = miseEnCirculation;
        this.dernierControle = miseEnCirculation;
    }

    public String getImmatriculation() {
        return immatriculation;
    }
    public LocalDate getMiseEnCirculation() {
        return miseEnCirculation;
    }
    public LocalDate getDernierControle() {
        return dernierControle;
    }
    public double getKilometrage() {
        return kilometrage;
    }

    public void setDernierControle(LocalDate dernierControle) {
        this.dernierControle = dernierControle;
    }
    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public abstract boolean estEnOrdre();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return immatriculation.equals(vehicule.immatriculation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(immatriculation);
    }

    @Override
    public String toString() {
        return "Vehicule : ";
    }
}
