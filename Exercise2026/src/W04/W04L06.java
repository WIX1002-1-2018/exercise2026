
package W04;
import java.util.Scanner;
public class W04L06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = in.nextDouble();
        System.out.println("Enter x-coordinate of circle: ");
        double x = in.nextDouble();
        System.out.println("Enter y-coordinate of circle: ");
        double y = in.nextDouble();
        
        double distance = Math.sqrt((x*x)+(y*y));
        if (distance > radius){
            System.out.println("The point is not in the circle.");
        }else{
            System.out.println("The point is in the circle");
        }
        in.close();
    }
}