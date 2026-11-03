/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class W05L03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int score;
        int minScore = 0, maxScore = 0;
        int totalScore = 0;
        int sumSquare = 0;
        int enterCount = 0;
        do{
            System.out.print("Enter a score (negative score to quit): ");
            score = sc.nextInt();
            
            if(score < 0){
                break;
            }
            if(enterCount == 0){
                minScore = score;
                maxScore = score;
            }else{
                if(score < minScore){
                    minScore = score;
                }
                if(score > maxScore){
                    maxScore = score;
                }
            }
            totalScore += score;
            sumSquare += score*score;
            enterCount++;
        }while(true);
        
        if(enterCount > 0){
            double aveScore = (double)totalScore / enterCount;
            int squareTotalScore = totalScore * totalScore;
            double variance = ((double)sumSquare - ((double)(squareTotalScore)/enterCount))/ (double)(enterCount - 1);
            double sdScore = Math.sqrt(variance);
            System.out.println("Minimum Score: " + minScore);
            System.out.println("Maximum Score: " + maxScore);
            System.out.printf("Average Score: %.2f%n", aveScore);
            System.out.printf("Standard Deviation: %.2f%n", sdScore);
        }
    }
}
