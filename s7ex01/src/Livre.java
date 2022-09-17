import java.util.Objects;

public class Livre {
	private String isbn, nom, prenom, titre;
	private int nbPages, anneeEdition;
	private double prixConseille;

	public Livre(String isbn, String nom, String prenom, String titre, int nbPages, double prixConseille, int anneeEdition) {
		this(isbn,nom,titre,nbPages,prixConseille,anneeEdition);
		if (prenom == null) throw new IllegalArgumentException("Le prenom ne peut pas être null");
		this.prenom = prenom;
	}
	
	public Livre(String isbn, String nom, String titre, int nbPages, double prixConseille, int anneeEdition) {
		if (isbn == null) throw new IllegalArgumentException("L'isbn ne peut pas être null");
		if (nom == null) throw new IllegalArgumentException("Le nom ne peut pas être null");
		if (titre == null) throw new IllegalArgumentException("Le titre ne peut pas être null");
		if (nbPages <=0) throw new IllegalArgumentException("Le nombre de pages doit être strictement positif");
		this.isbn = isbn;
		this.nom = nom;
		this.titre = titre;
		this.nbPages = nbPages;
		this.setPrixConseille(prixConseille);
		this.anneeEdition = anneeEdition;
	}

	public String getIsbn() {
		return isbn;
	}
	public String getTitre() {
		return titre;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getNbPages() {
		return nbPages;
	}
	public double getPrixConseille() {
		return prixConseille;
	}
	public int getAnneeEdition() {
		return anneeEdition;
	}

	public void setPrixConseille(double prixConseille)  {
		if (prixConseille < 0) throw new IllegalArgumentException("Le prix ne peut pas être négatif");
		this.prixConseille = prixConseille;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Livre livre = (Livre) o;
		return isbn.equals(livre.isbn);
	}
	public int hashCode() {
		return Objects.hash(isbn);
	}

	public String toString(){
		return titre +  " de " + nom + " " + prenom;
	}
	
}
