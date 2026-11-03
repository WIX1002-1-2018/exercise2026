/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L04;

/**
 *
 * @author Azzam Aziz
 */
public class W05Q02 {
    public static void main(String[] args) {
        int n = 3;
        int addNumbers = 0;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                addNumbers += j;
            }
        }
        System.out.println(addNumbers);
    }
}
