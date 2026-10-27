package W04;

import java.util.Scanner;
public class W04L06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter x-coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y = sc.nextDouble();
        double distance = Math.sqrt((x*x)+(y*y));
        if(radius>distance)
            System.out.println("The point is inside the circle");
        else
            System.out.println("The point is outside the circle");
    }
}