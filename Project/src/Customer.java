

public class Customer extends User {
    private String address;
    private String phoneNumber;

    public Customer(String id, String name, String email, String password, String address, String phoneNumber) {
        super(id, name, email, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- Customer Info ----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
    }
}
