package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infoMarche = controlAfficherMarche.donnerInfosMarche();
		if (infoMarche.length == 0) {
			System.out.println("le marché est vide, revenez plus tard");
		} else {
			System.out.println(nomAcheteur + ", vous trouvrez au marché");
			for (String string : infoMarche) {
				System.out.println("-" + string);
			}

		}

	}
}
