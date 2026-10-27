import java.util.Scanner;
public class W04L03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter sales volume: ");
        int salesVolume = scan.nextInt();
        double com;
        if (salesVolume > 1000) {
            com = salesVolume * 0.125;
        }
        else if(salesVolume > 500){
            com = salesVolume * 0.1;
        }
        else if(salesVolume > 100){
            com = salesVolume * 0.075;
        }
        else{
            com = salesVolume * 0.05;
        }
        System.out.printf("Commission: %.2f", com);
        scan.close();
    }

}
