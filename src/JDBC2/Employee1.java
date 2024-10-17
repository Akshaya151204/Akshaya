package src.JDBC2;

public class Employee1  {
    String employeeId;
    String firstName;
    String lastName;
    String middleName;
    String dob;
    String gender;
    String emailAddress;
    String phoneNumber;
    public Address address;
    String jobTitle;
    String department;
    String managerId;
    String dateOfJoining;
    String employmentStatus;
    double salary;
    String workLocation;
    private String panNumber;
    private String aadhaarNumber;
    private String bankAccountDetails;
    String employmentEligibilityVerification;
    String backgroundCheckStatus;
    String emergencyContact;
    String skills;
    String education;
    String certifications;
    String performance;
    Employee1(String employeeId, String firstName, String lastName
            , String middleName, String dob, String gender, String emailAddress, String phoneNumber
            , Address address,
              String jobTitle, String department, String managerId, String dateOfJoining, String employmentStatus,
              double salary, String workLocation, String employmentEligibilityVerification, String backgroundCheckStatus, String emergencyContact,
              String skills, String education, String certifications, String performance) {

        this.employeeId=employeeId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleName=middleName;
        this.dob=dob;
        this.gender=gender;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.jobTitle=jobTitle;
        this.department=department;
        this.managerId=managerId;
        this.dateOfJoining=dateOfJoining;
        this.employmentStatus=employmentStatus;
        this.salary=salary;
        this.workLocation=workLocation;
        this.employmentEligibilityVerification=employmentEligibilityVerification;
        this.backgroundCheckStatus=backgroundCheckStatus;
        this.emergencyContact=emergencyContact;
        this.skills=skills;
        this.education=education;
        this.certifications=certifications;
        this.performance=performance;
    }
    public String getPanNumber() {
        return panNumber;
    }
    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
    public String getAadhaarNumber() {
        return aadhaarNumber;
    }
    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }
    public String getBankAccountDetails() {
        return bankAccountDetails;
    }
    public void setBankAccountDetails(String bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }
    @Override
    public String toString(){
        return employeeId+"\n"+firstName+"\n"+lastName+"\n"+middleName+"\n"+dob+"\n"+gender+"\n"+emailAddress+"\n"+phoneNumber+"\n"+address+
                jobTitle+"\n"+department+"\n"+managerId+"\n"+dateOfJoining+"\n"+employmentStatus+"\n"+
                salary+"\n"+workLocation+"\n"+employmentEligibilityVerification+"\n"+backgroundCheckStatus+"\n"+emergencyContact+"\n"+
                skills+"\n"+education+"\n"+certifications+"\n"+performance+"\n"+aadhaarNumber+"\n"+panNumber+"\n"+bankAccountDetails;
    }
    public static void main(String[] args) {
        Address address=new Address("Plot no 7","annamalai nagar","Kanchipura,","TamilNadu","631502");
        Employee1 employee=new Employee1("cs1211","A","Amuthan","Akshaya","15/12/2004",
                "Female","akshu19721@gmail.com","6383909012",address,"Senior UI Developer","Application","1441","10/7/2013",
                "Full Time",70000,"Medavakkam","Verification Done","Verification Done"
                ,"789090123","Frontend Development",
                "BCA","Microsoft Certification","Excellent");
        employee.setBankAccountDetails("Indian Bank");
        employee.setAadhaarNumber("7872 297 2892");
        employee.setPanNumber("120AA12903709");
        System.out.println(employee);
    }
}
