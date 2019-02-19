import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public void Chunhat() {
        int cdai, crong;
        System.out.print("Moi ban nhap chieu dai: ");
        cdai = scanner.nextInt();
        System.out.print("Moi ban nhap chieu rong: ");
        crong = scanner.nextInt();
        for (int i = 0; i < cdai; i++) {
            for (int j = 0; j < crong; j++)
                System.out.print("*");
            System.out.print("\r\n");
        }
    }

    public void Tamgiaccan() {
        int canh;
        System.out.print("Moi ban nhap canh cua tam giac vuong: ");
        canh = scanner.nextInt();
        int lchon;
        System.out.print("Moi ban nhap lua chon: ");
        lchon = scanner.nextInt();
        if (lchon == 1) {
            for (int i = 1; i <= canh; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                System.out.print("\r\n");
            }
        }
        if (lchon == 2) {
            for (int i = 1; i<=canh;i++)
            {
                for(int j=canh;j>canh-i;j--)
                    System.out.print("*");
                System.out.print("\r\n");
            }
        }
        if (lchon == 3) {
            for (int i = canh; i > 0; i--) {
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                System.out.print("\r\n");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Tamgiaccan();
    }
}
