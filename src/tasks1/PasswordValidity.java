package tasks1;

public class PasswordValidity {
    public static void main(String[] args) {

        String password = "Likabigi26#";
        System.out.println("isValidPassword(password) = " + isValidPassword(password));

    }

    public static boolean isValidPassword(String password) {
        boolean hasLowerCaseLetter = password.matches("(.*[a-z].*)");
        boolean hasUpperCaseLetter = password.matches("(.*[A-Z].*)");
        boolean hasDigits = password.matches("(.*[0-9].*)");
        boolean hasSpecialChar = password.matches("(.*[ -/, :-@].*)");

        if (password.length() >= 6 && !password.contains(" ")) {
            if (hasLowerCaseLetter && hasUpperCaseLetter && hasDigits && hasSpecialChar) {
                return true;
            }
        }

        return false;
    }
}