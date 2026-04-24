package ilu2;

public class Parking {

	private int nbPlacesLibres;

	public Parking(int nbPlaces) {
		this.nbPlacesLibres = nbPlaces;
	}

	public int getNbPlacesLibres() {
		return nbPlacesLibres;
	}

	public void ajouter(Vehicule v) {
		nbPlacesLibres--;
		// on ajoute un vehicule veut dire on decremente le nombre de place 
	}
	
	public void retirer(Vehicule v) {
		nbPlacesLibres++;
	}

}
