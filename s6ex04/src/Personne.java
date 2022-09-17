public class Personne {
    private String nom, prenom, numeroRegistreNational;
    private char genre;
    private Adresse domicile;
    private Personne parent1;
    private Personne parent2;

    public Personne(String nom, String prenom, String numeroRegistreNational, char genre, Personne parent1, Personne parent2) {
        if (nom == null || prenom == null || numeroRegistreNational == null)
            throw new IllegalArgumentException("L'attribut ne peut pas être vide");
        this.nom = nom;
        this.prenom = prenom;
        this.numeroRegistreNational = numeroRegistreNational;
        this.genre = genre;
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public Personne(String nom, String prenom, String numeroRegistreNational, char genre, Personne parent1) {
        this(nom,prenom,numeroRegistreNational,genre,parent1,null);
    }

    public Personne(String nom, String prenom, String numeroRegistreNational, char genre) {
        this(nom,prenom,numeroRegistreNational,genre,null,null);
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNumeroRegistreNational() {
        return numeroRegistreNational;
    }
    public char getGenre() {
        return genre;
    }
    public Adresse getDomicile() {
        return domicile;
    }
    public Personne getParent1() {
        return parent1;
    }
    public Personne getParent2() {
        return parent2;
    }

    public void setDomicile(Adresse domicile) {
        if (domicile == null)
            throw new IllegalArgumentException("Cet attribut ne peux être vide");
        this.domicile = domicile;
    }

    public boolean estDescendant(Personne personne){
        if (personne.equals(this.parent1) || personne.equals(this.parent2))
            return true;
        if (personne.equals(this.parent1.parent1) || personne.equals(this.parent1.parent2))
            return true;
        return personne.equals(this.parent2.parent1) || personne.equals(this.parent2.parent2);
    }

    public String toString() {
        if (parent1 == null && parent2 == null)
            return prenom + " " + nom + "\nSexe: " + genre + "\nNuméro de régistre national: " + numeroRegistreNational + "\nParents: inconnu";

        if (parent1 == null)
            return prenom + " " + nom + "\nSexe: " + genre + "\nNuméro de régistre national: " + numeroRegistreNational +
                    "\nParents: " + parent2.getPrenom() + " " + parent2.getNom() + "\n";

        if (parent2 == null)
            return prenom + " " + nom + "\nSexe: " + genre + "\nNuméro de régistre national: " + numeroRegistreNational +
                    "\nParents: " + parent1.getPrenom() + " " + parent1.getNom() + "\n";

        return prenom + " " + nom + "\nSexe: " + genre + "\nNuméro de régistre national: " + numeroRegistreNational +
                "\nParents: " + parent1.getPrenom() + " " + parent1.getNom() + " et " + parent2.getPrenom() + " " + parent2.getNom() + "\n";
    }
}
