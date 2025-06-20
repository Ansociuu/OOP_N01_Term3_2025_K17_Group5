import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ProductList productList;
    private UserList userList;
    private OrderList orderList;

    public Menu(ProductList productList, UserList userList, OrderList orderList) {
        this.productList = productList;
        this.userList = userList;
        this.orderList = orderList;
    }

    public void show() {
        int choice;
        do {
            System.out.println("==== Online Sales Platform ====");
            System.out.println("1. View Products");
            System.out.println("2. View Users");
            System.out.println("3. Create Order");
            System.out.println("4. View Orders");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                choice = -1;
            }

            switch (choice) {
                case 1:
                    productList.displayAllProducts();
                    break;
                case 2:
                    userList.displayAllUsers();
                    break;
                case 3:
                    createOrder();
                    break;
                case 4:
                    orderList.displayAllOrders();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 0);
    }

    private void createOrder() {
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        User user = userList.getUserById(customerId);

        if (!(user instanceof Customer)) {
            System.out.println("⚠️ Customer not found or invalid.");
            return;
        }

        ArrayList<Product> selectedProducts = new ArrayList<>();

        while (true) {
            System.out.print("Enter Product ID (or 'done'): ");
            String pid = scanner.nextLine();

            if (pid.equalsIgnoreCase("done")) {
                break;
            }

            Product p = productList.getProductById(pid);
            if (p != null) {
                selectedProducts.add(p);
            } else {
                System.out.println("⚠️ Product not found.");
            }
        }

        System.out.print("Enter payment method: ");
        String method = scanner.nextLine();

        try {
            Payment payment = new Payment(method, true);
            Time time = new Time();

            String orderId = "OD" + System.currentTimeMillis();
            Order order = new Order(orderId, (Customer) user, selectedProducts, payment, time);
            orderList.addOrder(order);

            System.out.println("✅ Order created successfully with ID: " + orderId);
        } catch (Exception e) {
            System.out.println("❌ Failed to create order: " + e.getMessage());
        }
    }
}
