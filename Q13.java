
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix-1 Rows:");
        int rows1 = sc.nextInt();
        System.out.println("Enter Matrix-1 Columns:");
        int cols1 = sc.nextInt();
        System.out.println("Enter Matrix-2 Rows:");
        int rows2 = sc.nextInt();
        System.out.println("Enter Matrix-2 Columns:");
        int cols2 = sc.nextInt();

        if (rows2 != cols1) {
            System.out.println("Matrix multiplication is not possible with this dimentions");
            return;
        }

        int[][] Matrix1 = new int[rows1][cols1];
        System.out.println("Enter values of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                Matrix1[i][j] = sc.nextInt();
            }
        }

        int[][] Matrix2 = new int[rows2][cols2];
        System.out.println("Enter values of Second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                Matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] ResultMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    ResultMatrix[i][j] += Matrix1[i][k] * Matrix2[k][j];
                }
            }
        }
        System.out.println("Result Matrix");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(ResultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
