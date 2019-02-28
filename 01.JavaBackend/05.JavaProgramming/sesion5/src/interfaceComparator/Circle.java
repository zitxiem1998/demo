package interfaceComparator;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent;
    }

    @Override
    public String toString() {
        return ("\"A systemOfGeometricObjects.Circle with radius =" + this.radius + ", which is a subclass of " + super.toString());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
