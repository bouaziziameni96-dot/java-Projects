package exercice1;

import java.util.Scanner;

public class testcompte {
	//PP
		public static void main(String[] args) {
			Scanner m=new Scanner(System.in);
			System.out.println("saisir solde compte1");
			double solde1=m.nextDouble();
			System.out.println("saisir solde compte2");
			double solde2=m.nextDouble();
			compte A= new compte(solde1);
			compte B=new compte(solde2);
			A.afficher();
			B.afficher();
			//AFFICHER LE SOLDE
			A.deposer(150);
			//AFFICHER APRES LE DEPOSAGE
			A.afficher();
			//RETIRER ARGENT
			A.retirer(120);
			//AFFICHAGE APRES LE RETIRE
			A.afficher();
			//TESTER LE COMPTE
			A.testcompte(B);
			A.afficher();
			B.afficher();
		}	

}
