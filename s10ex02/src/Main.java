import java.util.ArrayList;

public class Main {
    private ArrayList<Carte> cartes;
    private final static int CARTES_MAXIMUM = 10;

    public Main() {
        cartes = new ArrayList<Carte>();
    }

    public void piocher(Carte carte) {
        if (cartes.size() == CARTES_MAXIMUM)
            throw new TropDeCartesException();
        cartes.add(carte);
    }

    public String jouer(int index) {
        Carte carteJouee = cartes.get(index);
        if (index < 0 || index > 9)
            throw new IllegalArgumentException();

        cartes.remove(index);

        return "Carte jouée: " + carteJouee.fournirDetail() + "\n";
    }

    public String toString() {
        String toString = "Carte(s) : \n";
        for (Carte carte : cartes) {
            toString += carte.fournirDetail() + "\n";
        }
        return toString;
    }
}
