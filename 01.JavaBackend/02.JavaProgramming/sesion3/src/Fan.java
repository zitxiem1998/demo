public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public String toString() {
        if (this.on) {
            return ("Speed is: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color + ", fan is on");
        } else {
            return ("Radius: " + this.radius + ", Color: " + this.color + ", fan is off");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
        Fan fan1 = new Fan();
        /*Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật. */
        fan1.speed = FAST;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;
        System.out.println(fan1.toString());

        Fan fan2=new Fan();
        // Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
        fan2.speed = MEDIUM;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.on = false;
        System.out.println(fan2.toString());
    }
}
