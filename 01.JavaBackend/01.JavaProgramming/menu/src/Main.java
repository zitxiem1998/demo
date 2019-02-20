import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public void triangle() {
        System.out.print("Moi ban nhap canh cua tam giac: ");
        int edge = scanner.nextInt();
        for (int i = 1; i <= edge; i++) {
            for (int j = edge; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    public void square() {
        System.out.print("Nhap do dai cua canh hinh vuong: ");
        int edge = scanner.nextInt();
        for (int i = 1; i <= edge; i++) {
            for (int j = 1; j <= edge; j++) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    public void rectangle() {
        System.out.print("Moi ban nhap 2 canh cua hinh chu nhat: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Menu");
        System.out.println("Draw the triangle");
        System.out.println("Draw the square");
        System.out.println("Draw the rectangle");
        System.out.print("Moi ban nhap lua chon: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                main.triangle();
                break;
            case 2:
                main.square();
                break;
            case 3:
                main.rectangle();
                break;
            case 0:
                System.exit(0);
        }

    }
}
