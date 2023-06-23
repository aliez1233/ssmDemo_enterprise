package com.my.vo;



public class Employee implements java.io.Serializable{

	private Integer employeeId;			// id
	private String employeeName;		// 名称
	private String employeeSex;		// 性别
	private String employeeDept;			// 部门
	private String  employeeDutyType;			// 职位

	private String tel;			// 电话
	private String address;		// 地址

	public Employee(Integer employeeId, String employeeName, String employeeSex, String employeeDept, String employeeDutyType, String tel, String address) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSex = employeeSex;
		this.employeeDept = employeeDept;
		this.employeeDutyType = employeeDutyType;
		this.tel = tel;
		this.address = address;
	}

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

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	public String getEmployeeDutyType() {
		return employeeDutyType;
	}

	public void setEmployeeDutyType(String employeeDutyType) {
		this.employeeDutyType = employeeDutyType;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"employeeId=" + employeeId +
				", employeeName='" + employeeName + '\'' +
				", employeeSex='" + employeeSex + '\'' +
				", employeeDept='" + employeeDept + '\'' +
				", employeeDutyType='" + employeeDutyType + '\'' +
				", tel='" + tel + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}