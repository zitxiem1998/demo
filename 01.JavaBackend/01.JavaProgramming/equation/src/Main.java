import java.util.Scanner;

public class Main {

    public void equation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh co vo so ngiem!");
            } else {
                System.out.print("Phuong trinh vo nghiem");
            }
        }
        if (a != 0) {
            double c = ((-b) / a);
            System.out.print("Phuong trinh co nghiem la:" + c);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Chao mung ban den voi chuong trinh giai phuong trinh bac nhat!");
        System.out.print("Moi ban nhap 2 so: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        main.equation(a, b);
    }
}
