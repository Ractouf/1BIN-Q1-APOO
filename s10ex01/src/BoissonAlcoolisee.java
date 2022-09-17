public class BoissonAlcoolisee extends Boisson {

    private double degreAlcool;

    public BoissonAlcoolisee(String nom, int contenance, double prix, double degreAlcool) {
        super(nom, contenance,  prix);
        this.degreAlcool = degreAlcool;
    }

    public double getDegreAlcool() {
        return degreAlcool;
    }

    public String toString() {
        return super.toString() + " (degré d'alcool: " + degreAlcool +"°)";
    }
}
