package com.my.dao;

import com.my.vo.Items;

import java.util.List;

public interface ItemMapper {
    List<Items> queryAllItem();//查询全部员工，返回list列表

    int insertItem(Items item);//添加员工

    int updateItem(Items item);//更新员工

    Items queryItemById(int id);//根据id查询，返回员工

    int deleteItemById(int id);//根据id删除员工

}
