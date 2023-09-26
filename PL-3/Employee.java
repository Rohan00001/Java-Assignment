class Employee {
    private int empNo;
    private String name;
    private double basicPay;
    private double hra;
    private double da;

    // Default constructor
    public Employee() {
        this.empNo = 0;
        this.name = "";
        this.basicPay = 0.0;
        this.hra = 0.0;
        this.da = 0.0;
    }

    // Parameterized constructor
    public Employee(int empNo, String name, double basicPay, double hra, double da) {
        this.empNo = empNo;
        this.name = name;
        this.basicPay = basicPay;
        this.hra = hra;
        this.da = da;
    }

    // Calculate and display gross salary
    public void calc() {
        double grossSalary = basicPay + hra + da;
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", 50000.0, 10000.0, 8000.0);
        emp.calc();
    }
}
