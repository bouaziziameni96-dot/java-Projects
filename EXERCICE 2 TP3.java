package exercice2;
import java.util.Scanner;
public class tableau2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] tab= {5,6,8,4,9,0,0,8,4};
        //bech nsaisiri l'entier
        System.out.println("saisir entier");
        int n=input.nextInt();
        int s = -1;//bech nhotou fih 
        //bech nlawej fi west tableau
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n) {  // idha ken l entier li khtartou 9ad n    
                s = i;         
            }
        }
        if (s != -1) {
            System.out.println( n + " mawjouf f tableau  w b indice" + s );
        } else {
            System.out.println( n + " moch mawjouf f tableau");
        }
	}

}
