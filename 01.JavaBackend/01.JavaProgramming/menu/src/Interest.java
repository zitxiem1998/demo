import java.util.Scanner;

public class Interest {
    Scanner scanner = new Scanner(System.in);

    public void ratemonth(double n) {
        System.out.print("Nhap vao so thang ma ban da gui ngan hang: ");
        int month = scanner.nextInt();
        System.out.print("Moi ban nhap vao he so lai suat: ");
        float interrest = scanner.nextFloat();
        double money = n * month * interrest;
        System.out.print("Toan bo so tien ban nhan duoc sau khi gui " + month + " la: " + money);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien da gui ngan hang: ");
        double count = scanner.nextDouble();
        Interest interest = new Interest();
        interest.ratemonth(count);

    }
}
