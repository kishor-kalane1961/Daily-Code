class Employee {
    static String companyName;
    
    static {
        companyName = "Tech Solutions Pvt Ltd";
        System.out.println("Static Block Executed: Company Initialized");
    }

    String empName;

    {
        System.out.println("Instance Block Executed: Employee Object Created");
    }

    Employee(String name) {
        empName = name;
        System.out.println("Constructor Executed for: " + empName);
    }

    static void showCompany() {
        System.out.println("Company Name: " + companyName);
    }

    void showEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Company: " + companyName);
    }
    public static void main(String[] args) {

        Employee.showCompany();

        Employee e1 = new Employee("Kishor");
        e1.showEmployee();

        Employee e2 = new Employee("Rahul");
        e2.showEmployee();
    }
}