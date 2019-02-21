import java.util.Scanner;

public class Max_2_DimensionalArrays {
    public void maxArray(int[][] array,int row,int col) {
        int max=array[0][0];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.print("Max of Array is : "+max);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Max_2_DimensionalArrays max_2_dimensionalArrays=new Max_2_DimensionalArrays();
        System.out.print("Enter row: ");
        int row=scanner.nextInt();
        System.out.print("Enter column: ");
        int col=scanner.nextInt();
        System.out.print("Enter element of the table: ");
        int[][] array=new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                array[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
               System.out.print(array[i][j]);
            }
            System.out.print("\r\n");
        }
        max_2_dimensionalArrays.maxArray(array,row,col);
    }
}
