import java.util.Scanner;

public class MinListNumber {
        public void minnum(int[] listnum) {
            int minnum;
            minnum = listnum[0];
            for (int i = 0; i < listnum.length; i++) {
                if (listnum[i] < minnum) {
                    minnum = listnum[i];
                }
            }
            System.out.print("Min of list number is: "+minnum);
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinListNumber minListNumber = new MinListNumber();
        System.out.print("Enter element number of list: ");
        int number = scanner.nextInt();
        int[] listnum = new int[number];
        System.out.print("Enter List number: ");
        for (int i = 0; i < number; i++) {
            listnum[i] = scanner.nextInt();
        }
        minListNumber.minnum(listnum);

    }
}
