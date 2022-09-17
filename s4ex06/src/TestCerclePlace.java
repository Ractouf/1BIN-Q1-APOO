public class TestCerclePlace {
    public static void main(String[] args) {
        Point centre1 = new Point(4,2.5);
        CerclePlace cercle1 = new CerclePlace(4,centre1);
        CerclePlace cercle2 = new CerclePlace(12.5,centre1);

        cercle2.setCentre(8,2.5);

        System.out.println(cercle1.toString());
        System.out.print(cercle2.toString());
    }
}
