public class Biere extends BoissonAlcoolisee {

    private boolean pression;

    public Biere(String nom, int contenance, double prix, double degreAlcool, boolean pression) {
        super(nom, contenance, prix,  degreAlcool);
        this.pression = pression;
    }

    public boolean isPression() {
        return pression;
    }

    public String toString() {
        if (pression)
            return "Bière en pression  : " + super.toString();
        return "Bière en bouteille  : " + super.toString();
    }
}
