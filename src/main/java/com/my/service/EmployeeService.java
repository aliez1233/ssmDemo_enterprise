package com.my.service;

import com.my.vo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> queryALLEmployee();
    // 查询全部Book,返回list集合
    int insertEmployee(Employee employee);
    //添加一本书
    int updateEmployee(Employee employee);
    //更新Book
    Employee queryEmployeeById(int id);
    //根据id查询，返回一本书
    int deleteEmployeeById(int id);
    //根据id删除一本书
}
