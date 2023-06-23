package com.my.service;

import com.my.vo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> queryALLDept();
    // 查询全部Book,返回list集合
    int insertDept(Dept dept);
    //添加一本书
    int updateDept(Dept dept);
    //更新Book
    Dept queryDeptById(int id);
    //根据id查询，返回一本书
    int deleteDeptById(int id);
    //根据id删除一本书
}
