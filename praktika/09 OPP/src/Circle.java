public class Circle extends Shape {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*(radius*radius);
    }

    public double getPerimeter() {
        return (radius*2)*Math.PI;
    }

    public String toString() {
        return "A Circle with radius=xxx, which is a subclass of " + super.toString();
    }
}
