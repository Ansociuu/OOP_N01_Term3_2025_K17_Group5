

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    private String description;

    public Product(String id, String name, double price, int stock, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getDescription() {
        return description;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayInfo() {
        System.out.println("---- Product Info ----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
        System.out.println("Description: " + description);
    }
}
