/*
Write a program that used to create Pascal Triangle in the square matrix. The program
will accept an integer from the users and use the integer to create the Pascal Triangle.
*/
package LabW6;


import java.util.Scanner;
public class W06L06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of Pascal Triangle to generate: ");
        int rows = sc.nextInt();

        int[][] triangle = new int[rows][rows];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if ( j == 0 || i == j ) triangle[i][j] = 1;
                else if (j < i ) triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                else triangle[i][j] = 0;
                
                System.out.printf("%3d", triangle[i][j]);
            }
                System.out.println();
        }

        sc.close();
    }
}