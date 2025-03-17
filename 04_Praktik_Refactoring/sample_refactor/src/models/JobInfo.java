package models;

import java.util.Date;
import enums.Department;

public class JobInfo {
    private String employeeId;
    private float salary;
    private Department department;
    private Date joinDate;

    public JobInfo(String employeeId, float salary, Department department, Date joinDate) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
        this.joinDate = joinDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
