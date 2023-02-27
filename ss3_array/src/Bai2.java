import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int[] numbers = {10, 8, 6, 7, 8, 6, 0, 0, 0, 0};
        int index, number;
        System.out.println(Arrays.toString(numbers));
        System.out.print("Nhập vào vị trí của mảng cần thêm vào: ");
        Scanner scanner = new Scanner(System.in);
        index = Integer.parseInt(scanner.nextLine());
        if (index <= 1 || index >= numbers.length - 1) {
            System.out.print("Không chèn được vào phần tử vào mảng: ");
        }
        System.out.print("Nhập vào giá trị của mảng cần thêm vào: ");
        number = Integer.parseInt(scanner.nextLine());

        for (int i = numbers.length - 1; i > index; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[index] = number;
        System.out.println("Mảng sau khi chèn: " + Arrays.toString(numbers));
    }
}