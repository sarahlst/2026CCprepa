package ilu2;

public class Parking {

	private int nbPlacesLibres;
	private int tarifHoraire;
	private Vehicule[] vehiculeGares;
	private float reduction;

	/*
	 * dans l'iteration 4 on peut faire un autre constructeur mais moi je choisis de
	 * modifier le constructeur 1
	 */
	public Parking(int nbPlaces, int tarif) {
		this.nbPlacesLibres = nbPlaces;
		this.tarifHoraire = tarif;
		this.vehiculeGares = new Vehicule[nbPlaces];
	}
	

	public Parking(int nbPlaces, int tarif, float reduction) {
		this.nbPlacesLibres = nbPlaces;
		this.tarifHoraire = tarif;
		this.vehiculeGares = new Vehicule[nbPlaces];
		this.reduction = reduction;
	}


	public int getNbPlacesLibres() {
		return nbPlacesLibres;
	}

	public boolean ajouter(Vehicule v) {
		if (nbPlacesLibres >0) {
			for(int i=0 ; i<vehiculeGares.length ;i++)
			{
				if (vehiculeGares[i] == null )
				{
					vehiculeGares[i]=v;
					break;
				}
			}
			nbPlacesLibres--;
			return true;
		}
		return false;
	}

	public int retirer(Vehicule v, int nbrHeures) {
		if(!contient(v)) {
			throw new IllegalArgumentException("Le vehicule n'est pas garé dans ce parking !");
		}
		else {
			// retirer le vehicule du tableau 
			for(int i=0 ; i<vehiculeGares.length ;i++)
			{
				if (vehiculeGares[i] == v )
				{
					vehiculeGares[i]=null;
					break;
				}
			}
			nbPlacesLibres++;
			int prixInitial = nbrHeures * tarifHoraire;
			if ( v.estAbonne(this))	{
				prixInitial = (int) (prixInitial * reduction);
			}
		    
		    return prixInitial;
		}
	}

	public boolean contient(Vehicule v) {
		for ( Vehicule v1 : vehiculeGares )
		{
			if ( v1!= null && v.equals(v1))
			{
				return true;
			}
		}
		return false;
	}

}
