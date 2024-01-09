/*Display lower triangular matrix */

/*Concepts
 * Multidimensional Arrays
 * row-major traversal
 */
import java.util.Scanner;
public class LowerTriangularMatrix{
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        n = myObj.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Enter the matrix elements...");
        int element;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[0].length; j++){
                System.out.print("Element A"+i+j+": ");
                element = myObj.nextInt();
                array[i][j] = element;
            }
        }
        // // Displaying the matrix
        // System.out.println("Matrix...")
        // for (int i = 0; i<array.length; i++){
        //     for (int j = 0; j<array.length; j++){
        //         System.out.print(array[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println("Lower triangular matrix...");
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[0].length; j++){
                if (j>i){
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}