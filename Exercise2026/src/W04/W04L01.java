package W04;
import java.util.Scanner;

public class W04L01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);

        if (operand=='+') {
            System.out.println(num1+num2);
        }
        else if (operand=='-') {
            System.out.println(num1-num2);
        }
        else if (operand=='*') {
            System.out.println(num1*num2);
        }
        else if (operand=='/') {
            System.out.println(num1/num2);
        }
        else if (operand=='%') {
            System.out.println(num1%num2);
        }
        else {
            System.out.print("Invalid operand");
        }
        sc.close();
    }
}