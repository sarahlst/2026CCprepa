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
	
	@Test
	void test5() {
		Parking p = new Parking(10,3);
		Vehicule v = new Vehicule("1");
	    assertEquals(true,p.ajouter(v));
	    Parking p1 = new Parking(0,3);
	    assertEquals(false,p1.ajouter(v));
	    
	}
	
	@Test
	void test6() {
		Parking p = new Parking(10,3);
		Vehicule v = new Vehicule("1");
		Vehicule v1 = new Vehicule("2");
		p.ajouter(v);
		assertEquals(true,p.contient(v));
		assertEquals(false,p.contient(v1));
	}
	
	@Test
	void test7() {
		Parking p1 = new Parking(100, 0);
		Parking p2 = new Parking(100, 0);
		Vehicule v = new Vehicule("1");
		p1.ajouter(v);
		assertEquals(0,p1.retirer(v, 5));
		assertThrows(IllegalArgumentException.class, () -> {
			p2.retirer(v, 1);
			});

	}
	
	@Test 
	void test8() {
		Parking p1 = new Parking(100, 0);
		Parking p2 = new Parking(100, 0);
		Vehicule v = new Vehicule("1");
		v.abonner(p1);
		assertEquals(true,v.estAbonne(p1));
		assertEquals(false,v.estAbonne(p2));
		

	}
	
	@Test
	void test9() {
		Parking p = new Parking(100, 10,(float) 0.5);
		Vehicule v = new Vehicule("1");
		v.abonner(p);
		p.ajouter(v);
		
		assertEquals(15,p.retirer(v, 3));
	}
	
	@Test
	void test10() {
		Parking p = new Parking(100, 10,(float) 0.5);
		Ambulance a = new Ambulance("A123");
		Ambulance a1 = new Ambulance("A1234");
		p.ajouter(a);
		p.ajouter(a1);
		
		assertEquals(15,p.retirer(a, 3));
		assertEquals(10,p.retirer(a1, 2));
		
		
	}
	
	
	
	
}
