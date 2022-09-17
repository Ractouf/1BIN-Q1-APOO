public class Adresse {
    private String rue, numero, codePostal, ville;
    public Adresse(String nRue, String nNumero, String nCodePostal, String
            nVille){
        rue = nRue;
        numero = nNumero;
        codePostal = nCodePostal;
        ville = nVille;
    }
    public String toString(){
        return rue + ", " + numero + " " + codePostal + " " + ville;
    }
}


