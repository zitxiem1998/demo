import java.util.Scanner;

public class MineSweeper {
    public void mineSweeper(String[][] matrix, int row, int col) {
        MineSweeper mineSweeper = new MineSweeper();
        String[][] newMatrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String curentCell = matrix[i][j];
                if (curentCell.equals("*")) {
                    newMatrix[i][j] = "*";
                } else {
                    final int[][] NEIGHBOURS_ORDINATE = {
                            {i, j - 1}, {i, j + 1}
                    };

                    int minesAround = 0;
                    for (int k = 0; k < NEIGHBOURS_ORDINATE.length; k++) {
                        int[] neighbourOrdinate = NEIGHBOURS_ORDINATE[k];
                        int xOrdinateOfNeighbour = neighbourOrdinate[1];
                        int yOrdinateOfNeighbour = neighbourOrdinate[0];

                        boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0 || xOrdinateOfNeighbour == col;
                        if (isOutOfMapNeighbour) continue;

                        boolean isMineOwnerNeighbour = matrix[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
                        if (isMineOwnerNeighbour) minesAround++;
                    }

                    newMatrix[i][j] = String.valueOf(minesAround);
                }
            }
        }
        System.out.println("New Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MineSweeper mineSweeper = new MineSweeper();
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int col = scanner.nextInt();
        String[][] matrix = new String[row][col];
        System.out.print("Enter matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.next();
            }
        }
        System.out.println("The Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\r\n");
        }
        mineSweeper.mineSweeper(matrix, row, col);
    }
}
