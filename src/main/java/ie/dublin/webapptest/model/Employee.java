package ie.dublin.webapptest.model;

public class Employee {

    private int employeeId, titleId, startYear;
    private String employeeName, email, telephone, department, university;

    //Constructor Methods
    public Employee() {
    }

    public Employee(int employeeId, int titleId, int startYear, String employeeName, String email, String telephone, String department, String university) {
        this.employeeId = employeeId;
        this.titleId = titleId;
        this.startYear = startYear;
        this.employeeName = employeeName;
        this.email = email;
        this.telephone = telephone;
        this.department = department;
        this.university = university;
    }

    //Getter and Setter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
