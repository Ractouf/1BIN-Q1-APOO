public class TestLivre {

    public static void main(String[] args) {
        Livre livre1 = new Livre(2000, 200, 20,"0-321-54325-4","APOO","Vandeputte","François" );
        Livre livre2 = new Livre(1000,100,10,"0-321-54325-5","APOOO","Charles","Charles");
        System.out.println(livre1.toString());
        System.out.println(livre2.anneeEdition + " " + livre2.pages + " " + livre2.prix + " " + livre2.isbn + " " + livre2.titre + " " + livre2.nom + " " + livre2.prenom);
    }


}
