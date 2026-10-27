package W04;

import java.util.Scanner;

public class W04L06 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();

        double distanceSq = x * x + y * y;
        double radiusSq = radius * radius;

        if(distanceSq < radiusSq){
            System.out.println("The point is inside the circle");
        }
        else if(distanceSq > radiusSq){
            System.out.println("The point is outside the circle.");
        }
        else{
            System.out.println("The point is on the circle.");
        }

        scanner.close();
    }
}
