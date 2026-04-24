package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParkingTest {

	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void test1() {
		Parking p = new Parking(10);
		assertEquals(10,p.getNbPlacesLibres()); 
		// renvoie le nombre de places libres (==10)
	}
	
	@Test 
	void test2() {
		Parking p = new Parking(10);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		assertEquals(9,p.getNbPlacesLibres());

	}
	
	@Test
	void test3() {
		Parking p = new Parking(10);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		p.retirer(v);
		assertEquals(10,p.getNbPlacesLibres());
       //ici on la rajoute apres on reicremente
	}
}
