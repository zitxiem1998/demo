import java.util.Scanner;

public class CountStudent {
    public void countStudent(int[] listPoint) {
        int count = 0;
        for (int i = 0; i < listPoint.length; i++) {
            if (listPoint[i] >= 5) {
                count++;
            }
        }
        System.out.print("The number of students passing the exam is :" + count);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of list: ");
        int size = scanner.nextInt();
        int[] listStudent = new int[size];
        for (int i = 0; i < listStudent.length; i++) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            listStudent[i] = scanner.nextInt();
            if (listStudent[i] < 0 || listStudent[i] > 10) {
                System.out.println("Not illegal!");
                System.out.print("Enter a mark for student " + (i + 1) + ": ");
                listStudent[i] = scanner.nextInt();
            }
        }
        System.out.print("List point of student: ");
        for (int i = 0; i < listStudent.length; i++) {
            System.out.print(listStudent[i] + " ");
        }
        System.out.print("\r\n");
        CountStudent countStudent = new CountStudent();
        countStudent.countStudent(listStudent);
    }
}
