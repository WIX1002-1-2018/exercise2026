package W05;
import java.util.Scanner;

public class W05L07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p = scan.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = scan.nextDouble();
        System.out.print("Enter total number of months(s): ");
        double n = scan.nextDouble();
        System.out.printf("%-6s%19s%13s%12s%18s%18s\n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total interest");
        double m = (p * (i / (12 * 100)))/(1 - Math.pow((1 + i /(12 * 100)), -n));
        double totalInterest = 0;
        for(int j = 1; j <= n; j++){
            double c = m * Math.pow((1 + i / (12 * 100)), -(1 + n - j));
            double l = m - c;
            double r = l / (i / (12 * 100)) - c;
            totalInterest += l;
            System.out.printf("%-6d%19.2f%13.2f%12.2f%18.2f%18.2f\n", j, m, c, l, r, totalInterest);

        }
        scan.close();
    }
}
