import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Commande {
	private ArrayList<Article> articles;
	private LocalDate date;
	private double sommePrix = 0;

	public Commande(){
		date = LocalDate.now();
		articles = new ArrayList<>();
	}

	public LocalDate getDate() {
		return date;
	}

	public void ajouter(Article article){
		if (article == null)
			throw new IllegalArgumentException("L'article ne peut être null");
		articles.add(article);
	}

	public double calculerPrixTotal(){
		for (Article article : articles) {
			sommePrix += article.getPrixHTVA() + (article.getPrixHTVA() / 100 * article.getTauxTVA());
		}
		return sommePrix;
	}
	
	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String resultat = date.format(formatter)+" \n";
		System.out.print("Liste des articles: ");
		for (Article article : articles) {
			System.out.print("\n");
			System.out.print(article);
		}
		System.out.println("Prix total: " + sommePrix);
		
		return resultat;
	}
}
