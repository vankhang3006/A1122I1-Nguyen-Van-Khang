package BaiTap;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Menu
        System.out.println("*************************MENU*************************");
        System.out.println("*   1. Chuyển đổi từ hệ thập phân sang hệ nhị phân.  *");
        System.out.println("*   2. Chuyển đổi từ hệ nhị phân sang hệ thập phân.  *");
        System.out.println("*   3. Chuyển đổi từ hệ thập phân sang hệ 16.        *");
        System.out.println("*   4. Chuyển đổi từ hệ 16 sang hệ thập phân.        *");
        System.out.println("*   5. Thoát.                                        *");
        System.out.println("******************************************************");
        System.out.printf("Nhập một số từ 1 -> 5 để chọn chức năng của menu: ");
        int key = scanner.nextInt();
        switch (key){
            case 1:
                System.out.printf("Nhập một số cần biến đổi sang hệ nhị phân: ");
                int decNum = scanner.nextInt();
                Stack<Integer> stack = new Stack<>();
                System.out.printf(decNum +"= ");
                while(decNum > 0){
                    stack.push(decNum % 2);
                    decNum /=2;
                }

                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                break;
            case 2:
                int temp, count = 0;
                double digit,s,result = 0;
                System.out.printf("Nhập một số hệ nhị phân cần biến đổi: ");
                int biNum = scanner.nextInt();
                int num = Integer.parseInt(String.valueOf(biNum),2);
                System.out.println(biNum);
                break;
            case 3:
                System.out.printf("Nhập một số cần biến đổi sang hệ 16: ");
                decNum = scanner.nextInt();
                Stack<String> st = new Stack<>();
                System.out.printf(decNum +"= ");
                while(decNum > 0){
                    int du = decNum%16;
                    switch (du){
                        case 10:
                            st.push("A");
                            break;
                        case 11:
                            st.push("B");
                            break;
                        case 12:
                            st.push("C");
                            break;
                        case 13:
                            st.push("D");
                            break;
                        case 14:
                            st.push("E");
                            break;
                        case 15:
                            st.push("F");
                            break;
                        default:
                            st.push(String.valueOf(du));
                            break;
                    }
                    decNum /=16;
                }
                while (!st.isEmpty()){
                    System.out.print(st.pop());
                }
                break;
            case 4:
                scanner = new Scanner(System.in);
                System.out.printf("Nhập một số hệ 16 cần biến đổi: ");
                String str = scanner.nextLine();
                int hexNum = Integer.parseInt(str,16);
                System.out.println(hexNum);
                break;
            case 5:
                System.out.println("Bạn đã chọn thoát! ");
                System.exit(0);
                break;
        }

    }
}
