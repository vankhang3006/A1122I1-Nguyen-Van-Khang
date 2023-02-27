import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của ma trận: ");
        int hang = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số cột của ma trận: ");
        int cot = Integer.parseInt(scanner.nextLine());
        int[][] numbers = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        int max = numbers[0][0];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("Gía trị lớn nhất của ma trận vừa nhập vào là: " + max);
    }
}
