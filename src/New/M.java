package New;

public class M {
    public void main(String[] args) {
        Manager manager = new Manager("Akshaya", 1,"BCA");
        Employee employee = new Employee("Anushka",12,"BCA");
        System.out.println(manager.name);
        System.out.println( manager.salary);
        System.out.println(manager.department);
        System.out.println(employee.name);
        System.out.println( employee.salary);
        System.out.println(employee.department);
    }

}
