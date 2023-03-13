package Bai1v2;

public class Test {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(2.4);
        cy.setColor("blue");
        cy.setHeight(4.5);
        System.out.println(cy.toString());
        System.out.println("area = " + cy.getArea());
        System.out.println("volume = " + cy.getVolume());
        Circle circle = new Circle();
        circle.setColor("yellow");
        circle.setRadius(3.2);
        System.out.println(circle.toString());
        System.out.println("area = " + circle.getArea());
    }

}
