/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial4;

/**
* Write the statements that display the first ten values of the Fibonacci sequence. 
* Given the formula f1 = 1, f2 =1, f(n) = f(n-1) + f(n-2)
 */
public class W05T03 {
    public static void main(String[] args) {
        int f1 = 1, f2 = 1;
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        for (int i = 3; i <= 10; i++) {
            int fn = f1 + f2;           
            System.out.println("f" + i + " = " + fn);
            f1 = f2;
            f2 = fn;
        }
    }
}
