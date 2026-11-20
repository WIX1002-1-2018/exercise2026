<<<<<<< HEAD
package W05;
import java.util.Scanner;
public class W05L02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = in.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum of integers is: " + sum);
        in.close();
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class W05L02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        int sum = 0;
        
        for(int i=1;i<=num;i++){
            for (int j = 1 ; j <= i ; j++){
                sum += j ;
            }
        }
        
        System.out.print(sum);
        
        
    }
}
>>>>>>> 7c778018c15c35b792fe04902afe669a5a867f3d
