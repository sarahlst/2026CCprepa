package ilu2;

public class Ambulance extends Vehicule {

	public Ambulance(String immatriculation) {
		super(immatriculation);
		
	}
	
	@Override
	public boolean estAbonne(Parking p)
	{
		return true;
	}

}
