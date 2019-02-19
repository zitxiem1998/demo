import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double vnd=23000;
        double usd;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Moi ban nhap so tien USD: ");
        usd=scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("So tien sau khi da quy doi sang VND:"+quydoi);


    }
}
