package interfaceComparator;

import java.util.Arrays;
import java.util.Scanner;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle comparableCircle) {
        if (this.getRadius() > comparableCircle.getRadius()) {
            return 1;
        } else if (this.getRadius() < comparableCircle.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComparableCircle[] comparableCircles=new ComparableCircle[3];
        for (int i=0;i<comparableCircles.length;i++) {
            System.out.print("Enter radius: ");
            double radius=scanner.nextDouble();
            comparableCircles[i]=new ComparableCircle(radius);
        }
        for (int i=0;i<comparableCircles.length;i++) {
            System.out.println(comparableCircles[i]);
        }
        Arrays.sort(comparableCircles);
        for (int i=0;i<comparableCircles.length;i++) {
            System.out.println(comparableCircles[i]);
        }

    }
}

