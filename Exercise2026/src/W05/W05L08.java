package W05;

/**
 *
 * @author huiling
 */
import java.util.Scanner;

public class W05L08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double rate = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double month = sc.nextDouble();
        
        double monthlyPayment, C, L, R, totalInterest = 0;
        
        System.out.printf("\n%-20s %-20s %-20s %-20s %-20s %-20s", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        
        for (int i = 1; i <= month; i++){
            monthlyPayment = (P*(rate/(12*100)))/(1-Math.pow(1+(rate/(12*100)), -month));
            C = monthlyPayment * Math.pow(1+(rate/(12*100)), -(1+month-i));
            L = monthlyPayment - C;
            R = L / (rate/(12*100))-C;
            totalInterest = totalInterest + L;
            
            System.out.printf("\n%-20d %-20.2f %-20.2f %-20.2f %-20.2f %-20.2f", i, monthlyPayment, C, L, R, totalInterest);
        }
    }
}
