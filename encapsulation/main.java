package encapsulation;

public class main {

    public static void main(String[] args) {        
        Employee newEmployee = new Employee();

        newEmployee.setName("Devin");
        newEmployee.setSalary(50_000);

        System.out.printf("Hello, %s! Your salary is %.0f!\n", newEmployee.getName(), newEmployee.getSalary());
    }
}