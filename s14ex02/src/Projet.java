import java.util.ArrayList;
import java.util.Iterator;

public class Projet {
    private int numero = 1;
    private String nom;
    private boolean termine;
    private ArrayList<Developpeur> developpeurs = new ArrayList<Developpeur>();
    private static int nombreDeProjets = 0;

    public Projet(String nom) {
        if (nom == null)
            throw new IllegalArgumentException("Nom invalide");
        this.nom = nom;
        termine = false;
        nombreDeProjets ++;
        numero = nombreDeProjets;
    }

    public int getNumero() {
        return numero;
    }
    public String getNom() {
        return nom;
    }
    public boolean isTermine() {
        return termine;
    }

    public boolean ajouter(Developpeur developpeur) {
        if (termine || developpeurs.contains(developpeur))
            return false;
        developpeur.signalerNouveauProjet();
        developpeurs.add(developpeur);
        return true;
    }

    public boolean retirer(Developpeur developpeur) {
        if (termine || !developpeurs.contains(developpeur))
            return false;
        developpeur.signalerFinDUnProjet();
        developpeurs.remove(developpeur);
        return true;
    }

    public boolean terminer() {
        termine = true;
        for (Developpeur developpeur : developpeurs) {
            developpeur.signalerFinDUnProjet();
        }
        return true;
    }

    public Iterator<Developpeur> it = developpeurs.iterator();

    @Override
    public String toString() {
        String toString = "Projet " + numero + " : " + nom + "\nDeveloppeur(s) sur le projet :\n";
        if (developpeurs.isEmpty())
            return toString + "\tAucun developpeur\n";
        else {
            for (Developpeur developpeur : developpeurs) {
                toString += "\t" + developpeur.toString() + "\n";
            }
            return toString;
        }
    }
}
