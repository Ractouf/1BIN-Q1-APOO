import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestAgenceDeVoyage {
    public static void main(String[] args) {
        LocalDateTime dateHeureVol = LocalDateTime.of(2021,12,17,8,10);
        LocalDateTime dateHeureVol2 = LocalDateTime.of(2021,12,30,10,30);
        LocalDate dateDepart = LocalDate.of(2021,12,17);
        LocalDate dateSejour = LocalDate.of(2021,12,18);
        Vol vol1 = new Vol(dateHeureVol, "BEL-178","Zaventem", "Bruxelles - Shuman",90);
        Vol vol2 = new Vol(dateHeureVol2,"BRU-489", "Oostende","Bruges",90);
        Hotel hotel1 = new Hotel("Le Damien", 6 , 11000000);
        Sejour sejour1 = new Sejour(dateSejour,8,vol1,vol2,hotel1);
        FormuleSimple formuleSimple1 = new FormuleSimple(dateDepart,13,vol1,vol2);

        System.out.println(formuleSimple1);
        System.out.println(sejour1);
    }
}
