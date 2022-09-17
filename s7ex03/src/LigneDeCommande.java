public class LigneDeCommande {
    private Article article;
    private int quantite;

    public LigneDeCommande(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
        if (article == null)
            throw new IllegalArgumentException("L'article peux pas être null");
        if (quantite <= 0)
            throw new IllegalArgumentException("La quantitée doit être plus grande que 0");
    }

    public LigneDeCommande(Article article) {
        this(article,1);
    }

    public Article getArticle() {
        return article;
    }
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
        if (quantite <= 0)
            throw new IllegalArgumentException("La quantitée doit être plus grande que 0");
    }

    public double calculerPrixTotalTVAComprise() {
        return article.calculerPrixTVAComprise()*quantite;
    }

    public String toString() {
        return "[" + quantite + "x" + "]";
    }
}
