package fr.ensim;

import java.util.List;

public class ContratMRH extends Contrat {
	
	public ContratMRH(String nvNumeroContrat, boolean nvContratValide) {
		super(nvNumeroContrat, nvContratValide);
		// TODO Auto-generated constructor stub
	}

	public List<String> determinerGaranties() {
		List<String> garanties = null;
		return garanties;
	}

	public List<String> determinerCostisation() {
		List<String> cotisations = null;
		return cotisations;
	}
	
	public Contrat creationContrat() {
		Contrat contrat = null;
		
		return contrat;
	}
}
