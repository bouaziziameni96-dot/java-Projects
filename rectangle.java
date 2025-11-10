package exercice2;
public class rectangle {
	private double longueur;
    private double largeur;

    // Constructeur avec paramètres
    public rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return longueur * largeur;
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode pour afficher les résultats
    public void afficher() {
        System.out.println("Longueur : " + longueur);
        System.out.println("Largeur : " + largeur);
        System.out.println("Surface : " + surface());
        System.out.println("Périmètre : " + perimetre());
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        rectangle r = new rectangle(5, 3);
        r.afficher();
    }
}


