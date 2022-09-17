import java.util.ArrayList;

public class Carte {
    ArrayList<Boisson> boissons;

    public Carte() {
        boissons = new ArrayList<Boisson>();
    }

    public boolean ajouter(Boisson boisson) {
        if (boisson == null)
            throw new IllegalArgumentException();
        if (this.contient(boisson))
            return false;
        return boissons.add(boisson);
    }

    public boolean retirer(Boisson boisson) {
        if (boisson == null)
            throw new IllegalArgumentException();
        return boissons.remove(boisson);
    }

    public boolean contient(Boisson boisson) {
        if (boisson == null)
            throw new IllegalArgumentException();
        return boissons.contains(boisson);
    }

    public int nombreDeBoissons() {
        return boissons.size();
    }

    public String toString() {
        //return "Carte : " + "\n" + boissons;
        String toString = "Carte : \n";
        for (Boisson boisson : boissons) {
            toString += boisson + "\n";
        }
        return toString;
    }
}
