import java.math.BigInteger;
import java.util.Scanner;

public class LargeIntegerInput {
    public static void main(String[] args) {
        System.out.print("Enter a score [negative score to quit]: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), min=Long.MAX_VALUE, max=0, i=0;
        double sum=0, sumsq=0, sd=0, avg=0, avgsq=0;
        while (n>0){
            min = (min > n) ? n : min;
            max = (max < n) ? n : max;
            sum += n;
            sumsq += n*n;
            System.out.print("Enter a score [negative score to quit]: ");
            n = sc.nextLong();
            i++;
        }
        if (i>0){
            avg = sum/i;
            avgsq = (sum*sum)/i;
            sd = (i>1) ? Math.sqrt((sumsq - avgsq)/(i-1)) : -1;
            System.out.println("Minimum score: "+min);
            System.out.println("Maximum score: "+max);
            System.out.printf("Average score: "+ "%.2f%n", avg);
            if (sd != -1){
                System.out.printf("Standard deviation: "+"%.2f%n",sd);
            } else {
                System.out.println("No standard deviation. ");
            }
        } else {
            System.out.print("No score was entered.");
        }

    }
}