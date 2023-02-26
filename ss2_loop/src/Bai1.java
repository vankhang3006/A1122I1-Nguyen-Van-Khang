import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit ");
        System.out.print("Enter a number to choose function: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        switch (key) {
            case 1:
                System.out.print("Enter row number: ");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.printf("* ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 2:
                System.out.print("Enter row number: ");
                n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("* ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 3:
                System.out.print("Enter row number: ");
                n = sc.nextInt();
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("* ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 4:
                System.out.println("You chose Exit!");
                break;
        }
    }
}
