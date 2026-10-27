import java.util.Scanner;

public class W04L06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String ans = "";
        if ((x*x)+(y*y) <= r*r){
            ans = "Point is inside the circle.";
        } else {
            ans = "Point is outside the circle.";
        }
        System.out.print(ans);
    }
}
