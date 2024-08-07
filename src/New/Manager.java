package New;

public class Manager extends Employee{
    public String department;
    Manager(String name, int salary, String dept) {
        super(name,salary);
        this.department=dept;

        }
    }
