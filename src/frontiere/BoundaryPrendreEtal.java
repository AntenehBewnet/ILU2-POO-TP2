package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnue = controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!nomVendeurConnue) {
			System.out.println("Je suis désolé "+ nomVendeur + " mais il faut être habitant de notre village pour commencer ici. ");
		}else {
			System.out.println("Bonjour "+ nomVendeur + " Je vais regarder si je peux trouver un étal. ");
			if (!controlPrendreEtal.resteEtals()) {
				System.out.println();
			} else {

			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
