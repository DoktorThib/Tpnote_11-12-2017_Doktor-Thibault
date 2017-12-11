package fr.ensim;

import java.util.GregorianCalendar;
import java.util.List;

public class Personne {

	private boolean estUnClient;
	private String nom;
	private String prenom;
	private GregorianCalendar dateDeNaissance;
	
	public Personne (Boolean nvEstUnClient, String nvNom, String nvPrenom, GregorianCalendar nvDateDeNaissance) {
		setEstUnClient(nvEstUnClient);
		setNom(nvNom);
		setPrenom(nvPrenom);
		setDateDeNaissance(nvDateDeNaissance);
	}
	
	public boolean estUnClient() {
		return estUnClient;
	}
	
	public String obtenirNomComplet() {
		return prenom+" "+nom;
	}
	
	public GregorianCalendar obtenirDateDeNaissance() {
		return dateDeNaissance;
	}

	public void ChoixDuContrat(int choix, String numeroContrat,boolean b) {
		if(choix == 0) {
			creerContratAuto(numeroContrat, b);
		}
		else if (choix == 1) {
			creerContratPrevoyance(numeroContrat, b);
		}
		else if(choix == 2) {
			creerContratMRH(numeroContrat, b);
		}
		else {
			System.out.println("Il y a une erreur dans le choix");
		}
	}
	
	public ContratMRH creerContratMRH(String numeroContrat, boolean contratValide) { 
		ContratMRH contrat = new ContratMRH (numeroContrat, contratValide);
	return contrat;
	}
	
	public ContratPrevoyance creerContratPrevoyance(String numeroContrat, boolean contratValide) { 
		ContratPrevoyance contrat = new ContratPrevoyance (numeroContrat, contratValide);
	return contrat;
	}
	
	public ContratAuto creerContratAuto(String numeroContrat, boolean contratValide) { 
			ContratAuto contrat = new ContratAuto (numeroContrat, contratValide);
		return contrat;
	}
	
	public void resilierContrat(Contrat contrat) {/*par contrat*/
		contrat.setContratValide(false);
	}
	
	public void resilierContrat (String contrat) {/*par numero de contrat*/
		List<Contrat> contrats = obtenirContrats();
		
		/*parcourt de la liste de contrats jusqu'à obtenir le bon numéro de contrat afin de set at false Contratvalide */
	    for(int i=0;i<contrats.size();i++ ) {
	    	if (contrats.get(i).numeroContrat.equals(contrat))
	    		contrats.get(i).setContratValide(false);
	    }
	}
	
	public List<Contrat> obtenirContrats (){
		List<Contrat> contrats= null;
		
		return contrats;
	}
	
	public List<Contrat> obtenirContratsAuto (){
		List<Contrat> contratAuto = null;
		
		return contratAuto;
	}
	public List<Contrat> obtenirContratsMRH (){
		List<Contrat> contratMRH = null;
		
		return contratMRH;
	}
	
	public String ToString() {
		return prenom+" "+nom + dateDeNaissance.toString();
	}

	public GregorianCalendar getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(GregorianCalendar dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isEstUnClient() {
		return estUnClient;
	}

	public void setEstUnClient(boolean estUnClient) {
		this.estUnClient = estUnClient;
	}
}
