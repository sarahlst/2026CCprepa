package ilu2;

public class Parking {

	private int nbPlacesLibres;
	private int tarifHoraire;

	/*
	 * dans l'iteration 4 on peut faire un autre constructeur mais moi je choisis de
	 * modifier le constructeur 1
	 */
	public Parking(int nbPlaces, int tarif) {
		this.nbPlacesLibres = nbPlaces;
		this.tarifHoraire = tarif;
	}

	public int getNbPlacesLibres() {
		return nbPlacesLibres;
	}

	public boolean ajouter(Vehicule v) {
		if (nbPlacesLibres == 0) {
			return false;
		} else {
			nbPlacesLibres--;
			return true;
		}
	}

	public int retirer(Vehicule v, int nbrHeures) {
		nbPlacesLibres++;
		return nbrHeures * tarifHoraire;

	}

}
