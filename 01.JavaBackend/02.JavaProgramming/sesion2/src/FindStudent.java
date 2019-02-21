import java.util.Scanner;

public class FindStudent {

    public void find(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(name)) {
                System.out.print("Position of the student in the list " + name + " is: " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.print("Not found " + name + " in the list!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindStudent findStudent = new FindStudent();
        System.out.print("Enter number student: ");
        int number = scanner.nextInt();
        String[] lists = new String[number];
        System.out.print("Enter list student: ");
        for (int i = 0; i < number; i++) {
            lists[i] = scanner.next();
        }
        findStudent.find(lists);
    }
}
