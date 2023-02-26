public class Bai3 {
    public static void main(String[] args) {


        for (int n = 2; n <= 100; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    count++;
                } else {
                    continue;
                }

            }
            if (count == 2) {
                System.out.printf(n + " ");
            }


        }
    }
}
