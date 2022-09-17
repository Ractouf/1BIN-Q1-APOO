import java.util.ArrayList;
import java.util.Iterator;

public class Club {
    private String nom;
    private int matricule;
    private int matriculeSuivant = 1;
    private Entraineur entraineur;
    private Terrain terrain, terrainEntrainement;
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

    public Club(String nom, Terrain terrain) {
        this.nom = nom;
        this.terrain = terrain;
        this.matricule = matriculeSuivant;
        matriculeSuivant ++;
    }
    public Club(String nom, Terrain terrain, Terrain terrainEntrainement) {
        this.nom = nom;
        this.terrain = terrain;
        this.terrainEntrainement = terrainEntrainement;
        this.matricule = matriculeSuivant;
        matriculeSuivant ++;
    }

    public void setTerrainEntrainement(Terrain terrainEntrainement) {
        this.terrainEntrainement = terrainEntrainement;
    }

    public boolean engagerEntraineur(Entraineur entraineur) {
        if (entraineur == null)
            throw new IllegalArgumentException("Entraineur invalide");
        if (!entraineur.estDansUnClub())
            return false;
        this.entraineur = entraineur;
        return true;
    }
    public boolean engagerJoueur(Joueur joueur) {
        if (joueur == null)
            throw new IllegalArgumentException("Joueur invalide");
        if (!joueur.estDansUnClub() || joueurs.contains(joueur))
            return false;
        joueurs.add(joueur);
        return true;
    }
    public boolean licencierEntraineur(Entraineur entraineur) {
        if (entraineur == null)
            throw new IllegalArgumentException("Entraineur invalide");
        if (entraineur != this.entraineur)
            return false;
        this.entraineur = null;
        return true;
    }
    public boolean licencierJoueur(Joueur joueur) {
        if (joueur == null)
            throw new IllegalArgumentException("Joueur invalide");
        if (!joueurs.contains(joueur))
            return false;
        joueurs.remove(joueur);
        return true;
    }
    public int nombreJoueurs() {
        return joueurs.size();
    }

    public Iterator<Joueur> it = joueurs.iterator();


}
