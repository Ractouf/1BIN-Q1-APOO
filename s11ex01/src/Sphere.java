import java.util.Objects;

public class Sphere implements Solide {

    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double fournirVolume() {
        return (4 * Math.PI * Math.pow(rayon,3)) / 3;
    }
    @Override
    public double fournirSurface() {
        return 4 * Math.PI * Math.pow(rayon,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.rayon, rayon) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(rayon);
    }

    @Override
    public String toString() {
        return "Sphère de rayon " + rayon;
    }
}
