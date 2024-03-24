package BT8;

import MyUtils.stringUtils;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();

        for (int i = 0; i < 3; i++) {
            System.out.println(STR."Enter \{stringUtils.getOrdinal(i + 1)} player details:");

            String name = "";
            while (!stringUtils.isValidName(name)) {
                System.out.print("Name: ");
                name = scanner.nextLine();
                if (!stringUtils.isValidName(name)) {
                    System.out.println("Invalid name. Please enter a valid name.");
                }
            }

            int jerseyNumber = 0;
            boolean validNumber = false;
            while (!validNumber) {
                System.out.print("Jersey Number: ");
                try {
                    jerseyNumber = scanner.nextInt();
                    validNumber = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number. Please enter a valid number.");
                    scanner.next();
                }
            }
            scanner.nextLine();

            System.out.print("Position: ");
            String position = scanner.nextLine();

            Player player = new Player(name, jerseyNumber, Collections.singletonList(position));
            team.addPlayer(player);
        }

        team.printPlayers();
        scanner.close();
    }
}