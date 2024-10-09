package src.Employe2;


import src.JDBC2.Address;

public class Employee1 {
   String jobTitle;
   String department;
   String managerID;
   String employmentStatus;
   String salary;
   String workLocation;
   private String panNumber;
   private String aadhaarNumber;
   private String bankAccountDetails;
   String employmentEligibilityVerification;
   String backgroundStatus;
   String emergencyContact;
   String skills;
   String education;
   String certifications;

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public void setBankAccountDetails(String bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public String getBankAccountDetails() {
        return bankAccountDetails;
    }
    public Employee1(String jobTitle, String department, String managerID, String employmentStatus, String salary, String workLocation, String employmentEligibilityVerification, String backgroundStatus, String emergencyContact, String skills, String education, String certifications, String performanceReviews) {
        this.jobTitle = jobTitle;
        this.department = department;
        this.managerID = managerID;
        this.employmentStatus = employmentStatus;
        this.salary = salary;
        this.workLocation = workLocation;
        this.employmentEligibilityVerification = employmentEligibilityVerification;
        this.backgroundStatus = backgroundStatus;
        this.emergencyContact = emergencyContact;
        this.skills = skills;
        this.education = education;
        this.certifications = certifications;
        this.performanceReviews = performanceReviews;
    }

    String performanceReviews;

    @Override
    public String toString() {
        return
                "jobTitle=" + jobTitle + '\n' +
                "department=" + department + '\n' +
                "managerID=" + managerID + '\n' +
                "employmentStatus=" + employmentStatus + '\n' +
                "salary=" + salary + '\n' +
                "workLocation=" + workLocation + '\n' +
                "panNumber=" + panNumber + '\n' +
                "aadhaarNumber=" + aadhaarNumber + '\n' +
                "bankAccountDetails=" + bankAccountDetails + '\n' +
                "employmentEligibilityVerification=" + employmentEligibilityVerification + '\n' +
                "backgroundStatus=" + backgroundStatus + '\n' +
                "emergencyContact=" + emergencyContact + '\n' +
                "skills=" + skills + '\n' +
                "education=" + education + '\n' +
                "certifications=" + certifications + '\n' +
                "performanceReviews=" + performanceReviews + '\n' ;
    }

    public static void main(String[] args) {
       Employee1 employee1=new Employee1("Employee","Application","CI3005","FullTime","50000",
               "Medavakkam","Verification Done","Verification done","9382827282","Painting",
               "BCA","NPTEL","Excellent");
        System.out.println(employee1);
        employee1.setPanNumber("FW456789");
        employee1.setAadhaarNumber("ASDF5667");
        employee1.setBankAccountDetails("Indian Bank");
    }
}



