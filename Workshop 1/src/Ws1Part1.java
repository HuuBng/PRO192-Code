
import java.util.Scanner;

public class Ws1Part1 {

    public static void main(String[] args) {
        int rows, cols, matrix[][];
        Scanner sc = new Scanner(System.in);

        // Entering data
        System.out.println("Enter rows: ");
        rows = sc.nextInt();
        System.out.println("Enter columns: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Enter matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("m[" + i + "] [" + j + "]=");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix imputted: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }

        // Calculate sum of matrix
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);

        // Get average value
        System.out.println("Average: " + (float) sum / (rows * cols));
    }

}
