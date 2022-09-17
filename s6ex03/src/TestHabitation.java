public class TestHabitation {

    public static void main(String[] args) {
        try {
            Date naissancePersonne1 = new Date(2002,12,3);
            Adresse domicilePersonne1 = new Adresse("Avenue Grandchamp","175","1150","Bruxelles");
            Personne personne1 = new Personne("Vandeputte","François",naissancePersonne1,domicilePersonne1);
            Habitation habitation1 = new Habitation(personne1,domicilePersonne1,1000,2000,300);

            Date naissancePersonne2 = new Date(2001,7,5);
            Adresse domicilePersonne2 = new Adresse("Rue du loutrier","35","1050","Bruxelles");
            Personne personne2 = new Personne("Vandeputte","Lucie",naissancePersonne2,domicilePersonne2);

            System.out.println(habitation1);

            habitation1.setProprietaire(personne2);
            System.out.println(habitation1);

            try {
                habitation1.changerRevenuCadastral(20);
                System.out.println(habitation1);

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            try {
                System.out.println(habitation1.calculerPrecompte(30));

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }


        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
