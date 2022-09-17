public class Adresse {
    private String rue, numero, codePostal, ville;

    public Adresse(String nRue, String nNumero, String nCodePostal, String
            nVille){
        rue = nRue;
        numero = nNumero;
        codePostal = nCodePostal;
        ville = nVille;
    }
    //getteurs
    public String getRue() {
        return rue;
    }
    public String getNumero() {
        return numero;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public String getVille() {
        return ville;
    }
    //setteurs
    public void setRue(String nRue) {
        rue = nRue;
    }
    public void setNumero(String nNumero) {
        numero = nNumero;
    }
    public void setCodePostal(String nCodePostal) {
        codePostal = nCodePostal;
    }
    public void setVille(String nVille) {
        ville = nVille;
    }

    public String toString(){
        return rue + ", " + numero + " " + codePostal + " " + ville;
    }
}

