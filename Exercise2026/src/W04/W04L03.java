
package W04;
import java.util.Scanner;
public class W04L03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sales volume: ");
        double sales = in.nextDouble();
        double commision;
        if (sales > 1000){
            commision = sales * 0.125;
        }else if(sales > 500){
            commision = sales * 0.1;
        }else if(sales >100){
            commision = sales *0.075;
        }else{
            commision = sales *0.05;
        }
        System.out.printf("Commision is %.2f", commision);
        in.close();
    }
}