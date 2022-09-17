import java.time.LocalDate;
import java.util.Locale;

public class TestVehicule {
    public static void main(String[] args) {
        LocalDate dateCamion1 = LocalDate.of(2002,12, 3);
        LocalDate dateCamion2 = LocalDate.of(2005,5,26);
        LocalDate dateVoiture1 = LocalDate.of(2001,4,7);
        LocalDate dateControleVoiture1 = LocalDate.of(2019,12,13);


        Utilitaire utilitaire1 = new Utilitaire("1-STZ-472",dateCamion1);
        Utilitaire utilitaire2 = new Utilitaire("1-XAT-429",dateCamion2,20);
        Voiture voiture1 = new Voiture("1-NRV-490",dateVoiture1);

        System.out.println(utilitaire1);
        System.out.println(utilitaire2);
        System.out.println(voiture1);

        System.out.println("Voiture 1 en ordre: " + voiture1.estEnOrdre());
        System.out.println("Utilitaire 1 en ordre: " + utilitaire1.estEnOrdre());
        System.out.println("Utilitaire 2 en ordre: " + utilitaire2.estEnOrdre());

        voiture1.setKilometrage(100000);
        voiture1.setDernierControle(dateControleVoiture1);
        utilitaire1.setKilometrage(50001);
        utilitaire2.setKilometrage(21);

        System.out.println("Voiture 1 en ordre: " + voiture1.estEnOrdre());
        System.out.println("Utilitaire 1 en ordre: " + utilitaire1.estEnOrdre());
        System.out.println("Utilitaire 2 en ordre: " + utilitaire2.estEnOrdre());

    }
}
