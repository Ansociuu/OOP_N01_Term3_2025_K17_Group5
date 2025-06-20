
import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orders;

    public OrderList() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(String orderId) {
        try {
            for (Order o : orders) {
                if (o.getOrderId().equals(orderId)) {
                    return o;
                }
            }
        } catch (Exception e) {
            System.out.println("❌ Failed to get order: " + e.getMessage());
        }
        return null;
    }

    public void removeOrderById(String orderId) {
        try {
            orders.removeIf(o -> o.getOrderId().equals(orderId));
        } catch (Exception e) {
            System.out.println("❌ Failed to remove order: " + e.getMessage());
        }
    }

    public void displayAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (Order o : orders) {
                o.displayOrder();
                System.out.println("---------------------");
            }
        }
    }
}
