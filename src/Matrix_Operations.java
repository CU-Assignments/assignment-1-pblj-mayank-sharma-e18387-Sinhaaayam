import java.util.Scanner;

public class MatrixOperations {

    // Method to check if two matrices can be added or subtracted
    public static boolean canAddOrSubtract(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    // Method to check if two matrices can be multiplied
    public static boolean canMultiply(int[][] matrix1, int[][] matrix2) {
        return matrix1[0].length == matrix2.length;
    }

    // Method to perform matrix addition
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to perform matrix subtraction
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for matrix 1
        System.out.println("Enter the number of rows and columns for Matrix 1:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for matrix 2
        System.out.println("Enter the number of rows and columns for Matrix 2:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Check if operations are valid
        if (canAddOrSubtract(matrix1, matrix2)) {
            System.out.println("Addition:");
            int[][] additionResult = addMatrices(matrix1, matrix2);
            printMatrix(additionResult);

            System.out.println("Subtraction:");
            int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
            printMatrix(subtractionResult);
        } else {
            System.out.println("Addition and Subtraction are not possible for these matrices due to dimension mismatch.");
        }

        if (canMultiply(matrix1, matrix2)) {
            System.out.println("Multiplication:");
            int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
            printMatrix(multiplicationResult);
        } else {
            System.out.println("Multiplication is not possible for these matrices due to dimension mismatch.");
        }

        scanner.close();
    }
}
