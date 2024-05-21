package Part5_EmployeeManager;

public class Employee {

    // Fields
    private String firstName;
    private String lastName;
    private double salary;

    // Constructors
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = (salary < 0.0) ? 0.0 : salary;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = (salary < 0) ? 0 : salary;
    }

}
