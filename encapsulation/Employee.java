package encapsulation;
public class Employee {
    // Protect data from being changed directly
    private String name;
    private double salary;

    // Getters (read-only methods)
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters (writing methods)
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary; 
    }

}