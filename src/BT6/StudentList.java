package BT6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    private final List<Student> students;

    public int size() {
        return this.students.size();
    }

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public boolean containsId(String studentId) {
        for (Student student : this.students) {
            if (student.getStudentId().equals(studentId)) {
                return true;
            }
        }
        return false;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addStudent(int index, Student student) {
        this.students.add(index, student);
    }

    public void sortStudents() {
        Collections.sort(this.students);
    }

    public void removeLowScoringStudents() {
        this.students.removeIf(student -> student.getAverageScore() < 5 || student.getConductScore() < 50);
    }


    public void printExcellentStudents() {
        System.out.println("Excellent students:");
        this.students.stream()
                .filter(student -> student.getAverageScore() >= 8.0 && student.getConductScore() >= 80)
                .forEach(System.out::println);
    }

    public int countExcellentStudents() {
        int count = 0;
        for (Student student : this.students) {
            if (student.getAverageScore() >= 8 && student.getConductScore() >= 80) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}