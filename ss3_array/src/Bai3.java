
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, n1, n2, n;
        int k = 0;
        n1 = inputN(scanner, 1);
        int[] arr1 = new int[n1];
        for (i = 0; i < n1; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + 1 + " của mảng 1: ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        n2 = inputN(scanner, 2);

        int[] arr2 = new int[n2];

        for (i = 0; i < n2; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + 1 + " của mảng 2: ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng 1: " + Arrays.toString(arr1));
        System.out.println("Mảng 2: " + Arrays.toString(arr2));
        n = n1 + n2;
        int[] arrMerg = new int[n];
        for (i = 0; i < n1; i++) {
            arrMerg[i] = arr1[i];
        }
        for (i = n1; i < n; i++) {
            arrMerg[i] = arr2[k];
            k++;
        }
        System.out.println("Mảng sau khi gộp: " + Arrays.toString(arrMerg));
    }

    private static int inputN(Scanner scanner, int x) {
        int n;
        do {
            System.out.print("Nhập vào số phần tử của mảng " + x + " : ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("n > 0, xin kiểm tra lại!!!");
            }
        } while (n <= 0);
        return n;
    }
}
