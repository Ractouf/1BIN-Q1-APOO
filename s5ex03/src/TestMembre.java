public class TestMembre {
    public static void main(String[] args) {
        Membre membre1 = new Membre("Leconte","Emmeline","1");
        System.out.println(membre1);
        membre1.initialiserParrain(membre1);

        Membre membre2 = new Membre("Cambron","Isabelle","2");
        membre1.initialiserParrain(membre2);
        System.out.println(membre1);

        Membre membre3 = new Membre("Raphaël","Baroni","3");
        membre1.initialiserParrain(membre3);
        System.out.println(membre1);
    }
}
