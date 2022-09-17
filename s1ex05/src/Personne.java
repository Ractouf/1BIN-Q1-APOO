public class Personne {
    private String nom, prenom;
    private int jour, mois, annee;
    private Adresse domicile;

    public Personne(String nNom, String nPrenom, int nAnnee, int nMois, int nJour, Adresse nDomicile) {
        nom = nNom;
        prenom = nPrenom;
        jour = nJour;
        mois = nMois;
        annee = nAnnee;
        domicile = nDomicile;
    }

    public int calculerAge() {
        return  2021 - annee;
    }

    public int calculerAgeEn(int an) {
        return  an - annee;
    }

    public Adresse fournirDomicile() {
        return domicile;
    }
    public String fournirDateNaissance(){
        return jour + "/" + mois + "/" + annee;
    }
    public String toString(){
        return prenom + " " + nom + " né(e) le " + fournirDateNaissance() + " domicile: " + fournirDomicile();
    }
}
