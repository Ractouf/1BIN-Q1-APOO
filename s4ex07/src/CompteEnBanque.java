public class CompteEnBanque {
    private Personne titulaire;
    private Date dateOuverture, dateDeValidite;
    private String numero;
    private double solde;

    public CompteEnBanque(Personne nTitulaire, Date nDateOuverture, Date nDateDeValidite, String nNumero, double nSolde) {
        titulaire = nTitulaire;
        dateOuverture = nDateOuverture;
        dateDeValidite = nDateDeValidite;
        numero = nNumero;
        solde = nSolde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }
    public Date getDateOuverture() {
        return dateOuverture;
    }
    public Date getDateDeValidite() {
        return dateDeValidite;
    }
    public String getNumero() {
        return numero;
    }
    public double getSolde() {
        return solde;
    }
    public String nomTitulaire() {
        return titulaire.getNom();
    }
    public String prenomTitulaire() {
        return titulaire.getPrenom();
    }

    public void setDateDeValidite(Date nDateDeValidite) {
        dateDeValidite = nDateDeValidite;
    }

    public boolean retirer(double montant){
       if (solde < montant)
           return false;
       else {
           solde = solde - montant;
           return true;
       }
    }

    public boolean deposer(double montant){
        solde = solde + montant;
        return true;
    }

    public boolean effectuerVirement(double montant, CompteEnBanque compteBeneficiaire){
        if(solde < montant)
            return false;
        else {
            solde = solde - montant;
            compteBeneficiaire.solde = compteBeneficiaire.solde + montant;
            return true;
        }

    }

    public String toString() {
        return "Bonjour " + nomTitulaire() + " " + prenomTitulaire() + "\n" + "Votre numero de compte est: " + numero + "\n" +
                "Avec une solde de " + solde + "\n" + "Compte crée le: " + dateOuverture +"\n";
    }
}
