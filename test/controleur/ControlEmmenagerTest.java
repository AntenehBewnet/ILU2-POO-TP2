package controleur;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {

	ControlEmmenager cm;
	ControlAfficherVillage caff;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 10);
		Chef chef = new Chef("Chef", 1, village);
		village.setChef(chef);
		cm = new ControlEmmenager(village);
		caff = new ControlAfficherVillage(village);
	}

	@Test
	void testIsHabitant() {
		// fail("Not yet implemented");
		cm.ajouterGaulois("Bonemine", 1);
		cm.ajouterGaulois("Asterix", 10);
		assertTrue(cm.isHabitant("Bonemine"));
		assertFalse(cm.isHabitant("Exist Pas"));
		cm.ajouterDruide("Panoramix", 1, 5, 8);
		assertTrue(cm.isHabitant("Panoramix"));

	}

	@Test
	void testAjouterDruide() {
		// fail("Not yet implemented");
		cm.ajouterDruide("Panoramix", 1, 5, 8);
		String[] villageois = caff.donnerNomsVillageois();
		assertTrue(villageois[1].contains("Panoramix"));
	}

	@Test
	void testAjouterGaulois() {
		// fail("Not yet implemented");
		cm.ajouterGaulois("Bonemine", 3);
		String[] villageois = caff.donnerNomsVillageois();
		assertEquals(villageois[1], "Bonemine");

	}

}
