package com.my.service;

import com.my.dao.DeptDao;
import com.my.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptImpl implements DeptService{
@Autowired
    DeptDao deptDao;
    @Override
    public List<Dept> queryALLDept() {
        return deptDao.queryALLDept();
    }

    @Override
    public int insertDept(Dept dept) {
        int d=deptDao.insertDept(dept);
        return d;
    }

    @Override
    public int updateDept(Dept dept) {
        int d=deptDao.updateDept(dept);
        return d;
    }

    @Override
    public Dept queryDeptById(int id) {

        return deptDao.queryDeptById(id);
    }

    @Override
    public int deleteDeptById(int id) {
        int d=deptDao.deleteDeptById(id);
        return d;
    }
}
