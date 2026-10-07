public class Employee {

    private String name;
    private int id;
    private double salary;

    // Constructor 1 - Default Constructor
    Employee() {
        name = "";
        id = 0;
        salary = 0.0;
    }

    // Constructor 2 - Parameterized Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Set Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Get Methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Display Method
    public void display() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Salary: " + getSalary());
    }
}
