package Bai1v2;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
//        System.out.print("Nhập vào phần trăm kích thước cần tăng cho hình tròn: ");
//        double percent1 = Double.parseDouble(scanner.nextLine());
//        System.out.println(shapes[0].reSize(percent1));
        shapes[1] = new Rectangle(2,4);
//        System.out.print("Nhập vào phần trăm kích thước cần tăng cho hình chữ nhật: ");
//        double percent2 = Double.parseDouble(scanner.nextLine());
//        System.out.println(shapes[1].reSize(percent2));
        shapes[2] = new Square(4);
        for ( Shape shape : shapes){
            System.out.println("Nhập vào phần trăm kích thước cần tăng: ");
            double percent = Double.parseDouble(scanner.nextLine());
            System.out.println(shape.toString() + " - " + shape.reSize(percent));
            if (shape instanceof Colorable) {
                Colorable colorable = (Square) shape;
                System.out.println(colorable.howToColor());
            }
        }
    }
}
