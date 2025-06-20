

public class Main {
    public static void main(String[] args) {
        // Khởi tạo danh sách
        ProductList productList = new ProductList();
        UserList userList = new UserList();
        OrderList orderList = new OrderList();

        // Thêm dữ liệu mẫu
        productList.addProduct(new Product("P001", "Laptop", 1200.0, 10, "Gaming Laptop"));
        productList.addProduct(new Product("P002", "Phone", 800.0, 15, "Smartphone"));

        userList.addUser(new Customer("C001", "Alice", "alice@example.com", "pass123", "123 Main St", "0901234567"));
        userList.addUser(new Seller("S001", "Bob", "bob@shop.com", "shop123", "Bob's Store"));

        // Chạy Menu
        Menu menu = new Menu(productList, userList, orderList);
        menu.show();
    }
}
