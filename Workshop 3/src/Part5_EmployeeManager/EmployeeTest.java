package Part5_EmployeeManager;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Bell", 300);
        Employee e2 = new Employee("Kang", "Who", 250);

        System.out.println("Employee 1: ");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + ", salary: " + e1.getSalary());
        System.out.println("Employee 2: ");
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + ", salary: " + e2.getSalary());

        System.out.println("\nEmployee get 10% raise\n");
        System.out.println("Employee 1: ");
        e1.setSalary(e1.getSalary() + (e1.getSalary() / 100 * 10));
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + ", salary: " + e1.getSalary());
        System.out.println("Employee 2: ");
        e2.setSalary(e2.getSalary() + (e2.getSalary() / 100 * 10));
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + ", salary: " + e2.getSalary());

    }

}
