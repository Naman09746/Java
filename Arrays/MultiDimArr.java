

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArr {
    public static void main(String[] args) {
        // Define a 2D array (matrix) with 3 rows and 3 columns
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);

        // Input: Fill the matrix with user-provided values
        System.out.println("Enter the values for a 3x3 matrix:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Output: Display the matrix in matrix format
        System.out.println("The matrix in matrix format is:");
        for (int[] row : arr) {
            System.out.print("[ ");
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println("]");
        }

        in.close(); // Close the Scanner object
    }
}
