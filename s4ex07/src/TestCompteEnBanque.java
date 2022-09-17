public class TestCompteEnBanque {
    public static void main(String[] args) {
        Date dateDeNaissancePersonne1 = new Date(2002,12,3);
        Date dateOuverturePersonne1 = new Date(2021,10,9);
        Date dateValiditePersonne1 = new Date(2026,10,9);

        Adresse domicilePersonne1 = new Adresse("Avenue Grandchamp","175","1150","Bruxelles");
        Personne personne1 = new Personne("Vandeputte","François",dateDeNaissancePersonne1,domicilePersonne1);
        Personne personne2 = new Personne("vandeputte","Pierre",dateDeNaissancePersonne1,domicilePersonne1);

        CompteEnBanque compteEnBanque1 = new CompteEnBanque(personne1,dateOuverturePersonne1,
                dateValiditePersonne1,"000-000000089-89", 1200);
        CompteEnBanque compteBeneficiaire = new CompteEnBanque(personne2,dateOuverturePersonne1,dateValiditePersonne1,
                "000-000000089-99",1200);

        System.out.println(compteEnBanque1.toString());
        System.out.println(compteEnBanque1.effectuerVirement(1000,compteBeneficiaire));
        System.out.println(compteEnBanque1.toString());
        System.out.println(compteBeneficiaire.toString());
    }
}
