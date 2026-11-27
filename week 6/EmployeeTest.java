public class EmployeeTest {
    private static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public Employee(int id, String name, double salary) {
            this(id, name, "N/A", salary);
        }

        public Employee(int id, String name) {
            this(id, name, "N/A", 0.0);
        }

        public void giveRaise(double amount) {
            salary += amount;
        }

        public void displayInfo() {
            System.out.println("ID: " + id + ", Name: " + name
                    + ", Department: " + department + ", Salary: " + salary);
        }
    }

    public static void main(String[] args) {

        System.out.println("=== TESTING CONSTRUCTORS ===");

        // Using Constructor 1 (All parameters)
        Employee e1 = new Employee(101, "Alice", "HR", 50000.0);
        e1.displayInfo();

        // Using Constructor 2 (No department)
        Employee e2 = new Employee(102, "Bob", 45000.0);
        e2.displayInfo();

        // Using Constructor 3 (Only ID and Name)
        Employee e3 = new Employee(103, "Charlie");
        e3.displayInfo();

        System.out.println("\n=== TESTING METHODS ===");
        e3.giveRaise(5000.0);
        e3.displayInfo();
    }
}