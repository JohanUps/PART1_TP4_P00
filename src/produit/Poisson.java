package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String datePeche) {
		super("poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}
	
	@Override
	public String decrireProduit() {
		StringBuilder description = new StringBuilder();
		description.append(super.getNom());
		description.append(" p�ch�s ");
		description.append(datePeche);
		return description.toString();
	}
}
