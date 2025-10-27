package exercice1;
import java.util.Scanner;
public class tableau {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tab = new int[5];
        //bech n3abi tableau
        System.out.println("saisir 5 entier");
        for(int i=0;i<5;i++) {
        	System.out.print("tab[" + i + "] = ");
            tab[i] = input.nextInt();
        }
        //bech naffichi tableau
        System.out.println(" tableau avant le tri :");
        for (int i = 0; i < 5; i++) {
            System.out.print(tab[i] + " ");
        }
        //bech na3mel tri ml sghir lel kbir
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (tab[i] > tab[j]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        //bech naffichi tableau bae3ed tri
		System.out.println("tableau après le tri  :"); 
	    for (int i = 0; i < 5; i++) { 
	        System.out.print(tab[i] + " "); 
	    }
	}

}
