package com.my.vo;

public class Employees {
    private Integer employeeId;

    private String employeeName;

    private String employeeSex;

    private String employeeDepartment;

    private String employeeDutyType;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeDutyType() {
        return employeeDutyType;
    }

    public void setEmployeeDutyType(String employeeDutyType) {
        this.employeeDutyType = employeeDutyType;
    }

    public Employees(Integer employeeId, String employeeName, String employeeSex, String employeeDepartment, String employeeDutyType) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.employeeDepartment = employeeDepartment;
        this.employeeDutyType = employeeDutyType;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSex='" + employeeSex + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeDutyType='" + employeeDutyType + '\'' +
                '}';
    }
}
