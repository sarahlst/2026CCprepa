package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParkingTest {

	
	@Test
	void test() {
		Parking p = new Parking(10);
		assertEquals(10,p.getNbPlacesLibres()); 
		// renvoie le nombre de places libres (==10)
	}

}
