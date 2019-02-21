import java.util.Scanner;

public class TemperatureTransfer {
    Scanner scanner = new Scanner(System.in);

    public void fToC() {
        System.out.print("Enter Fahrenheit:  ");
        double fahre = scanner.nextDouble();
        double cel=(5.0 / 9) * (fahre - 32);
        System.out.print("Celsius: "+cel);
    }
    public void cToF() {
        System.out.print("Enter Celsius: ");
        double cel=scanner.nextDouble();
        double fahre= (9.0 / 5) * cel + 32;
        System.out.print("Fahrenheit: "+fahre);
    }
    public static void main(String[] args) {
        TemperatureTransfer c_f=new TemperatureTransfer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                c_f.fToC();
                break;
            }
            case 2: {
                c_f.cToF();
                break;
            }
            case 0: {
                System.exit(0);
            }
        }
        while (choice != 0) ;
    }
}
