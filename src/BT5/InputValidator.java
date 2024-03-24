package BT5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class InputValidator {
    public boolean validateUsername(String username) {
    if (username.isEmpty()) {
        System.out.println("Error: Username cannot be empty.");
        return false;
    }

    if (username.length() < 15 || username.length() > 30) {
        System.out.println("Error: Username must be between 15 and 30 characters.");
        return false;
    }

    String regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(username);

    if (!matcher.matches()) {
        System.out.println("Error: Username must only contain letters, spaces, and the first character of each word must be uppercase.");
        return false;
    }

    return true;
}

    public boolean validateEmail(String email) {
    if (email.isEmpty()) {
        System.out.println("Error: Email cannot be empty.");
        return false;
    }

    String regex = "^[a-z0-9]+@[a-z]+\\.[a-z]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);

    if (!matcher.matches()) {
        System.out.println("Error: Email must be in the format aaa@bbb.ccc. It should not contain uppercase letters or special characters. aaa can be lowercase letters or numbers (except the first character which should be a letter), and bbb and ccc should be lowercase letters.");
        return false;
    }

    return true;
}

    public boolean validatePassword(String password) {
    if (password.isEmpty()) {
        System.out.println("Error: Password cannot be empty.");
        return false;
    }

    String regex = "^[A-Z][A-Za-z0-9]{7,}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(password);

    if (!matcher.matches()) {
        System.out.println("Error: Password must start with an uppercase letter and can contain only alphanumeric characters. It should be at least 8 characters long.");
        return false;
    }

    return true;
}
}