package produit;

public abstract class Produit {

	private Unite unite;
	private String nom;

	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;

	}

	public String getNom() {
		return nom;
	}

	public abstract String decrireProduit();

}
