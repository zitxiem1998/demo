package circleAndCylinder;

public class Circle {
    public final double PI = 3.14;
    private double radius;
    private String color;

    public Circle() {
        this.radius = 5;
        this.color = "blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getAcreage() {
        return PI * Math.pow(radius, 2);
    }

    public String toString() {
        return ("Radius is: " + this.radius + ", Color is: " + this.color + " and acreage = " + this.getAcreage());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4,"green");
        System.out.print(circle.toString());
    }
}
