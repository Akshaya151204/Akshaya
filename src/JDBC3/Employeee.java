package src.JDBC3;

import src.JDBC2.Address;

public class Employeee {
        public String employeeId;
        public String firstName;
        public String lastName;
        public String middleName;
        public String dateOfBirth;
        public String gender;
        public String emailAddress;
        public String phoneNumber;
        public Address1 address;
        public Employeee(String employeeId, String firstName, String lastName,
                         String middleName, String dateOfBirth, String gender,
                         String emailAddress, String phoneNumber, Address1 address) {
            this.employeeId = employeeId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
            this.emailAddress = emailAddress;
            this.phoneNumber = phoneNumber;
            this.address = address;
        }
        @Override
        public String toString() {
            return
                    "employeeId=" + employeeId + '\n' +
                            "firstName=" + firstName + '\n' +
                            "lastName=" + lastName + '\n' +
                            "middleName=" + middleName + '\n' +
                            "dateOfBirth=" + dateOfBirth +'\n'+
                            "gender=" + gender + '\n' +
                            "emailAddress=" + emailAddress + '\n' +
                            "phoneNumber=" + phoneNumber + '\n' +
                            "address=" + address + '\n' ;
        }

        public static void main(String[] args) {
            Address address1=new Address("Plot No 7, Annamalai nagar","Near indra nagar","Kanchipuram","Tamil Nadu","631502");
            src.JDBC2.Employee1 employee=new src.JDBC2.Employee1("1234","A","Amuthan","Akshaya",
                    "15/12/2004","Female","akshaya151204@gmail.com","6383909012",address1);
            System.out.println(employee);
        }
    }
