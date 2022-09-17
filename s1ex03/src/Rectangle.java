public class Rectangle {
    double longueur, largeur;

    Rectangle(double nLargeur, double nLongueur) {
        largeur = nLargeur;
        longueur = nLongueur;
    }

    double calculerAire() {
        return longueur * largeur;
    }

    double calculerPerimetre() {
        return (longueur + largeur) * 2;
    }

    public String toString() {
        return "Rectangle 3 de largeur " + largeur + " et de longueur " + longueur;
    }
}
