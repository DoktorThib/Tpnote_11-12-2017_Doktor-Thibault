package fr.ensim;

import java.util.List;

public abstract class Contrat {

	protected String numeroContrat;
	protected boolean contratValide;
	
	public Contrat (String nvNumeroContrat, boolean nvContratValide) {
		setNumeroContrat(nvNumeroContrat);
		setContratValide(nvContratValide);
	}
	
	public Contrat creationContrat() {
		Contrat contrat = null;
		
		return contrat;
	}
	
	public List<String> determinerGaranties(){
		List<String> garanties = null;

		return garanties;
	}
	
	public double determinerCotisation() {
		double a = 0;
		
		return a;
	}

	public String getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	public boolean isContratValide() {
		return contratValide;
	}

	public void setContratValide(boolean contratValide) { 
		this.contratValide = contratValide;
	}
}
