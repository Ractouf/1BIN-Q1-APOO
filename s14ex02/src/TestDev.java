public class TestDev {
    public static void main(String[] args) {
        Projet projet1 = new Projet("Site stages");
        Projet projet2 = new Projet("AVENGERS");
        Developpeur olivier = new Developpeur("Olivier","infra", 3500);
        Developpeur loic = new Developpeur("Loic","full-stack", 3000);
        DeveloppeurStagiaire zoe = new DeveloppeurStagiaire("Zoe", "IPL");
        zoe.setSpecialite("back-end");

        projet1.ajouter(olivier);
        projet1.ajouter(zoe);


        System.out.println(projet1);
        System.out.println(projet2);


        System.out.println(projet1);
    }
}
