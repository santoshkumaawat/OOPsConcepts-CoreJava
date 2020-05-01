package Encapsulation;

public class CircleOne {

    private double radius, area, circumference, diameter;
    final double pi = 3.14;

    public void setRadius(double r) {
        radius = r;
    }

    public void computeArea() {
        area = pi * radius * radius;
        System.out.println("Area :" + area);
    }

    public void computeCircumference() {
        circumference = 2 * pi * radius;
        System.out.println("Circumfrence :" + circumference);
    }

    public void computeDiameter() {
        diameter = 2 * radius;
        System.out.println("Diameter :" + diameter);
    }
}
