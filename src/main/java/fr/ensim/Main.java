package fr.ensim;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GregorianCalendar date1 = new GregorianCalendar(1996,04,13);
		GregorianCalendar date2 = new GregorianCalendar(1996,01,7);
		GregorianCalendar date3 = new GregorianCalendar(1996,04,8);
		GregorianCalendar date4 = new GregorianCalendar(1964,12,21);
		
		Personne pers1 = new Personne (false,"Doktor","Thibault",date1);
		Personne pers2 = new Personne (true,"Cayon","Etienne",date2);
		Personne pers3 = new Personne (false,"Renard","Dylan",date3);
		Personne pers4 = new Personne (true,"Doktor","Christine",date4);

		CompagnieAssurance compagnie = new CompagnieAssurance ("ThiefCompany");
		
		pers2.ChoixDuContrat(0,"1", true);
		pers2.ChoixDuContrat(1,"11", false);
		pers4.ChoixDuContrat(2,"2", true);
		
		ArrayList<Personne> personnes = new ArrayList<Personne> ();
		personnes.add(pers1);
		personnes.add(pers2);
		personnes.add(pers3);
		personnes.add(pers4);
		
		/*Exemple pour ajouter UNE personne*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer le nom du nouveau client");
		String nom = sc.nextLine();
		
		System.out.println("Entrer le prenom du nouveau client");
		String prenom = sc.nextLine();
		
		System.out.println("Entrer l'annee de naissance de "+prenom+" "+nom);
		int annee = sc.nextInt();

		System.out.println("Entrer le mois du nouveau client");
		int mois = sc.nextInt();
		
		System.out.println("Entrer le jour du nouveau client");
		int jour= sc.nextInt();
		
		System.out.println("Vous etes "+prenom+" "+nom+" \nNé le "+jour+" "+mois+" "+annee+"\nAjouté à la base de donnée");
		
		GregorianCalendar date5 = new GregorianCalendar(annee,mois,jour);
		Personne pers5 = new Personne (true,nom, prenom,date5);
		personnes.add(pers5);
		
		
		/*Exemple pour ajouter un contrat*/
		System.out.println("Quel type de contrat souhaitez-vous ?\n 0 pour un contrat auto, "
							+ "	1 pour un contrat prevoyance et 2 pour un contrat MRH");
		
	}

}
