package tp;
import java.util.Scanner;
public class exercice1 {

	public static void main(String[] args) {
		Scanner aff=new Scanner(System.in);
		System.out.println("donner une chaine de caractére");
		String ch=aff.nextLine();
		System.out.println("saisir un entier a");
		int a=aff.nextInt();
		System.out.println("saisir un entier b");
		int b=aff.nextInt();
		System.out.println("saisir un entier c");
		int c=aff.nextInt();
		int somme=a+b+b;
		int produit=a*b*c;
		int moy=(a*b*c)/3;
		System.out.println("bonjour"  + ch +"la somme est :"+somme);
		System.out.println("bonjour"  + ch +"la produit est :"+produit);
		System.out.println("bonjour"  + ch +"la moyen est :"+
		moy);
		
		

	}

}
