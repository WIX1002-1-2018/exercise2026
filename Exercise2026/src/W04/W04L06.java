import java.util.Scanner;
public class W04L06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int rad = input.nextInt();
        System.out.print("Enter x-coordinate of a point: ");
        int x = input.nextInt();
        System.out.print("Enter y-coordinate of a point: ");
        int y = input.nextInt();
        double xsquare = Math.pow(x, 2);
        double ysquare = Math.pow(y, 2);
        double distance = Math.sqrt(xsquare + ysquare);
        System.out.println(distance);
        if(distance < rad){
            System.out.println("The point is inside the circle");
        }
        else if(distance > rad){
            System.out.println("The point is outside the circle");
        }
        else{
            System.out.println("The point is on the circle");
        }
        input.close();
        

    }
}
