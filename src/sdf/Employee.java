package sdf;

public class Employee implements Comparable<Employee>{
    private String staffNo;
    private String fullName;
    private String department;
    private String role;
    private String emailAddress;
    private Integer salary;


    public Employee(String staffNo, String fullName, String department, String role, String emailAddress,
            Integer salary) {
        this.staffNo = staffNo;
        this.fullName = fullName;
        this.department = department;
        this.role = role;
        this.emailAddress = emailAddress;
        this.salary = salary;
        
    }
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getStaffNo() {
        return staffNo;
    }
    public String getFullName() {
        return fullName;
    }
    public String getDepartment() {
        return department;
    }
    public String getRole() {
        return role;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public Integer getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [staffNo=" + staffNo + ", fullName=" + fullName + ", department=" + department + ", role="
                + role + ", emailAddress=" + emailAddress + ", salary=" + salary + "]";
    }
    @Override
    public int compareTo(Employee o) {
        return this.getFullName().compareTo(o.getFullName());
    }
    
}
