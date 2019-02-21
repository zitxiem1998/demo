import java.util.Scanner;

public class MaxListNumber {
    public void maxnum(int[] listnum) {
        int maxnum;
        maxnum = listnum[0];
        for (int i = 0; i < listnum.length; i++) {
            if (listnum[i] > maxnum) {
                maxnum = listnum[i];
            }
        }
        System.out.print("Max of list number is: "+maxnum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxListNumber maxListNumber=new MaxListNumber();
        System.out.print("Enter element number of list: ");
        int number = scanner.nextInt();
        int[] listnum = new int[number];
        System.out.print("Enter List number: ");
        for (int i = 0; i < number; i++) {
            listnum[i] = scanner.nextInt();
        }
        maxListNumber.maxnum(listnum);
    }
}
