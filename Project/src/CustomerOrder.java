

import java.util.ArrayList;

public class CustomerOrder {
    private String orderId;
    private String customerId;
    private ArrayList<String> productIds;
    private boolean isPaid;

    public CustomerOrder(String orderId, String customerId, ArrayList<String> productIds, boolean isPaid) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productIds = productIds;
        this.isPaid = isPaid;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public ArrayList<String> getProductIds() {
        return productIds;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Product IDs: " + productIds);
        System.out.println("Payment Status: " + (isPaid ? "Paid" : "Unpaid"));
    }
}
