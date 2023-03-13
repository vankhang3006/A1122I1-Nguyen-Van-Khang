package Bai1v2;

public class Square extends Shape implements Colorable{
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * this.edge;
    }

    public double getPerimeter() {
        return 4 * this.edge;
    }

    @Override
    public String toString() {
        return "A Square with edge= "
                + getEdge()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor(){
        return "Color all four sides";
    }

    @Override
    public double reSize(double percent){
        return getArea()*(percent+100)/100;
    }
}
