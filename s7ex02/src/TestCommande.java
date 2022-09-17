public class TestCommande {
	public static void main(String[] args) {
		Commande commande = new Commande();
		Article article1 = new Article(
					"Lad700",
					"lapierre tecnic 700 lady",
					"Géométrie adaptée, composants et design spécifiques ont guidé la conception de notre gamme de VTT femme",
					899);
		commande.ajouter(article1);
		Article article2 = new Article("TandFit",
					"lapierre tandem route 2 race fit",
					"le vélo tandem, ludique, convivial et performant", 1785,
					23);
		commande.ajouter(article2);
		System.out.println(article1.calculerPrixTVAComprise());
		System.out.println(article1.calculerPrixTVAComprise(50));
		System.out.println(article1.getTauxTVA());
		System.out.println(article2.calculerPrixTVAComprise());
		article1.setTauxTVA(50);
		System.out.println(article1.getTauxTVA());
		System.out.println(commande);
	}

}
