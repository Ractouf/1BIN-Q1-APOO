
public class Membre {
	private String nom, prenom, numeroTelephone;
	private Membre parrain;

	//Ajoutez un constructeur initialisant le nom, le prénom et le numéro de téléphone du membre.

	public Membre(String nom, String prenom, String numeroTelephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroTelephone = numeroTelephone;
	}

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	public Membre getParrain() {
		return parrain;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public boolean initialiserParrain(Membre parrain){
		if (this.parrain != null)
			return false;
		if (this == parrain)
			return true;
		this.parrain = parrain;
		return true;
	}

	public String toString() {
		if (this.parrain != null)
			return nom + " " + prenom + "\nNuméro de téléphone: " + numeroTelephone + "\nParrain: " + parrain.getPrenom() + " " + parrain.getNom();
		return nom + " " + prenom + "\nNuméro de téléphone: " + numeroTelephone;
	}

	//Ajoutez une méthode toString qui renverra toutes les informations du membre sous forme textuelle.
	//Si le membre a un parrain, il faut uniquement reprendre le prénom et le nom du parrain. Sinon, il faut dire que le membre n'a pas de parrain.






}
