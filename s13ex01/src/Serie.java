public class Serie extends ContenuVideo {
    private int nombreEpisodes;

    public Serie(String titre, String categorie, int nombreEpisodes) {
        super(titre, categorie);
        if (nombreEpisodes == 0)
            throw new IllegalArgumentException("nombres d'épisode(s) invalide(s)");
        this.nombreEpisodes = nombreEpisodes;
    }

    public void setNombreEpisodes(int nombreEpisodes) {
        if (nombreEpisodes == 0)
            throw new IllegalArgumentException("nombres d'épisode(s) invalide(s)");
        this.nombreEpisodes = nombreEpisodes;
    }

    @Override
    public String toString() {
        return "Serie [id = " + getId() + ", titre = " + getTitre() + ", catégorie = " + getCategorie() + ", nombre d'épisodes = " + nombreEpisodes + "]";
    }
}
