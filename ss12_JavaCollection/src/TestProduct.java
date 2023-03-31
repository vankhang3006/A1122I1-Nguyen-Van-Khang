import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager pm = new ProductManager();
        //Menu
        System.out.println("*************************MENU*************************");
        System.out.println("**   1. Add product                                 **");
        System.out.println("**   2. Edit product by id                          **");
        System.out.println("**   3. Delete product by id                        **");
        System.out.println("**   4. Display product list                        **");
        System.out.println("**   5. Search product by name                      **");
        System.out.println("**   6. Sort products by price                      **");
        System.out.println("**   0. Exit                                        **");
        System.out.println("******************************************************");
        System.out.printf("Input number to chose function: ");
        int menuKey = scanner.nextInt();
        switch (menuKey){
            case 1:
                System.out.println("Add product:");
                pm.addProduct();
                break;
            case 2:
                System.out.println("Edit product: ");
                pm.editProduct();
                break;
            case 3:
                System.out.println("Delete product: ");
                pm.deleteProduct();
                break;
            case 4:
                System.out.println("Display product list: ");
                pm.displayProduct();
                break;
            case 5:
                System.out.println("Search product by id: ");
                pm.searchProduct();
                break;
            case 6:
                System.out.println("Sort ascending by price: ");
                pm.sortProductAscending();
                break;
            case 7:
                System.out.println("Sort descending by price: ");
                pm.sortProductDescending();
                break;
            case 0:
                System.out.println("Exiting........");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
}
