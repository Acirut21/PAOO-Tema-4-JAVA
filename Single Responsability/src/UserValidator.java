public class UserValidator {
    public boolean isValid(User user) {
        return user.getName() != null && !user.getName().isEmpty()
                && user.getEmail() != null && user.getEmail().contains("@");
    }
}