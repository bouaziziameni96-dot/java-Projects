//Ecrire le programme Somme.java qui lit au clavier 2 réels et affiche leur somme à l’écran
package tp;

import java.util.Scanner;

public class exercice2 {
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("saisir un entier x");
		int x=a.nextInt();
		System.out.println("saisir un entier y");
		int y=a.nextInt();
		int somme=x+y;
		System.out.println("la somme est"+somme);
		
	}
	

}
