import java.util.Arrays;
import java.util.Objects;

public abstract class ContenuVideo {
    private int id;
    private String titre, categorie;
    private static int idSuivant = 1;
    private final static String[] CATEGORIES_POSSIBLES = {"action","science-fiction","drame","comédie","horreur","thriller","documentaire","animation"};

    public ContenuVideo(String titre, String categorie) {
        if (titre == null || categorie == null)
            throw new IllegalArgumentException("paramètre(s) invalide(s)");
        if (!Arrays.asList(CATEGORIES_POSSIBLES).contains(categorie))
            throw new IllegalArgumentException("catégorie inexistante");
        this.titre = titre;
        this.categorie = categorie;
        this.id = idSuivant;
        idSuivant ++;
    }

    public int getId() {
        return id;
    }
    public String getTitre() {
        return titre;
    }
    public String getCategorie() {
        return categorie;
    }

    public void setTitre(String titre) {
        if (titre == null)
            throw new IllegalArgumentException("titre invalide");
        this.titre = titre;
    }
    public void setCategorie(String categorie) {
        if (!Arrays.asList(CATEGORIES_POSSIBLES).contains(categorie))
            throw new IllegalArgumentException("catégorie inexistante");
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenuVideo that = (ContenuVideo) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "";
    }
}
