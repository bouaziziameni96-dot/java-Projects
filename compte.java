package exercice1;
import java.util.Scanner;
//DECLARATION DE LA CLASSE
public class compte {
	private double solde;
	private Scanner input=new Scanner(System.in);
	public compte () {
		System.out.println("entre le solde ");
		this.solde=input.nextDouble();
	}
	public void deposer(double versement ) {
		System.out.println("entre le montont qui va deposer ");
		double montant=input.nextDouble();
		if(montant>0) {
			solde+=montant;
			System.out.println("depot de" +montant+"effectué avec succes");
		}else {
			System.out.println("le montant du dépot doit etre positif ");
		}
		
	}
	//METHODE DE RETIRER L4ARGENT DU COMPTE
	public void retirer() {
	    System.out.print("Entrez le montant à retirer : ");
	    double montant = input.nextDouble();

	    if (montant > 0 && montant <= solde) {
	        solde -= montant;
	        System.out.println("Retrait de " + montant + " effectué avec succès.");
	    } else if (montant > solde) {
	        System.out.println("Solde insuffisant !");
	    } else {
	        System.out.println("Le montant doit être positif !");
	    }
	}
	//METHODE D'AFFICHE LE SOLDE
	public void afficher() {
		System.out.println("solde est"+ solde );
	}
	public void virement(compte compte2) {
		System.out.println("saisir le montant de virement");
		double montant= input.nextDouble();
		if(montant>0 && montant<=solde) {
			solde-=montant;
			compte2.solde+=montant;
			System.out.println("virement de"+montant+" avec succes");
			
		}else if(montant > solde){
			System.out.println("solde insuffisant");
			
		}else {
			System.out.println("solde if faut etre positif");
			
		}
	}
	

}
