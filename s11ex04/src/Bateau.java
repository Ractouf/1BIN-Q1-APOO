import java.util.ArrayList;

public class Bateau {
    private String nom;
    private int nombreCabines;
    private ArrayList<String> activites = new ArrayList<String>();

    public Bateau(String nom, int nombreCabines) {
        this.nom = nom;
        this.nombreCabines = nombreCabines;
    }

    public String getNom() {
        return nom;
    }
    public int getNombreCabines() {
        return nombreCabines;
    }

    public boolean ajouterActivite(String activite) {
        if (activite == null)
            throw new IllegalArgumentException("L'activité peux pas être un élément vide");
        activites.add(activite);
        return true;
    }

    public boolean retirerActivite(String activite) {
        if (activite == null)
            throw new IllegalArgumentException("L'activité peux pas être un élément vide");
        activites.remove(activite);
        return true;
    }

    @Override
    public String toString() {
        return "Bateau: " + nom + " avec " + nombreCabines + " cabines.";
    }
}
