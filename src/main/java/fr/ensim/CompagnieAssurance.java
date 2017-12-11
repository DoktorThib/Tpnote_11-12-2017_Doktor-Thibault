package fr.ensim;

public class CompagnieAssurance {

	private String nom;
	
	public CompagnieAssurance (String nvNom) {
		setNom(nvNom);
	}
	
	public int obtenirNombreDeClients() {
		return 4; /*arrayList.size*/
	}
	
	public int obtenirNombreDeProspects() {
		int nbProspect =0;
		return nbProspect;
	}
	
	public int obtenirNombreDeContrats() {
		int nbContrat = 0;
		return nbContrat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Personne obtenirPlusGrosClient() {
		return null;
		
	}
}
