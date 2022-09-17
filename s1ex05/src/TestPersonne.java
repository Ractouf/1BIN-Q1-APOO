public class TestPersonne {
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse("Avenue Grandchamp","175","1150","Bruxelles");
        Personne personne1 = new Personne("Vandeputte","François",2002,12,03,adresse1);
        Personne personne2 = new Personne("Vandeputte","Lucie",2001,04,07,adresse1);
        Personne personne3 = new Personne("Vandeputte","Emma",2005,05,26,adresse1);
        System.out.println(personne1.toString());
        System.out.println(personne1.calculerAgeEn(2025));
        System.out.println(personne2.toString());
        System.out.println(personne3.toString());
    }
}
