package com.my.dao;

import com.my.vo.Employees;
import java.util.List;

public interface EmployeeMapper {
    List <Employees> queryAllEmployee();//查询全部员工，返回list列表

    int insertEmployee(Employees employee);//添加员工

    int updateEmployee(Employees employee);//更新员工

    Employees queryEmployeeById(int id);//根据id查询，返回员工

    int deleteEmployeeById(int id);//根据id删除员工

}
