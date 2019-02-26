package circleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 5.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    @Override
    public String toString() {
        return (super.toString()+", Height = "+this.height+", Volume ="+this.getVolume());
    }
    public double getVolume() {
        return this.height*this.getAcreage();
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(4);
        System.out.print(cylinder.toString());
    }
}
