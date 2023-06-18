package com.my.service;

import com.my.dao.EmployeeMapper;
import com.my.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    public List<Employee> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }

    public int insertEmployee(Employee employee) {
        int e= employeeMapper.insertEmployee();
        return e;
    }

    public int updateEmployee(Employee employee) {
        int e=employeeMapper.updateEmployee(employee);
        return e;
    }

    public Employee queryEmployeeById(int id) {

        return employeeMapper.queryEmployeeById(id);
    }

    public int deleteEmployeeById(int id) {
        int e= employeeMapper.deleteEmployeeById(id);
        return e;
    }

    public int deleteEmployeeByName(String name) {
        int e= employeeMapper.deleteEmployeeByName(name);
        return e;
    }
}
