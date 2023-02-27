
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n1, n2, n;
        int k = 0;
        do {
            System.out.print("Nhập vào số phần tử của mảng 1: ");
            n1 = Integer.parseInt(scanner.nextLine());
            if (n1 <= 0) {
                System.out.println("n1 > 0, xin kiểm tra lại!!!");
            }
        } while (n1 <= 0);
        int[] arr1 = new int[n1];
        for (i = 0; i < n1; i++) {
            System.out.print("Nhập vào phần tử arr[" + i + "] của mảng 1: ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        do {
            System.out.print("Nhập vào số phần tử của mảng 2: ");
            n2 = Integer.parseInt(scanner.nextLine());
            if (n2 <= 0) {
                System.out.println("n2 > 0, xin kiểm tra lại!!!");
            }
        } while (n2 <= 0);
        int[] arr2 = new int[n2];
        for (i = 0; i < n2; i++) {
            System.out.print("Nhập vào phần tử arr[" + i + "] của mảng 2: ");
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
}
