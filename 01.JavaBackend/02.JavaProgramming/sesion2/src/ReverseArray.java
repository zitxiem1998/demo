import java.util.Scanner;

public class ReverseArray {
    public void reverse(int[] listnumber) {
        System.out.print("List number: ");
        for (int i = 0; i < listnumber.length; i++) {
            System.out.print(listnumber[i] + " ");
        }
        System.out.print("\r\n");
        for (int i = 0; i < listnumber.length / 2; i++) {
            int temp = listnumber[i];
            listnumber[i] = listnumber[listnumber.length - 1 - i];
            listnumber[listnumber.length - 1 - i] = temp;
        }
        System.out.print("List number: ");
        for (int i = 0; i < listnumber.length; i++) {
            System.out.print(listnumber[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReverseArray reverseArray = new ReverseArray();
        System.out.print("Enter element number of list: ");
        int number = scanner.nextInt();
        System.out.print("Enter List number: ");
        int[] listnum = new int[number];
        for (int i = 0; i < number; i++) {
            listnum[i] = scanner.nextInt();
        }
        reverseArray.reverse(listnum);
    }
}
