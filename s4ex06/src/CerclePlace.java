public class CerclePlace {
    private Point centre;
    private double rayon;

    public CerclePlace(double nRayon, Point nCentre){
        rayon = nRayon;
        centre = nCentre;
    }

    public double getRayon() {
        return rayon;
    }
    public Point getCentre() {
        return centre;
    }

    public void setRayon(double nRayon) {
        rayon = nRayon;
    }

    public void setCentre(double nX, double nY) {
        centre = new Point(nX, nY);
    }

    public String toString() {
        return "un cercle de rayon: " + rayon + " et centre du cercle en " + centre;
    }
}
