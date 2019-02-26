import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this.height = 5;
        this.width = 5;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(int width, int height) {
        return this.width * this.height;
    }

    public int getPerimeter(int width, int height) {
        return (this.width + this.height) * 2;
    }

    public void display() {
        int area = getArea(this.width, this.height);
        int perimeter = getPerimeter(this.width, this.height);
        System.out.print("Dien tich hinh chu nhat la: " + area + " va chu vi la: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.display();

    }
}
