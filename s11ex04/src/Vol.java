
import java.time.LocalDateTime;

public class Vol {
    private LocalDateTime dateHeure;
    private String numero, aeroportDepart, aeroprtArrivee;
    private double prix;

    public Vol(LocalDateTime dateHeure, String numero, String aeroportDepart, String aeroprtArrivee, double prix) {
        this.dateHeure = dateHeure;
        this.numero = numero;
        this.aeroportDepart = aeroportDepart;
        this.aeroprtArrivee = aeroprtArrivee;
        this.prix = prix;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }
    public String getNumero() {
        return numero;
    }
    public String getAeroportDepart() {
        return aeroportDepart;
    }
    public String getAeroprtArrivee() {
        return aeroprtArrivee;
    }
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Vol: " + numero + " à " + dateHeure + "\nDe: " + aeroportDepart + " à " + aeroprtArrivee + "\n";
    }
}
