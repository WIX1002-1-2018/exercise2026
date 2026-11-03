package W05;
import java.util.Scanner;

public class W05L03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a score [negative score to quit]: ");
        int score = scan.nextInt();
        if(score < 0){
            System.out.println("The program ends");
            scan.close();
            return;
        }
        int sum = 0;
        int min = 100;
        int max = 0;
        int n = 0;
        int sumsquare = 0;
        while(score > 0){
            min = score < min ? score : min;
            max = score > max ? score : max;
            sum += score;
            sumsquare += score * score;
            System.out.print("Enter a score [negative score to quit]: ");
            score = scan.nextInt();
            n++;
        }
        double avg = (double)sum / n;
        double sd = Math.sqrt((sumsquare - (double)(sum*sum)/n)/(n-1));
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", avg);
        System.out.printf("Standard Deviation: %.2f\n", sd);
        scan.close();
        
    }

}
