import java.util.Scanner;

public class Acreage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap 2 canh cua hinh chu nhat: ");
        float length=scanner.nextFloat();
        float width=scanner.nextFloat();
        System.out.print("Dien tich hinh chu nhau la: "+length*width);
    }
}
