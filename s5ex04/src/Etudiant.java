public class Etudiant {
    private String matriculeEtudiant, nomEtudiant, prenomEtudiant;
    private Serie serieEtudiant;

    public Etudiant(String matriculeEtudiant, String nomEtudiant, String prenomEtudiant, Serie serieEtudiant) {
        this.matriculeEtudiant = matriculeEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.serieEtudiant = serieEtudiant;
    }

    public String getMatriculeEtudiant() {
        return matriculeEtudiant;
    }
    public String getNomEtudiant() {
        return nomEtudiant;
    }
    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }
    public Serie getSerieEtudiant() {
        return serieEtudiant;
    }

    public void changerSerie(Serie serie){
        if (this.serieEtudiant == serie)
            throw new IllegalArgumentException("Etudiant est déja dans cette série");
        if (this == this.serieEtudiant.getDelegueSerie())
            throw new IllegalArgumentException("Etudiant est délégué de la série");
        this.serieEtudiant = serie;
    }

    public String toString() {
        return matriculeEtudiant + ", " + nomEtudiant + " " + prenomEtudiant + " (série " + this.serieEtudiant.getNomSerie() + ")";
    }
}
