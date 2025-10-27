package exercice4;
import java.util.Scanner;
public class tableau4 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Création du scanner

        // nsaisiri 9adeh men telmidh
        System.out.print("Entrez le nombre d'élèves : ");
        int n = input.nextInt();

        double[] notes = new double[n]; //  Création du tableau pour les notes
        double somme = 0; //  la somme
        double max = 0;   //  la plus grande note
        double min = 20;  //  la plus petite note (max = 20)

        // nsisiri notes
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez la note de l'élève " + (i + 1) + " : ");
            notes[i] = input.nextDouble();

            // nzid la note l somme
            somme += notes[i];

            
            if (notes[i] > max) {
                max = notes[i];
            }

            //  minimum
            if (notes[i] < min) {
                min = notes[i];
            }
        }

        //  Calcul de la moyenne
        double moyenne = somme / n;

        //Affichage des résultats
        System.out.println("Résultats");
        System.out.println("Somme des notes : " + somme);
        System.out.println("Note la plus élevée : " + max);
        System.out.println("Note la plus basse : " + min);
        System.out.println("Moyenne de la classe : " + moyenne);

    }
}


