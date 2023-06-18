package com.my.service;

import com.my.vo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> queryAllEmployee();//查询全部员工，返回list列表

    int insertEmployee(Employee employee);//添加员工

    int updateEmployee(Employee employee);//更新员工

    Employee queryEmployeeById(int id);//根据id查询，返回员工

    int deleteEmployeeById(int id);//根据id删除员工

    int deleteEmployeeByName(String name);//根据id删除员工
}
