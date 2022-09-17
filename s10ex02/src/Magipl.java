public class Magipl {
    public static void main(String[] args) {
        Main main1 = new Main();
        Terrain terrain1 = new Terrain('b');
        Creature creature1 = new Creature(6,"Golem", 4, 6);
        Sortilege sortilege1 = new Sortilege(1,"Croissance", "Gigantesque");

        System.out.println(terrain1.fournirDetail());
        System.out.println(creature1.fournirDetail());
        System.out.println(sortilege1.fournirDetail());

        main1.piocher(terrain1);

        System.out.println(main1);

        main1.piocher(creature1);

        System.out.println(main1);

        main1.piocher(sortilege1);

        System.out.println(main1);

        System.out.println(main1.jouer(1));

        System.out.println(main1);

        System.out.println(main1.jouer(1));

        System.out.println(main1);
    }
}
