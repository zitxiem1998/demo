import java.util.Scanner;

public class MainDiagonal {
    public void sumMainDiagonal(float[][] matrix, int heigth) {
        float sum = 0;
        for (int i = 0; i < heigth; i++) {
            sum += matrix[i][i];
        }
        System.out.print("The sum of the numbers of the main diagonal is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainDiagonal mainDiagonal = new MainDiagonal();
        System.out.print("Enter height: ");
        int heigth = scanner.nextInt();
        System.out.print("Enter matrix: ");
        float[][] matrix = new float[heigth][heigth];
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < heigth; j++) {
                matrix[i][j] = scanner.nextFloat();
            }
        }
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < heigth; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\r\n");
        }
        mainDiagonal.sumMainDiagonal(matrix,heigth);
    }
}
