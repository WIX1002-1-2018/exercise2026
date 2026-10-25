package W04;

import java.util.Scanner;
import java.util.Random;

public class lab3{
    public static void main(String[] args) {
       //Q1
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int p = in.nextInt();
        int q = in.nextInt();
        in.nextLine();
        System.out.print("Enter the operand: ");
        String operator = in.nextLine();
        char operand = operator.charAt(0);
        switch(operand){
            case '+':
                System.out.println(p+q);
                break;
            case '-':
                System.out.println(p-q);
                break;
            case '*':
                System.out.println(p*q);
                break;
            case '/':
                System.out.println(p/q);
                break;
            case '%':
                System.out.println(p%q);
                break;
            default:
                System.out.println("Invalid operand");
        }
        
        //Q2
        
        Random num = new Random();
        int number = num.nextInt(0,6);
        switch (number){
            case 0:
                System.out.println(number + " is zero." );
                break;
            case 1:
                System.out.println(number + " is one." );
                break;
            case 2:
                System.out.println(number + " is two." );
                break;
            case 3:
                System.out.println(number + " is three." );
                break;
            case 4:
                System.out.println(number + " is four." );
                break;
            case 5:
                System.out.println(number + " is five." );
                break;
            default:
                System.out.println("The number is out of range.");
        }
        
        //Q3
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales volume: ");
        double sales_volume = sc.nextDouble();
        
        if (sales_volume >= 1000){
            System.out.printf("%.2f%n",(sales_volume * 0.125));
        } else if (sales_volume > 500 && sales_volume <= 1000){
            System.out.printf("%.2f%n",(sales_volume * 0.1));
        } else if (sales_volume > 100 && sales_volume <= 500){
            System.out.printf("%.2f%n",(sales_volume * 0.075));
        } else if (sales_volume <= 100){
            System.out.printf("%.2f%n",(sales_volume * 0.05));
        }
        
        //Q4
        
        Random game = new Random();
        Scanner dicegame = new Scanner(System.in);
        
        System.out.print("Player 1, press enter to roll your dice. ");
        in.nextLine();
        int player1_1 = game.nextInt(1,7);
        System.out.println(player1_1);
        System.out.print("Player 2, press enter roll your dice. ");
        in.nextLine();
        int player2_1 = game.nextInt(1,7);
        System.out.println(player2_1);
        System.out.print("Player 1, press enter to roll your dice again. ");
        in.nextLine();
        int player1_2 = game.nextInt(1,7);
        System.out.println(player1_2);
        System.out.print("Player 2, press enter to roll your dice again. ");
        in.nextLine();
        int player2_2 = game.nextInt(1,7);
        System.out.println(player2_2);
        int score1 = player1_1 + player1_2;
        System.out.println("Player 1's socre: " + score1);
        int score2 = player2_1 + player2_2;
        System.out.println("Player 2's socre: " + score2);
        
        if (score1 > score2){
            System.out.println("Player 1 wins!");
        } else if(score1 == score2) {
            System.out.println("Tie!");
        } else {
            System.out.println("Player 2 wins!");
        }
        
        //Q5
        Scanner cm = new Scanner(System.in);
        System.out.println("Cramer's rule is used to solve the linear equations.");
        System.out.println("ax+by=e,cx+dy=f; x=(ed-bf)/(ad-bc); y=(af-ec)/(ad-bc)");
        System.out.print("Enter the value of a,b,c,d,e,f(separated by space): ");
        int a = cm.nextInt();
        int b = cm.nextInt();
        int c = cm.nextInt();
        int d = cm.nextInt();
        int e = cm.nextInt();
        int f = cm.nextInt();
        
        if (((a*d)-(b*c)) == 0){
            System.out.println("The equation has no solution.");
        } else {
            int x = (e*d-b*f)/(a*d-b*c);
            int y = (a*f-e*c)/(a*d-b*c);
            System.out.println("x: " + x);
            System.out.println("y: " + y);
      }
        
        /*Q6 Write a program that asks users to enter the radius of a circle and a coordinate point 
       (m, n). Determine whether the point is inside or outside the circle centered at (0, 0). 
        */
        
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        int r = cc.nextInt();
        System.out.print("Enter a coordinate point(m,n): ");
        int m = cc.nextInt();
        int n = cc.nextInt();
        if ( (m*m+n*n) <= r*r){
            System.out.println("The point is inside the circle.");
        } else if ((m*m+n*n) > r*r){
            System.out.println("The point is outside the circle.");
        }
        
    }
}