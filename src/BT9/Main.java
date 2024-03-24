package BT9;

import MyUtils.stringUtils;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> employeeIds = new HashSet<>();
        Set<String> studentIds = new HashSet<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee maxEmployee = new Employee("", "", 0);
        for (int i = 0; i < n; i++) {
            System.out.println(STR."Enter \{stringUtils.getOrdinal(i + 1)} employee's details (name, ID, salary): ");
            String name = "";
            while (!stringUtils.isValidName(name)) {
                System.out.print("Name: ");
                name = scanner.next();
                if (!stringUtils.isValidName(name)) {
                    System.out.println("Invalid name. Please enter a valid name.");
                }
            }
            String id = "";
            while (id.isEmpty() || employeeIds.contains(id)) {
                System.out.print("ID: ");
                id = scanner.next();
                if (employeeIds.contains(id)) {
                    System.out.println("ID already exists. Please enter a unique ID.");
                    id = "";
                }
            }
            employeeIds.add(id);
            double salary = -1;
            while (salary < 0) {
                System.out.print("Salary: ");
                salary = scanner.nextDouble();
                if (salary < 0) {
                    System.out.println("Invalid salary. Salary cannot be negative. Please enter a valid salary.");
                }
            }
            Employee employee = new Employee(name, id, salary);
            maxEmployee = Utils.max(maxEmployee, employee);
        }

        System.out.print("\nEnter the number of students: ");
        int m = scanner.nextInt();
        Student maxStudent = new Student("", "", 0);
        for (int i = 0; i < m; i++) {
            System.out.println(STR."Enter \{stringUtils.getOrdinal(i + 1)} student's details (name, id, average score): ");
            String name = "";
            while (!stringUtils.isValidName(name)) {
                System.out.print("Name: ");
                name = scanner.next();
                if (!stringUtils.isValidName(name)) {
                    System.out.println("Invalid name. Please enter a valid name.");
                }
            }
            String id = "";
            while (id.isEmpty() || studentIds.contains(id)) {
                System.out.print("ID: ");
                id = scanner.next();
                if (studentIds.contains(id)) {
                    System.out.println("ID already exists. Please enter a unique ID.");
                }
            }
            studentIds.add(id);
            double score = -1;
            while (score < 0 || score > 10) {
                System.out.print("Average score: ");
                score = scanner.nextDouble();
                if (score < 0 || score > 10) {
                    System.out.println("Invalid score. Please enter a score between 0 and 10.");
                }
            }
            Student student = new Student(name, id, score);
            maxStudent = Utils.max(maxStudent, student);
        }

        System.out.println(STR."\nEmployee with highest salary has a salary of: \{maxEmployee.getSalary()}.");
        System.out.println(STR."Student with highest average score has a score of: \{maxStudent.getAverageScore()}.");

        scanner.close();
    }
}