/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 *
 * @author DELL
 */
import java.util.Random;
public class W05L05 {
    public static void main(String[] args){
        Random rd = new Random();
        System.out.println("Welcome to 2 players dice game.");
        System.out.println("""
                           This is the rule:
                           Each player will take turns to roll a dice. 
                           The first players that reach more than 100 points win the game.
                           If the player rolls a 6, the player will score 6 points and has the chance to roll again. 
                           """);
        int scorePlayer1 = 0, scorePlayer2 = 0;
        int turns = 1;
        int randomRoll;
        while(scorePlayer1 <= 100 && scorePlayer2 <= 100){
            System.out.println("Round " + turns);
            System.out.print("""
                               Player 1:
                               Please roll a dice...
                               """);
            randomRoll = rd.nextInt(6)+1;
            System.out.println("Your roll: " + randomRoll);
            scorePlayer1 += randomRoll;
            if(randomRoll == 6){
                do{
                    System.out.println("You roll is 6! You get an extra roll!");
                    randomRoll = rd.nextInt(6)+1;
                    System.out.println("Your extra roll: " + randomRoll);
                    scorePlayer1 += randomRoll;
                }while(randomRoll == 6);
            }
            System.out.println("Player 1 current marks: " + scorePlayer1);
            if(scorePlayer1 > 100){
                break;
            }
            
            System.out.print("""
                               Player 2:
                               Please roll a dice...
                               """);
            randomRoll = rd.nextInt(6)+1;
            System.out.println("Your roll: " + randomRoll);
            scorePlayer2 += randomRoll;
            if(randomRoll == 6){
                do{
                    System.out.println("You roll is 6! You get an extra roll!");
                    randomRoll = rd.nextInt(6)+1;
                    System.out.println("Your extra roll: " + randomRoll);
                    scorePlayer2 += randomRoll;
                }while(randomRoll == 6);
            }
            System.out.println("Player 2 current marks: " + scorePlayer2);
            turns++;
            System.out.println();
        }
        System.out.println("Game end!");
        System.out.println("Player 1 total score: " + scorePlayer1);
        System.out.println("Player 2 total score: " + scorePlayer2);
        if(scorePlayer1 > scorePlayer2){
            System.out.println("Player 1 won!");
        }else{
            System.out.println("Player 2 won!");
        }
        
    }
}
