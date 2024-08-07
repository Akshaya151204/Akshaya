package New;

public class Employee {
    public String name;
    public int salary;
    public String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        System.out.println("Employee Details:");
       // System.out.println("Name:" + name + "\nSalary:" + salary + "\nDept:" + department);
    }
}