package encapsulation;

public class Employee {

    private String employeeName;
    private String employeeId;
    private static String companyName;
    private int yearsOfExperience;
    private String jobName;
    private String joinedDate;
    private String address;
    private String birthday;
    private int age;
    private int accumulatedBonusSoFar;
    private int noOfDaysLeaveTaken;


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAccumulatedBonusSoFar() {
        return accumulatedBonusSoFar;
    }

    public void setAccumulatedBonusSoFar(int accumulatedBonusSoFar) {
        this.accumulatedBonusSoFar = accumulatedBonusSoFar;
    }

    public int getNoOfDaysLeaveTaken() {
        return noOfDaysLeaveTaken;
    }

    public void setNoOfDaysLeaveTaken(int noOfDaysLeaveTaken) {
        this.noOfDaysLeaveTaken = noOfDaysLeaveTaken;
    }
}
