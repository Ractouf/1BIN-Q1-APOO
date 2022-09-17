public class TestSite {
    public static void main(String[] args) {

        Site superContent = new Site("www.supercontent.com");
        Film endgame = new Film("Avengers: Endgame", "action", 181, 279800000);
        Film avengers = new Film("The Avengers", "action", 143);
        Serie bigbang = new Serie("The Big Bang Theory", "comédie", 279);
        Film mauvaisEndgame = new Film("Avengers: Endgame", "action", 181, 279800000);

        superContent.ajouter(endgame);
        superContent.ajouter(avengers);
        superContent.ajouter(bigbang);

        System.out.println(superContent);

        System.out.println(superContent.effacer(mauvaisEndgame));

        System.out.println(superContent);

    }
}
