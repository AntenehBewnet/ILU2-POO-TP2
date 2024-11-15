package controleur;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAfficherVillageTest {

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
	void testDonnerNomsVillageois() {
		cm.ajouterGaulois("Asterix", 5);
		cm.ajouterGaulois("Panoramix", 3);
		String[] tab = { "Chef", "Asterix", "Panoramix" };
		System.out.println(Arrays.toString(tab));
		System.out.println(Arrays.toString(caff.donnerNomsVillageois()));
		assertArrayEquals(tab, caff.donnerNomsVillageois());
	}

	@Test
	void testDonnerNomVillage() {
		assertEquals(caff.donnerNomVillage(), "LeVillage");
	}

	@Test
	void testDonnerNbEtals() {
		fail("Not yet implemented");
	}

}
