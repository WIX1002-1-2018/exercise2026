package W05;
import java.util.Scanner;

public class W05L04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, … , 6 for Saturday): ");
        int day = scan.nextInt() ;
        int MAY_DAYS = 31;
        int AUG_DAYS = 31;
        boolean leap = (year%4 == 0 && year%100 !=0) || (year%400 == 0);
        int may1st;
        if(leap){
            may1st = (day + 31 + 29 + 31 + 30 ) % 7 ;
        }
        else{
            may1st = (day + 31 + 28 + 31 + 30 ) % 7 ;
        }
        System.out.println("May " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat ");
        for(int i = 0; i < may1st; i++){
            System.out.print("    ");
        }
        for(int i = 0; i < MAY_DAYS;i++){
            if((i + may1st)%7 == 6){
                System.out.printf("%-4d\n", i + 1);
            }
            else{
                System.out.printf("%-4d", i + 1);
            }
        }
        int aug1st;
        if(leap){
            aug1st = (day + 31 + 29 + 31 + 30 + 31 + 30 + 31) % 7 ;
        }
        else{
            aug1st = (day + 31 + 28 + 31 + 30 + 31 + 30 + 31) % 7 ;
        }
        System.out.println("\n\nAugust " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat ");
        for(int i = 0; i < aug1st; i++){
            System.out.print("    ");
        }
        for(int i = 0; i < AUG_DAYS;i++){
            if((i + aug1st)%7 == 6){
                System.out.printf("%-4d\n", i + 1);
            }
            else{
                System.out.printf("%-4d", i + 1);
            }
        }
        scan.close();
        

    }


}
