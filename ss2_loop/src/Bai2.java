import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int count = 0;

        while (count <= numbers) {
            for (int n = 1; ; ++n) {
                int countPrime = 0;
                for (int i = 2; i <= n - 1; i++) {
                    if (n % i == 0) {
                        countPrime++;
                    }
                }
                if (countPrime == 0 && n > 1) {
                    System.out.printf(n + " ");
                    count++;
                }
                if (count == numbers)
                    break;
            }
        }
    }
}
