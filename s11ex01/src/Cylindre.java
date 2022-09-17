import java.util.Objects;

public class Cylindre implements Solide {

    private double hauteur, rayon;

    public Cylindre(double rayon, double hauteur) {
        this.hauteur = hauteur;
        this.rayon = rayon;
    }

    public double getHauteur() {
        return hauteur;
    }
    public double getRayon() {
        return rayon;
    }

    @Override
    public double fournirVolume() {
        return Math.PI * Math.pow(rayon,2) * hauteur;
    }

    @Override
    public double fournirSurface() {
        return 2 * Math.PI * Math.pow(rayon,2) + 2 * Math.PI * rayon * hauteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylindre cylindre = (Cylindre) o;
        return Double.compare(cylindre.hauteur, hauteur) == 0 && Double.compare(cylindre.rayon, rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hauteur, rayon);
    }

    @Override
    public String toString() {
        return "Cylindre de rayon " + rayon + " et de hauteur " + hauteur;
    }
}
