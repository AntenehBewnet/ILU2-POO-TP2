package controleur;

import personnages.Gaulois;
import villagegaulois.IEtal;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public IEtal trouverEtalVendeur(String nomVendeur) {
		IEtal etal = null;
		Gaulois gaulois = village.trouverHabitant(nomVendeur);
		if (gaulois != null) {
			etal = village.rechercherEtal(gaulois);
		}
		return etal;
	}
}
