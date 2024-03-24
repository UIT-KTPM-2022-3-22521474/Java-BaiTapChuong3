package BT5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBT5 - Regex - InputValidator - To Vinh Tien - 22521474.\n");
        InputValidator validator = new InputValidator();
        Scanner scanner = new Scanner(System.in);

        boolean isValid;
        String username;
        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            isValid = validator.validateUsername(username);
            if (!isValid) {
                System.out.println("Please enter a valid username.");
            }
        } while (!isValid);

        String email;
        do {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            isValid = validator.validateEmail(email);
            if (!isValid) {
                System.out.println("Please enter a valid email.");
            }
        } while (!isValid);

        String password;
        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            isValid = validator.validatePassword(password);
            if (!isValid) {
                System.out.println("Please enter a valid password.");
            }
        } while (!isValid);

        System.out.println("\nAll fields are valid. Registration successful.");
        System.out.println(STR."Username: \{username}.");
        System.out.println(STR."Email: \{email}.");
        System.out.println(STR."Password: \{password}.");
    }
}