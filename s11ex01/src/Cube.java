import java.util.Objects;

public class Cube implements Solide {

   private double cote;

    public Cube(double cote) {
        if (cote <= 0)
            throw new IllegalArgumentException("Le côté doit être plus grand que 0");
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    @Override
    public double fournirVolume() {
        return Math.pow(cote,3);
    }

    @Override
    public double fournirSurface() {
        return Math.pow(cote,2) * 6;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.cote, cote) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cote);
    }

    @Override
    public String toString() {
        return "Cube de côté " + cote;
    }
}
