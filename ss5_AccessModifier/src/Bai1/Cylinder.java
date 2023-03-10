package Bai1;

public class Cylinder extends Circle{
    private double height = 1.0 ;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double volume = super.getArea() * height;
        return volume;
    }

    @Override
    public double getArea() {
        double area = 2*Math.PI*getRadius()*height + 2* super.getArea();
        return area;
    }

    @Override
    public String toString() {
        String result = super.toString() + " height = " + height;
        return result;
    }

}
