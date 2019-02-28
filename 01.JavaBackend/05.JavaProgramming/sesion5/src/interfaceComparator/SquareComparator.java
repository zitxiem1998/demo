package interfaceComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square square1, Square square2) {
        return Double.compare(square1.getSide(), square2.getSide());
    }

    public static void main(String[] args) {
        SquareComparator squareComparator = new SquareComparator();
        Scanner scanner = new Scanner(System.in);
        Square[] squares=new Square[3];
        for (int i = 0; i < squares.length; i++) {
            System.out.print("Enter side: ");
            double side = scanner.nextDouble();
            squares[i] = new Square(side);
        }
        for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i]);
        }
        Arrays.sort(squares, squareComparator);
        for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i]);
        }
    }
}
