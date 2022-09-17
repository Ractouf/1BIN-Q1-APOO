import java.util.ArrayList;
import java.util.Iterator;

public class ListeSolides implements Iterable<Solide>{
    public ArrayList<Solide> solides = new ArrayList<Solide>();

    public boolean estVide() {
        return solides.size() == 0;
    }

    public int nombreDeSolides() {
        return solides.size();
    }

    public boolean ajouter(Solide solide) {
        if (contient(solide))
            throw new IllegalArgumentException();
        return solides.add(solide);
    }

    public boolean supprimer(Solide solide) {
        if (!contient(solide))
            throw new IllegalArgumentException();
        return solides.remove(solide);
    }

    public boolean contient(Solide solide) {
        return solides.contains(solide);
    }

    public Iterator<Solide> iterator() {
        return solides.iterator();
    }

    public ArrayList<Solide> trouverPlusGrand() {
        double plusGrandSolide = 0;
        ArrayList<Solide> plusGrandSolides = new ArrayList<Solide>();

        for (Solide solide : solides) {
            if (solide.fournirVolume() >= plusGrandSolide) {
                if (solide.fournirVolume() != plusGrandSolide) {
                    plusGrandSolides.removeAll(plusGrandSolides);
                }
                plusGrandSolides.add(solide);
                plusGrandSolide = solide.fournirVolume();
            }
        }
        return plusGrandSolides;
    }

    @Override
    public String toString() {
        String toString = "Liste de solides : \n";
        for (Solide solide : solides) {
            toString += solide.toString() + "\n";
        }
        return toString;
    }
}
