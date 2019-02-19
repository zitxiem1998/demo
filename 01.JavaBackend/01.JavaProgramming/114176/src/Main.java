import java.util.Scanner;


public class Main {

    public  boolean Element(int i) {
        if (i < 2) return false;
        for (int j = 2; j < (i-1); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
    public void Display()
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Nhap vao so luong so nguyen to can in ra: ");
        num = scanner.nextInt();
        int count = 0;
        int n=2;
        while (count < num) {
            if (Element(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.Display();
    }
}

