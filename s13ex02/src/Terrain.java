import java.time.LocalDate;

public class Terrain {
    private int longueur, largeur;
    private boolean pelouseNaturelle;
    private LocalDate dernierRenouvellementPelouse;

    public Terrain(int longueur, int largeur, boolean pelouseNaturelle) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.pelouseNaturelle = pelouseNaturelle;
        this.dernierRenouvellementPelouse = LocalDate.now();
    }

    public void setPelouseNaturelle(boolean pelouseNaturelle) {
        this.pelouseNaturelle = pelouseNaturelle;
        this.dernierRenouvellementPelouse = LocalDate.now();
    }
}
