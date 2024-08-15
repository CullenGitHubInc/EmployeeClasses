public class Manager extends Employee {
    // Field
    private String department;

    // Constructor
    public Manager(String firstName, String lastName, int employeeID, String department) {
        super(firstName, lastName, employeeID);
        this.department = department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Override the employeeSummary method to include department
    @Override
    public void employeeSummary() {
        super.employeeSummary(); // Call the superclass method to print common attributes
        System.out.println("Department: " + department);
    }
}
