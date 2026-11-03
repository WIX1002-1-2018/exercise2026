/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class W05LO8 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(101);
        int test = 0;
        System.out.println(num);
        
        for (int i=2 ; i <= num ; i++){
            for (int j = 2 ; j < i ; j++){
                if (i % j == 0 )
                    test+=1;
            }
            
            if (test==0){
                System.out.print(i + "  ");
            }
            test = 0;
        
    }
    
    }}
