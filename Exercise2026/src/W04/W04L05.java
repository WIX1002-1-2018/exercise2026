
package W04;
import java.util.Scanner;
public class W04L05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = in.nextDouble();

        System.out.print("Enter b: ");
        double b = in.nextDouble();

        System.out.print("Enter c: ");
        double c = in.nextDouble();

        System.out.print("Enter d: ");
        double d = in.nextDouble();

        System.out.print("Enter e: ");
        double e = in.nextDouble();

        System.out.print("Enter f: ");
        double f = in.nextDouble();
        
        double denominator = (a * d) - (b * c);
        
        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = ((e * d) - (b * f)) / denominator;
            double y = ((a * f) - (e * c)) / denominator;

            System.out.println("x is " + x + " and y is " + y);
        }

        in.close();
    }
}