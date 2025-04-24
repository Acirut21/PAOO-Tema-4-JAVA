public class UserRepository {
    public void save(User user) {
        System.out.println("User saved: " + user.getName() + ", " + user.getEmail());
    }
}

