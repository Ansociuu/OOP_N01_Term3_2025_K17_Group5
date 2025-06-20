

public class Seller extends User {
    private String storeName;

    public Seller(String id, String name, String email, String password, String storeName) {
        super(id, name, email, password);
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- Seller Info ----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Store: " + storeName);
    }
}
