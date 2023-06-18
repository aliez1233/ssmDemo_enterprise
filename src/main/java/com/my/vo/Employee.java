package com.my.vo;

public class Employee {
    private  Integer EmployeeId;

    private  String EmployeeName;

    private String EmployeeSex;

    private String EmployeeDepartment;

    private String EmployeeDutyType;

    public Employee() {
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeSex() {
        return EmployeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        EmployeeSex = employeeSex;
    }

    public String getEmployeeDepartment() {
        return EmployeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        EmployeeDepartment = employeeDepartment;
    }

    public String getEmployeeDutyType() {
        return EmployeeDutyType;
    }

    public void setEmployeeDutyType(String employeeDutyType) {
        EmployeeDutyType = employeeDutyType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeSex='" + EmployeeSex + '\'' +
                ", EmployeeDepartment='" + EmployeeDepartment + '\'' +
                ", EmployeeDutyType='" + EmployeeDutyType + '\'' +
                '}';
    }
}
