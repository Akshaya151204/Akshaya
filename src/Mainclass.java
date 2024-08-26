package src;

public class Mainclass {
    public static void main(String[] args) {
        Contact1 contact1=new Contact1();
        Person1 person1=new Person1();
        System.out.println(person1.calculateAge());
        Company company=new Company();
        Employe1 employe1=new Employe1();
        Contact1 contact2=new Employe1();
        System.out.println(contact2.name+contact2.phoneNumber+contact2.emalId);
        System.out.println(employe1.salary+employe1.destination+person1.dateOfBirth);

        //we cannot sent sub class as a reference because it isA relationship
    }
}
