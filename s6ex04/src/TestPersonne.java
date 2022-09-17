public class TestPersonne {
    public static void main(String[] args) {
        Personne parent1Albert = new Personne("Bonte","André","12.11.03-001.07",
                'M');

        Personne parent1Phillipe = new Personne("Bonte","Albert","44.09.11-002.23",
                'M',parent1Albert);
        Personne parent2Phillipe = new Personne("Leclercq","Marie","47.09.11-002.23",
                'F');

        Personne parent1Personne1 = new Personne("Bonte","Philippe","70.04.15-001.61",
                'M',parent1Phillipe,parent2Phillipe);
        Personne parent2Personne1 = new Personne("Maes","Julie","73.01.20-002.65",
                'F');
        Personne personne1 = new Personne("Bonte","Elizabeth","01.10.25-004.16",
                'F',parent1Personne1,parent2Personne1);

        Adresse adresse1 = new Adresse("Grand rue","142","7000","Mons");
        parent1Personne1.setDomicile(adresse1);
        parent2Personne1.setDomicile(adresse1);
        personne1.setDomicile(adresse1);

        System.out.println(personne1);
        System.out.println(parent1Personne1);
        System.out.println(parent1Phillipe);
        System.out.println(parent1Albert);

        System.out.println(personne1.estDescendant(parent2Phillipe));
    }
}
