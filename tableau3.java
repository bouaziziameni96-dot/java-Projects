package exercice3;
import java.util.Scanner;
public class tableau3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// bech nsaisiri taille tableau
        System.out.print("Entrez la taille du tableau: ");
        int n = input.nextInt();
        int[] tab = new int[n];
        //bech n3abi tableau
        for (int i = 0; i < n; i++) {
            int somme = 0; 
            for (int j = 0; j <= i; j++) { 
                somme += j;
            }
            tab[i] = somme; 
        }
        //bech naffichi tableau
        System.out.println("\nContenu du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }

	}

}
