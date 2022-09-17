public class TestProduit {

    public static void main(String[] args) {
        Panier panier = new Panier();
        DVD dvd1 = new DVD("1",2,"Le roi lion","Steve Jobs");
        System.out.println("Ajout de DVD: " + panier.ajouterProduit(dvd1));
        System.out.println(panier);
        System.out.println("Prix total: " + panier.calculerPrix());
        System.out.println("Trouver produit: " + panier.trouverProduit(dvd1));

        CD cd1 = new CD("2",3,"Thiller", "Andy Warhol",10);
        System.out.println("Ajout de CD: " + panier.ajouterProduit(cd1));
        System.out.println(panier);
        System.out.println("Prix total: " + panier.calculerPrix());
        System.out.println("Nombre de produits: " + panier.nbrProduits());
    }
}
