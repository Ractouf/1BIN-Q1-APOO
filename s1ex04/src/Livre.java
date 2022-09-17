public class Livre {
    int anneeEdition, pages;
    double prix;
    String isbn,titre, nom, prenom;

    Livre(int nAnneeEdition,int nPages,double nPrix,String nIsbn,String nTitre,String nNom,String nPrenom) {
        anneeEdition = nAnneeEdition;
        pages = nPages;
        prix = nPrix;
        isbn = nIsbn;
        titre = nTitre;
        nom = nNom;
        prenom = nPrenom;
    }

    @Override
    public String toString() {
        return "Livre:" +
                "L'année d'édition= " + anneeEdition +
                ", pages= " + pages +
                ", prix= " + prix +
                ", isbn= " + isbn + " " +
                ", titre= " + titre + " " +
                ", nom= " + nom + " " +
                ", prenom= " + prenom + " ";
    }
}
