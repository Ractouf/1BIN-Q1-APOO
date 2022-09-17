public class Joueur extends MembreFederation {
    private char positionTerrain;
    private final static char[] POSITIONS_POSSIBLES = {'G', 'D', 'M', 'A'};

    public Joueur(String nom, String prenom, String nationalite, char positionTerrain) {
        super(nom, prenom, nationalite);
        this.positionTerrain = positionTerrain;
    }

    public void setPositionTerrain(char positionTerrain) {
        this.positionTerrain = positionTerrain;
    }
}
