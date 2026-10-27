package W04;

import java.util.Scanner;

public class W04L01 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Enter the operand: ");
        char op = scanner.next().charAt(0);

        if(op == '+') System.out.println(a + b);
        else if(op == '-') System.out.println(a - b);
        else if(op == '*') System.out.println(a * b);
        else if(op == '/') System.out.println(a / b);
        else if(op == '%') System.out.println(a % b);
        else System.out.println("Invalid!");

        scanner.close();

    }

}
