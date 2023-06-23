package com.my.service;

import com.my.dao.EmployeeDao;
import com.my.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
    @Override
    public List<Employee> queryALLEmployee() {

        return employeeDao.queryALLEmployee();
    }

    @Override
    public int insertEmployee(Employee employee) {
        int e= employeeDao.insertEmployee(employee);
        return e;
    }

    @Override
    public int updateEmployee(Employee employee) {
        int e=employeeDao.updateEmployee(employee);
        return e;
    }

    @Override
    public Employee queryEmployeeById(int id) {
        return employeeDao.queryEmployeeById(id);

    }

    @Override
    public int deleteEmployeeById(int id) {
        int e=employeeDao.deleteEmployeeById(id);
        return e;
    }
}
