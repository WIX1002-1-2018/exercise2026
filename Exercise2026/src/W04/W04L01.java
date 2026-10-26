
package W04;
import java.util.Scanner;
public class W04L01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.print("Enter the operand: ");
        char operation = in.next().charAt(0);
        double result =0;
        switch (operation) {
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> result = num1/num2;
            case '%' -> result = num1%num2;
            default -> {System.out.println("Invalid syntax");System.exit(0);}
        }
        System.out.printf("%d %c %d = %.2f",num1,operation,num2,result);
        in.close();
    }
}