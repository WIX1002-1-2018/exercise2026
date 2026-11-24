/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W08L06;

/**
 *
 * @author User
 */
public class L06Q01 {

    public static int triangular(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[ ] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(triangular(i));
        }
    }    
}
