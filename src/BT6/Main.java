package BT6;

import MyUtils.stringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BT6 - Vector & ArrayList - Student Management - To Vinh Tien - 22521474.\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        StudentList studentList = new StudentList();

        for (int i = 0; i < n; i++) {
            System.out.println(STR."\nEnter details for \{stringUtils.getOrdinal(i + 1)} student:");

            String studentId;
            while (true) {
                System.out.print("Enter student ID: ");
                studentId = scanner.nextLine();
                if (!studentList.containsId(studentId)) {
                    break;
                }
                System.out.println("This ID already exists. Please enter a different ID.");
            }

            String name;
            while (true) {
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                if (name.matches("[a-zA-Z ]+")) {
                    break;
                }
                System.out.println("The name should only contain letters and spaces. Please enter a different name.");
            }

            double averageScore;
            while (true) {
                System.out.print("Enter average score: ");
                averageScore = scanner.nextDouble();
                if (averageScore >= 0 && averageScore <= 10) {
                    break;
                }
                System.out.println("The average score should be between 0 and 10. Please enter a different average score.");
            }

            double conductScore;
            while (true) {
                System.out.print("Enter conduct score: ");
                conductScore = scanner.nextDouble();
                if (conductScore >= 0 && conductScore <= 100) {
                    break;
                }
                System.out.println("The conduct score should be between 0 and 100. Please enter a different conduct score.");
            }

            studentList.addStudent(new Student(studentId, name, averageScore, conductScore));

            if (i < n - 1) {
                scanner.nextLine();
            }
        }

        System.out.println("\nOriginal list:");
        System.out.println(studentList);

        studentList.sortStudents();
        System.out.println("Sorted list:");
        System.out.println(studentList);

        studentList.removeLowScoringStudents();
        System.out.println("List after removing low scoring students:");
        System.out.println(studentList);

        System.out.print("Enter the number of students to insert: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        int k;
        while (true) {
            System.out.print("Enter the position to insert the students at: ");
            k = scanner.nextInt();
            scanner.nextLine();

            if (k <= studentList.size()) {
                break;
            }

            System.out.println("Invalid position. The position should be less than or equal to the current size of the student list. Please enter again.");
        }

        for (int i = 0; i < m; i++) {
            System.out.println(STR."\nEnter details for \{stringUtils.getOrdinal(i + 1)} student:");

            String studentId;
            while (true) {
                System.out.print("Enter student ID: ");
                studentId = scanner.nextLine();
                if (!studentList.containsId(studentId)) {
                    break;
                }
                System.out.println("This ID already exists. Please enter a different ID.");
            }

            String name;
            while (true) {
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                if (name.matches("[a-zA-Z ]+")) {
                    break;
                }
                System.out.println("The name should only contain letters and spaces. Please enter a different name.");
            }

            double averageScore;
            while (true) {
                System.out.print("Enter average score: ");
                averageScore = scanner.nextDouble();
                if (averageScore >= 0 && averageScore <= 10) {
                    break;
                }
                System.out.println("The average score should be between 0 and 10. Please enter a different average score.");
            }

            double conductScore;
            while (true) {
                System.out.print("Enter conduct score: ");
                conductScore = scanner.nextDouble();
                if (conductScore >= 0 && conductScore <= 100) {
                    break;
                }
                System.out.println("The conduct score should be between 0 and 100. Please enter a different conduct score.");
            }

            studentList.addStudent(k + i, new Student(studentId, name, averageScore, conductScore));

            if (i < m - 1) {
                scanner.nextLine();
            }
        }

        studentList.printExcellentStudents();
        int count = studentList.countExcellentStudents();
        System.out.println(STR."Number of excellent students: \{count}.");
    }
}