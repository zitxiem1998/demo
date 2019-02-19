import java.util.Scanner;

public class Main {
    public void Display()
    {
        Scanner scanner=new Scanner(System.in);
        double wei,hei,bmi;
        System.out.print("Moi ban nhap can nang: ");
        wei=scanner.nextDouble();
        System.out.print("Moi ban nhap chieu cao: ");
        hei=scanner.nextDouble();
        bmi=wei/Math.pow(hei,2);
        if(bmi<18.5)
            System.out.print(bmi+" underweight");
        else if(bmi<25.0)
            System.out.print(bmi+" Normal");
        else if(bmi<30.0)
            System.out.print(bmi+" Overweight");
        else System.out.print(bmi+" Obese");

    }
    public static void main(String[] args) {
        Main main=new Main();
        main.Display();
    }
}
