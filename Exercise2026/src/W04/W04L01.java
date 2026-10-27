import java.util.Scanner;
public class W04L01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print("Enter the operand: ");
        char operand = scan.next().charAt(0);
        switch(operand){
            case '+':
                 System.out.printf("%d %c %d = %d%n",num1, operand, num2, (num1+num2));
                 break;
            case '-':
                 System.out.printf("%d %c %d = %d%n",num1, operand, num2, (num1-num2));
                 break;
            case '*':
                 System.out.printf("%d %c %d = %d%n",num1, operand, num2, (num1*num2));
                 break;
            case '/':
                 System.out.printf("%d %c %d = %d%n",num1, operand, num2, (num1/num2));
                 break;
            case '%':
                 System.out.printf("%d %c %d = %d%n",num1, operand, num2, (num1%num2));
                 break;
            default:
                break;

        }
        scan.close();
    }

}
