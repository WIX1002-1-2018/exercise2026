/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W04;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class W04L05 {
    public static void main(String[] args){
    //ax + by = e, cx + dy = f; 
    //x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc) 
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Cramer's rule is used to solve the linear question.
                           Equation:
                                ax + by = e, cx + dy = f
                           Thus, 
                                x = (ed-bf)/(ad-bc), y = (af-ec)/(ad-bc)
                           """);
        System.out.println("Please enter the value of a, b, c, d, e and f.");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        System.out.print("d: ");
        double d = sc.nextDouble();
        System.out.print("e: ");
        double e = sc.nextDouble();
        System.out.print("f: ");
        double f = sc.nextDouble();
        
        double denominator = (a*d)-(b*c);
        if(denominator == 0){
            System.out.println("The equation has no solution!");
        }else{
            double x = ((e*d)-(b*f))/denominator;
            double y = ((a*f)-(e*c))/denominator;
            System.out.printf("x: %.2f%n", x);
            System.out.printf("y: %.2f%n", y);
        }
        
    }
}
