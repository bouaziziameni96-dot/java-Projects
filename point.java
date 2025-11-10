package exercice3;
public class point {
 private double x;
 private double y;
 public point(double x, double y) {
     this.x = x;
     this.y = y;
 }
 public void afficher() {
     System.out.println("Point(" + x + ", " + y + ")");
 }
 public double getX() { return x; }
 public double getY() { return y; }
}
