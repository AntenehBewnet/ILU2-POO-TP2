package controleur;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	ControlVerifierIdentite cv;
	ControlEmmenager ce;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 10);
		Chef chef = new Chef("Chef", 1, village);
		village.setChef(chef);
		cv = new ControlVerifierIdentite(village);
		ce = new ControlEmmenager(village);
	}

	@Test
	void testVerifierIdentite() {
		ce.ajouterGaulois("Asterix", 5);
		assertTrue(cv.verifierIdentite("Asterix"));
		assertFalse(cv.verifierIdentite("oblelix"));

	}

}
