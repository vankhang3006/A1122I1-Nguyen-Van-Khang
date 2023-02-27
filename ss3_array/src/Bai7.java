import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.print("Nhập số hàng(cột) của ma trận vuông m x m: ");
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        double [][] arr = new double[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: " );
                arr[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println("Ma trận vừa nhập: ");
        double sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t\t");
                if(i==j){
                    sum = sum + arr[i][j];
                }
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        System.out.println("Tổng các giá trị của đường chéo chính của ma trận vừa nhập là: "+sum);
    }
}
