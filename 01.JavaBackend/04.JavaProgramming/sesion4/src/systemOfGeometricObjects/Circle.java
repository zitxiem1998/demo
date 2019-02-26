package systemOfGeometricObjects;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle.getColor(), circle.isFilled());
        this.radius = circle.radius;
    }

    @Override
    public String toString() {
        return ("\"A systemOfGeometricObjects.Circle with radius =" + this.radius + ", which is a subclass of "+super.toString());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
