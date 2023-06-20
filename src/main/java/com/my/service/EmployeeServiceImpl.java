package com.my.service;

import com.my.dao.EmployeeMapper;
import com.my.vo.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    public List<Employees> queryAllEmployee() {

        return employeeMapper.queryAllEmployee();
    }

    public int insertEmployee(Employees employee) {
        int e= employeeMapper.insertEmployee(employee);
        return e;
    }

    public int updateEmployee(Employees employee) {
        int e=employeeMapper.updateEmployee(employee);
        return e;
    }

    public Employees queryEmployeeById(int id) {

        return employeeMapper.queryEmployeeById(id);
    }

    public int deleteEmployeeById(int id) {
        int e= employeeMapper.deleteEmployeeById(id);
        return e;
    }

}
