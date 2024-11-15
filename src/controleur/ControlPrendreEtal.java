package controleur;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Village;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite, Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		return village.rechercherEtalVide();
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		village.trouverHabitant(nomVendeur);
		int numeroEtal = -1;
		Gaulois gaulois = village.trouverHabitant(nomVendeur);

		Produit p;
		if (produit.equals("sanglier"))
			p = new Sanglier(10, gaulois);
		else
			p = new Poisson("hier");

		numeroEtal = village.installerVendeur(gaulois, p, nbProduit);
		return numeroEtal;
	}

	public boolean verifierIdentite(String nomVendeur) {
		return controlVerifierIdentite.verifierIdentite(nomVendeur);

	}
}
