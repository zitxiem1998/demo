import java.util.Scanner;

public class Main {

    public void Display()
    {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.print("Moi ban nhap vao 2 so: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0 && b==0)
            System.out.print("No greatest common factor");
        while (a!=b) {
            if(a>b) a=a-b;
            else b=b-a;
        }
        System.out.print("Uoc chung lon nhat la "+a);
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.Display();

    }
}
