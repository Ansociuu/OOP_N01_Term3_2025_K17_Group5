

public class Payment {
    private String method;
    private boolean isPaid;

    public Payment(String method, boolean isPaid) {
        this.method = method;
        this.isPaid = isPaid;
    }

    public String getMethod() {
        return method;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void displayPayment() {
        System.out.println("Payment Method: " + method);
        System.out.println("Payment Status: " + (isPaid ? "Paid" : "Unpaid"));
    }
}
