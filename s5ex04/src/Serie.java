public class Serie {
    private char nomSerie;
    private Etudiant delegueSerie;

    public Serie(char nomSerie) {
        this.nomSerie = nomSerie;
    }

    public char getNomSerie() {
        return nomSerie;
    }
    public Etudiant getDelegueSerie() {
        return delegueSerie;
    }

    public void elireDelegue(Etudiant etudiant){
        if (this != etudiant.getSerieEtudiant())
            throw new IllegalArgumentException("L'étudiant est pas dans cette série");
        if (delegueSerie != null)
            throw new IllegalArgumentException("Il y déja un délégué");

        delegueSerie = etudiant;
    }

    public String toString() {
        if (this.delegueSerie != null) {
            return "Série " + this.nomSerie + " (délégué : " + this.delegueSerie.getNomEtudiant() + ")";
        } else {
            return "Série " + this.nomSerie;
        }
    }
}
