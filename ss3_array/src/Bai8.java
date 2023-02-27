import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        String str = "Hello word!";

        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào ký tự bất kỳ: ");
        char c = scanner.next().charAt(0);

        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < str.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + c +
                " trong chuỗi " + str + " = " + count);
    }
}
