
import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> products;

    public ProductList() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProductById(String id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public Product getProductById(String id) {
        try {
            for (Product p : products) {
                if (p.getId().equals(id)) {
                    return p;
                }
            }
        } catch (Exception e) {
            System.out.println("❌ Error while searching for product: " + e.getMessage());
        }
        return null;
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : products) {
                p.displayInfo();
                System.out.println("----------------------");
            }
        }
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
