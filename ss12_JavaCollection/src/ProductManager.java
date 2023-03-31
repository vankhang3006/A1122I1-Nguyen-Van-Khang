import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Input product's id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Input product's name: ");
        String name = sc.nextLine();
        System.out.println("Input product's price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        Product product = new Product(id, name, price);
        productList.add(product);
    }

    public void displayProduct(){
        int count = 1;
        for(Product product : productList){
            System.out.println("Information of product "+ count++ + ":");
            System.out.println(product.toString());
        }
    }

    public void editProduct(){
        System.out.println("Input product's id you want to change: ");
        int editId = Integer.parseInt(sc.nextLine());
        for(Product product : productList){
            if(product.getId() == editId){
                System.out.println("Input new product's name: ");
                product.setName(sc.nextLine());
                System.out.println("Input new product's price: ");
                product.setPrice(sc.nextDouble());
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void deleteProduct(){
        System.out.println("Input product's id you want to delete: ");
        int delId = Integer.parseInt(sc.nextLine());
        for(Product product : productList){
            if(product.getId() == delId){
                productList.remove(product);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void searchProduct(){
        System.out.println("Input product's name you want to search: ");
        String productName = sc.nextLine();
        for(Product product : productList){
            if(product.getName().equals(productName)){
                System.out.println(product.toString());
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void sortProductAscending(){
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductDescending(){
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
