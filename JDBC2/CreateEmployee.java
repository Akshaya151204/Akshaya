package JDBC2;
import java.util.Date;

public class CreateEmployee {
    public String employeeId;
        public String firstName;
        public String lastName;
        public String middleName;
        public String dateOfBirth;
        public String gender;
        public String emailAddress;
        public String phoneNumber;
        public String address;
        public CreateEmployee(String employeeId, String firstName, String lastName,
                              String middleName, String dateOfBirth, String gender,
                              String emailAddress, String phoneNumber, String address) {
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
        CreateEmployee createEmployee=new CreateEmployee("1234","A","Amuthan","Akshaya",
    "15/12/2004","Female","akshaya151204@gmail.com","6383909012","Kanchipuram");
        System.out.println(createEmployee);
        }
    }
