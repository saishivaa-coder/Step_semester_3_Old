import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    // Constructor
    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Display product bill
    void display() {
        double totalPrice = price * quantity;
        double discount;

        // Conditional control structure
        if (totalPrice >= 5000) {
            discount = totalPrice * 0.10;  // 10% discount
        } else {
            discount = totalPrice * 0.05;  // 5% discount
        }

        double finalPrice = totalPrice - discount;

        System.out.println("\nProduct ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
    }
}

public class ProductBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 Product objects
        Product[] products = new Product[5];

        // Loop to get details of 5 products
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // Clear buffer

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            // Create Product object
            products[i] = new Product(id, name, price, quantity);
        }

        // Display bill for all products
        System.out.println("\n========== PRODUCT BILL ==========");

        for (int i = 0; i < 5; i++) {
            products[i].display();
        }

        sc.close();
    }
}
