

import java.util.ArrayList;

public class ListCustomerOrder {
    private ArrayList<CustomerOrder> orderList;

    public ListCustomerOrder() {
        this.orderList = new ArrayList<>();
    }

    public void add(CustomerOrder order) {
        orderList.add(order);
    }

    public void displayAll() {
        if (orderList.isEmpty()) {
            System.out.println("No customer orders available.");
        } else {
            for (CustomerOrder order : orderList) {
                order.display();
                System.out.println("------------------");
            }
        }
    }

    public CustomerOrder getOrderById(String orderId) {
        for (CustomerOrder o : orderList) {
            if (o.getOrderId().equals(orderId)) {
                return o;
            }
        }
        return null;
    }
}
