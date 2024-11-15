package controleur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlPrendreEtalTest {

	ControlVerifierIdentite cv;
	ControlPrendreEtal cp;
	ControlEmmenager cm;
	ControlAfficherVillage caff;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 2);
		Chef chef = new Chef("Chef", 1, village);
		village.setChef(chef);
		cm = new ControlEmmenager(village);
		caff = new ControlAfficherVillage(village);
		cp = new ControlPrendreEtal(cv, village);
		cm.ajouterGaulois("Asterix", 5);
		cm.ajouterGaulois("Panoramix", 3);
		cp.prendreEtal("Asterix", "fleur", 5);

	}

	@Test
	void testResteEtals() {
		assertTrue(cp.resteEtals());
		// cp.prendreEtal("Panoramix", "poisson", 5);
		// assertFalse(cp.resteEtals());
	}

	@Test
	void testPrendreEtal() {
		assertEquals(1, cp.prendreEtal("Panoramix", "poisson", 5));
	}

	@Test
	void testVerifierIdentite() {
		assertTrue(cp.verifierIdentite("Asterix"));
	}

}
