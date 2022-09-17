import java.util.ArrayList;

public class Catalogue {
    private ArrayList <Livre> livres;

    public Catalogue(){
        livres = new ArrayList<>();
    }

    public boolean contient(Livre livre){
        return livres.contains(livre);
    }
    public boolean ajouter(Livre livre){
        if (this.contient(livre))
            return false;
        return livres.add(livre);
    }
    public boolean retirer(Livre livre){
        return livres.remove(livre);
    }
    public int nombreDeLivres(){
        if (livres.isEmpty())
            System.out.println("La liste est vide");
        return livres.size();
    }
    public boolean estVide(){
        return livres.isEmpty();
    }
    public Livre chercherLivre(String isbn){
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn))
                return livre;
        }
        return null;
    }

    public String toString() {
        System.out.print("Liste des livres: ");
        for (Livre livre : livres) {
            System.out.print("\n");
            System.out.print(livre);
        }
        return "";
    }
}
