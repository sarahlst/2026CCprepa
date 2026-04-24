package ilu2;

public class Vehicule {
	private String immatriculationVehicule;
	private Parking[] abonnementVehicule = new Parking[10];

	public Vehicule(String immatriculation) {
		this.immatriculationVehicule = immatriculation;
	}

	public void abonner(Parking p) {
		for (int i = 0; i < abonnementVehicule.length; i++) {
			if (abonnementVehicule[i] == null) {
				abonnementVehicule[i]=p;
				break;
			}
		}
	}
	
	public boolean estAbonne(Parking p) {
		for (Parking p1 : abonnementVehicule)
		{
			if(p1 != null && p1.equals(p) ) 
			{
				return true;
			}
		}
		return false;
	}
	
	

}
