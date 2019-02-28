package interfaceComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rectangle1, Rectangle rectangle2) {
        return Double.compare(rectangle1.getWidth() * rectangle1.getLength(), rectangle2.getLength() * rectangle2.getWidth());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RectangleComparator rectangleComparator = new RectangleComparator();
        Rectangle[] rectangles = new Rectangle[5];
        for (int i = 0; i < rectangles.length; i++) {
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            System.out.print("Enter Length: ");
            double length = scanner.nextDouble();
            rectangles[i]=new Rectangle("green",true,width,length);
        }
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i]);
        }
        Arrays.sort(rectangles, rectangleComparator);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i]);
        }
    }
}
