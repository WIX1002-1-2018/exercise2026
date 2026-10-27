package W04;

import java.util.Scanner;
public class W04L05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = sc.nextInt();
        System.out.print("Enter value b: ");
        int b = sc.nextInt();
        System.out.print("Enter value c: ");
        int c = sc.nextInt();
        System.out.print("Enter value d: ");
        int d = sc.nextInt();
        System.out.print("Enter value e: ");
        int e = sc.nextInt();
        System.out.print("Enter value f: ");
        int f = sc.nextInt();
        if((a*d)-(b*c)!=0){
            double x = ((e*d)-(b*f))/((a*d)-(b*c));
            double y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("x= "+x+" y= "+y);}
        else
            System.out.println("The equation has no solution");
    }
}