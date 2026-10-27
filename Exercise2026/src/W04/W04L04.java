package W04;

import java.util.Random;
import java.util.Scanner;

public class W04L04 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //sum of players
        int p1 = 0;
        int p2 = 0;

        for(int i = 1; i <= 2; i++){
            System.out.print("Player 1, enter r to roll: ");
            while(!scanner.next().equalsIgnoreCase("r")){
                System.out.print("Invalid input! Enter r to roll: ");
            }
            int a = random.nextInt(1, 7);
            p1 += a;
            System.out.println("Rolled: " + a);

            System.out.print("Player 2, enter r to roll: ");
            while(!scanner.next().equalsIgnoreCase("r")){
                System.out.print("Invalid input! Enter r to roll: ");
            }
            int b = random.nextInt(1, 7);
            p2 += b;
            System.out.println("Rolled: " + b);
        }

        System.out.println("Player 1: " + p1 + "\nPlayer 2: " + p2);
        System.out.println(p1 == p2 ? "Tie!" : p1 > p2 ? "Player 1 wins!" : "Player 2 wins");

        scanner.close();
    }
}
