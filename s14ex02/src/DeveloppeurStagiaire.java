public class DeveloppeurStagiaire extends Developpeur {
    private String ecole;

    public DeveloppeurStagiaire(String nom, String ecole) {
        super(nom, 100);
        this.ecole = ecole;
    }

    public String getEcole() {
        return ecole;
    }

    @Override
    public String toString() {
        return "Developpeur Stagiaire : " + getNom() + ", Specialité : " + getSpecialite() + ", Salaire : " + getSalaire() +", Nombre de projets en cours : " + getNbProjetsEnCours() + ", Ecole : " + ecole;
    }
}
