public class CerclePlace {
    private Point centre;
    private double rayon;

    public CerclePlace(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public CerclePlace(Point centre) {
        this(centre,1);
    }
    public CerclePlace() {
        this(new Point(0,0),1);
    }

    public double getRayon() {
        return rayon;
    }
    public Point getCentre() {
        return centre;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public String toString() {
        return "un cercle de rayon: " + rayon + " et centre du cercle en " + centre;
    }
}
