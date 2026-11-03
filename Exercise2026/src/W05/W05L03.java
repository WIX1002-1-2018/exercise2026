package W05;

import java.util.Scanner;
public class W05L03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a score [negative score to quit] :");
        int score = sc.nextInt();
        int num = 0;
        double sum = 0;
        double sum2 = 0;
        int min = 100;
        int max = 0;
        while(score>=0){
            sum = sum + score;
            sum2 = sum2 + Math.pow(score,2);
            System.out.print("Enter a score [negative score to quit] :");
            score = sc.nextInt();
            if(score<min&&score>=0)
                min = score;
            if(score>max)
                max = score;
            num++;}
        double avg = sum/num;
        double sd = Math.sqrt((sum2-(Math.pow(sum,2)/num))/(num-1));
        System.out.println(sum);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n",avg);
        System.out.printf("Standard Deviation: %.2f\n",sd);
        sc.close();
    }
}
