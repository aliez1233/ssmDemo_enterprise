package com.my.dao;

import com.my.vo.File;

import java.util.List;

public interface FileDao {
    //查询所有的文件,返回list集合
    List<File> queryAllFile();
    //添加一份文件
    int insertFile(File file);
    //更新文件信息
    int updateFile(File file);
    //根据id查询，返回一份文件
    File queryFileById(int id);
    //根据id删除一份文件
    int deleteFileById(int id);
}
