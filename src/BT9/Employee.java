package BT9;

public class Employee implements Comparable<Employee> {
    private final String fullName;
    private final String employeeId;
    private final double salary;

    public Employee(String fullName, String employeeId, double salary) {
        this.fullName = fullName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
}