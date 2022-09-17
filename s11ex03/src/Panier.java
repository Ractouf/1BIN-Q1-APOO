import java.util.ArrayList;
import java.util.Iterator;

public class Panier {
    private ArrayList<Produit> produits = new ArrayList<Produit>();

    public boolean ajouterProduit(Produit produit) {
        if (produit == null)
            throw new IllegalArgumentException();
        return produits.add(produit);
    }

    public boolean supprimerProduit(Produit produit) {
        if (trouverProduit(produit) == null)
            throw new IllegalArgumentException("Le produit n'est pas dans le panier");
        return produits.remove(produit);
    }

    public double calculerPrix() {
        double somme = 0;
        for (Produit produit : produits) {
            somme += produit.getPrix();
        }
        return somme;
    }

    public Produit trouverProduit(Produit produit) {
        if (produit == null)
            throw new IllegalArgumentException();
        for (Produit value : produits) {
            if (produit == value)
                return value;
        }
        return null;
    }

    public int nbrProduits() {
        return produits.size();
    }

    public Iterator<Produit> it = produits.iterator();

    public String produits() {
        String toString = "Votre panier : \n";
        for (Produit produit : produits) {
            toString += produit.toString() + "\n";
        }
        return toString;
    }

    @Override
    public String toString() {
        return produits();
    }
}
