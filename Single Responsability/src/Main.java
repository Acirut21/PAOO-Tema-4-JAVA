public class Main {
    public static void main(String[] args) {
        User user = new User("Alex", "alex@gmail.com");
        UserValidator validator = new UserValidator();
        UserRepository repository = new UserRepository();

        if (validator.isValid(user)) {
            repository.save(user);
        } else {
            System.out.println("User data is invalid.");
        }
    }
}
