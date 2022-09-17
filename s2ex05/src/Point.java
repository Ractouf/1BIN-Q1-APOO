public class Point {
    private double coordonneeX, coordonneeY;

    public Point(double nCoordonneeX, double nCoordonneeY) {
        coordonneeX = nCoordonneeX;
        coordonneeY = nCoordonneeY;
    }

    public double getCoordonneeX() {
        return coordonneeX;
    }
    public double getCoordonneeY() {
        return coordonneeY;
    }

    public void setCoordonneeX(double NcoordonneeX) {
        coordonneeX = NcoordonneeX;
    }

    public void setCoordonneeY(double nCoordonneeY) {
        coordonneeY = nCoordonneeY;
    }

    public String toString() {
        return "(" + coordonneeX + "," + coordonneeY + ")";
    }
}
