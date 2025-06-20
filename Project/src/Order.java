

import java.util.ArrayList;

public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> productList;
    private Payment payment;
    private Time orderTime;

    public Order(String orderId, Customer customer, ArrayList<Product> productList, Payment payment, Time orderTime) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
        this.payment = payment;
        this.orderTime = orderTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public Payment getPayment() {
        return payment;
    }

    public Time getOrderTime() {
        return orderTime;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("---- Order Info ----");
        System.out.println("Order ID: " + orderId);
        customer.displayInfo();
        System.out.println("Ordered Products:");
        for (Product p : productList) {
            System.out.println(" - " + p.getName() + " ($" + p.getPrice() + ")");
        }
        System.out.println("Total Amount: $" + getTotalAmount());
        payment.displayPayment();
        orderTime.displayTime();
    }
}
