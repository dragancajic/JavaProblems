class Employee {

    String name;
    int salary;
    String address;
    
    final String missingData = "unknown";
    
    public Employee() {
        this.name = missingData;
        this.salary = 0;
        this.address = missingData;
    }
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.address = missingData;
    }
    
    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}