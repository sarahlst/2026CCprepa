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
		Parking p = new Parking(10,0);
		assertEquals(10,p.getNbPlacesLibres()); 
		// renvoie le nombre de places libres (==10)
	}
	
	@Test 
	void test2() {
		Parking p = new Parking(10,0);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		assertEquals(9,p.getNbPlacesLibres());

	}
	
	@Test
	void test3() {
		Parking p = new Parking(10,0);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		p.retirer(v,0);
		assertEquals(10,p.getNbPlacesLibres());
       //ici on la rajoute apres on reicremente
	}
	
	@Test
	void test4() {
		Parking p = new Parking(10,3);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		assertEquals(15,p.retirer(v, 5));
		assertEquals(10,p.getNbPlacesLibres());
	}
	
	/*@Test
	void test5() {
		Parking p = new Parking(10,3);
		Vehicule v = new Vehicule("1");
	    assertEquals(true,p.ajouter(v));
	    Parking p1 = new Parking(0,3);
	    assertEquals(false,p1.ajouter(v));
	    
	}*/
	
	
}
