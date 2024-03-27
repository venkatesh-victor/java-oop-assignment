package polymorphism;

class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void getEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee id: " + id);
    }
}

class HourlyEmployee extends Employee {
    private String employeeType;

    public HourlyEmployee(String name, String id, String employeeType) {
        super(name, id);
        this.employeeType = employeeType;
    }

    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Employee type: " + employeeType);
    }
}

class SalariedEmployee extends Employee {

    private String employeeType;

    public SalariedEmployee(String name, String id, String employeeType) {
        super(name, id);
        this.employeeType = employeeType;
    }

    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Employee type: " + employeeType);
    }

}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee("Venkatesh", "emp33", "Salaried");
        Employee hourlyEmployee = new HourlyEmployee("Victor", "emp33", "hourly");

        salariedEmployee.getEmployeeDetails();
        System.out.println();
        hourlyEmployee.getEmployeeDetails();
    }
}
