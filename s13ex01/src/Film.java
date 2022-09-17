public class Film extends ContenuVideo {
    private int duree;
    private long recettes;

    public Film(String titre, String categorie, int duree, long recettes) {
        super(titre, categorie);
        if (duree == 0)
            throw new IllegalArgumentException("durée invalide");
        this.duree = duree;
        this.recettes = recettes;
    }
    public Film(String titre, String categorie, int duree) {
        this(titre, categorie, duree, 0);
    }

    public void setDuree(int duree) {
        if (duree == 0)
            throw new IllegalArgumentException("durée invalide");
        this.duree = duree;
    }
    public void setRecettes(long recettes) {
        if (recettes == 0)
            throw new IllegalArgumentException("recettes invalides");
        this.recettes = recettes;
    }

    @Override
    public String toString() {
        return "Film [id = " + getId() + ", titre = " + getTitre() + ", catégorie = " + getCategorie() + ", durée = " + duree + ", recettes = " + recettes + "]";
    }
}
