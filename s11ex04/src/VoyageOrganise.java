import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class VoyageOrganise extends FormuleDeVacance {
    private double prix;
    private String nom;
    private ArrayList<Etape> etapes = new ArrayList<Etape>();

    public VoyageOrganise(LocalDate dateDeDepart, int duree, double prix, String nom) {
        super(dateDeDepart, duree);
        this.prix = prix;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public double calculerPrix() {
        return 0;
    }

    public boolean ajouterEtape(Etape etape) {
        if (etape == null)
            throw new IllegalArgumentException("l'étape peux pas être un élement vide.");
        etapes.add(etape);
        return true;
    }

    public boolean retirerEtape(Etape etape) {
        if (etape == null)
            throw new IllegalArgumentException("l'étape peux pas être un élement vide.");
        etapes.remove(etape);
        return true;
    }

    public Iterator<Etape> it() {
        return etapes.iterator();
    }

    @Override
    public String toString() {
        return "";
    }
}
