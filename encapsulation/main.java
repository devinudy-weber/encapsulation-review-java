package encapsulation;

public class main {

    public static void main(String[] args) {        
        Employee newEmployee = new Employee();

        newEmployee.setName("Devin");
        newEmployee.setSalary(50_000);

        System.out.printf("Hello, %s! Your salary is %.0f!\n", newEmployee.getName(), newEmployee.getSalary());

        product newProduct = new product();
        newProduct.setName("Laptop");
        newProduct.setPrice(999.99);

        System.out.printf("The product is %s and it costs $%.2f\n", newProduct.getName(), newProduct.getPrice());

        customer newCustomer = new customer();
        newCustomer.setName("Alice");
        newCustomer.setEmail("alice@example.com");

        System.out.printf("Customer name: %s\nEmail: %s\n", newCustomer.getName(), newCustomer.getEmail());
        building newBuilding = new building();
        newBuilding.setName("Tech Store");
        newBuilding.setAddress("123 Main St");

        System.out.printf("Building name: %s\nAddress: %s\n", newBuilding.getName(), newBuilding.getAddress());

    }
}