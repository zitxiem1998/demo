package systemOfGeometricObjects;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super("blue", true, side, side);
    }


    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public String toString() {
        return ("\"A systemOfGeometricObjects.Square with side = "+this.getSide()+", which is a subclass of "+super.toString());
    }
    @Override
    public void setWidth(double side) {
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        setLength(side);
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8);
        System.out.println(square);
    }
}
