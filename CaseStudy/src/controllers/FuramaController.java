package controllers;

import java.util.Scanner;

public class FuramaController {
     public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        //Menu
        System.out.println("*************************MENU*************************");
        System.out.println("**   1. Employee Management                         **");
        System.out.println("**   2. Customer Management                         **");
        System.out.println("**   3. Facility Management                         **");
        System.out.println("**   4. Booking Management                          **");
        System.out.println("**   5. Promotion Management                        **");
        System.out.println("**   6. Exit                                        **");
        System.out.println("******************************************************");
        System.out.printf("Input number to chose function: ");
        int menuKey = scanner.nextInt();
        switch (menuKey){
            case 1:
                System.out.println("*************EMPLOYEE MANAGEMENT**************");
                System.out.println("**   1. Display list employees              **");
                System.out.println("**   2. Add new employee                    **");
                System.out.println("**   3. Edit employee                       **");
                System.out.println("**   4. Return main menu                    **");
                System.out.println("**********************************************");
                break;
            case 2:
                System.out.println("**************CUSTOMER MANAGEMENT*************");
                System.out.println("**   1. Display list customers              **");
                System.out.println("**   2. Add new customer                    **");
                System.out.println("**   3. Edit customer                       **");
                System.out.println("**   4. Return main menu                    **");
                System.out.println("**********************************************");
                break;
            case 3:
                System.out.println("**************FACILITY MANAGEMENT*************");
                System.out.println("**   1. Display list facility               **");
                System.out.println("**   2. Add new facility                    **");
                System.out.println("**   3. Display list facility maintenance   **");
                System.out.println("**   4. Return main menu                    **");
                System.out.println("**********************************************");
                break;
            case 4:
                System.out.println("***************BOOKING MANAGEMENT*************");
                System.out.println("**   1. Add new booking                     **");
                System.out.println("**   2. Display list booking                **");
                System.out.println("**   3. Create new contracts                **");
                System.out.println("**   4. Display list contracts              **");
                System.out.println("**   5. Edit contracts                      **");
                System.out.println("**   4. Return main menu                    **");
                System.out.println("**********************************************");
                break;
            case 5:
                System.out.println("**************PROMOTION MANAGEMENT************");
                System.out.println("**   1. Display list customers use service  **");
                System.out.println("**   2. Display list customers get voucher  **");
                System.out.println("**   3. Return main menu                    **");
                System.out.println("**********************************************");
                break;
            case 6:
                System.out.println("You chose Exit!");
                break;
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}


