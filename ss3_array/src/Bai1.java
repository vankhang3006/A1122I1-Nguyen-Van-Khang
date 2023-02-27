
import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int[] numbers = {10, 8, 6, 7, 8, 6, 0, 0, 0, 0};
        int i, j;
        System.out.println(Arrays.toString(numbers));
        System.out.print("Nhập vào giá trị cần kiểm tra trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int item = Integer.parseInt(scanner.nextLine());
        for (i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == item) {
                System.out.println(item + " Đang tồn tại ở vị trí " + (i + 1));
                for (j = i; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                break;
            }
        }
        if (i == numbers.length - 1) {
            System.out.println(item + " Không tồn tại trong mảng.");
        }

        System.out.println(Arrays.toString(numbers));

    }
}
