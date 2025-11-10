package exercice3;
public class cercle {
 private point centre;
 private double rayon;
 public cercle(point centre, double rayon) {
     this.centre = centre;
     this.rayon = rayon;
 }
 public double surface() {
     return Math.PI * rayon * rayon;
 }
 public double perimetre() {
     return 2 * Math.PI * rayon;
 }
 public void afficher() {
     System.out.println("Cercle de centre : ");
     centre.afficher();
     System.out.println("Rayon : " + rayon);
     System.out.println("Surface : " + surface());
     System.out.println("Périmètre : " + perimetre());
 }
 public static void main(String[] args) {
     point p = new point(2, 3);
     cercle c = new cercle(p, 4);
     c.afficher();
 }
}

