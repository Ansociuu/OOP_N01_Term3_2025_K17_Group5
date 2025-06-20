
import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUserById(String id) {
        try {
            for (User user : users) {
                if (user.getId().equals(id)) {
                    return user;
                }
            }
        } catch (Exception e) {
            System.out.println("❌ Error while searching for user: " + e.getMessage());
        }
        return null;
    }

    public void displayAllUsers() {
        for (User user : users) {
            user.displayInfo();
            System.out.println("------------------");
        }
    }
}
