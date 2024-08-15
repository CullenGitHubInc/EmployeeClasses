public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Rex", "Jones", 12345);
        employee.setSalary(50000);
        employee.employeeSummary();

        System.out.println(); // Print a blank line for separation

        // Create a Manager object
        Manager manager = new Manager("Riley", "Reynolds", 54321, "IT");
        manager.setSalary(80000);
        manager.employeeSummary();
    }
}
