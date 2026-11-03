package W04;
import java.util.Scanner;

public class W04L06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.print("Enter x coordinate: ");
        double x = input.nextDouble();

        System.out.print("Enter y coordinate: ");
        double y = input.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance < radius) {
            System.out.println("Point (" + x + ", " + y + ") is inside the circle.");
        } else if (distance == radius) {
            System.out.println("Point (" + x + ", " + y + ") is on the circle.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the circle.");
        }
    }
}
