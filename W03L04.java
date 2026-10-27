/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 * Write a simple two players dice game. 
 * Each player will roll the dice twice and the player with the highest score wins the game. 
 */
import java.util.Random;
public class W03L04 {
    public static void main(String[] args) {
        Random rand= new Random();
        
        System.out.println("Player 1");
        int p1roll1= rand.nextInt(6)+1;
        System.out.println("Roll the dice 1st time: "+p1roll1);
        int p1roll2= rand.nextInt(6)+1;
        System.out.println("Roll the dice 2nd time: "+p1roll2);
        
        int sum1 = p1roll1+p1roll2;
        
        System.out.println("Player 2");
        int p2roll1= rand.nextInt(6)+1;
        System.out.println("Roll the dice 1st time: "+p2roll1);
        int p2roll2= rand.nextInt(6)+1;
        System.out.println("Roll the dice 2nd time: "+p2roll2);
        
        int sum2 = p2roll1+p2roll2;
        
        if (sum1>sum2){
            System.out.println("Player 1 win!");
        }
        else if (sum2>sum1){
            System.out.println("Player 2 win!");
        }
        else{
            System.out.println("Same score");
        }
    }
}
        
        
