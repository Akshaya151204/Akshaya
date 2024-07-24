public class Employee {

    int id;
    String name;

    //constructor to initialize integer and string
    Employee(int i, String n) {
        id = i;
        name = n;

    }

    //constructor to initialize another object
    Employee(Employee c) {
        id = c.id;
        name = c.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }


    public static void main(String args[]) {
        Employee c1 = new Employee(100, "Joy");
        Employee c2 = new Employee(c1);

        c1.display();
        c2.display();
    }
}



