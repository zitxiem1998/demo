package interfaceComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        return Double.compare(o1.getRadius(), o2.getRadius());
    }

    public static void main(String[] args) {
        CircleComparator circleComparator = new CircleComparator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius of circle 1: ");
        double radius1 = scanner.nextDouble();
        System.out.print("Radius of circle 2: ");
        double radius2 = scanner.nextDouble();
        Circle[] circles = new Circle[3];
        circles[0] = new Circle("green", true, radius1);
        circles[1] = new Circle("blue", true, radius2);
        circles[2] = new Circle();
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
        Arrays.sort(circles, circleComparator);
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
    }
}
