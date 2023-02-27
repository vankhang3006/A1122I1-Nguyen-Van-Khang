import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        System.out.print("Nhập vào số của cột muốn tính tổng: ");
        Scanner scanner = new Scanner(System.in);
        int col = Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(j==(col-1)){
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println("Tổng giá trị của cột " + col + " là: " + sum);
    }
}
