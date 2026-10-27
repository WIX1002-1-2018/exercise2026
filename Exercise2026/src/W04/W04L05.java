import java.util.Scanner;
public class W04L05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ax + by = e, cx + dy = f");
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        System.out.println("Enter c: ");
        int c = scan.nextInt();
        System.out.println("Enter d: ");
        int d = scan.nextInt();
        System.out.println("Enter e: ");
        int e = scan.nextInt();
        System.out.println("Enter f: ");
        int f = scan.nextInt();
        if(a * d - b * c == 0){
            System.out.println("The equation has no solution");
        }
        else{
            double x = (double)(e * d - b * f)/(a * d - b * c);
            double y = (double)(a * f - e * c)/(a * d - b * c);
            System.out.printf("x = %.3f%ny = %.3f3 4",x ,y);
        }
        scan.close();
    }
}
