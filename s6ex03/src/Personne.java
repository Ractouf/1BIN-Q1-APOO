public class Personne {
    private String nom, prenom;
    private Adresse domicile;
    private Date naissance;

    public Personne(String nNom, String nPrenom, Date nNaissance, Adresse nDomicile) {
        nom = nNom;
        prenom = nPrenom;
        domicile = nDomicile;
        naissance = nNaissance;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public int calculerAge() {
        return  2021 - naissance.getAnnee();
    }

    public int calculerAgeEn(int an) {
        return  an - naissance.getAnnee();
    }

    public Adresse fournirDomicile() {
        return domicile;
    }

    public Date fournirDateNaissance(){
        return naissance;
    }
    public String toString(){
        return prenom + " " + nom + " né(e) le " + fournirDateNaissance() + " domicile: " + fournirDomicile();
    }
   /* public void demenager(String nRue, String nNumero, String nCodePostal, String nVille) {
    domicile.setRue(nRue);
    domicile.setNumero(nNumero);
    domicile.setCodePostal(nCodePostal);
    domicile.setVille(nVille);
    }*/
    public void demenager(String nRue, String nNumero, String nCodePostal, String nVille) {
        domicile = new Adresse(nRue,nNumero,nCodePostal,nVille);
    }
}
