package W06;

import java.util.Scanner;
import java.util.Arrays;

public class W06L04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };

        int[][] rotatedMatrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };

         // Coordinates for arrow to rotate at 90°, 180°, 270°, 0°
        int[][] sideIncrements1 = {
            {+1, +1},
            {+1, -1},
            {-1, -1},
            {-1, +1}
        };

        // Initial position
        int i1 = 0, j1 = 1;

        // Rotate values that aren't in edges
        for (int i = 0; i < 4; i++) {

                // Coordinates for new position
               int nextI1 = i1 + sideIncrements1[i][0];
               int nextJ1 = j1 + sideIncrements1[i][1];

               // Put previous value in new position
               rotatedMatrix[nextI1][nextJ1] = matrix[i1][j1];

               // Update new position
                i1 = nextI1;
                j1 = nextJ1;
            }

            // Rotate edges

            // Increment to change positions
            int incrementIndex = 0;

            for (int i = 0; i < 3; i+=2) {
                for (int j = 0; j < 3; j+=2) {

                    // If on the first row, +2
                    if (i == 0) incrementIndex = +2;

                    // If on the second row, -2
                    else incrementIndex = -2;

                    // If row and column are the same, change the j position
                    if (i == j) {
                    rotatedMatrix[i][j+incrementIndex] = matrix[i][j];
                    }

                    // If row and column are not the same, change the i position
                    else {
                    rotatedMatrix[i+incrementIndex][j] = matrix[i][j];
                    }
                }

            }

     // Original and rotated matrix output
        System.out.println("3 by 3 matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-3d", matrix[i][j]);
            }
            System.out.println();
        }
        
        
        System.out.println("After rotates 90 degrees clockwise: ");
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.printf("%-3d", rotatedMatrix[i][j]);
            }
            System.out.println();
        }

    }
}


