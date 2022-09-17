public class TestPersonne {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Rue de la gare","34","5000","Namur");
        Date date1 = new Date(1968,02,06);
        Date date2 = new Date(1970,03,07);
        Personne personne1 = new Personne("Schmidt","Paul",date1,adresse);
        Personne personne2 = new Personne("Gobert","Valérie",date2,adresse);
        personne2.demenager("Avenue Grandchamp","175","1150","Bruxelles");
        System.out.println(personne1.toString());
        System.out.println(personne2.toString());
    }
}
