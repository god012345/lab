import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] matrix3 = new int[2][2];
        System.out.println("Enter element of the first 2x2 matrix : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matrix1 [" + i + "][" + j + "] : ");
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter element of the secound 2x2 matrrix :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matrix2[" + i + "][" + j + "] :");
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("\nResult ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix3[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
                System.out.print(matrix3[i][j] + "   ");
            }
            System.out.println();
        }
        input.close();
    }

}