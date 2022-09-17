import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Commande {
	private ArrayList<LigneDeCommande> listeDeCommandes;
	private LocalDate date;
	private double sommePrix = 0;

	public Commande(){
		date = LocalDate.now();
		listeDeCommandes = new ArrayList<LigneDeCommande>();
	}

	public LocalDate getDate() {
		return date;
	}

	public void ajouter(Article article){
		if (article == null)
			throw new IllegalArgumentException("L'article ne peut être null");
	}

	public double calculerPrixTotal(){
		for (LigneDeCommande article : listeDeCommandes)
			sommePrix += article.calculerPrixTotalTVAComprise() * article.getQuantite();
		return sommePrix;
	}

	public double quantite(Article article){
		if (article == null)
			throw new IllegalArgumentException("L'artice ne peut pas être null");
		return sommePrix;
	}
	
	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String resultat = date.format(formatter)+" \n";
		System.out.print("Liste des articles: ");
		for (LigneDeCommande article : listeDeCommandes) {
			System.out.print("\n");
			System.out.print(article);
		}
		System.out.println("Prix total: " + sommePrix);
		
		return resultat;
	}
}
